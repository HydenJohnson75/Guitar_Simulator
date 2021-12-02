package GuitarSimulatorProject;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;


public class GuitarGUI extends JFrame implements ActionListener, MouseListener {

    protected static MediaPlayer mediaPlayer;
    final JavaSoundRecorder recorder = new JavaSoundRecorder();
    private final ImageIcon guitarImage = new ImageIcon("Images/Guitar_fretboard.png");
    private final JLabel guitar = new JLabel();
    private final Notes n1 = new Notes();
    private final JLabel currentGenre;
    private final String userGenre;
    private final JPanel topPanel;
    private final JPanel genrePanel;
    private final JPanel tuningPanel;
    private final JLabel currentTuning;
    private final JButton randomRiffButton;
    private final JButton recordButton;
    private final JMenuBar menuBar = new JMenuBar();
    private final JButton stopButton;
    protected String[] guitarists;
    private String userSelectedTuning;
    private JMenu fileMenu;
    private JMenu tuningMenu;
    private JMenu guitaristMenu;
    private Guitar metalGuitar;
    private Guitar jazzGuitar;
    private Guitar popGuitar;
    private Guitar[] allGuitars;

    /**
     * An instantiable class which generates the main GUI
     *
     * @param genre  Users genre
     * @param tuning Users tuning
     * @author Hyden Johnson
     */

    public GuitarGUI(String genre, String tuning) {

        super("Guitar Simulator");


        BorderLayout layout = new BorderLayout(6, 3);

        setLayout(layout);

        createFileMenu();
        createTuningMenu();
        createGuitaristMenu();

        randomRiffButton = new JButton("Random Riff");
        recordButton = new JButton("Record");
        stopButton = new JButton("Stop Recording");

        setJMenuBar(menuBar);
        menuBar.setBackground(Color.LIGHT_GRAY);
        menuBar.add(fileMenu);
        menuBar.add(tuningMenu);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(guitaristMenu);
        menuBar.add(randomRiffButton);
        menuBar.add(recordButton);
        menuBar.add(stopButton);

        stopButton.setVisible(false);

        guitaristMenu.addActionListener(this);
        randomRiffButton.addActionListener(this);
        recordButton.addActionListener(this);
        stopButton.addActionListener(this);

        userGenre = createGuitar(genre);

        userSelectedTuning = tuning;

        currentTuning = new JLabel();
        currentGenre = new JLabel();

        currentTuning.setText("Current Tuning: " + userSelectedTuning);
        currentGenre.setText("Current Genre: " + userGenre);


        tuningPanel = new JPanel();
        genrePanel = new JPanel();
        topPanel = new JPanel();

        tuningPanel.setLayout(new FlowLayout());
        genrePanel.setLayout(new FlowLayout());

        tuningPanel.add(currentTuning);
        genrePanel.add(currentGenre);


        topPanel.setLayout(new BorderLayout());
        topPanel.add(tuningPanel, BorderLayout.WEST);
        topPanel.add(genrePanel, BorderLayout.CENTER);


        add(topPanel, BorderLayout.NORTH);
        setSize(1920, 1080);
        setResizable(false);
        guitar.setIcon(guitarImage);
        add(guitar, BorderLayout.CENTER);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(this);

    }

    /**
     * Static method to play the audio file based on the path gotten from the users selections
     *
     * @param path string value which is the path to the audio file
     */

    public static void playAudio(String path) {
        JFXPanel pan = new JFXPanel();   //Initialize the toolkit

		/*Create a new Media object using the file path specified in the call to playAudio()
		 this will become the audio clip object we wish to play*/

        Media audioClip = new Media(new File(path).toURI().toString());

        //create a new MediaPlayer object that will be used to play the audio clip

        mediaPlayer = new MediaPlayer(audioClip);

        mediaPlayer.play();


    }

    /**
     * Method to instantiate a guitar object based on the genre
     *
     * @param genre Users genre
     * @return a string value which sets the users genre based on the parameter genre
     */

    public String createGuitar(String genre) {

        String userGenre;
        userGenre = genre;

        metalGuitar = new Guitar("PRS SE Mark Holcomb", "Metal");
        jazzGuitar = new Guitar("Ibanez AF75-BS", "Jazz");
        popGuitar = new Guitar("Fender Player Stratocaster", "Pop");

        allGuitars = new Guitar[3];

        allGuitars[0] = metalGuitar;
        allGuitars[1] = jazzGuitar;
        allGuitars[2] = popGuitar;

        if (userGenre.equals("Metal")) {
            JOptionPane.showMessageDialog(null, allGuitars[0], "Guitar Details", JOptionPane.INFORMATION_MESSAGE);
        }
        if (userGenre.equals("Jazz")) {
            JOptionPane.showMessageDialog(null, allGuitars[1], "Guitar Details", JOptionPane.INFORMATION_MESSAGE);
        }
        if (userGenre.equals("Pop")) {
            JOptionPane.showMessageDialog(null, allGuitars[2], "Guitar Details", JOptionPane.INFORMATION_MESSAGE);
        }


        return userGenre;
    }

