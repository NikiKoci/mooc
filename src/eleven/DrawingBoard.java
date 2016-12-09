/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleven;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Niki
 */
public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
      
        
        graphics.fillRect(100, 50, 50, 50);
        graphics.fillRect(250, 50, 50, 50);
        graphics.fillRect(50, 150, 50, 50);
        graphics.fillRect(300, 150, 50, 50);
        graphics.fillRect(100, 200, 200, 50);
    }
}