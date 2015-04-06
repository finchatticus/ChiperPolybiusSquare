package classical.gui;

import classical.classes.Chipher;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cooper on 03.04.15.
 */

public class LangAction implements ActionListener {
    private GeneralPanel generalPanel;
    private int item;

    public LangAction(GeneralPanel generalPanel) {
        this.generalPanel = generalPanel;
    }

    public void actionPerformed(ActionEvent e) {
        Chipher chipher = new Chipher();
        //chipher.setAlphabet("en");
        JComboBox box = (JComboBox)e.getSource();
        item = box.getSelectedIndex();
        //System.out.println(item);
    }

    public int getItem() {
        return item;
    }
}