    /**
     * Method to create a guitarist menu which is placed on the menu bar
     */

    private void createGuitaristMenu() {
        JMenuItem info = new JMenuItem("Guitarist Information");
        info.addActionListener(this);

        JMenuItem band = new JMenuItem("Guitarist Band");
        band.addActionListener(this);

        JMenuItem songs = new JMenuItem("Guitarist Songs");
        songs.addActionListener(this);


        guitaristMenu = new JMenu("Guitarist");

        guitaristMenu.add(info);
        guitaristMenu.add(band);
        guitaristMenu.add(songs);

        guitarists = new String[3];

        guitarists[0] = "Michael Paget";
        guitarists[1] = "B.B. King";
        guitarists[2] = "Adam Levine";


    }

    /**
     * Method to create a file menu which is placed on the menu bar
     */

    private void createFileMenu() {
        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(this);


        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(this);


        fileMenu = new JMenu("File");

        fileMenu.add(open);
        fileMenu.addSeparator();
        fileMenu.add(quit);


    }

    /**
     * Method to create a tuning menu which is placed on the menu bar
     */

    private void createTuningMenu() {

        JMenuItem eTuning = new JMenuItem("E Standard");
        eTuning.addActionListener(this);

        JMenuItem dTuning;
        dTuning = new JMenuItem("D Standard");
        dTuning.addActionListener(this);

        JMenuItem dropTuning;

        JMenuItem[] tunings = new JMenuItem[3];
        dropTuning = new JMenuItem("Drop C");
        dropTuning.addActionListener(this);

        tunings[0] = eTuning;
        tunings[1] = dTuning;
        tunings[2] = dropTuning;

        tuningMenu = new JMenu("Tuning");

        tuningMenu.add(tunings[0]);
        tuningMenu.add(tunings[1]);
        tuningMenu.add(tunings[2]);

        userSelectedTuning = tunings[1].toString();

    }

