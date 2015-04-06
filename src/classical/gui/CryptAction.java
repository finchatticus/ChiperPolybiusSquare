package classical.gui;

import classical.classes.Chipher;
import classical.classes.FileWorker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cooper on 03.04.15.
 */

public class CryptAction implements ActionListener {
    private GeneralPanel generalPanel;

    public CryptAction(GeneralPanel generalPanel){
        this.generalPanel = generalPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = generalPanel.getFieldsPanel().getTextPaneInput().getText();
        String shift = new String(GeneralPanel.getTextField().getText());

        Chipher chipher = new Chipher();
        //chipher.setAlphabet("en");
        //chipher.setShift(shift);
        //String cipher = chipher.getEncryptMessage(message);

        //FileWorker fileWorker = new FileWorker();
        //System.out.println(cipher);
        //fileWorker.write("encrypted.txt","");
        //fileWorker.write("encrypted.txt",cipher);
        //fileWorker.update("encrypted.txt",cipher);

        //generalPanel.getFieldsPanel().getTextPaneInput().setText(cipher);

    }
}

