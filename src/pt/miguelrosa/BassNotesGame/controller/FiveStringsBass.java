package pt.miguelrosa.BassNotesGame.controller;


import pt.miguelrosa.BassNotesGame.resources.GameTexts;

import java.util.Scanner;



public class FiveStringsBass {

    private static NoteController noteController = new NoteController();
    private static GameTexts gameTexts = new GameTexts();



    public void mainGame(int manyStrings){
        Scanner playerAnswer = new Scanner(System.in);
        String insertedAnswer;
        int pickedBassString, pickedBassFret;


        pickedBassString = noteController.getStringFromSpecificBass(manyStrings); //CPU select random string
        pickedBassFret   = noteController.getFretFromBassFretboard();             //CPU select random fret


        System.out.println("\nWhich note: String (" + pickedBassString + ") | Fret (" + pickedBassFret + ")");
        System.out.print(gameTexts.TXT_ANSWER);
        insertedAnswer = playerAnswer.nextLine().toUpperCase();

        switch (pickedBassString) {
            case 0: //corda (B) Si
                NoteController.guessNoteStringB(insertedAnswer, pickedBassFret);
                break;
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
