package edu.teamrocket.brunosbox;

public class PointsDeducted {
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

    private byte substractPoints(String score) {
        String numbers[] = score.replaceAll("\\s", "").split(",");
        byte finalScore;

        if (Byte.parseByte(numbers[0]) > Byte.parseByte(numbers[1])) {
            finalScore = (byte) (Byte.parseByte(numbers[0]) - 1);
        }
        else  {
            finalScore = (byte) (Byte.parseByte(numbers[1]) - 1);
        }

        return finalScore;
    }

    private void parseBoxerRoundScore() {
        String[] scores = this.roundScore.split("-", 2);
//        this.redBoxerScore = Byte.parseByte(score[0]);
//        this.blueBoxerScore = Byte.parseByte(score[1]);

        for (String score : scores) {
            if (score.contains(",")) {

            }
        }
    }
}



