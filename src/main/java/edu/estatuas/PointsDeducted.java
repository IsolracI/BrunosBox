package edu.estatuas;

public class PointsDeducted implements Round{
    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    PointsDeducted(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.parseBoxerRoundScore();
    }

    private String getRoundScore() {
        return this.roundScore;
    }

    private Byte parseComaBlue(String score) {
        return Byte.parseByte(score.substring(0, score.indexOf(',')));
    }

    private Byte parseComaRed(String score) {
        return Byte.parseByte(score.substring(score.indexOf(',') + 1, score.length()));
    }

    private void parseBoxerRoundScore() {
        String[] scores = getRoundScore().split("-", 2);
        String redBoxerRoundScore = scores[0];
        String blueBoxerRoundScore = scores[1];

        if (redBoxerRoundScore.indexOf(',') == -1) {
            this.redBoxerScore = Byte.parseByte(redBoxerRoundScore);
            this.blueBoxerScore = this.parseComaBlue(blueBoxerRoundScore);
        }
        else {
            this.blueBoxerScore = Byte.parseByte(blueBoxerRoundScore);
            this.redBoxerScore = this.parseComaRed(redBoxerRoundScore);
        }
    }

    @Override
    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    @Override
    public String toString() {
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }
}