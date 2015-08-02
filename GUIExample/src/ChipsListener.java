import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.guthrie.menu.mail.mail;


public class ChipsListener implements ActionListener {

	public boolean MenuListener(){
		//JOptionPane.showMessageDialog(null, "You clicked Call Server");
		return true;
	}
	
	
	public void actionPerformed(ActionEvent evt) {
		    JButton source = (JButton) evt.getSource();
		    String buttonText = source.getText();
		    JOptionPane.showMessageDialog(null, "You clicked Chips and Salsa");
		    mail mm = new mail();
		    //JOptionPane.showMessageDialog(null, "You clicked Call Server");
			try {
				mm.sendMailWithAuth("smtp.gmail.com", "stephen.guthrie@gmail.com", "NT$753211nt", "587", "stephen.guthrie@gmail.com",
					     "Table 22", "Please send us more chips and salsa");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		      source.setText("Requesting Chips");
		      System.out.println(source.toString());
		      //source.setText(buttonText);
		   }
}
