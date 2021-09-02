/***************************************************************
* file: GameScore.java
* author: Juan Sebastian Ospina
          Diego Alejandro Leon
* class: CVDS 01 - Ciclos de Vida y Desarrollo de Softaware
*
* assignment: Swing Project v1.0
*
****************************************************************/ 

package hangman.model;

import java.lang.Math;

public class PowerScore implements GameScore{

    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int score = 0;
        for (int i = 1 ; i <= correctCount; i++) score += (int)Math.pow(5, i);
        score -= 8*incorrectCount;
        return (score > 500)?500:(score<0)?0:score;
    }
    
}
