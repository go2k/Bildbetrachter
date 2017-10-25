package com.sabel.bildbetrachter;

import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Testklasse extends JFrame{

    private Button button;

    public Testklasse() throws HeadlessException {
        super();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setSize(300,300);
        this.setLocationRelativeTo(null);


        button = new Button("klick");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endDialog();
            }
        });

        this.add(button);
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                endDialog();
            }
        });


        this.setVisible(true);


    }

    // https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html#overview

    private void endDialog() {

        int n = JOptionPane.showConfirmDialog(
                this,
                "Wollen Sie das Programm wirklich beenden?",
                "Beenden?",
                JOptionPane.YES_NO_OPTION);

        if (n == 0) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new Testklasse();
    }

}
