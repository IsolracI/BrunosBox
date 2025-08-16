package edu.estatuas;

public class RegularRound implements Round {
    private final String roundScore;
    private final byte redBoxerScore;
    private final byte blueBoxerScore;

    RegularRound(String roundScore) {
        this.roundScore = roundScore;
    
        String[] scores = roundScore.replaceAll(" ", "").split("-");
        this.redBoxerScore = Byte.parseByte(scores[0]) ;
        this.blueBoxerScore = Byte.parseByte(scores[1]);
    }

    public String getRoundScore() {
        return this.roundScore;
    }
 
    @Override
    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    public String toString() {
        return  "The round's scores are: " + getRoundScore() + "\n" +
                "the red boxer's score is: " + getRedBoxerScore() + "\n" +
                "the blue boxer's score is: " + getBlueBoxerScore();
    }

}
