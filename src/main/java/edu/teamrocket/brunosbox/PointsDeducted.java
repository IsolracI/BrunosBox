package edu.teamrocket.brunosbox;

public class PointsDeducted implements Round{
    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public PointsDeducted(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.parseBoxerRoundScore();
    }

    String getRoundScore() {
        return this.roundScore;
    }

    private byte getBoxerScore(String score) {
        String[] numbers = score.replaceAll("\\s", "").split(",");
        byte finalScore;

        if (Byte.parseByte(numbers[0]) > Byte.parseByte(numbers[1])) {
            finalScore = Byte.parseByte(numbers[0]);
        }
        else  {
            finalScore = Byte.parseByte(numbers[1]);
        }

        return finalScore;
    }

    private void parseBoxerRoundScore() {
        String[] scores = this.roundScore.split("-", 2);

        if (scores[0].contains(",")) {
            this.redBoxerScore = getBoxerScore(scores[0]);
            this.blueBoxerScore = Byte.parseByte(scores[1]);
        }
        else {
            this.redBoxerScore = Byte.parseByte(scores[0]);
            this.blueBoxerScore = getBoxerScore(scores[1]);
        }
    }

    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }
}