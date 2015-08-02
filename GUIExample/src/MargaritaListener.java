import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class MargaritaListener implements ActionListener {

	public boolean MargaritaListener(){
		//JOptionPane.showMessageDialog(null, "You clicked Call Server");
		return true;
	}
	
	
	public void actionPerformed(ActionEvent evt) {
		    JButton source = (JButton) evt.getSource();
		    String buttonText = source.getText();
		    JOptionPane.showMessageDialog(null, "You clicked Margarita");

		      source.setText("Requesting Margarita");
		      System.out.println(source.toString());
		      //source.setText(buttonText);
		   }
}
