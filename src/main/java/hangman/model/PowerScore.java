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
    public int calculateScore(int correctCount, int incorrectCount) throws HangManException{
        if(correctCount < 0 || incorrectCount < 0){
            throw new HangManException(HangManException.NEGATIVE_NUMBER);
        }
        int score = (correctCount ==0)?0:(int)Math.pow(5, correctCount);

        score -= 8*incorrectCount;
        return (score > 500)?500:(score<0)?0:score;
    }
    
}
