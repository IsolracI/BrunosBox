package edu.estatuas;

public class ScoreCard {
    private String color = "";
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;
    private Round[] rounds;

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
    @Override
    public String toString() {
        return "\t\t" + getColor() + "\n" +
                "\t" + getBCorner() + "\t" + getRCorner() + "\n";
    }
}
