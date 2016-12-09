/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Niki
 */
public class CalculatorListener implements ActionListener {

    JTextField input;
    JTextField output;
    String type;
    int value = 0;

    public CalculatorListener(JTextField input, JTextField output, String type) {
        this.input = input;
        this.output = output;
        this.type = type;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (type.equals("+")) {
            value = value + Integer.parseInt(input.getText());

        }
        if (type.equals("-")) {
            value = value - Integer.parseInt(input.getText());

        }

        if (type.equals("Z")) {
            value = 0;

        }
        input.setText("");
        output.setText(Integer.toString(value));
    }

}
