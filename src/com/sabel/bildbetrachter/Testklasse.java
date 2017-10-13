package com.sabel.bildbetrachter;

import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

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


        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                endDialog();
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

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
