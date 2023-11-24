package pt.miguelrosa.BassNotesGame.model;


public class Note {

                                                  //  DO   RE   MI   FA   SOL  LA   SI
    private final static String[] BASS_ROOT_NOTES = {"C", "D", "E", "F", "G", "A", "B"};

                                                    //  0    1    2    3    4    (4 string bass, increment 1 to array)
    private final static String[] BASS_STRING_NOTES = {"B", "E", "A", "D", "G"};

    private final String[] G_STRING_NOTES_ASC = {"G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G"};
    private final String[] G_STRING_NOTES_DSC = {"G", "Ab", "A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G"};

    private final String[] D_STRING_NOTES_ASC = {"D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D"};
    private final String[] D_STRING_NOTES_DSC = {"D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B", "C", "Db", "D"};

    private final String[] A_STRING_NOTES_ASC = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A"};
    private final String[] A_STRING_NOTES_DSC = {"A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A"};

    private final String[] E_STRING_NOTES_ASC = {"E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E"};
    private final String[] E_STRING_NOTES_DSC = {"E", "F", "Gb", "G", "Ab", "A", "Bb", "B", "C", "Db", "D", "Eb", "E"};

    private final String[] B_STRING_NOTES_ASC = {"B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    private final String[] B_STRING_NOTES_DSC = {"B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B"};






    // Get array size

    public int getArrayNotesLenght(){ return BASS_ROOT_NOTES.length; }

    public int getArrayStringsLenght(){ return BASS_STRING_NOTES.length; }


    public int getGStringNotesAscLenght(){ return G_STRING_NOTES_ASC.length; }
    public int getGStringNotesDscLenght(){ return G_STRING_NOTES_DSC.length; }
    public int getDStringNotesAscLenght(){ return D_STRING_NOTES_ASC.length; }
    public int getDStringNotesDscLenght(){ return D_STRING_NOTES_DSC.length; }
    public int getEStringNotesAscLenght(){ return E_STRING_NOTES_ASC.length; }
    public int getEStringNotesDscLenght(){ return E_STRING_NOTES_DSC.length; }
    public int getAStringNotesAscLenght(){ return A_STRING_NOTES_ASC.length; }
    public int getAStringNotesDscLenght(){ return A_STRING_NOTES_DSC.length; }
    public int getBStringNotesAscLenght(){ return B_STRING_NOTES_ASC.length; }
    public int getBStringNotesDscLenght(){ return B_STRING_NOTES_DSC.length; }




    //Get position from each array (bass string)
    public String[] getBassNotesName(){ return BASS_ROOT_NOTES; } //name notes
    public String[] getBassStringsName(){ return BASS_STRING_NOTES; } //name string



    public String getGStringAscPosition(int stringPosition){ return G_STRING_NOTES_ASC[stringPosition]; }
    public String getGStringDscPosition(int stringPosition){ return G_STRING_NOTES_DSC[stringPosition]; }
    public String getDStringAscPosition(int stringPosition){ return D_STRING_NOTES_ASC[stringPosition]; }
    public String getDStringDscPosition(int stringPosition){ return D_STRING_NOTES_DSC[stringPosition]; }
    public String getEStringAscPosition(int stringPosition){ return E_STRING_NOTES_ASC[stringPosition]; }
    public String getEStringDscPosition(int stringPosition){ return E_STRING_NOTES_DSC[stringPosition]; }
    public String getAStringAscPosition(int stringPosition){ return A_STRING_NOTES_ASC[stringPosition]; }
    public String getAStringDscPosition(int stringPosition){ return A_STRING_NOTES_DSC[stringPosition]; }
    public String getBStringAscPosition(int stringPosition){ return B_STRING_NOTES_ASC[stringPosition]; }
    public String getBStringDscPosition(int stringPosition){ return B_STRING_NOTES_DSC[stringPosition]; }






}
