package com.sabel.bildbetrachter;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Bilder extends JFrame {

    private JRadioButton[] jradios;
    private ButtonGroup bGroupWest;
    private JPanel jpWest;
    private JPanel jpSouth;
    private JPanel jpCenter;
    private Button bPrev;
    private Button bNext;
    private JLabel jLabel;
    private Icon[] icons;
    private int bildNr;

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

        bPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bildNr > 0) {
                    zeigeBild(bildNr - 1);
                } else {
                    zeigeBild(icons.length - 1);
                }
            }
        });

        bNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bildNr < icons.length - 1) {
                    zeigeBild(bildNr + 1);
                } else {
                    zeigeBild(0);
                }
            }
        });

        for (int i = 0; i < icons.length; i++) {
            final int finalI = i;
            jradios[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    zeigeBild(finalI);
                }
            });
        }
    }

    private void zeigeBild(int i) {
        jLabel.setIcon(icons[i]);
        jradios[i].setSelected(true);
        bildNr = i;
    }

    private void initComponents() {

        icons = new Icon[4];
        for (int i = 0; i < 4; i++) {
            icons[i] = new ImageIcon(getClass().getResource("/bilder/Bild" + (i + 1) + ".jpg"));
            //icons[i] = new ImageIcon("bilder/Bild" + (i + 1) + ".jpg");
        }

        jpWest = new JPanel();
        jpWest.setLayout(new BoxLayout(jpWest, BoxLayout.Y_AXIS));
        jradios = new JRadioButton[4];
        bGroupWest = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            jradios[i] = new JRadioButton("Bild " + (i + 1));
            bGroupWest.add(jradios[i]);
            jpWest.add(jradios[i]);
        }
        jradios[0].setSelected(true);
        this.add(jpWest, BorderLayout.WEST);

        jpSouth = new JPanel();
        bPrev = new Button("Vorheriges Bild");
        jpSouth.add(bPrev);
        bNext = new Button("Nächstes Bild");
        jpSouth.add(bNext);
        this.add(jpSouth, BorderLayout.SOUTH);

        jLabel = new JLabel();
        jLabel.setIcon(icons[0]);
        JScrollPane jScrollPane = new JScrollPane(jLabel);
        this.add(jScrollPane, BorderLayout.CENTER);
    }


}
