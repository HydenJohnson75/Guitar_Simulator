package GuitarSimulatorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import javafx.embed.swing.JFXPanel;

public class GUI extends JFrame implements WindowListener, ActionListener, MouseListener {

    private ImageIcon guitarImage = new ImageIcon("Images/Guitar_fretboard.png");
    JLabel guitar = new JLabel();
    JMenu fileMenu;
    static MediaPlayer mediaPlayer;

    public GUI(){

        super("Guitar Simulator");

        createFileMenu();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.LIGHT_GRAY);
        menuBar.add(fileMenu);
        addWindowListener(this);


        BorderLayout layout = new BorderLayout(6,3);

        setLayout(layout);

        setSize(1920,1080);

        setResizable(false);

        guitar.setIcon(guitarImage);

        add(guitar,BorderLayout.CENTER);

        setExtendedState(MAXIMIZED_BOTH);

        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addMouseListener(this);
    }


    private void createFileMenu( ) {
        JMenuItem item;
        fileMenu = new JMenu("Tuning");
        item = new JMenuItem("E Standard");
        item.addActionListener(this);
        fileMenu.add(item);
        item = new JMenuItem("D Standard");
        item.addActionListener(this);
        fileMenu.add(item);
        item = new JMenuItem("Drop C");
        item.addActionListener(this);
        fileMenu.add(item);
        fileMenu.add(item);
        fileMenu.addSeparator();
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

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {



    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mouseX = e.getPoint().x;
        int mouseY = e.getPoint().y;

        //////6th String

        if ((mouseX > 128 && mouseX < 468) && (mouseY > 796 && mouseY < 826)) {
            System.out.println("First Fret (F) Low E String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 796 && mouseY < 826)) {
            System.out.println("Second Fret (F#) Low E String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 796 && mouseY < 826)) {
            System.out.println("Third Fret (G) Low E String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 796 && mouseY < 826)) {
            System.out.println("Fourth Fret (G#) Low E String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 796 && mouseY < 826)) {
            System.out.println("Fifth Fret (A) Low E String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }

        //////5th String
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("First Fret (F) A String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Second Fret (F#) A String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Third Fret (G) A String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Fourth Fret (G#) A String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Fifth Fret (A) A String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }

        //////4th String
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("First Fret (F) D String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Second Fret (F#) D String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Third Fret (G) D String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Fourth Fret (G#) D String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Fifth Fret (A) D String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }

        //////3rd String
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("First Fret (F) G String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Second Fret (F#) G String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Third Fret (G) G String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Fourth Fret (G#) G String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Fifth Fret (A) G String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }

        //////2nd String
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("First Fret (F) B String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Second Fret (F#) B String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Third Fret (G) B String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Fourth Fret (G#) B String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Fifth Fret (A) B String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }

        //////1st String
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("First Fret (F) High E String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Second Fret (F#) High E String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Third Fret (G) High E String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Fourth Fret (G#) High E String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Fifth Fret (A) High E String");
            playAudio("GuitarSounds/Clean E standard Notes/E_Note.mp3");
        }

        System.out.println(mouseX + "   " + mouseY);


    }


    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
