import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;


public class MyGUIProgram extends Frame{
	
	public MyGUIProgram() {
		setLayout(new FlowLayout());
		setSize(250, 100);
		Label lblInput;                     // Declare an Label instance called lblInput
		lblInput = new Label("Enter ID");   // Construct by invoking a constructor via the new operator
		add(lblInput);                      // this.add(lblInput) - "this" is typically a subclass of Frame
		lblInput.setText("Enter password"); // Modify the Label's text string
		lblInput.getText();                 // Retrieve the Label's text string
		setVisible(true);
	}

}
