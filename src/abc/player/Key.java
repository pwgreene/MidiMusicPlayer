package abc.player;

import java.util.Map;

public class Key {
    
    private int[] accidentals = new int[7];
    private Map<String, int[]> keyMap;
    private final String theKey;
      
    /**
     * Initializes a new KeySignature object.
     * @param key is inputed as a string (ex "C", "D#m", "Gb")
     * @throws IllegalArgumentException if the input is not a valid key signature
     */
    public Key(String key) {
        this.theKey = key;
        if (key.equals("C")) this.accidentals = new int[] {0,0,0,0,0,0,0};
        else if (key.equals("Ebm")) this.accidentals = new int[] {-1,-1,-1,-1,-1,0,-1};
        else if (key.equals("Cb")) this.accidentals = new int[] {-1,-1,-1,-1,-1,-1,-1};
        else if (key.equals("Am")) this.accidentals = new int[] {0,0,0,0,0,0,0};
        else if (key.equals("G")) this.accidentals = new int[] {0,0,0,0,0,1,0};
        else if (key.equals("Em")) this.accidentals = new int[] {0,0,0,0,0,1,0};
        else if (key.equals("D")) this.accidentals = new int[] {0,0,1,0,0,1,0};
        else if (key.equals("Bm")) this.accidentals = new int[] {0,0,1,0,0,1,0};
        else if (key.equals("A")) this.accidentals = new int[] {0,0,1,0,0,1,1};
        else if (key.equals("F#m")) this.accidentals = new int[] {0,0,1,0,0,1,1};
        else if (key.equals("E")) this.accidentals = new int[] {0,0,1,1,0,1,1};
        else if (key.equals("C#m")) this.accidentals = new int[] {0,0,1,1,0,1,1};
        else if (key.equals("B")) this.accidentals = new int[] {1,1,1,0,0,1,1};
        else if (key.equals("Ab")) this.accidentals = new int[] {-1,-1,0,-1,-1,0,0};
        else if (key.equals("Fm")) this.accidentals = new int[] {-1,-1,0,-1,-1,0,0};
        else if (key.equals("Db")) this.accidentals = new int[] {-1,-1,0,-1,-1,0,-1};
        else if (key.equals("Bbm")) this.accidentals = new int[] {-1,-1,0,-1,-1,0,-1};
        else if (key.equals("A#m")) this.accidentals = new int[] {1,1,1,1,1,1,1};
        else if (key.equals("F")) this.accidentals = new int[] {0,-1,0,0,0,0,0};
        else if (key.equals("Dm")) this.accidentals = new int[] {0,-1,0,0,0,0,0};
        else if (key.equals("Bb")) this.accidentals = new int[] {0,-1,0,0,-1,0,0};
        else if (key.equals("G#m")) this.accidentals = new int[] {1,1,1,0,0,1,1};
        else if (key.equals("F#")) this.accidentals = new int[] {1,1,1,1,0,1,1};
        else if (key.equals("D#m")) this.accidentals = new int[] {1,1,1,1,0,1,1};
        else if (key.equals("C#")) this.accidentals = new int[] {1,1,1,1,1,1,1};
        else if (key.equals("Gm")) this.accidentals = new int[] {0,-1,0,0,-1,0,0};
        else if (key.equals("Eb")) this.accidentals = new int[] {-1,-1,0,0,-1,0,0};
        else if (key.equals("Cm")) this.accidentals = new int[] {-1,-1,0,0,-1,0,0};   
        else if (key.equals("Gb")) this.accidentals = new int[] {-1,-1,-1,-1,-1,0,-1};
        else if (key.equals("Abm")) this.accidentals = new int[] {-1,-1,-1,-1,-1,-1,-1};
        else {
            throw new IllegalArgumentException("Invalid Key Signature");
        }
    }
    
    /**
     * Get the necessary accidentals for a key signature
     * @return The accidental array that corresponds to the accidentals on the notes [A,B,C,D,E,F,G]
     * -1 indicates flat on that note, 0 indicates natural, and 1 indicates sharp
     */
    public int[] getAccidentals() {
        return accidentals;
    }
    /**
     * Maps A to 0, B to 1, etc, up until G to 6. Case-insensitive.
     * @param noteString must be A,B,C,D,E,F, or G
     * @return the integer corresponding to that character. -1 if that letter isn't A,B,C,D,E,F, or G
     */
    public static int getNoteInteger(String noteString) {
        if (noteString.equalsIgnoreCase("A")) {
            return 0;
        } else if (noteString.equalsIgnoreCase("B")) {
            return 1;
        } else if (noteString.equalsIgnoreCase("C")) {
            return 2;
        } else if (noteString.equalsIgnoreCase("D")) {
            return 3;
        } else if (noteString.equalsIgnoreCase("E")) {
            return 4;
        } else if (noteString.equalsIgnoreCase("F")) {
            return 5;
        } else if (noteString.equalsIgnoreCase("G")) {
            return 6;
        } else {
            return -1;
        }
    }
}   