    /**
     * Method to listen for an action performed and carry out code and decisions
     * based on the action carried out
     *
     * @param e Action Event
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        String menuSelection;
        menuSelection = e.getActionCommand();

        String guitaristSelection;
        guitaristSelection = e.getActionCommand();

        if (menuSelection.equals("E Standard")) {
            userSelectedTuning = menuSelection;
            currentTuning.setText("Current Tuning: " + menuSelection);
        }
        if (menuSelection.equals("D Standard")) {
            userSelectedTuning = menuSelection;
            currentTuning.setText("Current Tuning: " + menuSelection);
        }
        if (menuSelection.equals("Drop C")) {
            userSelectedTuning = menuSelection;
            currentTuning.setText("Current Tuning: " + menuSelection);
        }

        if (menuSelection.equals("Open")) {

            JFileChooser fileOpener = new JFileChooser();
            fileOpener.setAcceptAllFileFilterUsed(false);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("WAV Files", "wav");
            fileOpener.addChoosableFileFilter(filter);
            fileOpener.addChoosableFileFilter(filter);
            fileOpener.setDialogTitle("Open previously saved .wav file");
            int userSelection = fileOpener.showOpenDialog(this);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileOpener.getSelectedFile();
                File userWAV = new File(fileToSave.getAbsolutePath());
                System.out.println(userWAV.getAbsolutePath());
                playAudio(userWAV.getAbsolutePath());
            }

        }

        if (menuSelection.equals("Quit")) {
            System.exit(0);
        }

        if (guitaristSelection.equals("Guitarist Information")) {
            if (userGenre.equals("Metal")) {
                JOptionPane.showMessageDialog(null, "A great guitarist within the selected genre " + "'" + userGenre + "'" + " is: " + guitarists[0], "Guitarist Information", JOptionPane.INFORMATION_MESSAGE);
            }
            if (userGenre.equals("Jazz")) {
                JOptionPane.showMessageDialog(null, "A great guitarist within the selected genre " + "'" + userGenre + "'" + " is: " + guitarists[1], "Guitarist Information", JOptionPane.INFORMATION_MESSAGE);
            }
            if (userGenre.equals("Pop")) {
                JOptionPane.showMessageDialog(null, "A great guitarist the selected genre " + "'" + userGenre + "'" + " is: " + guitarists[2], "Guitarist Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (guitaristSelection.equals("Guitarist Band")) {
            if (userGenre.equals("Metal")) {
                JOptionPane.showMessageDialog(null, guitarists[0] + " is the lead guitarist for the band Bullet For My Valentine", "Guitarist Band", JOptionPane.INFORMATION_MESSAGE);
            }
            if (userGenre.equals("Jazz")) {
                JOptionPane.showMessageDialog(null, guitarists[1] + " is the lead guitarist who plays guitar and sings by himself with a supporting band", "Guitarist Band", JOptionPane.INFORMATION_MESSAGE);
            }
            if (userGenre.equals("Pop")) {
                JOptionPane.showMessageDialog(null, guitarists[2] + " is the lead guitarist for the band Maroon 5", "Guitarist Band", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (guitaristSelection.equals("Guitarist Songs")) {
            if (userGenre.equals("Metal")) {
                JOptionPane.showMessageDialog(null, "Some of Bullet For My Valentine's songs are: \n\nWaking The Demon\nTears Don't Fall\nDeath By A Thousand Cuts", "Guitarist Songs", JOptionPane.INFORMATION_MESSAGE);
            }
            if (userGenre.equals("Jazz")) {
                JOptionPane.showMessageDialog(null, "Some of B.B. Kings's songs are: \n\nThe Thrill Is Gone\nRock Me Baby\n3 O' Clock Blues", "Guitarist Songs", JOptionPane.INFORMATION_MESSAGE);
            }
            if (userGenre.equals("Pop")) {
                JOptionPane.showMessageDialog(null, "Some of Maroon 5's songs are: \n\nPayphone\nSugar\nMoves Like Jagger", "Guitarist Songs", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (e.getSource() == randomRiffButton) {
            RandomRiffGUI randomRiffGUI = new RandomRiffGUI(userGenre);
            this.setState(ICONIFIED);
        }

        if (e.getSource() == recordButton) {

            try {

                // I Learnt the JFileChooser code from the website https://www.codejava.net/java-se/swing/show-save-file-dialog-using-jfilechooser
                // Author: Nam Ha Minh
                // Date: 06/07/2019

                JFileChooser fileSaver = new JFileChooser();
                fileSaver.setDialogTitle("Specify where you would like to save the file");
                int userSelection = fileSaver.showSaveDialog(this);

                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileSaver.getSelectedFile();
                    recorder.wavFile = new File(fileToSave.getAbsolutePath() + ".wav");
                    //JB added the following code so that sound recording begins automatically after the
                    //creation of the guitar GUI and lasts for 60 seconds - it is using a modified version
                    //of the "JavaSoundRecorder.java" demo.

                    // creates a new thread that waits for a specified amount
                    // of time before stopping

                    Thread stopper = new Thread(new Runnable() {
                        public void run() {
                            try {
                                Thread.sleep(60000);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                            recorder.finish();
                        }
                    });

                    stopper.start();

                    // start recording
                    recorder.start();

                    //JB Code finish here

                    if (JavaSoundRecorder.checkIfRecording() == true) {
                        recordButton.setVisible(false);
                        stopButton.setVisible(true);
                    }

                }


            } catch (Exception NullPointerException) {
                JOptionPane.showMessageDialog(null, "Cancelling");

            }

        }

        if (e.getSource() == stopButton) {
            recorder.finish();
            stopButton.setVisible(false);
            recordButton.setVisible(true);
        }

    }

    /**
     * Method to listen if mouse is clicked
     *
     * @param e Mouse Event
     */

    @Override
    public void mouseClicked(MouseEvent e) {


    }

    /**
     * Method to listen if mouse is pressed on the screen based on a mouse listener
     * and play the audio file based on mouse position on guitar fretboard
     *
     * @param e Mouse Event
     */

