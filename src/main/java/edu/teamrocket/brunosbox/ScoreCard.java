package edu.teamrocket.brunosbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ScoreCard {
    private final String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;
    private Byte redBoxerFinalScore;
    private Byte blueBoxerFinalScore;

    private List<Round> rounds = new ArrayList<>();

    public ScoreCard(String color) {
        this.color = color;
    }

    public void setRCorner(String rCorner) {
        this.redCorner = rCorner;
    }

    public void setBCorner(String bCorner) {
        this.blueCorner = bCorner;
    }

    private void setJudgeScoreCard(String[] judgeScoreCard) {
        this.judgeScoreCard = judgeScoreCard;
    }

    public byte getNumRounds() {
        return (byte) this.rounds.size();
    }

    public List<Round> getRounds() {
        return this.rounds;
    }

    private void addRound(Round round) {
        this.rounds.add(round);
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        setJudgeScoreCard(judgeScoreCard);

        Optional<Round> round = Optional.empty();
        for (String score : this.judgeScoreCard) {
            round = Optional.ofNullable(RoundFactory.getRound(score));
            round.ifPresent(this::addRound);
        }
    }

    public String viewRounds() {
        StringBuilder roundsScores = new StringBuilder();
        int numRound = 1;

        for (Round round : rounds) {
            roundsScores.append(round.getRedBoxerScore() + "\t" + numRound + "\t" + round.getBlueBoxerScore());
            numRound++;
        }

        return roundsScores.toString();
    }

    public int getRedBoxerFinalScore() {
        int redBoxerFinalScore = 0;

        for (Round round : getRounds()) {
            redBoxerFinalScore += round.getRedBoxerScore();
        }
        return redBoxerFinalScore;
    }

    public int getBlueBoxerFinalScore() {
        int blueBoxerFinalScore = 0;

        for (Round round : getRounds()) {
            blueBoxerFinalScore += round.getBlueBoxerScore();
        }
        return blueBoxerFinalScore;
    }
}