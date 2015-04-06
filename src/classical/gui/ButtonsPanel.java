package classical.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cooper on 03.04.15.
 */

public class ButtonsPanel extends JPanel {
    private JButton buttonCrypt = new JButton("Зашифровать");
    private JButton buttonDecrypt = new JButton("Расшифровать");
    private static String[] items = {
            "Английский язык",
            "Русский язык"
    };
    //private JComboBox comboBoxLang = new JComboBox(items);
    private GeneralPanel generalPanel;
    public ButtonsPanel(GeneralPanel generalPanel) {
        setLayout(new FlowLayout());

        this.generalPanel = generalPanel;

        addButtons();
        addListeners();
    }

    private void addButtons() {
        add(buttonCrypt);
        add(buttonDecrypt);
        //comboBoxLang.setSelectedItem(items[0]);
        //add(comboBoxLang);
    }

    private void addListeners() {
        buttonCrypt.addActionListener(new CryptAction(generalPanel));
        buttonDecrypt.addActionListener(new DecryptAction(generalPanel));
        //comboBoxLang.addActionListener(new LangAction(generalPanel));
    }
}
