package pt.miguelrosa.BassNotesGame.controller;


import pt.miguelrosa.BassNotesGame.resources.GameTexts;

import java.util.Scanner;



public class FourStringsBassController {

    private static final NoteController noteController = new NoteController();
    private final GameTexts gameTexts = new GameTexts();
    private static String insertedAnswer;
    private static int pickedBassString, pickedBassFret, countShowedNotes, countUserCorrectAnswers;



    public static void mainGame(int manyStrings){
        Scanner playerAnswer = new Scanner(System.in);

        pickedBassString = noteController.getStringFromSpecificBass(manyStrings); //CPU select random string
        pickedBassFret   = noteController.getFretFromBassFretboard();    //CPU select random fret


        System.out.println("\nWhich note: String (" + pickedBassString + ") | Fret (" + pickedBassFret + ")");
        System.out.print(GameTexts.TXT_ANSWER);
        insertedAnswer = playerAnswer.nextLine().toUpperCase();

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

        countShowedNotes++;
        if(noteController.isIsCorrect() == true) countUserCorrectAnswers++;
    }







    public static int getCountUserCorrectAnswers() { return countUserCorrectAnswers; }

    public static int getCountShowedNotes() { return countShowedNotes; }


}
