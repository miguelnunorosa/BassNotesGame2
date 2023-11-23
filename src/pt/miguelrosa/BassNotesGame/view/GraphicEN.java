package pt.miguelrosa.BassNotesGame.view;


public class GraphicEN {


    /**
     * Method to draw main menu
     */
    public void mainMenu(){
        System.out.println("# ============================ #");
        System.out.println("#       Bass Notes Memory      #");
        System.out.println("#                              #");
        System.out.println("# 1) Start Game                #");
        System.out.println("# 2) Show Musical Notes        #");
        System.out.println("# 3) How to Play               #");
        System.out.println("#                              #");
        System.out.println("# 9) About                     #");
        System.out.println("# 0) Exit                      #");
        System.out.println("# ============================ #\n");
        System.out.print("Insert the option: ");
    }


    /**
     * Method to draw help menu (explains how to play)
     */
    public void help(){
        System.out.println("# ========================================= #");
        System.out.println("#             Bass Notes Memory             #");
        System.out.println("#                                           #");
        System.out.println("# How to use:                               #");
        System.out.println("#    # (sharp)                              #");
        System.out.println("#    b (flat)                               #");
        System.out.println("#                                           #");
        System.out.println("# | Example:                             |  #");
        System.out.println("# |  -> Selected note was  D# (D sharp)  |  #");
        System.out.println("# |  -> user write:   D#                 |  #");
        System.out.println("# |                                      |  #");
        System.out.println("# |   For another notes, just type note  |  #");
        System.out.println("# |  name                                |  #");
        System.out.println("#                                           #");
        System.out.println("# ========================================= #");
    }


    /**
     * Method to draw graphics to show the selected bass (4 or 5 strings)
     * @param strings player set how many strings bass have
     */
    public void selectedBass(int strings){
        System.out.println("# =================== #");
        System.out.println("#                     #");
        System.out.println("#   " + strings + " BASS STRING   #");
        System.out.println("#                     #");
        System.out.println("# =================== #\n\n");
    }


    /**
     * Method to draw musical notes menu
     */
    public void showNotes(){
        System.out.println("# ================================= #");
        System.out.println("#           Bass Notes              #");
        System.out.println("#                                   #");
        System.out.println("#   Notes            Accidents      #");
        System.out.println("#     A              A#  /  Ab      #");
        System.out.println("#     B                             #");
        System.out.println("#     C              C#  /  Cb      #");
        System.out.println("#     D              D#  /  Db      #");
        System.out.println("#     E                             #");
        System.out.println("#     F              F#  /  Fb      #");
        System.out.println("#     G              G#  /  Gb      #");
        System.out.println("#                                   #");
        System.out.println("# ================================= #");
    }


    /**
     * Method to draw about menu
     */
    public void about(){
        System.out.println("# ========================================= #");
        System.out.println("#              Bass Notes Memory            #");
        System.out.println("#                                           #");
        System.out.println("# Developed by:                             #");
        System.out.println("#   Miguel Rosa                             #");
        System.out.println("#   November 23, 2023                       #");
        System.out.println("#                                           #");
        System.out.println("# github.com/miguelnunorosa/BassNotesGame2  #");
        System.out.println("#                                           #");
        System.out.println("#   Project to recycle knowledge such as    #");
        System.out.println("#  MVC pattern and OOP. Any suggestions     #");
        System.out.println("#  are welcome. Thanks.                     #");
        System.out.println("#                                           #");
        System.out.println("# ========================================= #");
    }



}