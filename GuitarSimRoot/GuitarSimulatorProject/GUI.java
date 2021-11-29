package GuitarSimulatorProject;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;


public class GUI extends JFrame implements ActionListener, MouseListener {

    private static MediaPlayer mediaPlayer;
    private static String userSelectedTuning;
    final GuitarRecorder recorder = new GuitarRecorder();
    private final ImageIcon guitarImage = new ImageIcon("Images/Guitar_fretboard.png");
    private final JLabel guitar = new JLabel();
    private final Notes n1 = new Notes();
    private final JLabel currentTuning;
    private final JLabel currentGenre;
    private final String userGenre;
    private final JPanel topPanel;
    private final JPanel genrePanel;
    private final JPanel tuningPanel;
    private final JPanel recordPanel;
    protected String[] guitarists;
    protected int mostPlayedNote = 0;
    private JMenu fileMenu;
    private JMenu tuningMenu;
    private JMenu guitaristMenu;
    private final JButton recordButton;
    private Guitar metalGuitar;
    private Guitar jazzGuitar;
    private Guitar popGuitar;
    private Guitar[] allGuitars;


    public GUI(String genre, String tuning) {

        super("Guitar Simulator");

        BorderLayout layout = new BorderLayout(6, 3);

        setLayout(layout);

        createFileMenu();
        createTuningMenu();
        createGuitaristMenu();


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.LIGHT_GRAY);
        menuBar.add(fileMenu);
        menuBar.add(tuningMenu);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(guitaristMenu);

        guitaristMenu.addActionListener(this);

        userGenre = createGuitar(genre);

        userSelectedTuning = tuning;

        currentTuning = new JLabel();
        currentGenre = new JLabel();

        currentTuning.setText("Current Tuning: " + userSelectedTuning);
        currentGenre.setText("Current Genre: " + userGenre);

        recordButton = new JButton("Record");
        recordButton.addActionListener(this);

        tuningPanel = new JPanel();
        genrePanel = new JPanel();
        recordPanel = new JPanel();
        topPanel = new JPanel();

        tuningPanel.setLayout(new FlowLayout());
        genrePanel.setLayout(new FlowLayout());
        recordPanel.setLayout(new BorderLayout());

        tuningPanel.add(currentTuning);
        genrePanel.add(currentGenre);
        recordPanel.add(recordButton);


        topPanel.setLayout(new BorderLayout());
        topPanel.add(tuningPanel, BorderLayout.WEST);
        topPanel.add(genrePanel, BorderLayout.CENTER);
        topPanel.add(recordPanel, BorderLayout.EAST);


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

    public static void playAudio(String path) {
        JFXPanel pan = new JFXPanel();   //Initialize the toolkit

		/*Create a new Media object using the file path specified in the call to playAudio()
		 this will become the audio clip object we wish to play*/

        Media audioClip = new Media(new File(path).toURI().toString());

        //create a new MediaPlayer object that will be used to play the audio clip

        mediaPlayer = new MediaPlayer(audioClip);

        mediaPlayer.play();

    }


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

        if (userGenre == "Metal") {
            JOptionPane.showMessageDialog(null, allGuitars[0], "Guitar Details", JOptionPane.INFORMATION_MESSAGE);
        }
        if (userGenre == "Jazz") {
            JOptionPane.showMessageDialog(null, allGuitars[1], "Guitar Details", JOptionPane.INFORMATION_MESSAGE);
        }
        if (userGenre == "Pop") {
            JOptionPane.showMessageDialog(null, allGuitars[2], "Guitar Details", JOptionPane.INFORMATION_MESSAGE);
        }


