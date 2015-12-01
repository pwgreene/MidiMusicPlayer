package abc.player;

public enum Key {

    C_MAJOR, G_MAJOR, D_MAJOR, A_MAJOR, E_MAJOR, B_MAJOR, Fs_MAJOR, Cs_MAJOR,
    A_MINOR, E_MINOR, B_MINOR, Fs_MINOR, Cs_MINOR, Gs_MINOR, Ds_MINOR, As_MINOR,
    F_MAJOR, Bb_MAJOR, Eb_MAJOR, Ab_MAJOR, Db_MAJOR, Gb_MAJOR, Cb_MAJOR,
    D_MINOR, G_MINOR, C_MINOR, F_MINOR, Bb_MINOR, Eb_MINOR, Ab_MINOR;

    private int[] accidentals;
    
    /**
     * The accidental array corresponds to the accidentals on the notes [A,B,C,D,E,F,G]
     * -1 indicates flat on that note, 0 indicates natural, and 1 indicates sharp
     */
    static {
        //                               A  B  C  D  E  F  G
        C_MAJOR.accidentals = new int[]{ 0, 0, 0, 0, 0, 0, 0};
        A_MINOR.accidentals = new int[]{ 0, 0, 0, 0, 0, 0, 0};
        
        G_MAJOR.accidentals = new int[]{ 0, 0, 0, 0, 0, 1, 0};
        E_MINOR.accidentals = new int[]{ 0, 0, 0, 0, 0, 1, 0};
        
        D_MAJOR.accidentals = new int[]{ 0, 0, 1, 0, 0, 1, 0};
        B_MINOR.accidentals = new int[]{ 0, 0, 1, 0, 0, 1, 0};
        
        A_MAJOR.accidentals = new int[]{ 0, 0, 1, 0, 0, 1, 1};
        Fs_MINOR.accidentals =new int[]{ 0, 0, 1, 0, 0, 1, 1};
        
        E_MAJOR.accidentals = new int[]{ 0, 0, 1, 1, 0, 1, 1};
        Cs_MINOR.accidentals =new int[]{ 0, 0, 1, 1, 0, 1, 1};
        
        B_MAJOR.accidentals = new int[]{ 1, 0, 1, 1, 0, 1, 1};
        Gs_MINOR.accidentals =new int[]{ 1, 0, 1, 1, 0, 1, 1};
        
        Fs_MAJOR.accidentals =new int[]{ 1, 0, 1, 1, 1, 1, 1};
        Ds_MINOR.accidentals =new int[]{ 1, 0, 1, 1, 1, 1, 1};
        
        Cs_MAJOR.accidentals =new int[]{ 1, 1, 1, 1, 1, 1, 1};
        As_MINOR.accidentals =new int[]{ 1, 1, 1, 1, 1, 1, 1};
        //                               A  B  C  D  E  F  G
        F_MAJOR.accidentals = new int[]{ 0,-1, 0, 0, 0, 0, 0};
        D_MINOR.accidentals = new int[]{ 0,-1, 0, 0, 0, 0, 0};
        
        Bb_MAJOR.accidentals =new int[]{ 0,-1, 0, 0, -1, 0, 0};
        G_MINOR.accidentals = new int[]{ 0,-1, 0, 0, -1, 0, 0};
        
        Eb_MAJOR.accidentals =new int[]{-1,-1, 0, 0, -1, 0, 0};
        C_MINOR.accidentals = new int[]{-1,-1, 0, 0, -1, 0, 0};
        
        Ab_MAJOR.accidentals =new int[]{-1,-1, 0, -1, -1, 0, 0};
        F_MINOR.accidentals = new int[]{-1,-1, 0, -1, -1, 0, 0};
        
        Db_MAJOR.accidentals =new int[]{-1,-1, 0, -1, -1, 0,-1};
        Bb_MINOR.accidentals =new int[]{-1,-1, 0, -1, -1, 0,-1};
        
        Gb_MAJOR.accidentals =new int[]{-1,-1, -1, -1, -1, 0,-1};
        Eb_MINOR.accidentals =new int[]{-1,-1, -1, -1, -1, 0,-1};
        
        Cb_MAJOR.accidentals =new int[]{-1,-1, -1, -1, -1, -1,-1};
        Ab_MINOR.accidentals =new int[]{-1,-1, -1, -1, -1, -1,-1};
    }
    
    public int[] accidentals(Key key) {
        return key.accidentals;
    }
}
