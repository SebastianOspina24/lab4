/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

/**
 *
 * @author 2106913
 */

import hangman.model.French;
import hangman.model.Language;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.view.HangmanNoviolentoPanel;
import hangman.view.HangmanPanel;
import hangman.model.*;


public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);
        bind(Language.class).to(Spanish.class);
        bind(HangmanDictionary.class).to(FrenchDictionaryDataSource.class);
        bind(HangmanPanel.class).to(HangmanNoviolentoPanel.class);
        //bind(GameScore.class).to(BonusScore.class);
        bind(GameScore.class).to(PowerScore.class);
    }

}
