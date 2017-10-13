package com.sabel.bildbetrachter;

import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testklasse extends JFrame{

    private Button button;

    public Testklasse() throws HeadlessException {
        super();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        button = new Button("klick");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                klick();
            }
        });
        this.add(button);

    }

    private void klick() {

        //JOptionPane.showConfirmDialog(null , "Nachricht", "Titel");

    }

    public static void main(String[] args) {
        new Testklasse();
    }

}
