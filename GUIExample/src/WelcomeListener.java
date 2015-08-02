import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import com.guthrie.menu.mail.*;


public class WelcomeListener implements ActionListener {

	public boolean CallServerListener(){
		//JOptionPane.showMessageDialog(null, "You clicked Call Server");
		return true;
	}
	
	public void sendServerCalledEmail(){
	    mail mm = new mail();
	    //JOptionPane.showMessageDialog(null, "You clicked Call Server");
		try {
			mm.sendMailWithAuth("smtp.gmail.com", "stephen.guthrie@gmail.com", "NT$753211nt", "587", "stephen.guthrie@gmail.com",
				     "Table 22", "We need a Server");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void setButtonText(JButton button, String btnTxt){
		button.setText(btnTxt);
	}
	
	public void actionPerformed(ActionEvent evt) {
		    JButton source = (JButton) evt.getSource();
		    //String buttonText = source.getText();
              //sendServerCalledEmail();
              //setButtonText(source, "Server Called");
			  //source.setText("Server Called");
		      //source.setText(source.getText() + "P");
		      //System.out.println(source.toString());
		      //source.setText(buttonText);
		    source.getParent().getParent().getParent().getParent().setVisible(false);
		    GridScreen gs = new GridScreen();
		   }
}
