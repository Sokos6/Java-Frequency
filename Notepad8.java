package WebFrequency;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Notepad8 extends JFrame {
    private JButton closeButton;
    private JMenuItem openMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem exitMenuItem;
    private JTextArea notesTextArea;
    private JLabel myLabel;
    private JTextField fileName;

    public Notepad8() {
        super("Notepad");
        addComponents();
        addMenu();
        addEventHandlers();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void addComponents() {
        notesTextArea = new JTextArea(24, 60);
        notesTextArea.setLineWrap(true);
        notesTextArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(notesTextArea);
        closeButton = new JButton("Close");
        myLabel = new JLabel("Filename: ");
        fileName = new JTextField("<Untitled>");
        fileName.setEditable(false);
        
        
        
        
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.X_AXIS));
        southPanel.add(myLabel);
        southPanel.add(fileName);
        southPanel.add(closeButton);
        this.add(southPanel, BorderLayout.SOUTH);
        this.add(scrollPane, BorderLayout.CENTER);
    }

    private void addMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        openMenuItem = new JMenuItem("Open");
        saveMenuItem = new JMenuItem("Save");
        exitMenuItem = new JMenuItem("Exit");

        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        fileMenu.insertSeparator(2); // put a line between save and exit
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        
        
    }

    private void addEventHandlers() {
        class CloseListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        }
       ActionListener closeListener = new CloseListener();
        closeButton.addActionListener(closeListener);
        exitMenuItem.addActionListener(closeListener);

        openMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JFileChooser fc = new JFileChooser(".");
            	int result = fc.showOpenDialog(Notepad8.this);
            	File openFile = fc.getSelectedFile();
                try {
                	FileReader fileIn = new FileReader(openFile);
                	char[] readBuffer = new char[(int)openFile.length()];
                	fileIn.read(readBuffer);
                	notesTextArea.setText(new String(readBuffer));
                	fileIn.close();
                }
                catch (IOException ioe) {
                	
                }
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser(".");
                int result = fc.showSaveDialog(Notepad8.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File saveFile = fc.getSelectedFile();
                    fileName.setText(saveFile.getName());
                    
  
                    try {
                        FileWriter fileOut = new FileWriter(saveFile);
                        fileOut.write(notesTextArea.getText());
                        fileOut.close();
                        
                        
                    }
                    catch (IOException ioe) {
                        System.err.println("I/O Error on Save.");
                    }
                }
            }
        });
    }

    public static void main(String[] arg) {
        new Notepad8();
    }
}
