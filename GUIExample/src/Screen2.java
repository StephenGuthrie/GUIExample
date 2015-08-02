import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Screen2 extends JFrame implements ActionListener{
	
	JLabel lblInput;                     // Declare an Label instance called lblInput
	boolean btnPressed = false;
	
	public Screen2() {
		setLayout(new GridLayout(3,3));
		//setSize(450, 100);
		JButton myButton = new JButton("MY BUTTON S2");
		lblInput = new JLabel("Enter ID");   // Construct by invoking a constructor via the new operator
		add(lblInput);                      // this.add(lblInput) - "this" is typically a subclass of Frame
		lblInput.setText("Enter password"); // Modify the Label's text string
		lblInput.getText();                 // Retrieve the Label's text string
        add(myButton);
        myButton.addActionListener(this);
        
		setVisible(true);
		System.out.println(toString());

	}
	
	
	   public void actionPerformed(ActionEvent evt) {
	      lblInput.setText("Button Pressed");
	      System.out.println(lblInput.toString());
	      btnPressed = true;
	   }
}
