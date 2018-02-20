package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if (handSign.equals("rock")) {
        } else if (handSign.equals("paper")) {
            return "scissors";
        } else {
            return "rock";
        }
        return "paper";
    }


    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if (handSign.equals("rock")) {
        } else if (handSign.equals("paper")) {
            return "rock";
        } else {
            return "paper";
        }
        return "scissors";
    }


    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if (handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("scissor")) {
            return "rock";
        }
        if (handSignOfPlayer1.equals("scissors") && handSignOfPlayer2.equals("paper")) {
            return "scissors";
        }
        if (handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("rock")) {
            return "paper";
        }
        if (handSignOfPlayer2.equals("rock") && handSignOfPlayer1.equals("scissor")) {
            return "rock";
        }
        if (handSignOfPlayer2.equals("scissors") && handSignOfPlayer1.equals("paper")) {
            return "scissors";
        }
        if (handSignOfPlayer2.equals("paper") && handSignOfPlayer1.equals("rock")) {
            return "paper";
        }else {
            return "rock";
        }
    }
}