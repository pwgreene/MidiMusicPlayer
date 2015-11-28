package abc.player;

/**
 * Represents a rest in the music that extends for a period of time
 * @author Parker
 *
 */
public class Rest implements Music {

    private final double duration;
    
    /**
     * Create a new Rest 
     * @param duration the length for which to rest in beats
     */
    public Rest(double duration) {
        this.duration = duration;
    }
    
    @Override
    public Music transpose(int semitonesUp) {
        // TODO implement this
        return null;
    }

    @Override
    public Music inKey(Key key) {
        // TODO implement this
        return null;
    }
    
}
