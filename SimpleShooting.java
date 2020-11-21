// package simpleshooting;

import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
import javax.swing.*;

public class SimpleShooting {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shooting!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        Field field = new Field();
        frame.add(field);

        frame.setVisible(true);
    }
}
