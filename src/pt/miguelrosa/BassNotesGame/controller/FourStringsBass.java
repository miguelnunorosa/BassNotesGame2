package pt.miguelrosa.BassNotesGame.controller;


import pt.miguelrosa.BassNotesGame.resources.GameTexts;

import java.util.Scanner;



public class FourStringsBass {

    private final NoteController noteController = new NoteController();
    private final GameTexts gameTexts = new GameTexts();
    private static String insertedAnswer;



    public static void mainGame(int manyStrings){
        Scanner playerAnswer = new Scanner(System.in);

        int pickedBassString = NoteController.getStringFromSpecificBass(manyStrings); //CPU select random string
        int pickedBassFret   = NoteController.getFretFromBassFretboard();    //CPU select random fret


        System.out.println("\nWhich note: String (" + pickedBassString + ") | Fret (" + pickedBassFret + ")");
        System.out.print(GameTexts.TXT_ANSWER);
        insertedAnswer = playerAnswer.nextLine().toUpperCase();

        switch (pickedBassString) {
            case 1: //corda (E) Mi
                NoteController.guessNoteStringE(insertedAnswer, pickedBassFret);
                break;
            case 2: //corda (A) La
                NoteController.guessNoteStringA(insertedAnswer, pickedBassFret);
                break;
            case 3: //corda (D) Re
                NoteController.guessNoteStringD(insertedAnswer, pickedBassFret);
                break;
            case 4: //corda (G) Sol
                NoteController.guessNoteStringG(insertedAnswer, pickedBassFret);
                break;
        }
    }


}
