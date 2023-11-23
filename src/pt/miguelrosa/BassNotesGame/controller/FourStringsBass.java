package pt.miguelrosa.BassNotesGame.controller;


import pt.miguelrosa.BassNotesGame.resources.GameTexts;

import java.util.Scanner;



public class FourStringsBass {

    private static NoteController noteController = new NoteController();
    private static GameTexts gameTexts = new GameTexts();
    private static String insertedAnswer;



    public static void mainGame(int manyStrings){
        Scanner playerAnswer = new Scanner(System.in);

        int pickedBassString = noteController.getStringFromSpecificBass(manyStrings); //CPU select random string
        int pickedBassFret   = noteController.getFretFromBassFretboard();    //CPU select random fret


        System.out.println("\nWhich note: String (" + pickedBassString + ") | Fret (" + pickedBassFret + ")");
        System.out.print(gameTexts.TXT_ANSWER);
        insertedAnswer = playerAnswer.nextLine();

        switch (pickedBassString) {
            case 1: //corda (E) Mi
                noteController.guessNoteStringE(insertedAnswer, pickedBassFret);
                break;
            case 2: //corda (A) La
                noteController.guessNoteStringA(insertedAnswer, pickedBassFret);
                break;
            case 3: //corda (D) Re
                noteController.guessNoteStringD(insertedAnswer, pickedBassFret);
                break;
            case 4: //corda (G) Sol
                noteController.guessNoteStringG(insertedAnswer, pickedBassFret);
                break;
        }
    }


}
