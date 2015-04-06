package classical.gui;

import classical.classes.Chipher;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cooper on 06.04.15.
 */
public class MainFrame1 extends JFrame {
    private final String WindowTitle = "Шифр";
    private final Dimension WindowSize = new Dimension(520,480);
    private JPanel panel = new JPanel();
    private JLabel labelShift = new JLabel("Ключ:");
    private JButton buttonKey = new JButton("OK");
    private JButton buttonCrypt = new JButton("Зашифровать");
    private JButton buttonDecrypt = new JButton("Расшифровать");
    private JButton buttonClear = new JButton("Очистить");
    private JButton buttonClear2 = new JButton("Очистить");
    private JTextPane paneShift = new JTextPane();
    private JTextPane paneChipher = new JTextPane();
    String[] lang = { "Russian","Ukrainian","English"};
    String digits = "1234567890";
    private String ua = "єхидна, ґава, їжак ще й шиплячі плазуни бігцем форсують янцзи.\n" +
                        "ЄХИДНА, ҐАВА, ЇЖАК ЩЕ Й ШИПЛЯЧІ ПЛАЗУНИ БІГЦЕМ ФОРСУЮТЬ ЯНЦЗИ\n" +
                        digits;
    private String ru = "в чащах юга жил бы цитрус? да, но фальшивый экземпляр!\n" +
                        "В ЧАЩАХ ЮГА ЖИЛ БЫ ЦИТРУС? ДА, НО ФАЛЬШИВЫЙ ЭУЗЕМПЛЯР1\n" +
                        "Съешь же ещё этих мягких французских булок да выпей чаю.\n" +
                        digits;
    private String en = "the quick brown fox jumps over the lazy dog\n" +
                        "THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG\n " +
                        digits;
    private JComboBox comboBoxLang = new JComboBox(lang);
    private JTextArea area = new JTextArea(25,50);

    private Chipher chipher = new Chipher();

    public MainFrame1() throws HeadlessException {
        setTitle(WindowTitle);
        setSize(WindowSize);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        addComponents(getContentPane());
        setVisible(true);
    }

    private void addComponents(Container contentPane) {
        contentPane.add(panel);
        panel.setLayout(new MigLayout());

        panel.add(labelShift,"wrap");

        paneShift.setPreferredSize(new Dimension(350,200));
        panel.add(paneShift,"spany 3, wrap");

        JScrollPane jsp = new JScrollPane(paneShift);
        panel.add(jsp,"spany 3,wrap");

        //comboBoxLang
        panel.add(comboBoxLang,"wrap");
        comboBoxLang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox)e.getSource();
                String lang1 = (String)cb.getSelectedItem();
                if(lang1.equals(lang[0])) {
                    paneShift.setText(ru);
                    chipher.setShift(ru);
                }
                else if(lang1.equals(lang[1])) {
                    paneShift.setText(ua);
                    chipher.setShift(ua);
                }
                else if(lang1.equals(lang[2])) {
                    paneShift.setText(en);
                    chipher.setShift(en);
                }
                else {
                    paneShift.setText(en);
                    chipher.setShift(en);
                }
            }
        });

        //buttonKey
        //panel.add(buttonKey,"wrap");

        //buttonClear
        panel.add(buttonClear, "wrap");
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paneShift.setText("");
            }
        });

        paneChipher.setPreferredSize(new Dimension(350,200));
        panel.add(paneChipher,"spany 4,wrap");

        JScrollPane jsp1 = new JScrollPane(paneChipher);
        panel.add(jsp1,"spany 4,wrap");

        panel.add(buttonCrypt,"wrap");
        buttonCrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = paneChipher.getText();
                String shift = paneShift.getText();
                System.out.println("Mes " + message);
                System.out.println("Shift " + shift);
                if(shift.isEmpty() == true) {
                    JOptionPane.showMessageDialog(null,
                            "Поле ввода ключа пустое",
                            "error",
                            JOptionPane.ERROR_MESSAGE);
                }
                if(message.isEmpty() == true) {
                    JOptionPane.showMessageDialog(null,
                            "Поле ввода сообщения пустое",
                            "error",
                            JOptionPane.ERROR_MESSAGE);
                }
                chipher.setShift(shift);
                paneChipher.setText(chipher.getEncryptMessage(message));
            }
        });

        panel.add(buttonDecrypt,"wrap");
        buttonDecrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = paneChipher.getText();
                String shift = paneShift.getText();
                System.out.println("Mes " + message);
                System.out.println("Shift " + shift);
                if(shift.isEmpty() == true) {
                    JOptionPane.showMessageDialog(null,
                            "Поле ввода ключа пустое",
                            "error",
                            JOptionPane.ERROR_MESSAGE);
                }
                if(message.isEmpty() == true) {
                    JOptionPane.showMessageDialog(null,
                            "Поле ввода сообщения пустое",
                            "error",
                            JOptionPane.ERROR_MESSAGE);
                }
                chipher.setShift(shift);
                paneChipher.setText(chipher.getDecryptMessage(message));
            }
        });

        panel.add(buttonClear2);

 /*       panel.add(labelShift,"cell 0 0");

        paneShift.setPreferredSize(new Dimension(350,200));
        panel.add(paneShift,"cell 0 1");

        //comboBoxLang
        panel.add(comboBoxLang,"cell 1 1");

        //buttonKey
        panel.add(buttonKey,"cell 1 2");

        paneChipher.setPreferredSize(new Dimension(350,200));
        panel.add(paneChipher,"cell 0 2");

        panel.add(buttonCrypt,"cell 1 2");

        panel.add(buttonDecrypt,"cell 1 4");*/

    }

}
