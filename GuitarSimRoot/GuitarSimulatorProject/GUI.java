package GuitarSimulatorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI extends JFrame implements WindowListener {

    private ImageIcon guitarImage = new ImageIcon("Images/Guitar_fretboard.png");
    JLabel guitar = new JLabel();
    private JButton frets[];
    private JPanel fretGridPanel = new JPanel(new GridLayout(5,6));

    public GUI(){

        super("Guitar Simulator");

        addWindowListener(this);

        BorderLayout layout = new BorderLayout(6,8);
        setLayout(layout);

        setSize(1920,1080);

        guitar.setIcon(guitarImage);

        add(guitar,BorderLayout.CENTER);

        add(fretGridPanel);

        frets = new JButton[30];


        for(int i = 0; i<frets.length; i++){
            frets[i] = new JButton("hi");
            fretGridPanel.add(frets[i]);
        }


        setExtendedState(MAXIMIZED_BOTH);

        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
}
