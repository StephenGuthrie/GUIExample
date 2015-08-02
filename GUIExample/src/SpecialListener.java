import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class SpecialListener implements ActionListener {

	public boolean SpecialListener(){
		//JOptionPane.showMessageDialog(null, "You clicked Call Server");
		return true;
	}
	
	
	public void actionPerformed(ActionEvent evt) {
		    JButton source = (JButton) evt.getSource();
		    String buttonText = source.getText();
		    JOptionPane.showMessageDialog(null, "You clicked Special");

		      source.setText("Displaying Specials");
		      System.out.println(source.toString());
		      //source.setText(buttonText);
		   }
}
