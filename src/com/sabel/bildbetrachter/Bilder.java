package com.sabel.bildbetrachter;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import javax.swing.*;
import java.awt.*;

public class Bilder extends JFrame {

    private JRadioButton[] jradios;
    private ButtonGroup bGroupWest;
    private JPanel jpWest;
    private JPanel jpSouth;
    private JPanel jpCenter;
    private Button bPrev;
    private Button bNext;
    private JLabel jLabel;
    private Icon icon;

    public static void main(String[] args) {

        new Bilder();

    }

    public Bilder() throws HeadlessException {

        super("Bilder");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);

        initComponents();
        initEvents();
        this.setVisible(true);
    }


    private void initEvents() {

    }


    private void initComponents() {

        jpWest = new JPanel();
        jpWest.setLayout(new BoxLayout(jpWest, BoxLayout.Y_AXIS));
        jradios = new JRadioButton[4];
        bGroupWest = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            jradios[i] = new JRadioButton("Bild " + (i + 1));
            bGroupWest.add(jradios[i]);
            jpWest.add(jradios[i]);
        }
        this.add(jpWest, BorderLayout.WEST);

        jpSouth = new JPanel();
        bPrev = new Button("Vorheriges Bild");
        jpSouth.add(bPrev);
        bNext = new Button("Nächstes Bild");
        jpSouth.add(bNext);
        this.add(jpSouth, BorderLayout.SOUTH);


        jLabel = new JLabel();
        icon = new ImageIcon("bilder\\Bild1.jpg");
        jLabel.setIcon(icon);
        JScrollPane jScrollPane = new JScrollPane(jLabel);
        this.add(jScrollPane, BorderLayout.CENTER);


    }
}