    @Override
    public void mousePressed(MouseEvent e) {
        int mouseX = e.getPoint().x;
        int mouseY = e.getPoint().y;

        //////6th String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 828 && mouseY < 868)) {
            System.out.println("Open String (E) Low E String");
            playAudio(Notes.setAudioFile1(userGenre, userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 828 && mouseY < 868)) {
            System.out.println("First Fret (F) Low E String");
            playAudio(Notes.setAudioFile2(userGenre, userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 828 && mouseY < 868)) {
            System.out.println("Second Fret (F#) Low E String");
            playAudio(Notes.setAudioFile3(userGenre, userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 828 && mouseY < 868)) {
            System.out.println("Third Fret (G) Low E String");
            playAudio(Notes.setAudioFile4(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 828 && mouseY < 868)) {
            System.out.println("Fourth Fret (G#) Low E String");
            playAudio(Notes.setAudioFile5(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 828 && mouseY < 868)) {
            System.out.println("Fifth Fret (A) Low E String");
            playAudio(Notes.setAudioFile6(userGenre, userSelectedTuning));
        }

        //////5th String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 724 && mouseY < 750)) {
            System.out.println("Open String (A) A String");
            playAudio(Notes.setAudioFile7(userGenre, userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 724 && mouseY < 750)) {
            System.out.println("First Fret (F) A String");
            playAudio(Notes.setAudioFile8(userGenre, userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 724 && mouseY < 750)) {
            System.out.println("Second Fret (F#) A String");
            playAudio(Notes.setAudioFile9(userGenre, userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 724 && mouseY < 750)) {
            System.out.println("Third Fret (G) A String");
            playAudio(Notes.setAudioFile10(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 724 && mouseY < 750)) {
            System.out.println("Fourth Fret (G#) A String");
            playAudio(Notes.setAudioFile11(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 724 && mouseY < 750)) {
            System.out.println("Fifth Fret (A) A String");
            playAudio(Notes.setAudioFile12(userGenre, userSelectedTuning));
        }

        //////4th String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 612 && mouseY < 653)) {
            System.out.println("Open String (D) D String");
            playAudio(Notes.setAudioFile13(userGenre, userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 612 && mouseY < 653)) {
            System.out.println("First Fret (F) D String");
            playAudio(Notes.setAudioFile14(userGenre, userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 612 && mouseY < 653)) {
            System.out.println("Second Fret (F#) D String");
            playAudio(Notes.setAudioFile15(userGenre, userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 612 && mouseY < 653)) {
            System.out.println("Third Fret (G) D String");
            playAudio(Notes.setAudioFile16(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 612 && mouseY < 653)) {
            System.out.println("Fourth Fret (G#) D String");
            playAudio(Notes.setAudioFile17(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 612 && mouseY < 653)) {
            System.out.println("Fifth Fret (A) D String");
            playAudio(Notes.setAudioFile18(userGenre, userSelectedTuning));
        }

        //////3rd String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 509 && mouseY < 540)) {
            System.out.println("Open String (G) G String");
            playAudio(Notes.setAudioFile19(userGenre, userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 509 && mouseY < 540)) {
            System.out.println("First Fret (F) G String");
            playAudio(Notes.setAudioFile20(userGenre, userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 509 && mouseY < 540)) {
            System.out.println("Second Fret (F#) G String");
            playAudio(Notes.setAudioFile21(userGenre, userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 509 && mouseY < 540)) {
            System.out.println("Third Fret (G) G String");
            playAudio(Notes.setAudioFile22(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 509 && mouseY < 540)) {
            System.out.println("Fourth Fret (G#) G String");
            playAudio(Notes.setAudioFile23(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 509 && mouseY < 540)) {
            System.out.println("Fifth Fret (A) G String");
            playAudio(Notes.setAudioFile24(userGenre, userSelectedTuning));
        }

        //////2nd String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 405 && mouseY < 440)) {
            System.out.println("Open String (B) B String");
            playAudio(Notes.setAudioFile25(userGenre, userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 405 && mouseY < 440)) {
            System.out.println("First Fret (F) B String");
            playAudio(Notes.setAudioFile26(userGenre, userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 405 && mouseY < 440)) {
            System.out.println("Second Fret (F#) B String");
            playAudio(Notes.setAudioFile27(userGenre, userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 405 && mouseY < 440)) {
            System.out.println("Third Fret (G) B String");
            playAudio(Notes.setAudioFile28(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 405 && mouseY < 440)) {
            System.out.println("Fourth Fret (G#) B String");
            playAudio(Notes.setAudioFile29(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 405 && mouseY < 440)) {
            System.out.println("Fifth Fret (A) B String");
            playAudio(Notes.setAudioFile30(userGenre, userSelectedTuning));
        }

        //////1st String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 302 && mouseY < 335)) {
            System.out.println("Open String (E) High E String");
            playAudio(Notes.setAudioFile31(userGenre, userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 302 && mouseY < 335)) {
            System.out.println("First Fret (F) High E String");
            playAudio(Notes.setAudioFile32(userGenre, userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 302 && mouseY < 335)) {
            System.out.println("Second Fret (F#) High E String");
            playAudio(Notes.setAudioFile33(userGenre, userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 302 && mouseY < 335)) {
            System.out.println("Third Fret (G) High E String");
            playAudio(Notes.setAudioFile34(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 302 && mouseY < 335)) {
            System.out.println("Fourth Fret (G#) High E String");
            playAudio(Notes.setAudioFile35(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 302 && mouseY < 335)) {
            System.out.println("Fifth Fret (A) High E String");
            playAudio(Notes.setAudioFile36(userGenre, userSelectedTuning));
        }

        System.out.println(mouseX + "   " + mouseY);


    }

    /**
     * Method to listen if mouse is released
     *
     * @param e Mouse Event
     */

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Method to listen if mouse is entered
     *
     * @param e Mouse Event
     */

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * Method to listen if mouse is exited
     *
     * @param e Mouse Event
     */

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
