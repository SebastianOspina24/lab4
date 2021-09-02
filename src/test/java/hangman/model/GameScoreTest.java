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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GameScoreTest {
    
}
