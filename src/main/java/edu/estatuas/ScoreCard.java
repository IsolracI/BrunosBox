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
}
