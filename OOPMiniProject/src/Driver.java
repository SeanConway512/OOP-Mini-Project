//Driver.java
//This will be the driver class for the program

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Driver extends JFrame {
    public static void main(String[] args) {

      JFrame frame = new JFrame("HelpDesk");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600,600);
      JButton button = new JButton("Press");
      frame.getContentPane().add(button);
      frame.setVisible(true);
      frame.setLocationRelativeTo(null);

      JMenuBar mb = new JMenuBar();
      JMenu menu1 = new JMenu("FILE");
      JMenu menu2 = new JMenu("Help");
      mb.add(menu1);
      mb.add(menu2);
      JMenuItem m11 = new JMenuItem("Open");
      JMenuItem m22 = new JMenuItem("Save as");
      menu1.add(m11);
      menu1.add(m22);

      JPanel panel = new JPanel();
      JLabel label = new JLabel("Enter Text");
      JTextField tf = new JTextField(10);
      JButton send = new JButton("Send");
      JButton reset = new JButton("Reset");
      panel.add(label);
      panel.add(tf);
      panel.add(send);
      panel.add(reset);

      JTextArea ta = new JTextArea();

      frame.getContentPane().add(BorderLayout.SOUTH, panel);
      frame.getContentPane().add(BorderLayout.NORTH, mb);
      frame.getContentPane().add(BorderLayout.CENTER, ta);
      frame.setVisible(true);
    }
}
