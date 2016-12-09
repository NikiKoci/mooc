package eleven;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class ThirtySeven implements Runnable {

    private JFrame frame;

    public ThirtySeven() {
    }

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
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are You"));

        JCheckBox yes= new JCheckBox("Yes!");
        container.add(yes);
          JCheckBox no= new JCheckBox("No!");
        container.add(no);
        
        ButtonGroup buttonGroup = new ButtonGroup();
       JRadioButton noReason = new JRadioButton("No reason.");
       JRadioButton fun = new JRadioButton("Because it is fun");
       buttonGroup.add(noReason);
       buttonGroup.add(fun);
       container.add(noReason);
       container.add(fun);
    }

    public JFrame getFrame() {
        return frame;
    }
}
