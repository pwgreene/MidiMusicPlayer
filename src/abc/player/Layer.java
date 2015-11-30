package abc.player;

public class Layer implements Music {
    //Abstraction Function:
    //TODO
    //Rep Invariant:
    //TODO
    //Safety from Rep Exposure:
    //TODO
    
    private final Music m1;
    private final Music m2;
    
    /**
     * Create a new Layer object that joins two voice together
     * @param m1 the first voice to be played
     * @param m2 the second voice to be played
     */
    public Layer(Music m1, Music m2) {
        this.m1 = m1;
        this.m2 = m2;
    }
    
    @Override
    public int getDuration() {
        // TODO Auto-generated method stub
        return 0;
    }
     
    @Override
    public Music transpose(int semitonesUp) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Music inKey(Key key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void play(int atTick) {
        // TODO Auto-generated method stub
    }
    
    @Override
    public String toString() {
        //TODO implement this
        return "";
    }


}
