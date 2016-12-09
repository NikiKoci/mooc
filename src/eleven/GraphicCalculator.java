/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleven;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Niki
 */
public class GraphicCalculator implements Runnable{
     private JFrame frame;
     @Override
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
          JTextField output = new JTextField();
          output.setText("0");
          JTextField input = new JTextField();
          JPanel panel = new JPanel();
          GridLayout buttonLayout = new GridLayout(1, 3);
          panel.setLayout(buttonLayout);
        
          JButton plus = new JButton("+");
          JButton minus = new JButton("-");
          JButton z = new JButton("Z");
          
          plus.addActionListener(new CalculatorListener(input, output, "+"));
          minus.addActionListener(new CalculatorListener(input, output, "-"));
           z.addActionListener(new CalculatorListener(input, output, "Z"));
          panel.add(plus);
          panel.add(minus);
          panel.add(z);
          
        

        container.add(output);
        container.add(input);
        container.add(panel);
    
    }

    public JFrame getFrame() {
        return frame;
    }
}
