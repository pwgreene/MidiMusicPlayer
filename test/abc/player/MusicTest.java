package abc.player;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

import abc.sound.SequencePlayer;

public class MusicTest {
    
    /*Testing Strategy:*/
    
    //Music.parse() Partitions:
    //Input file has:
     //no optional headers/1-4 optional headers/5 optional headers
     //1, >1 bars
     //repeat/no repeat
     //1, >1 voices
    //Notes:
     //-whole/half/quarter/eighth/etc.
     //a note has/ doesn't have accidental
    //Key:
     //Major/Minor/sharp/flat
    
    @Test //no optional headers, 1 bar, no repeat, 1 voice
    public void testParseSample1() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File sample1 = new File("sample_abc/sample1.abc");
        MusicAndBeat musicAndBeat = Music.parse(sample1);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1); //TODO what are beatsPerMinute and ticksPerBeat?
        musicAndBeat.getMusic().play(player, 0);
        assertEquals("Event: NOTE_ON  Pitch: 48  Tick: 0\n" 
                + "Event: NOTE_OFF Pitch: 48  Tick: 2\n"
                + "Event: NOTE_ON Pitch: 60 Tick:2\n"
                + "Event: NOTE_OFF Pitch: 60 Tick:4\n"
                + "Event: NOTE_ON Pitch: 72 Tick: 4"
                + "Event: NOTE_OFF Pitch: 72 Tick: 5\n"
                + "Event: NOTE_ON Pitch: 84 Tick: 5\n"
                + "Event: NOTE_OFF Pitch: 84 Tick 6\n"
                + "Meta event: END_OF_TRACK Tick: 6\n", player.toString());
    }
}
