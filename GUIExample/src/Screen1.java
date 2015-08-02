import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Screen1 extends JFrame implements ActionListener{
	
	JLabel lblInput;                     // Declare an Label instance called lblInput
	boolean btnPressed = false;
	
	public Screen1() {
		//JPanel p1 = new JPanel();
		
		//p1.setLayout(new GridLayout(3,3));
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f1 = new JFrame();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLayout(new GridLayout(3,3));	
		f1.setSize(400,300);
		
		
		JButton myButton = new JButton("MY BUTTON");
		
		lblInput = new JLabel("Enter ID");   // Construct by invoking a constructor via the new operator
		f1.add(lblInput);                      // this.add(lblInput) - "this" is typically a subclass of Frame
		lblInput.setText("Enter password"); // Modify the Label's text string
		lblInput.getText();                 // Retrieve the Label's text string
		f1.add(myButton);
        myButton.addActionListener(this);
        //f1.add(p1);
        f1.pack();
		f1.setVisible(true);
		System.out.println(toString());

	}
	
	
	   public void actionPerformed(ActionEvent evt) {
	      lblInput.setText("Button Pressed");
	      System.out.println(lblInput.toString());
	      btnPressed = true;
	   }
}
