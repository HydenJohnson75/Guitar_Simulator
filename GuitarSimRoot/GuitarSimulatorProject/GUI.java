package GuitarSimulatorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements WindowListener, ActionListener {

    private ImageIcon guitarImage = new ImageIcon("Images/Guitar_fretboard.png");
    JLabel guitar = new JLabel();
//    private JButton frets[];
//    private JPanel fretGridPanel = new JPanel(new GridLayout(5,6));
    JMenu fileMenu;
    JPanel fretBoard;


    public GUI(){

        super("Guitar Simulator");

        createFileMenu();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.LIGHT_GRAY);
        menuBar.add(fileMenu);
        addWindowListener(this);

        setLayout(null);

        setSize(1920,1080);

        guitar.setIcon(guitarImage);

        add(guitar,BorderLayout.CENTER);

//        add(fretGridPanel);

//        frets = new JButton[30];


//        for(int i = 0; i<frets.length; i++){
//            frets[i] = new JButton("hi");
//            fretGridPanel.add(frets[i]);
//        }

        fretBoard = new JPanel();
        fretBoard.setLayout(null);
        fretBoard.setBounds(850,600,300,100);
        fretBoard.setBackground(Color.BLUE);
        add(fretBoard);
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

    @Override
    public void actionPerformed(ActionEvent e) {

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
}
