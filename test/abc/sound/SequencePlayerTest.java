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
    
    @Test
    public void piece2() throws MidiUnavailableException, InvalidMidiDataException{
        SequencePlayer player = new SequencePlayer(200, 12);
        
        // [F# e] 1/8
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 0, 6);  
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 0, 6);
        // [F# e] 1/8
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 6, 6);
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 6, 6);      
        //Rest 1/8 till 18 ticks
        // [F# e] 1/8
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 18, 6);
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 18, 6);
        //Rest 1/8 till 30 ticks
        // [F# c] 1/8
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 30, 6);
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 30, 6);
        // [F# e] 1/4
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 36, 12);
        player.addNote(new Pitch('F').toMidiNote(), 36, 12);
        
        //second 48
        //[g B G] 1/4 
        player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 48, 12);
        player.addNote(new Pitch('B').toMidiNote(), 48, 12);
        player.addNote(new Pitch('G').toMidiNote(), 48, 12);
        //rest 1/4 till 72
        //G
        player.addNote(new Pitch('G').toMidiNote(), 72, 12);
        //rest 1/4 till 96
        
        //third 96
        //c 3/8
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 96, 18);
        //G 1/8
        player.addNote(new Pitch('G').toMidiNote(), 114, 6);
        //rest 1/4 till 132
        player.addNote(new Pitch('E').toMidiNote(), 132, 12);
        
        //fourth 144
        //E 1/8
        player.addNote(new Pitch('E').toMidiNote(), 144, 6);
        //A 1/4
        player.addNote(new Pitch('A').toMidiNote(), 150, 12);
        //B 1/4
        player.addNote(new Pitch('B').toMidiNote(), 162, 12);
        //Bb 1/8
        player.addNote(new Pitch('B').transpose(-1).toMidiNote(), 174, 6);
        //A 1/4
        player.addNote(new Pitch('A').toMidiNote(), 180, 12);
        
        //fifth 192
        //G 1/3
        player.addNote(new Pitch('G').toMidiNote(), 192, 8);
        //e 1/3
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 200, 8);
        //g 1/3
        player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 208, 8);
        //a 1/4
        player.addNote(new Pitch('A').transpose(Pitch.OCTAVE).toMidiNote(), 216, 12);
        //f 1/8
        player.addNote(new Pitch('F').transpose(Pitch.OCTAVE).toMidiNote(), 228, 6);
        //g 1/8
        player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 234, 6);
        
        //sixth 240
        //rest 1/8 till 246
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 246, 12);
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 258, 6);
        player.addNote(new Pitch('D').transpose(Pitch.OCTAVE).toMidiNote(), 264, 6);
        player.addNote(new Pitch('B').transpose(Pitch.OCTAVE).toMidiNote(), 270, 9);
        //rest till 288
        //Done

        System.out.println(player);

        // play!
        player.play();
    }
    

}
