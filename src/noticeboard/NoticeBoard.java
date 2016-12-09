/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import eleven.AreaCopier;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Niki
 */
public class NoticeBoard implements Runnable {
    private JFrame frame;
    
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(400, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        frame.setTitle("Swing on");
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField field = new JTextField();
        JButton button = new JButton("Copy");
        JLabel label = new JLabel();
        
        container.add(field);
        container.add(button);
        container.add(label);
        button.addActionListener(new ActionEventListener(field, label));
    }
}
