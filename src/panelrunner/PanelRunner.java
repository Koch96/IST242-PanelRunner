package panelrunner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

//@author sak5680

public class PanelRunner {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1250, 1000);
      
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(1200, 1000));
      
        JPanel subpanel1 = new JPanel();
        subpanel1.setBackground(Color.RED);
        subpanel1.setPreferredSize(new Dimension(200, 200));
        JPanel subpanel2 = new JPanel();
        subpanel2.setBackground(Color.WHITE);
        subpanel2.setPreferredSize(new Dimension(200, 200));
        JPanel subpanel3 = new JPanel();
        subpanel3.setBackground(Color.BLUE);
        subpanel3.setPreferredSize(new Dimension(200, 200));
        JPanel subpanel4 = new JPanel();
        subpanel4.setBackground(Color.GREEN);
        subpanel4.setPreferredSize(new Dimension(200, 200));
        JPanel subpanel5 = new JPanel();
        subpanel5.setBackground(Color.YELLOW);
        subpanel5.setPreferredSize(new Dimension(200, 200));
        JPanel subpanel6 = new JPanel();
        subpanel6.setBackground(Color.ORANGE);
        subpanel6.setPreferredSize(new Dimension(200, 200));
      
        panel.add(subpanel1, BorderLayout.NORTH);
        panel.add(subpanel2, BorderLayout.WEST);
        panel.add(subpanel3, BorderLayout.CENTER);
        panel.add(subpanel4, BorderLayout.CENTER);
        panel.add(subpanel5, BorderLayout.EAST);
        panel.add(subpanel6, BorderLayout.SOUTH);
      
        frame.add(panel);
        frame.setVisible(true);
   }

}