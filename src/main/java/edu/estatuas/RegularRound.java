package edu.estatuas;

import java.util.ArrayList;

public class RegularRound implements Round{
    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    RegularRound(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.parseBoxerRoundScore();
    }
    
    public String getRoundScore() {
        return this.roundScore;
    }

    private void parseBoxerRoundScore() {
        String[] scores = getRoundScore().split("-", 2);
        this.redBoxerScore = Byte.parseByte(scores[0]);
        this.blueBoxerScore = Byte.parseByte(scores[1]);
    }

    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }
}
