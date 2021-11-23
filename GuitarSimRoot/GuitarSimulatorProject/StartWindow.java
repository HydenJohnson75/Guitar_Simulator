package GuitarSimulatorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow extends JFrame implements ActionListener {

    private JComboBox genreComboBox;
    private JComboBox tuningComboBox;

    public StartWindow(){

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
        welcomeButton.setFont(new Font("serif", Font.BOLD,30));
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
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void createGenreComboBox(){

        String genres[] = new String[3];

        genres[0] = "Metal";
        genres[1] = "Jazz";
        genres[2] = "Pop";

        genreComboBox = new JComboBox();
        genreComboBox.addItem(genres[0]);
        genreComboBox.addItem(genres[1]);
        genreComboBox.addItem(genres[2]);

        genreComboBox.setSelectedIndex(0);
    }

    public void createTuningComboBox(){

        String tunings[] = new String[3];

        tunings[0] = "E Standard";
        tunings[1] = "D Standard";
        tunings[2] = "Drop C";

        tuningComboBox = new JComboBox();
        tuningComboBox.addItem(tunings[0]);
        tuningComboBox.addItem(tunings[1]);
        tuningComboBox.addItem(tunings[2]);

        tuningComboBox.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(genreComboBox.getSelectedItem());
        System.out.println(tuningComboBox.getSelectedItem());
        dispose();
        GUI gui = new GUI();
    }

}
