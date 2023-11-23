package pt.miguelrosa.BassNotesGame.resources;


public class Settings {


    /**
     * Method to clear the console/terminal to show one window at a time
     */
    public void clearScreen(){

        final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";

        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
    }




}
