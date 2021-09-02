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

public class BonusScore implements GameScore{

    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangManException{
        if(correctCount < 0 || incorrectCount < 0){
            throw new HangManException(HangManException.NEGATIVE_NUMBER);
        }
        return (incorrectCount>correctCount*2)?0:correctCount*10-incorrectCount*5;
    }
    
}
