/***************************************************************
* file: HangManException.java
* author: Juan Sebastian Ospina
          Diego Alejandro Leon
* class: CVDS 01 - Ciclos de Vida y Desarrollo de Software
*
* assignment: Swing Project v1.0
*
****************************************************************/ 

package hangman.model;

public class HangManException extends Exception{
    public static final String NEGATIVE_NUMBER = "Numbers out of range";

    /**
     * Constructor of HangManException
     * @param mensaje
     */
    public HangManException(String mensaje){
        super(mensaje);
    }
}
