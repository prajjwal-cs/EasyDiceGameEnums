/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 05-03-2022
Time: 17:40
File: RandomDice.java */

public class ThrowDice {
    public DiceOutcomes rollDice() {
        var randomOutcome = Double.valueOf(Math.random() * DiceOutcomes.values().length).intValue();

        for (DiceOutcomes diceOutcomes : DiceOutcomes.values()) {
            if (randomOutcome == diceOutcomes.ordinal())
                return randomOutcome;
        }
    }
}