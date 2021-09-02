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

public class OriginalScore implements GameScore{

    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangManException{
        if(correctCount < 0 || incorrectCount < 0){
            throw new HangManException(HangManException.NEGATIVE_NUMBER);
        }
        return (incorrectCount<10)?100-incorrectCount*10:0;
    }
    
}
