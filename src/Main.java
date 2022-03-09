/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 09-03-2022
Time: 23:13
File: Main.java */

public class Main {
    public static void main(String[] args) {
        ThrowDice throwDice = new ThrowDice();
        DiceOutcomes dice1 = throwDice.rollDice();
        DiceOutcomes dice2 = throwDice.rollDice();

        System.out.println("dice1 = " + dice1);
        System.out.println("dice2 = " + dice2);
    }
}