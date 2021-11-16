package GuitarSimulatorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUI extends JFrame implements WindowListener {

    private ImageIcon guitarImage = new ImageIcon("Images/GuitarFretboard.png");
    JLabel guitar = new JLabel();

    public GUI(){
        super("Guitar Simulator");

        addWindowListener(this);

        BorderLayout layout = new BorderLayout(6,8);
        setLayout(layout);

        setSize(1920,1080);

        guitar.setIcon(guitarImage);

        add(guitar,BorderLayout.CENTER);

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
