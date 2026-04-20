package edu.teamrocket.brunosbox;

public class KnockdownRound implements Round {
    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public KnockdownRound(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        parseBoxerScore();
    }

    public String getRoundScore() {
        return this.roundScore;
    }

    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    private void parseBoxerScore() {
        String[] scores = getRoundScore().split("-", 2);
        this.redBoxerScore = Byte.parseByte(scores[0]);
        this.blueBoxerScore = Byte.parseByte(scores[1]);
    }
}
