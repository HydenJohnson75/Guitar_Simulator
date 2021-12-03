package GuitarSimulatorProject;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

/**
 * A sample program is to demonstrate how to record sound in Java
 * author: www.codejava.net
 */
public class JavaSoundRecorder implements Runnable {
    // record duration, in milliseconds
    static final long RECORD_TIME = 60000;  // 1 minute

    protected static boolean check;

    Thread thread;

    // path of the wav file
    File wavFile;

    // format of audio file
    AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;

    // the line from which audio data is captured
    TargetDataLine line;

    /**
     * Entry to run the program
     */
    public static void main(String[] args) {
        final JavaSoundRecorder recorder = new JavaSoundRecorder();

        // creates a new thread that waits for a specified
        // of time before stopping
        Thread stopper = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(RECORD_TIME);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                    check = false;
                }
                recorder.finish();
            }
        });

        stopper.start();

        //start recording
        recorder.start();
    }

    /**
     * Method to detect if the application is recording
     *
     * @return a static boolean based on if a line in is supported or not
     */

    public static boolean checkIfRecording() {
        boolean getCheck = check;

        return getCheck;

    }

    //JB added code to place this sound recorder object into it's own thread of execution
    //so that it wouldn't interfere with the execution of the GUI thread
    public void start() {

        thread = new Thread(this);

        thread.start();


    }

    /**
     * Defines an audio format
     */
    AudioFormat getAudioFormat() {

        //JB altered sample rate, sample size and num channels as per
        //https://stackoverflow.com/questions/26436994/java-sound-generation-produces-noisy-sound
        //to prevent noisy background in playback

        float sampleRate = 44100;
        int sampleSizeInBits = 16;
        int channels = 1;
        boolean signed = true;
        boolean bigEndian = true;
        AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits,
                channels, signed, bigEndian);
        return format;
    }

    /**
     * Captures the sound and record into a WAV file
     */
    public void run() { //JB altered this so that the capturing will take place as part of the
        //thread's run() method (called when the thread's start() is invoked)
        try {
            AudioFormat format = getAudioFormat();
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

            // checks if system supports the data line
            if (!AudioSystem.isLineSupported(info)) {
                System.out.println("Line not supported");
            }
            line = (TargetDataLine) AudioSystem.getLine(info);
            line.open(format);
            line.start();   // start capturing

            System.out.println("Start capturing...");

            AudioInputStream ais = new AudioInputStream(line);

            System.out.println("Start recording...");

            // start recording
            AudioSystem.write(ais, fileType, wavFile);

            check = true;

        } catch (LineUnavailableException ex) {
            ex.printStackTrace();
            check = false;
        } catch (IOException ioe) {
            ioe.printStackTrace();
            check = false;
        } catch (Exception IllegalArgumentException) {
            JOptionPane.showMessageDialog(null, "No Input device found/ Line not supported");
            check = false;
            this.finish();
        }

    }

    /**
     * Closes the target data line to finish capturing and recording
     */
    void finish() {
        if (line != null) {
            line.stop();
            line.close();
            System.out.println("Finished");
        }

    }
}