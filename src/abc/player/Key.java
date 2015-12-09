package abc.player;

import java.util.HashMap;
import java.util.Map;

public class Key {
    
    private int[] accidentals = new int[7];
    private Map<String, int[]> keyMap;
    private final String theKey;
    
    
    /**
     * Initializes a new KeySignature object.
     * @param key is inputed as a string (ex "C", "D#m", "Gb")
     */
    public Key(String key) {
        this.theKey = key;
        this.keyMap = this.getKeyMap();
        this.accidentals = this.keyMap.get(key);
    }
    
    /**
     * The accidental array corresponds to the accidentals on the notes [A,B,C,D,E,F,G]
     * -1 indicates flat on that note, 0 indicates natural, and 1 indicates sharp
     */
    private Map<String, int[]> getKeyMap() {
        Map<String, int[]> keyMap = new HashMap<String, int[]>();
        keyMap.put("C", new int[] {0,0,0,0,0,0,0});
        keyMap.put("Ebm", new int[] {-1,-1,-1,-1,-1,0,-1});
        keyMap.put("Cb", new int[] {-1,-1,-1,-1,-1,-1,-1});
        keyMap.put("Am", new int[] {0,0,0,0,0,0,0});
        keyMap.put("G", new int[] {0,0,0,0,0,1,0});
        keyMap.put("Em", new int[] {0,0,0,0,0,1,0});
        keyMap.put("D", new int[] {0,0,1,0,0,1,0});
        keyMap.put("Bm", new int[] {0,0,1,0,0,1,0});
        keyMap.put("A", new int[] {0,0,1,0,0,1,1});
        keyMap.put("F#m", new int[] {0,0,1,0,0,1,1});
        keyMap.put("E", new int[] {0,0,1,1,0,1,1});
        keyMap.put("C#m", new int[] {0,0,1,1,0,1,1});
        keyMap.put("B", new int[] {1,1,1,0,0,1,1});
        keyMap.put("Ab", new int[] {-1,-1,0,-1,-1,0,0});
        keyMap.put("Fm", new int[] {-1,-1,0,-1,-1,0,0});
        keyMap.put("Db", new int[] {-1,-1,0,-1,-1,0,-1});
        keyMap.put("Bbm", new int[] {-1,-1,0,-1,-1,0,-1});
        keyMap.put("A#m", new int[] {1,1,1,1,1,1,1});
        keyMap.put("F", new int[] {0,-1,0,0,0,0,0});
        keyMap.put("Dm", new int[] {0,-1,0,0,0,0,0});
        keyMap.put("Bb", new int[] {0,-1,0,0,-1,0,0});
        keyMap.put("G#m", new int[] {1,1,1,0,0,1,1});
        keyMap.put("F#", new int[] {1,1,1,1,0,1,1});
        keyMap.put("D#m", new int[] {1,1,1,1,0,1,1});
        keyMap.put("C#", new int[] {1,1,1,1,1,1,1});
        keyMap.put("Gm", new int[] {0,-1,0,0,-1,0,0});
        keyMap.put("Eb", new int[] {-1,-1,0,0,-1,0,0});
        keyMap.put("Cm", new int[] {-1,-1,0,0,-1,0,0});   
        keyMap.put("Gb", new int[] {-1,-1,-1,-1,-1,0,-1});
        keyMap.put("Abm", new int[] {-1,-1,-1,-1,-1,-1,-1});
        return keyMap;
    }
}
