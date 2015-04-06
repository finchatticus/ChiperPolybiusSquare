package classical.gui;

import classical.classes.Chipher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cooper on 03.04.15.
 */

public class GeneralPanel extends JPanel {
    private JLabel jLabel = new JLabel("Ключ:");
    private static JTextPane jTextPane = new JTextPane();
    //private JButton jButton = new JButton("Генерировать");
    private FieldsPanel fieldsPanel = new FieldsPanel();
    private JPanel jPanel = new JPanel();
    private JButton jButton = new JButton("TEST");

    public GeneralPanel() {
        //setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        jPanel.add(jLabel);
        //jTextPane.add(jLabel);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JScrollPane(jTextPane));
        jPanel.add(jButton);
/*        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int messageLength = getFieldsPanel().getTextPaneInput().getText().length();
                System.out.println(messageLength);
                Chipher chipher = new Chipher();
                jTextPane.setText(chipher.generateShift(0, 9, messageLength));

            }
        });*/

        add(jPanel, BorderLayout.PAGE_START);

        add(fieldsPanel,BorderLayout.CENTER);
    }
    


    public static JTextPane getTextField() {
        return jTextPane;
    }

    public FieldsPanel getFieldsPanel() {
        return fieldsPanel;
    }

}
