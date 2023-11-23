package pt.miguelrosa.BassNotesGame.controller;


import pt.miguelrosa.BassNotesGame.resources.Settings;
import pt.miguelrosa.BassNotesGame.view.Graphic;

import java.util.Scanner;



public class Game {

    private static final Graphic graphics = new Graphic();
    private static final Settings settings = new Settings();
    private static final FourStringsBass fourStringsBass = new FourStringsBass();
    private static final FiveStringsBass fiveStringsBass = new FiveStringsBass();

    private static int manyStrings;




    public void startGame(){

        Scanner playerAnswer = new Scanner(System.in);
        int optionFromMenu;


        settings.clearScreen();
        graphics.mainMenu();
        optionFromMenu = playerAnswer.nextInt(); //get player answer according to the menu options

        switch (optionFromMenu){
            case 1:
                settings.clearScreen();
                askHowManyStrings();
                gameWithSelectedBass(manyStrings);
            case 2:
                graphics.showNotes();
                break;
            case 3:
                graphics.howToPlay();
                break;
            case 0:
                System.exit(0);
        }

    }






    private static void askHowManyStrings() {
        Scanner playerAnswer = new Scanner(System.in);
        settings.clearScreen();

        do{
            System.out.println("How many strings does the bass have? (4 or 5)? ");
            manyStrings = playerAnswer.nextInt();

            if(manyStrings < 4 || manyStrings > 5) System.out.println("Wrong option. Try again. ");

        }while( manyStrings < 4 || manyStrings > 5);

    }


    private void gameWithSelectedBass(int manyStrings){

        if(manyStrings == 4) {
            do {
                settings.clearScreen();
                fourStringsBass.mainGame(manyStrings);
            } while (true);
        }else{
            do {
                settings.clearScreen();
                fiveStringsBass.mainGame(manyStrings);
            } while (true);
        }

    }



}
