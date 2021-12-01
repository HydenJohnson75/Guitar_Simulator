package GuitarSimulatorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import static GuitarSimulatorProject.GUI.mediaPlayer;
import static GuitarSimulatorProject.GUI.playAudio;


public class RandomRiffGUI extends JFrame implements WindowListener, ActionListener {


    private final JButton stopButton;
    private final JButton playButton;
    private final JLabel songInfo;
    private final JLabel bandInfo;
    private final JLabel dateInfo;
    private final Font textFont = new Font("Helvetica", Font.BOLD, 15);

    public RandomRiffGUI(String genre) {
        super("Random Riff");

        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        JPanel songPanel = new JPanel(new FlowLayout());
        JPanel bandPanel = new JPanel(new FlowLayout());
        JPanel datePanel = new JPanel(new FlowLayout());


        JPanel centerPanel = new JPanel(new BorderLayout());

        centerPanel.add(songPanel, BorderLayout.NORTH);
        centerPanel.add(bandPanel, BorderLayout.CENTER);
        centerPanel.add(datePanel, BorderLayout.SOUTH);

        songInfo = new JLabel();
        bandInfo = new JLabel();
        dateInfo = new JLabel();

        songInfo.setFont(textFont);
        bandInfo.setFont(textFont);
        dateInfo.setFont(textFont);

        songPanel.add(songInfo);
        bandPanel.add(bandInfo);
        datePanel.add(dateInfo);

        stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        playButton = new JButton("Play");
        playButton.addActionListener(this);


        add(centerPanel, BorderLayout.CENTER);
        add(stopButton, BorderLayout.EAST);
        add(playButton, BorderLayout.WEST);
        setSize(357, 240);
        setResizable(true);
        setVisible(true);
        addWindowListener(this);

        chooseRandomRiff(genre);
    }

    public void chooseRandomRiff(String genre) {
        int selection = (int) (Math.random() * (4 - 1) + 1);

        if (genre.equals("Metal")) {
            if (selection == 1) {
                playAudio("RecordedSongs/Metal/Symphony.mp3");
                songInfo.setText("Song: Symphony of Destruction");
                bandInfo.setText("Band: Megadeth");
                dateInfo.setText("Release Year: 1992");
            }
            if (selection == 2) {
                playAudio("RecordedSongs/Metal/Starting_Over.mp3");
                songInfo.setText("Song: Starting Over");
                bandInfo.setText("Band: Killswitch Engage");
                dateInfo.setText("Release Year: 2009");
            }
            if (selection == 3) {
                playAudio("RecordedSongs/Metal/Unsainted.mp3");
                songInfo.setText("Song: Unsainted");
                bandInfo.setText("Band: Slipknot");
                dateInfo.setText("Release Year: 2019");
            }
        }
        if (genre.equals("Jazz")) {
            if (selection == 1) {
                playAudio("RecordedSongs/Jazz/Thrill_is_Gone.mp3");
                songInfo.setText("Song: The Thrill is Gone");
                bandInfo.setText("Band: B.B. King");
                dateInfo.setText("Release Year: 1969");
            }
            if (selection == 2) {
                playAudio("RecordedSongs/Jazz/Johnny_B_Goode.mp3");
                songInfo.setText("Song: Johnny B Goode");
                bandInfo.setText("Band: Chuck Berry");
                dateInfo.setText("Release Year: 1959");
            }
            if (selection == 3) {
                playAudio("RecordedSongs/Jazz/Boom_Boom.mp3");
                songInfo.setText("Song: Boom Boom");
                bandInfo.setText("Band: John Lee Hooker");
                dateInfo.setText("Release Year: 1962");
            }
        }
        if (genre.equals("Pop")) {
            if (selection == 1) {
                playAudio("RecordedSongs/Pop/Dont_Stop_Beliving.mp3");
                songInfo.setText("Song: Don\'t Stop Believin' ");
                bandInfo.setText("Band: Journey");
                dateInfo.setText("Release Year: 1975");
            }
            if (selection == 2) {
                playAudio("RecordedSongs/Pop/Californication.mp3");
                songInfo.setText("Song: Californication");
                bandInfo.setText("Band: Red Hot Chilli Peppers");
                dateInfo.setText("Release Year: 1999");
            }
            if (selection == 3) {
                playAudio("RecordedSongs/Pop/Let_It_Go.mp3");
                songInfo.setText("Song: Let It Go");
                bandInfo.setText("Band: James Bay");
                dateInfo.setText("Release Year: 2014");
            }
        }

    }


    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        mediaPlayer.stop();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        dispose();
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
        if (e.getSource() == stopButton) {
            mediaPlayer.stop();
        }
        if (e.getSource() == playButton) {
            mediaPlayer.play();
        }
    }
}
