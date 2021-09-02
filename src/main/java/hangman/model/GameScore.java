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

public interface GameScore {
    
    /**
     * Calculate the game score 
     * @pre correctCount and incorrectCount  must be positives
     * @param correctCount correct Count of letters 
     * @param incorrectCount Incorrect Count of letters
     * @return Score get 
     */
    public int calculateScore(int correctCount, int incorrectCount);
}