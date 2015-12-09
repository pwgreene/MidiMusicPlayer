package abc.player;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import abc.sound.SequencePlayer;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     * @throws IOException 
     * @throws InvalidMidiDataException 
     * @throws MidiUnavailableException 
     */
    public static void play(String file) throws IOException, MidiUnavailableException, InvalidMidiDataException {
        File musicFile = new File(file);
        MusicAndBeat musicAndBeat = Music.parse(musicFile);
        Music music = musicAndBeat.getMusic();
        int beat = musicAndBeat.getBeatsPerMinute();
        SequencePlayer player = new SequencePlayer(beat, 1);
        music.play(player, 0);
        player.play();
    }

    public static void main(String[] args) {
        try {
            //String file = args[0];
            play("sample_abc/fur_elise.abc");
        } catch (IOException ioe) {
            System.err.println("Invalid File");
        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            System.err.println("Sequence Player not working");
        }
        
    }
}
