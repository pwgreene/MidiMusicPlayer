package abc.player;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

import abc.sound.SequencePlayer;

/**
 * Test the parsing and playing for Music files
 * @category no_didit
 *
 */
public class MusicTest {

    /*Testing Strategy:*/

    //Music.parse() Partitions:
    //Input file has:
    //  *no optional headers (X,T,K only)/*1-3 optional headers/*all 4 optional headers 
    //  *1, *>1 bars
    //  *repeat/*no repeat
    //  *1, *>1 voices
    //  *extra space
    //Notes:
    //  *whole/half/quarter/eighth/etc. (like e e/2 e/4 e/8 regardless of BPM) 
    //  a note has/doesn't have accidental (flat, sharp, natural)
    //  *middle octave, *lower octaves, *upper octaves
    //  with/*without *chords, *tuples
    //Key:
    //  *Major/*Minor/sharp/*flat

    @Test //no optional headers, 1 bar, no repeat, 1 voice, low octave, high octave, middle octave, major key, whole notes
    public void testParseSample1() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File sample1 = new File("sample_abc/sample1.abc");
        MusicAndBeat musicAndBeat = Music.parse(sample1);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1); //TODO what are beatsPerMinute and ticksPerBeat?
        musicAndBeat.getMusic().play(player, 0, 1);
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
    
    @Test //chords
    public void testParseSample2() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File sample2 = new File("sample_abc/sample2.abc"); //[EC]
        MusicAndBeat musicAndBeat = Music.parse(sample2);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1); //TODO what are beatsPerMinute and ticksPerBeat?
        musicAndBeat.getMusic().play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 64  Tick: 0\n"
                   + "Event: NOTE_ON  Pitch: 60  Tick: 0\n"
                   + "Event: NOTE_OFF Pitch: 64 Tick:1\n"
                   + "Event: NOTE_OFF Pitch: 60 Tick:1\n"
                   + "Meta event: END_OF_TRACK Tick: 1\n", player.toString());
    }
    
    @Test //multiple voices
    public void testParseSample3() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File sample3 = new File("sample_abc/sample3.abc");
        MusicAndBeat musicAndBeat = Music.parse(sample3);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1); //TODO what are beatsPerMinute and ticksPerBeat?
        musicAndBeat.getMusic().play(player, 0, 1);
        assertEquals("Event: NOTE_ON  Pitch: 60  Tick: 0\n"
                   + "Event: NOTE_ON  Pitch: 64  Tick: 0\n"
                   + "Event: NOTE_ON  Pitch: 67  Tick: 0\n"
                   + "Event: NOTE_OFF Pitch: 60 Tick:1\n"
                   + "Event: NOTE_OFF Pitch: 64 Tick:1\n"
                   + "Event: NOTE_OFF Pitch: 67 Tick:1\n"
                   + "Meta event: END_OF_TRACK Tick: 1\n", player.toString());
    }
    
    @Test //multiple bars, all 4 optional headers
    public void testParseScale() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File scale = new File("sample_abc/scale.abc");
        MusicAndBeat musicAndBeat = Music.parse(scale);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1); //TODO what are beatsPerMinute and ticksPerBeat?
        musicAndBeat.getMusic().play(player, 0, 1);
        //TODO assertEquals(    , player.toString());
    }
    
    @Test //tuples, repeats, 1-3 optional headers, extra space, flat + minor key
    public void testParserepeatTuple() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File file = new File("sample_abc/repeatTuple.abc");
        MusicAndBeat musicAndBeat = Music.parse(file);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1); //TODO what are beatsPerMinute and ticksPerBeat?
        musicAndBeat.getMusic().play(player, 0, 1);
        //TODO assertEquals(    , player.toString());
    }
    @Test
    public void testParseAbcSong() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File abcFile = new File("sample_abc/abc_song.abc");
        MusicAndBeat musicAndBeat = Music.parse(abcFile);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1); 
        musicAndBeat.getMusic().play(player, 0, 1);
        player.play();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testParseFurElise() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File abcFile = new File("sample_abc/fur_elise.abc");
        MusicAndBeat musicAndBeat = Music.parse(abcFile);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1); 
        musicAndBeat.getMusic().play(player, 0, 1);
        player.play();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testParseInvention() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File abcFile = new File("sample_abc/invention.abc");
        MusicAndBeat musicAndBeat = Music.parse(abcFile);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1);
        musicAndBeat.getMusic().play(player, 0, 1);
        player.play();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testParseLittleNighMusic() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File abcFile = new File("sample_abc/little_night_music.abc");
        MusicAndBeat musicAndBeat = Music.parse(abcFile);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1);
        musicAndBeat.getMusic().play(player, 0, 1);
        player.play();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testParsePaddy() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File abcFile = new File("sample_abc/paddy.abc");
        MusicAndBeat musicAndBeat = Music.parse(abcFile);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1);
        musicAndBeat.getMusic().play(player, 0, 1);
        player.play();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testParsePrelude() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File abcFile = new File("sample_abc/prelude.abc");
        MusicAndBeat musicAndBeat = Music.parse(abcFile);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1);
        musicAndBeat.getMusic().play(player, 0, 1);
        player.play();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testParsePiece1() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File abcFile = new File("sample_abc/piece1.abc");
        MusicAndBeat musicAndBeat = Music.parse(abcFile);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1);
        musicAndBeat.getMusic().play(player, 0, 1);
        player.play();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testParsePiece2() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File abcFile = new File("sample_abc/piece2.abc");
        MusicAndBeat musicAndBeat = Music.parse(abcFile);
        SequencePlayer player = new SequencePlayer(musicAndBeat.getBeatsPerMinute(), 1);
        musicAndBeat.getMusic().play(player, 0, 1);
        player.play();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
