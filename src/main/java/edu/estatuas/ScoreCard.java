package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {
    private String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;
    private List<Round> rounds = new ArrayList<Round>();

    ScoreCard(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setRCorner(String redCorner) {
        this.redCorner = redCorner;
    }

    public String getRCorner() {
        return this.redCorner;
    }
    public void setBCorner(String blueCorner) {
        this.blueCorner = blueCorner;
    }

    public String getBCorner() {
        return this.blueCorner;
    }
    
    public byte getNumRounds() {
        return (byte) this.rounds.size();
    }

    private void setJudgeScoreCard(String[] scoreCard) {
        this.judgeScoreCard = scoreCard;
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        this.setJudgeScoreCard(judgeScoreCard);
    }
    
    @Override
    public String toString() {
        return "\t\t    " + getColor() + "\n" +
                "\t" + getBCorner() + "\t" + getRCorner() + "\n" + 
                "\t\t  " + getNumRounds() + " rounds\n" +
                "   Round   Score   Round   Score   Round\n" +
                "   Score   Total           Total   Score\n" +
                ;
    }


}
