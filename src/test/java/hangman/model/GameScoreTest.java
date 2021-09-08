/***************************************************************
* file: GameScoreTest.java
* author: Juan Sebastian Ospina
          Diego Alejandro Leon
* class: CVDS 01 - Ciclos de Vida y Desarrollo de Software
*
* assignment: Swing Project v1.0
*
*Clases de Equivalencia de Variantes de GameScore:
* Casos generales:
* - Caso 1:(correctcount < 0, incorrectcount > 0)
* - Caso 2: (correctcount > 0, incorrectcount < 0)
* - Caso 3: (correctcount < 0, incorrectcount < 0) 
*OriginalScore: 
* - Caso 1: (0 < incorrectcount < 10 ,correctcount >= 0)
* - Caso 2:(incorrectcount > 10 ,correctcount >= 0)
* - Caso 3: (incorrectcount > correctcount *2, correctcount > 0) 
*BonusScore: 
* - Caso 1: (correctcount > 0, 0 < incorrectcount <= correctcount * 2)
* - Caso 2: (incorrectcount > correctcount *2, correctcount > 0)
*PowerScore: 
* - Caso 1: (incorrectcount*8 > 5^correctcount)
* - Caso 2: (incorrectcount*8 < 5^correctcount)
* - Caso 3:(incorrectcount > 0, correctcount > 0)
****************************************************************/

package hangman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.*;
import hangman.model.*;

public class GameScoreTest {
    @Test
    /**
     * We expect a exception
     */
    public void Case1GeneralOriginalScore(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(-1, 1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }
    @Test
    /**
     * We expect a exception
     */
    public void Case2GeneralOriginalScore(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(1, -1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }


    @Test
    /**
     * We expect a exception
     */
    public void Case3GeneralOriginalScore(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(-1, -1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }

    @Test
    /**
     * Result = 50
     */
    public void Case1OriginalScore(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(10, 5);
        assertEquals(50, result);
        }
        catch(HangManException e){
            fail();
           }
    }

    @Test
    /**
     * Result = 0
     */
    public void Case2OriginalScore(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(10, 12);
        assertEquals(0, result);
        }
        catch(HangManException e){
            fail();
           }
    }

    @Test
    /**
     * Result = 50
     */
    public void Case3OriginalScore(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(4, 5);
        assertEquals(50, result);
        }
        catch(HangManException e){
            fail();

           }
    }

    @Test
    /**
     * We expect a exception
     */
    public void Case1GeneralPowerScore(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(-1, 1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }

    @Test
    /**
     * We expect a exception
     */
    public void Case2GeneralPowerScore(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(1, -1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }
    
    @Test
    /**
     * We expect a exception
     */
    public void Case3GeneralPowerScore(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(-1, -1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }

    @Test
    /**
     * Result = 0
     */
    public void Case1PowerScore(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(2, 4);
        assertEquals(0, result);
        }
        catch(HangManException e){
            fail();

           }
    }

    @Test
    /**
     * Result = 93
     */
    public void Case2PowerScore(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(3, 4);
        assertEquals(93, result);
        }
        catch(HangManException e){
            fail();

           }
    }

    @Test
    /**
     * Result = 9
     */
    public void Case3PowerScore(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(4, 2);
        assertEquals(500, result);
        }
        catch(HangManException e){
            fail();

           }
    }

    @Test
    /**
     * We expect a exception
     */
    public void Case1GeneralBonusScore(){
        try{
            BonusScore score = new BonusScore();
        int result = score.calculateScore(-1, 1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }

    @Test
    /**
     * We expect a exception
     */
    public void Case2GeneralBonusScore(){
        try{
            BonusScore score = new BonusScore();
        int result = score.calculateScore(1, -1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);
        }
    }
    
    @Test
    /**
     * We expect a exception
     */
    public void Case3GeneralBonusScore(){
        try{
            BonusScore score = new BonusScore();
        int result = score.calculateScore(-1, -1);
        fail();
        }
        catch(HangManException e){
            assertEquals(e.getMessage(), HangManException.NEGATIVE_NUMBER);

           }
    }

    @Test
    /**
     * Result = 30
     */
    public void Case1BonusScore(){
        try{
        BonusScore score = new BonusScore();
        int result = score.calculateScore(4, 2);
        assertEquals(30, result);
        }
        catch(HangManException e){
            fail();

           }
    }

    @Test
    /**
     * Result = 0
     */
    public void Case2BonusScore(){
        try{
        BonusScore score = new BonusScore();
        int result = score.calculateScore(4, 9);
        assertEquals(0, result);
        }
        catch(HangManException e){
            fail();

           }
    }

    

   

}