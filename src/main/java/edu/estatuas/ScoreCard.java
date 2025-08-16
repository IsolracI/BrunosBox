package edu.estatuas;

import java.util.ArrayList;

public class ScoreCard {
    private String color;
    private String redCorner;
    private String blueCorner;
    private ArrayList<String> judgeScoreCard;
    private ArrayList<Round> rounds;

    ScoreCard(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setRCorner(String redBoxer) {
        this.redCorner = redBoxer;
    }
    
    public String getRCorner() {
        return this.redCorner;
    }

    public void setBCorner(String blueBoxer) {
        this.blueCorner = blueBoxer;
    }

    public String getBCorner() {
        return this.blueCorner;
    }

    public String toString() {
        return  "\t\t     " + getColor() + "\n" +
                "\t" + getBCorner() + "      " + getRCorner() + "\n";
    }

}
