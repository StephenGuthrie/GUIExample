import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class BackToMainListener implements ActionListener {

	public boolean BackToMainListener(){
		//JOptionPane.showMessageDialog(null, "You clicked Call Server");
		return true;
	}
	
	
	public void actionPerformed(ActionEvent evt) {
		    JButton source = (JButton) evt.getSource();
		    String buttonText = source.getText();
		    JOptionPane.showMessageDialog(null, "Back to main");

		      source.setText("Going Back");
		      System.out.println(source.toString());
		      source.getTopLevelAncestor().setVisible(false);
		      //source.setText(buttonText);
		   }
}
