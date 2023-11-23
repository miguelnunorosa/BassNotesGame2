package pt.miguelrosa.BassNotesGame.model;


public class Note {

                                           //  DO   RE   MI   FA   SOL  LA   SI
    private final static String[] BASS_NOTES = {"C", "D", "E", "F", "G", "A", "B"};

                                                    //  0    1    2    3    4    (4 string bass, increment 1 to array)
    private final static String[] BASS_STRING_NOTES = {"B", "E", "A", "D", "G"};

    private final String[] G_STRING_NOTES_ASC = {"G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G"};
    private final String[] D_STRING_NOTES_ASC = {"D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D"};
    private final String[] A_STRING_NOTES_ASC = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A"};
    private final String[] E_STRING_NOTES_ASC = {"E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E"};
    private final String[] B_STRING_NOTES_ASC = {"B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};






    // Get array size

    public int getArrayNotesLenght(){ return BASS_NOTES.length; }

    public int getArrayStringsLenght(){ return BASS_STRING_NOTES.length; }

    public int getGStringNotesAscLenght(){ return G_STRING_NOTES_ASC.length; }

    public int getDStringNotesAscLenght(){ return D_STRING_NOTES_ASC.length; }

    public int getEStringNotesAscLenght(){ return E_STRING_NOTES_ASC.length; }

    public int getAStringNotesAscLenght(){ return A_STRING_NOTES_ASC.length; }

    public int getBStringNotesAscLenght(){ return B_STRING_NOTES_ASC.length; }




    //Get position from each array (bass string)

    public String[] getBassNotesName(){ return BASS_NOTES; } //name notes
    public String[] getBassStringsName(){ return BASS_STRING_NOTES; } //name string

    public String getGStringAscPosition(int stringPosition){ return G_STRING_NOTES_ASC[stringPosition]; }
    public String getDStringAscPosition(int stringPosition){ return D_STRING_NOTES_ASC[stringPosition]; }
    public String getEStringAscPosition(int stringPosition){ return E_STRING_NOTES_ASC[stringPosition]; }
    public String getAStringAscPosition(int stringPosition){ return A_STRING_NOTES_ASC[stringPosition]; }
    public String getBStringAscPosition(int stringPosition){ return B_STRING_NOTES_ASC[stringPosition]; }



}
