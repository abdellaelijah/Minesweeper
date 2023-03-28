package com.minesweeper.main;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Window extends Canvas{
    
    public Window(int width, int height, String title){

        //Create and set up Window
         JFrame frame = new JFrame(title);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JLabel textLabel = new JLabel("MINESWEEPER", SwingConstants.CENTER);

         frame.setPreferredSize(new Dimension(width, height));
         frame.setMaximumSize(new Dimension(1440, 1080));
         frame.setMinimumSize(new Dimension(300, 300));
         frame.getContentPane().add(textLabel);

         //Display frame
         frame.setLocationRelativeTo(null);
         frame.pack();
         frame.setVisible(true);
    }
     
}
