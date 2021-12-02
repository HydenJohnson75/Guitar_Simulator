package GuitarSimulatorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindowGUI extends JFrame implements ActionListener {

    private JComboBox genreComboBox;
    private JComboBox tuningComboBox;
    private String userGenre;
    private String userTuning;

    /**
     * An instantiable class to generate the start-up window GUI to decided the genre of the guitar
     * and set the tuning for the guitar at the start
     *
     * @author Hyden Johnson
     */

    public StartWindowGUI() {

        super("Welcome Page");
        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        JLabel welcomeLabel = new JLabel();
        welcomeLabel.setText("Welcome to this Guitar Simulator");

        JLabel genreLabel = new JLabel();
        genreLabel.setText("What genre do you like the best: ");

        JLabel tuningLabel = new JLabel();
        tuningLabel.setText("What tuning would you like to start off with: ");


        JButton welcomeButton = new JButton();
        welcomeButton.setPreferredSize(new Dimension(300, 80));
        welcomeButton.setFont(new Font("serif", Font.BOLD, 30));
        welcomeButton.setText("Let's Go");
        welcomeButton.addActionListener(this);

        createGenreComboBox();
        createTuningComboBox();

        JPanel welcomePanel = new JPanel();
        welcomePanel.setLayout(new FlowLayout());
        welcomePanel.add(welcomeLabel);

        JPanel genrePanel = new JPanel();
        genrePanel.setLayout(new FlowLayout());
        genrePanel.add(genreLabel);
        genrePanel.add(genreComboBox);

        JPanel tuningPanel = new JPanel();
        tuningPanel.setLayout(new FlowLayout());
        tuningPanel.add(tuningLabel);
        tuningPanel.add(tuningComboBox);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(welcomeButton);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(welcomePanel);
        panel.add(genrePanel);
        panel.add(tuningPanel);
        panel.add(buttonPanel);


        add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null);    //Line of code received from URL:https://www.tutorialspoint.com/how-to-display-a-jframe-to-the-center-of-a-screen-in-java, Author: Raja
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    /**
     * Method to create a combo box which lets the user select their genre from a selection of 3 genres
     */

    public void createGenreComboBox() {

        String[] genres = new String[3];

        genres[0] = "Metal";
        genres[1] = "Jazz";
        genres[2] = "Pop";

        genreComboBox = new JComboBox();
        genreComboBox.addItem(genres[0]);
        genreComboBox.addItem(genres[1]);
        genreComboBox.addItem(genres[2]);

        genreComboBox.setSelectedIndex(0);
    }

    /**
     * Method to create a combo box which lets the user select their tuning from a selection of 3 tunings
     */

    public void createTuningComboBox() {

        String[] tunings = new String[3];

        tunings[0] = "E Standard";
        tunings[1] = "D Standard";
        tunings[2] = "Drop C";

        tuningComboBox = new JComboBox();
        tuningComboBox.addItem(tunings[0]);
        tuningComboBox.addItem(tunings[1]);
        tuningComboBox.addItem(tunings[2]);

        tuningComboBox.setSelectedIndex(0);
    }

    /**
     * Method to listen for an action preformed on the start button to initialize the genre and tuning
     * and instantiate the main GUI
     *
     * @param e Action Event
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        userGenre = genreComboBox.getSelectedItem().toString();
        System.out.println(userGenre);

        userTuning = tuningComboBox.getSelectedItem().toString();
        System.out.println(userTuning);
        dispose();
        GuitarGUI guitarGui = new GuitarGUI(userGenre, userTuning);
    }
}
