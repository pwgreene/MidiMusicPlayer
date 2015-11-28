package abc.sound;

import static org.junit.Assert.*;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

/**
 * Test some music playing stuff.
 * @category no_didit
 */

public class SequencePlayerTest {

    @Test
    public void testPiece1() throws MidiUnavailableException, InvalidMidiDataException {
        SequencePlayer player = new SequencePlayer(140, 48);
        //bar1
        player.addNote(new Pitch('C').toMidiNote(), 0, 12);
        player.addNote(new Pitch('C').toMidiNote(), 12, 24);
        player.addNote(new Pitch('C').toMidiNote(), 24, 33);
        player.addNote(new Pitch('D').toMidiNote(), 33, 36);
        player.addNote(new Pitch('E').toMidiNote(), 36, 48);
        //bar 2
        player.addNote(new Pitch('E').toMidiNote(), 48, 57);
        player.addNote(new Pitch('D').toMidiNote(), 57, 60);
        player.addNote(new Pitch('E').toMidiNote(), 60, 23);
        player.addNote(new Pitch('F').toMidiNote(), 23, 24);
        player.addNote(new Pitch('G').toMidiNote(), 24, 32);
        //bar 3
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 32, 11);
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 8, 11);
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 8, 11);
        player.addNote(new Pitch('G').toMidiNote(), 8, 11);
        player.addNote(new Pitch('G').toMidiNote(), 8, 11);
        player.addNote(new Pitch('G').toMidiNote(), 8, 11);
        player.addNote(new Pitch('E').toMidiNote(), 8, 11);
        player.addNote(new Pitch('E').toMidiNote(), 8, 11);
        player.addNote(new Pitch('E').toMidiNote(), 8, 11);
        player.addNote(new Pitch('C').toMidiNote(), 8, 11);
        player.addNote(new Pitch('C').toMidiNote(), 8, 11);
        player.addNote(new Pitch('C').toMidiNote(), 8, 11);
        //bar 4
        player.addNote(new Pitch('G'), startTick, numTicks);
        player.addNote(new Pitch('F'), startTick, numTicks);
        player.addNote(new Pitch('E'), startTick, numTicks);
        player.addNote(new Pitch('D'), startTick, numTicks);
        player.addNote(new Pitch('C'), startTick, numTicks);

        

    }
    
    @Test
    public void test() {
        fail("Not yet implemented");
    }
    

}