        return userGenre;
    }

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

    private void createFileMenu() {
        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(this);

        JMenuItem save = new JMenuItem("Save");
        save.addActionListener(this);

        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(this);


        fileMenu = new JMenu("File");

        fileMenu.add(open);
        fileMenu.add(save);
        fileMenu.addSeparator();
        fileMenu.add(quit);


    }

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


    @Override
    public void actionPerformed(ActionEvent e) {
        String menuSelection;
        menuSelection = e.getActionCommand();

        String guitaristSelection;
        guitaristSelection = e.getActionCommand();

        if (menuSelection == "E Standard") {
            userSelectedTuning = menuSelection;
            currentTuning.setText("Current Tuning: " + menuSelection);
        }
        if (menuSelection == "D Standard") {
            userSelectedTuning = menuSelection;
            currentTuning.setText("Current Tuning: " + menuSelection);
        }
        if (menuSelection == "Drop C") {
            userSelectedTuning = menuSelection;
            currentTuning.setText("Current Tuning: " + menuSelection);
        }


        if (menuSelection == "Quit") {
            System.exit(0);
        }

        if (guitaristSelection == "Guitarist Information") {
            if (userGenre == "Metal") {
                JOptionPane.showMessageDialog(null, "A great guitarist within the selected genre " + "'" + userGenre + "'" + " is: " + guitarists[0], "Guitarist Information", JOptionPane.INFORMATION_MESSAGE);
            }
            if (userGenre == "Jazz") {
                JOptionPane.showMessageDialog(null, "A great guitarist within the selected genre " + "'" + userGenre + "'" + " is: " + guitarists[1], "Guitarist Information", JOptionPane.INFORMATION_MESSAGE);
            }
            if (userGenre == "Pop") {
                JOptionPane.showMessageDialog(null, "A great guitarist the selected genre " + "'" + userGenre + "'" + " is: " + guitarists[2], "Guitarist Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }


        if (e.getActionCommand().equals("Record")) {
            String userFileName = "";

            try {
                while (userFileName.equals("")) {
                    userFileName = JOptionPane.showInputDialog("Please enter the name for your file");
                    if (!userFileName.equals("")) {
                        recorder.setFilePath(userFileName);
                        System.out.println(recorder.getFilePath());
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "File name cannot be null");
                    }
                }

                recorder.wavFile = new File(recorder.getFilePath());

                Thread stopper = new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(GuitarRecorder.RECORD_TIME);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        recorder.finish();
                    }
                });

                stopper.start();

                // start recording
                recorder.start();

            } catch (Exception NullPointerException) {
                JOptionPane.showMessageDialog(null, "Cancelling");
            }


        }


    }

    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mouseX = e.getPoint().x;
        int mouseY = e.getPoint().y;

        //////6th String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 796 && mouseY < 840)) {
            System.out.println("Open String (E) Low E String");
            playAudio(Notes.setAudioFile1(userGenre, userSelectedTuning));

            int clickCount = e.getClickCount();

            System.out.println(clickCount);
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 796 && mouseY < 840)) {
            System.out.println("First Fret (F) Low E String");
            playAudio(Notes.setAudioFile2(userGenre, userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 796 && mouseY < 840)) {
            System.out.println("Second Fret (F#) Low E String");
            playAudio(Notes.setAudioFile3(userGenre, userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 796 && mouseY < 840)) {
            System.out.println("Third Fret (G) Low E String");
            playAudio(Notes.setAudioFile4(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 796 && mouseY < 840)) {
            System.out.println("Fourth Fret (G#) Low E String");
            playAudio(Notes.setAudioFile5(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 796 && mouseY < 840)) {
            System.out.println("Fifth Fret (A) Low E String");
            playAudio(Notes.setAudioFile6(userGenre, userSelectedTuning));
        }

        //////5th String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Open String (A) A String");
            playAudio(Notes.setAudioFile7(userGenre, userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("First Fret (F) A String");
            playAudio(Notes.setAudioFile8(userGenre, userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Second Fret (F#) A String");
            playAudio(Notes.setAudioFile9(userGenre, userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Third Fret (G) A String");
            playAudio(Notes.setAudioFile10(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Fourth Fret (G#) A String");
            playAudio(Notes.setAudioFile11(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Fifth Fret (A) A String");
            playAudio(Notes.setAudioFile12(userGenre, userSelectedTuning));
        }

        //////4th String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Open String (D) D String");
            playAudio(Notes.setAudioFile13(userGenre, userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("First Fret (F) D String");
            playAudio(Notes.setAudioFile14(userGenre, userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Second Fret (F#) D String");
            playAudio(Notes.setAudioFile15(userGenre, userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Third Fret (G) D String");
            playAudio(Notes.setAudioFile16(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Fourth Fret (G#) D String");
            playAudio(Notes.setAudioFile17(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Fifth Fret (A) D String");
            playAudio(Notes.setAudioFile18(userGenre, userSelectedTuning));
        }

        //////3rd String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Open String (G) G String");
            playAudio(Notes.setAudioFile19(userGenre, userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("First Fret (F) G String");
            playAudio(Notes.setAudioFile20(userGenre, userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Second Fret (F#) G String");
            playAudio(Notes.setAudioFile21(userGenre, userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Third Fret (G) G String");
            playAudio(Notes.setAudioFile22(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Fourth Fret (G#) G String");
            playAudio(Notes.setAudioFile23(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Fifth Fret (A) G String");
            playAudio(Notes.setAudioFile24(userGenre, userSelectedTuning));
        }

        //////2nd String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Open String (B) B String");
            playAudio(Notes.setAudioFile25(userGenre, userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("First Fret (F) B String");
            playAudio(Notes.setAudioFile26(userGenre, userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Second Fret (F#) B String");
            playAudio(Notes.setAudioFile27(userGenre, userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Third Fret (G) B String");
            playAudio(Notes.setAudioFile28(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Fourth Fret (G#) B String");
            playAudio(Notes.setAudioFile29(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Fifth Fret (A) B String");
            playAudio(Notes.setAudioFile30(userGenre, userSelectedTuning));
        }

        //////1st String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Open String (E) High E String");
            playAudio(Notes.setAudioFile31(userGenre, userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("First Fret (F) High E String");
            playAudio(Notes.setAudioFile32(userGenre, userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Second Fret (F#) High E String");
            playAudio(Notes.setAudioFile33(userGenre, userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Third Fret (G) High E String");
            playAudio(Notes.setAudioFile34(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Fourth Fret (G#) High E String");
            playAudio(Notes.setAudioFile35(userGenre, userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Fifth Fret (A) High E String");
            playAudio(Notes.setAudioFile36(userGenre, userSelectedTuning));
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
