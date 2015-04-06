package classical.gui;

import javax.swing.*;

/**
 * Created by cooper on 03.04.15.
 */

public class FieldsPanel extends JPanel {
    private JTextPane textPaneInput = new JTextPane();
    private JTextPane textPaneOutput = new JTextPane();

    private JLabel labelPainInput = new JLabel("Текст для шифрования:");
    //private JLabel labelPainOutput = new JLabel("Зашифрований:");

    public FieldsPanel() {
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        textPaneInput.
                add(labelPainInput);
        add(new JScrollPane(textPaneInput));

        //add(labelPainOutput);
        //add(new JScrollPane(textPaneOutput));
    }

    public JTextPane getTextPaneInput() {
        return textPaneInput;
    }

    public JTextPane getTextPaneOutput() {
        return textPaneOutput;
    }
}
