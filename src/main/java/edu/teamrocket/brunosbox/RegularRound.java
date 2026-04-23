package edu.teamrocket.brunosbox;

public class RegularRound implements Round{
    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public RegularRound(String roundScore) {
    this.roundScore = roundScore.replaceAll("\\s", "" );
    this.parseBoxerRoundScore();
    }

    private void parseBoxerRoundScore() {
        String[] score = this.roundScore.split("-", 2);
        this.redBoxerScore = Byte.parseByte(score[0]);
        this.blueBoxerScore = Byte.parseByte(score[1]);
    }

    public String getRoundScore() {
        return this.roundScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    @Override
    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    @Override
    public String toString() {
        return this.redBoxerScore + "-" + this.blueBoxerScore;
    }


}

