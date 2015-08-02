import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MenuScreen {
    JButton jb1 = new JButton("Fajitas");
    JButton jb2 = new JButton("Tacos");
    JButton jb3 = new JButton("Salads");
    JButton jb4 = new JButton("Combos");
    JButton jb5 = new JButton("Gringo Food");
    JButton jb6 = new JButton("Drinks");
    JButton jb7 = new JButton("Breakfast");
    JButton jb8 = new JButton("BACK TO MAIN");
    boolean btnPressed = false;
	
	public MenuScreen() {
		JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame frame = new JFrame("GridLayout Test");
	    jb1.addActionListener(new FoodListener());
	    jb1.setPreferredSize(new Dimension(150, 90));
	    jb2.addActionListener(new FoodListener());
	    jb3.addActionListener(new FoodListener());
	    jb4.addActionListener(new FoodListener());
	    jb5.addActionListener(new FoodListener());
	    jb6.addActionListener(new FoodListener());
	    jb7.addActionListener(new FoodListener());
	    jb8.addActionListener(new BackToMainListener());
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new GridLayout(3, 2));
	    frame.add(jb1);
	    frame.add(jb2);
	    frame.add(jb3);
	    frame.add(jb4);
	    frame.add(jb5);
	    frame.add(jb6);
	    frame.add(jb7);
	    frame.add(jb8);
	    frame.pack();
	    frame.setVisible(true);
		
	}
	
}
