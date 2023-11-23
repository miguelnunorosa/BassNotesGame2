package pt.miguelrosa.BassNotesGame.resources;




public class Settings {


    /**
     * Method to clear the console/terminal to show one window at a time
     */
    public static void clearScreen(){
        final String os = System.getProperty("os.name");

        try{
            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
            }else{
                Runtime.getRuntime().exec("clear");
            }
        }catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
