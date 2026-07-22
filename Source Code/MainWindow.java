package hackos.firmware.xplorer;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MainWindow extends JFrame {

    private JTextArea textArea;

    public MainWindow() {

        super("HackOS Firmware Xplorer");

        setSize(1000, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        createMenuBar();
        createEditor();

        add(new JLabel(" Ready"), BorderLayout.SOUTH);

        setVisible(true);
    }

    private void createMenuBar() {

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem open = new JMenuItem("Open...");
        JMenuItem exit = new JMenuItem("Exit");

        exit.addActionListener(e -> System.exit(0));

        file.add(open);
        file.addSeparator();
        file.add(exit);

        JMenu help = new JMenu("Help");
        JMenuItem about = new JMenuItem("About");

        about.addActionListener(e -> {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "HackOS Firmware Xplorer\nVersion 0.1 Alpha",
                    "About",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE
            );
        });

        help.add(about);

        menuBar.add(file);
        menuBar.add(help);

        setJMenuBar(menuBar);
    }

    private void createEditor() {

        textArea = new JTextArea();

        textArea.setEditable(false);
        textArea.setText(
                "Welcome to HackOS Firmware Xplorer v0.1 Alpha!\n\n"
              + "Soon this window will display firmware\n"
              + "and binary files in hexadecimal."
        );

        add(new JScrollPane(textArea), BorderLayout.CENTER);

    }

}