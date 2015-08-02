import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class WelcomeScreen {
    JButton jb1 = new JButton("");
    
    
    			
    boolean btnPressed = false;
    JFrame frame = new JFrame("Welcome");
	
    public void setupFrame() {
		JFrame.setDefaultLookAndFeelDecorated(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new GridLayout(1, 1));
	    frame.pack();
	    frame.setVisible(true);    	
    }
    public void addWelcome(){
	    jb1.addActionListener(new WelcomeListener());
	    jb1.setPreferredSize(new Dimension(480, 270));    	
	    jb1.setLayout(new GridLayout(4,1));
	    JLabel l1 = new JLabel("Welcome");
	    JLabel l2 = new JLabel("To");
	    JLabel l3 = new JLabel("Que Bueno");
	    JLabel l4 = new JLabel("Touch Screen to Continue");
	    l1.setFont(new Font(l1.getName(), Font.PLAIN, 30));
	    l1.setHorizontalAlignment(SwingConstants.CENTER);
	    l2.setFont(new Font(l1.getName(), Font.PLAIN, 30));
	    l2.setHorizontalAlignment(SwingConstants.CENTER);
	    l3.setFont(new Font(l1.getName(), Font.PLAIN, 30));
	    l3.setHorizontalAlignment(SwingConstants.CENTER);
	    l4.setFont(new Font(l1.getName(), Font.PLAIN, 30));
	    l4.setHorizontalAlignment(SwingConstants.CENTER);
	    jb1.add(l1);
	    jb1.add(l2);
	    jb1.add(l3);
	    jb1.add(l4);
	    frame.add(jb1);
    }


    public void setupMenuButtons() {
 		addWelcome();
    	
    }
	public WelcomeScreen() {
        setupMenuButtons();
		setupFrame();
		
	}
	
}
