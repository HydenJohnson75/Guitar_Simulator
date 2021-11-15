package GuitarSimulatorProject;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.embed.swing.JFXPanel;


public class TestAudio {
    static MediaPlayer mediaPlayer;

    public static void main(String[] args) {
        int userNumber=0;
        String userNumberString;

        String audioFile1 = "GuitarSounds/Clean E standard Notes/E_Note.mp3", audioFile2 = "GuitarSounds/Clean E standard Notes/F_Note.mp3",
                audioFile3 = "GuitarSounds/Clean E standard Notes/F#_Note.mp3", audioFile4 = "GuitarSounds/Clean E standard Notes/G_Note.mp3",
                audioFile5 = "GuitarSounds/Clean E standard Notes/G#_Note.mp3", audioFile6 = "GuitarSounds/Clean E standard Notes/A_Note.mp3";


        try {
            while (userNumber != -1) {
                userNumberString = JOptionPane.showInputDialog("Please enter the option you would like:\n\n1.Play E note" +
                        "\n2.Play F note" + "\n3.Play F# note" + "\n4.Play G note" + "\n5.Play G# note" + "\n6.Play A note" +
                        "\n-1.Exit");
                userNumber = Integer.parseInt(userNumberString);

                if (userNumber == 1) {
                    playAudio(audioFile1);
                }
                if (userNumber == 2) {
                    playAudio(audioFile2);
                }
                if (userNumber == 3) {
                    playAudio(audioFile3);
                }
                if (userNumber == 4) {
                    playAudio(audioFile4);
                }
                if (userNumber == 5) {
                    playAudio(audioFile5);
                }
                if (userNumber == 6) {
                    playAudio(audioFile6);
                }
                if (userNumber == -1) {
                    break;
                }

                

            }

        }

       catch(Exception NumberFormatException){
           JOptionPane.showMessageDialog(null,"Closing the program succesfully", "Closing",JOptionPane.INFORMATION_MESSAGE);

           System.exit(0);
       }

        System.exit(0);
    }



    public static void playAudio(String path)
    {
        JFXPanel pan = new JFXPanel();   //Initialize the toolkit

		/*Create a new Media object using the file path specified in the call to playAudio()
		 this will become the audio clip object we wish to play*/

        Media audioClip = new Media(new File(path).toURI().toString());

        //create a new MediaPlayer object that will be used to play the audio clip

        mediaPlayer = new MediaPlayer(audioClip);

        mediaPlayer.play();

    }

}
