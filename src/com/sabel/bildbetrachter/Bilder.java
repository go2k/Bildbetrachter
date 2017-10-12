package com.sabel.bildbetrachter;

import javax.swing.*;
import java.awt.*;

public class Bilder extends JFrame {

    private JRadioButton[] jradios;
    private JPanel jpWest;
    private JPanel jpSouth;
    private JPanel jpCenter;
    private Button bPrev;
    private Button bNext;

    public static void main(String[] args) {

        new Bilder();

    }

    public Bilder() throws HeadlessException {

        super("Bildbetrachter");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
