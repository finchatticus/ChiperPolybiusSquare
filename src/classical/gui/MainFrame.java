package classical.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cooper on 03.04.15.
 */

public class MainFrame extends JFrame {
    private final String WindowTitle = "Шифр Гамированния";
    private final Dimension WindowSize = new Dimension(600,600);
    private final GeneralPanel generalFrame = new GeneralPanel();

    private JPanel jPanel1 = new JPanel();
    private JPanel jPanel2 = new JPanel();
    private JLabel jLabelShift = new JLabel("Ключ:");
    private JTextPane jTextPane = new JTextPane();


    public MainFrame() throws HeadlessException {
        setTitle(WindowTitle);
        setSize(WindowSize);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        //pack();

        getContentPane().setLayout(new BorderLayout());

        //getContentPane().add(jPanel1);
        //jPanel1.add(jLabelShift);
        getContentPane().add(jLabelShift);
        //getContentPane().add(jTextPane);
        //jPanel2.add(jTextPane);


        //add(new ButtonsPanel(generalFrame),BorderLayout.PAGE_START);
        //add(generalFrame,BorderLayout.CENTER);
    }

    public JTextPane getjTextPane() {
        return jTextPane;
    }
}
