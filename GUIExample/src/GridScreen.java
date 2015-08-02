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


public class GridScreen {
    JButton jb2 = new JButton("View Menu");
    JButton jb3 = new JButton("Order Special");
    JButton jb4 = new JButton("Margarita");
    JButton jb5 = new JButton("Request Water");
    JButton jb6 = new JButton("Chips and Salsa");
    JButton jb7 = new JButton("Ready for Check");
    JButton jb8 = new JButton("Ready to Order");
    boolean btnPressed = false;
    JFrame frame = new JFrame("GridLayout Test");
	
    public void setupFrame() {
		JFrame.setDefaultLookAndFeelDecorated(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new GridLayout(3, 2));
	    frame.pack();
	    frame.setVisible(true);    	
    }
    public void addCallServer(){
        JButton jb1 = new JButton();
	    JLabel l1 = new JLabel("Call");
	    JLabel l2 = new JLabel("Server");
	    
    	l1.setFont(new Font(l1.getName(), Font.PLAIN, 30));
	    l1.setHorizontalAlignment(SwingConstants.CENTER);
    	l2.setFont(new Font(l2.getName(), Font.PLAIN, 30));
	    l2.setHorizontalAlignment(SwingConstants.CENTER);
	    jb1.addActionListener(new CallServerListener());
	    jb1.setPreferredSize(new Dimension(150, 90));
	    jb1.setLayout(new GridLayout(2,1));
	    jb1.add(l1);
	    jb1.add(l2);	    
	    frame.add(jb1);
    }

    public void addViewMenu(){
        JButton jb1 = new JButton();
	    JLabel l1 = new JLabel("View");
	    JLabel l2 = new JLabel("Menu");
	    
    	l1.setFont(new Font(l1.getName(), Font.PLAIN, 30));
	    l1.setHorizontalAlignment(SwingConstants.CENTER);
    	l2.setFont(new Font(l2.getName(), Font.PLAIN, 30));
	    l2.setHorizontalAlignment(SwingConstants.CENTER);
	    jb1.addActionListener(new MenuListener());
	    jb1.setPreferredSize(new Dimension(150, 90));
	    jb1.setLayout(new GridLayout(2,1));
	    jb1.add(l1);
	    jb1.add(l2);	    
	    frame.add(jb1);

    }

    public void addOrderSpecials(){
        JButton jb1 = new JButton();
	    JLabel l1 = new JLabel("Order");
	    JLabel l2 = new JLabel("Special");
	    
    	l1.setFont(new Font(l1.getName(), Font.PLAIN, 30));
	    l1.setHorizontalAlignment(SwingConstants.CENTER);
    	l2.setFont(new Font(l2.getName(), Font.PLAIN, 30));
	    l2.setHorizontalAlignment(SwingConstants.CENTER);
	    jb1.addActionListener(new SpecialListener());
	    jb1.setPreferredSize(new Dimension(150, 90));
	    jb1.setLayout(new GridLayout(2,1));
	    jb1.add(l1);
	    jb1.add(l2);	    
	    frame.add(jb1);
    }

    public void addMargarita(){
        JButton jb1 = new JButton();
	    JLabel l1 = new JLabel("Order");
	    JLabel l2 = new JLabel("Margarita");
	    
    	l1.setFont(new Font(l1.getName(), Font.PLAIN, 30));
	    l1.setHorizontalAlignment(SwingConstants.CENTER);
    	l2.setFont(new Font(l2.getName(), Font.PLAIN, 26));
	    l2.setHorizontalAlignment(SwingConstants.CENTER);
	    jb1.addActionListener(new MargaritaListener());
	    jb1.setPreferredSize(new Dimension(150, 90));
	    jb1.setLayout(new GridLayout(2,1));
	    jb1.add(l1);
	    jb1.add(l2);	    
	    frame.add(jb1);

    }
    
    public void addRequestWater(){
        JButton jb1 = new JButton();
	    JLabel l1 = new JLabel("Request");
	    JLabel l2 = new JLabel("Water");
	    
    	l1.setFont(new Font(l1.getName(), Font.PLAIN, 30));
	    l1.setHorizontalAlignment(SwingConstants.CENTER);
    	l2.setFont(new Font(l2.getName(), Font.PLAIN, 30));
	    l2.setHorizontalAlignment(SwingConstants.CENTER);
	    jb1.addActionListener(new WaterListener());
	    jb1.setPreferredSize(new Dimension(150, 90));
	    jb1.setLayout(new GridLayout(2,1));
	    jb1.add(l1);
	    jb1.add(l2);	    
	    frame.add(jb1);
    }

    public void addRequestChipsAndSalsa(){
        JButton jb1 = new JButton();
	    JLabel l1 = new JLabel("Chips");
	    JLabel l2 = new JLabel("& Salsa");
	    
    	l1.setFont(new Font(l1.getName(), Font.PLAIN, 30));
	    l1.setHorizontalAlignment(SwingConstants.CENTER);
    	l2.setFont(new Font(l2.getName(), Font.PLAIN, 30));
	    l2.setHorizontalAlignment(SwingConstants.CENTER);
	    jb1.addActionListener(new ChipsListener());
	    jb1.setPreferredSize(new Dimension(150, 90));
	    jb1.setLayout(new GridLayout(2,1));
	    jb1.add(l1);
	    jb1.add(l2);	    
	    frame.add(jb1);
    }

    public void addReadyForCheck(){
        JButton jb1 = new JButton();
	    JLabel l1 = new JLabel("Request");
	    JLabel l2 = new JLabel("Check");
	    
    	l1.setFont(new Font(l1.getName(), Font.PLAIN, 30));
	    l1.setHorizontalAlignment(SwingConstants.CENTER);
    	l2.setFont(new Font(l2.getName(), Font.PLAIN, 30));
	    l2.setHorizontalAlignment(SwingConstants.CENTER);
	    jb1.addActionListener(new CheckListener());
	    jb1.setPreferredSize(new Dimension(150, 90));
	    jb1.setLayout(new GridLayout(2,1));
	    jb1.add(l1);
	    jb1.add(l2);	    
	    frame.add(jb1);
    }

    public void addReadyToOrder(){
        JButton jb1 = new JButton();
	    JLabel l1 = new JLabel("Ready");
	    JLabel l2 = new JLabel("To");
	    JLabel l3 = new JLabel("Order");
	    
	    
    	l1.setFont(new Font(l1.getName(), Font.PLAIN, 30));
	    l1.setHorizontalAlignment(SwingConstants.CENTER);
    	l2.setFont(new Font(l2.getName(), Font.PLAIN, 30));
	    l2.setHorizontalAlignment(SwingConstants.CENTER);
    	l3.setFont(new Font(l3.getName(), Font.PLAIN, 30));
	    l3.setHorizontalAlignment(SwingConstants.CENTER);
	    jb1.addActionListener(new OrderListener());
	    jb1.setPreferredSize(new Dimension(150, 90));
	    jb1.setLayout(new GridLayout(3,1));
	    jb1.add(l1);
	    jb1.add(l2);	    
	    jb1.add(l3);	    	    
	    frame.add(jb1);
    }

    public void setupMenuButtons() {
 		addCallServer();
        addViewMenu();
        addOrderSpecials();
        addMargarita();
        addRequestWater();
        addRequestChipsAndSalsa();
        addReadyForCheck();
        addReadyToOrder();
    	
    }
	public GridScreen() {
        setupMenuButtons();
		setupFrame();
		
	}
	
}
