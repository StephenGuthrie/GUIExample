import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class MenuListener implements ActionListener {

	public boolean MenuListener(){
		//JOptionPane.showMessageDialog(null, "You clicked Call Server");
		return true;
	}
	
	
	public void actionPerformed(ActionEvent evt) {
		    JButton source = (JButton) evt.getSource();
		    String buttonText = source.getText();
		    JOptionPane.showMessageDialog(null, "You clicked Menu");

		      source.setText("Displaying Menu");
		      System.out.println(source.toString());
		      MenuScreen ms = new MenuScreen();
		      //source.setText(buttonText);
		   }
}
