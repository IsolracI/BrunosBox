package edu.estatuas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ScoreCard {
    private String color = "";
    private String redCorner ="";
    private String blueCorner = "";
    private String[] judgeScoreCard; // esto no aparece como ArrayList en el UML?
    private Byte redBoxerFinalScore = 0; // esto no aparece en el UML???
    private Byte blueBoxerFinalScore = 0; // aunque estaba pensando que la respuesta a uno de los problemas que estaba teniendo era esto...
    private List<Round> rounds = new ArrayList<Round>();

    ScoreCard(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRCorner(String redBoxer) {
        this.redCorner = redBoxer;
    }
    
    public void setBCorner(String blueBoxer) {
        this.blueCorner = blueBoxer;
    }

    public byte getNumRounds() {
        return (byte) this.rounds.size();
    }

    public List<Round> getRounds() { // me voy a cagar en los UML...
        return Collections.unmodifiableList(this.rounds); // este método devuelve la lista que le diste (this.rounds) de manera que no se puede modificar.
    }

    private void addRound(Round round) {
        this.rounds.add(round);
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        this.judgeScoreCard = judgeScoreCard;

        Optional<Round> round = Optional.empty();
        for(String roundScore : this.judgeScoreCard) {
            round = Optional.ofNullable(RoundFactory.getRound(roundScore));
            round.ifPresent(this::addRound);
        }
    }

    private String viewRounds() {
        StringBuilder roundsView = new StringBuilder();
        roundsView.append("\tRound \t Score \t Round \t Score \t Round\n" +
                         "\tScore \t Total \t       \t Total \t Score");
        
        byte roundNum = 1;
        byte redBoxerScoreTotal = 0;
        byte blueBoxerScoreTotal = 0;

        for (Round round : this.rounds) {
            roundsView.append("\n\t").append(round.getRedBoxerScore())
                      .append("\t ").append(redBoxerScoreTotal += round.getRedBoxerScore())
                      .append("\t  ").append(roundNum++)
                      .append("\t ").append(blueBoxerScoreTotal += round.getBlueBoxerScore())
                      .append("\t").append(round.getBlueBoxerScore());
        }
        return roundsView.toString();
    }

    public byte getRedBoxerFinalScore() {
        if (this.redBoxerFinalScore == 0) {
            this.redBoxerFinalScore = this.getRounds().stream()
                                                      .map(Round::getRedBoxerScore)
                                                      .map(Byte::intValue)
                                                      .reduce(0, Integer::sum)
                                                      .byteValue();
        }
        return this.redBoxerFinalScore;
    }

    public byte getBlueBoxerFinalScore() {
        if (this.blueBoxerFinalScore == 0) {
            this.blueBoxerFinalScore = this.getRounds().stream()
                                                       .map(Round::getBlueBoxerScore)
                                                       .map(Byte::intValue)
                                                       .reduce(0, Integer::sum)
                                                       .byteValue();
        }
        return this.blueBoxerFinalScore;
    }

    @Override
    public String toString() {
        return  "\t\t\t " + this.color + "\n" +
                "\t     " + this.blueCorner + "     " + this.redCorner + "\n" +
                "\t\t       " + getNumRounds() + " rounds" + "\n" +
                viewRounds() + "\n" +
                "\t FINAL SCORE: " + this.getRedBoxerFinalScore() + " - " + this.getBlueBoxerFinalScore() + " FINAL SCORE";
    }

}
