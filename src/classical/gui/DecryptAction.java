package classical.gui;

import classical.classes.Chipher;
import classical.classes.FileWorker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cooper on 03.04.15.
 */

public class DecryptAction implements ActionListener {
    private GeneralPanel generalPanel;

    public DecryptAction(GeneralPanel generalPanel) {
        this.generalPanel = generalPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = generalPanel.getFieldsPanel().getTextPaneInput().getText();
        String shift = new String(GeneralPanel.getTextField().getText());

        Chipher chipher = new Chipher();
        //chipher.setAlphabet("en");
        //chipher.setShift(shift);
        //String cipher = chipher.getDecryptMessage(message);

        //FileWorker fileWorker = new FileWorker();
        //fileWorker.write("decrypted.txt","");
        //fileWorker.write("decrypted.txt",cipher);

        //generalPanel.getFieldsPanel().getTextPaneInput().setText(cipher);
    }
}
