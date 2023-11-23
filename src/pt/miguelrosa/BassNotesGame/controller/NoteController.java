package pt.miguelrosa.BassNotesGame.controller;


import pt.miguelrosa.BassNotesGame.model.Note;
import pt.miguelrosa.BassNotesGame.resources.GameTexts;

import java.util.Random;



public class NoteController {

    private static final Note notes = new Note();
    private static final GameTexts gameTexts = new GameTexts();

    private static final Random numRandom = new Random();

    private static int getFretPosition, getStringFromFourBassString, getStringFromFiveBassString;






    /**
     * Method for randomly choosing (between 1 and 12) the position on the instrument neck
     */
    public static int getFretFromBassFretboard(){
        return getFretPosition = numRandom.nextInt(11);
    }



    public static int getStringFromSpecificBass(int manyStrings){

        if(manyStrings == 4){
            return getStringFromFourBassString = numRandom.nextInt(1, notes.getArrayStringsLenght() );
        }else{
            int positionString = numRandom.nextInt(4);
            return getStringFromFiveBassString = positionString+1;
        }

    }



    /**
     * Method that checks whether the player hit the note indicated for the G string (in portuguese 'corda SOL')
     *
     * @param pickedBassFret Indicates the choice of position on the instrument neck
     * @param playerAnswer get the players answer
     */
    public static void guessNoteStringG(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getGStringAscPosition(pickedBassFret) ) ) {
            System.out.println(gameTexts.TXT_RIGHT_ANSWER);
        }else{
            System.out.println(gameTexts.TXT_WRONG_ANSWER + notes.getGStringAscPosition(pickedBassFret));
        }
    }


    /**
     * Method that checks whether the player hit the note indicated for the D string (in portuguese 'corda RÉ')
     *
     * @param pickedBassFret Indicates the choice of position on the instrument neck
     * @param playerAnswer get the players answer
     */
    public static void guessNoteStringD(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getDStringAscPosition(pickedBassFret) ) ) {
            System.out.println(gameTexts.TXT_RIGHT_ANSWER);
        }else{
            System.out.println(gameTexts.TXT_WRONG_ANSWER + notes.getDStringAscPosition(pickedBassFret));
        }
    }


    /**
     * Method that checks whether the player hit the note indicated for the D string (in portuguese 'corda LÁ')
     *
     * @param pickedBassFret Indicates the choice of position on the instrument neck
     * @param playerAnswer get the players answer
     */
    public static void guessNoteStringA(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getAStringAscPosition(pickedBassFret) ) ) {
            System.out.println(gameTexts.TXT_RIGHT_ANSWER);
        }else{
            System.out.println(gameTexts.TXT_WRONG_ANSWER + notes.getAStringAscPosition(pickedBassFret));
        }
    }


    /**
     * Method that checks whether the player hit the note indicated for the D string (in portuguese 'corda MI')
     *
     * @param pickedBassFret Indicates the choice of position on the instrument neck
     * @param playerAnswer get the players answer
     */
    public static void guessNoteStringE(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getEStringAscPosition(pickedBassFret) ) ) {
            System.out.println(gameTexts.TXT_RIGHT_ANSWER);
        }else{
            System.out.println(gameTexts.TXT_WRONG_ANSWER + notes.getEStringAscPosition(pickedBassFret));
        }
    }


    /**
     * Method that checks whether the player hit the note indicated for the B string (in portuguese 'corda SI')
     *
     * @param pickedBassFret Indicates the choice of position on the instrument neck
     * @param playerAnswer get the players answer
     */
    public static void guessNoteStringB(String playerAnswer, int pickedBassFret){
        if( playerAnswer.equals( notes.getBStringAscPosition(pickedBassFret) ) ) {
            System.out.println(gameTexts.TXT_RIGHT_ANSWER);
        }else{
            System.out.println(gameTexts.TXT_WRONG_ANSWER + notes.getBStringAscPosition(pickedBassFret));
        }
    }


}
