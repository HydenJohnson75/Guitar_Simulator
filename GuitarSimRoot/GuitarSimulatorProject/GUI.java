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
    JPanel startPanel = new JPanel();
    static String userSelectedGenre;
    Notes n1 = new Notes();
    static String userSelectedTuning;

    public GUI(){

        super("Guitar Simulator");

        createFileMenu();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.LIGHT_GRAY);
        menuBar.add(fileMenu);
        addWindowListener(this);

        userSelectedTuning = "E Standard";

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
        JMenuItem eTuning;
        JMenuItem dTuning;
        JMenuItem dropTuning;
        fileMenu = new JMenu("Tuning");
        eTuning = new JMenuItem("E Standard");
        eTuning.addActionListener(this);
        fileMenu.add(eTuning);
        dTuning = new JMenuItem("D Standard");
        dTuning.addActionListener(this);
        fileMenu.add(dTuning);
        dropTuning = new JMenuItem("Drop C");
        dropTuning.addActionListener(this);
        fileMenu.add(dropTuning);
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

    public static String startPopup(){

        JPanel panel = new JPanel();


        panel.add(new JLabel("What genre do you like:"));
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("Metal");
        model.addElement("Jazz");
        model.addElement("Pop");
        JComboBox comboBox = new JComboBox(model);
        panel.add(comboBox);


        int result = JOptionPane.showConfirmDialog(null,panel ,"Genre",JOptionPane.OK_CANCEL_OPTION);

        if(result == JOptionPane.OK_OPTION){
            System.out.println("okay");

            userSelectedGenre = comboBox.getSelectedItem().toString();

            System.out.println(userSelectedGenre);
        }

        return userSelectedGenre;

    }


    @Override
    public void windowOpened(WindowEvent e) {
        startPopup();
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
        final String menuSelection = e.getActionCommand();

        if(menuSelection == "D Standard"){
            userSelectedTuning = "D Standard";
        }
        if(menuSelection == "E Standard"){
            userSelectedTuning = "E Standard";
        }
        if(menuSelection == "Drop C"){
            userSelectedTuning = "Drop C";
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
            playAudio(n1.setAudioFile1(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 796 && mouseY < 840)) {
            System.out.println("First Fret (F) Low E String");
            playAudio(n1.setAudioFile2(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 796 && mouseY < 840)) {
            System.out.println("Second Fret (F#) Low E String");
            playAudio(n1.setAudioFile3(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 796 && mouseY < 840)) {
            System.out.println("Third Fret (G) Low E String");
            playAudio(n1.setAudioFile4(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 796 && mouseY < 840)) {
            System.out.println("Fourth Fret (G#) Low E String");
            playAudio(n1.setAudioFile5(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 796 && mouseY < 840)) {
            System.out.println("Fifth Fret (A) Low E String");
            playAudio(n1.setAudioFile6(userSelectedGenre,userSelectedTuning));
        }

        //////5th String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Open String (A) A String");
            playAudio(n1.setAudioFile7(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("First Fret (F) A String");
            playAudio(n1.setAudioFile8(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Second Fret (F#) A String");
            playAudio(n1.setAudioFile9(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Third Fret (G) A String");
            playAudio(n1.setAudioFile10(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Fourth Fret (G#) A String");
            playAudio(n1.setAudioFile11(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 690 && mouseY < 735)) {
            System.out.println("Fifth Fret (A) A String");
            playAudio(n1.setAudioFile12(userSelectedGenre,userSelectedTuning));
        }

        //////4th String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Open String (D) D String");
            playAudio(n1.setAudioFile13(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("First Fret (F) D String");
            playAudio(n1.setAudioFile14(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Second Fret (F#) D String");
            playAudio(n1.setAudioFile15(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Third Fret (G) D String");
            playAudio(n1.setAudioFile16(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Fourth Fret (G#) D String");
            playAudio(n1.setAudioFile17(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 590 && mouseY < 628)) {
            System.out.println("Fifth Fret (A) D String");
            playAudio(n1.setAudioFile18(userSelectedGenre,userSelectedTuning));
        }

        //////3rd String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Open String (G) G String");
            playAudio(n1.setAudioFile19(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("First Fret (F) G String");
            playAudio(n1.setAudioFile20(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Second Fret (F#) G String");
            playAudio(n1.setAudioFile21(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Third Fret (G) G String");
            playAudio(n1.setAudioFile22(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Fourth Fret (G#) G String");
            playAudio(n1.setAudioFile23(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 479 && mouseY < 516)) {
            System.out.println("Fifth Fret (A) G String");
            playAudio(n1.setAudioFile24(userSelectedGenre,userSelectedTuning));
        }

        //////2nd String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Open String (B) B String");
            playAudio(n1.setAudioFile25(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("First Fret (F) B String");
            playAudio(n1.setAudioFile26(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Second Fret (F#) B String");
            playAudio(n1.setAudioFile27(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Third Fret (G) B String");
            playAudio(n1.setAudioFile28(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Fourth Fret (G#) B String");
            playAudio(n1.setAudioFile29(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 380 && mouseY < 416)) {
            System.out.println("Fifth Fret (A) B String");
            playAudio(n1.setAudioFile30(userSelectedGenre,userSelectedTuning));
        }

        //////1st String
        if ((mouseX > 12 && mouseX < 99) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Open String (E) High E String");
            playAudio(n1.setAudioFile31(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 128 && mouseX < 468) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("First Fret (F) High E String");
            playAudio(n1.setAudioFile32(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 481 && mouseX < 856) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Second Fret (F#) High E String");
            playAudio(n1.setAudioFile33(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 868 && mouseX < 1285) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Third Fret (G) High E String");
            playAudio(n1.setAudioFile34(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 1297 && mouseX < 1603) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Fourth Fret (G#) High E String");
            playAudio(n1.setAudioFile35(userSelectedGenre,userSelectedTuning));
        }
        if ((mouseX > 1612 && mouseX < 1920) && (mouseY > 277 && mouseY < 311)) {
            System.out.println("Fifth Fret (A) High E String");
            playAudio(n1.setAudioFile36(userSelectedGenre,userSelectedTuning));
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
