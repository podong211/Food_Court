import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class KFC extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel Menu = new JPanel();
	JPanel Menu1 = new JPanel();
	JPanel b = new JPanel();
	JPanel ba = new JPanel();
	JPanel bac = new JPanel();
	JPanel ac = new JPanel();
	JPanel acd = new JPanel();
	
	JLabel lLabel = new JLabel();
	JLabel label = new JLabel();
	
	JButton b_Button = new JButton();
	JButton a_Button = new JButton();
	JButton s_Button = new JButton();
	JButton bat_Button = new JButton();
	JButton pay_Button = new JButton();
	JButton return_Button = new JButton();
	
	ImageIcon icon = new ImageIcon("img/icon.png");
	ImageIcon kfc = new ImageIcon("img/kfc.png"); //Logo KFC
	ImageIcon kfcc = new ImageIcon("img/kfcc.png"); //Logo KFC-1
	
	public KFC() {
		
		lLabel.setIcon(kfc);
		lLabel.setVerticalAlignment(JLabel.TOP);
		lLabel.setHorizontalAlignment(JLabel.CENTER);
		
		label.setIcon(kfcc);
		
		b_Button.setText("   Bucket Meals   ");
		b_Button.setBackground(new Color(0xD69962));
		b_Button.setFocusable(false);
		b_Button.addActionListener(this);
		b_Button.setFont(new Font("MS Gothic",Font.BOLD,18));
		
		a_Button.setText("All Chicken Bucket");
		a_Button.setBackground(new Color(0xD69962));
		a_Button.setFocusable(false);
		a_Button.addActionListener(this);
		a_Button.setFont(new Font("MS Gothic",Font.BOLD,18));
		
		s_Button.setText("    Beverages    ");
		s_Button.setBackground(new Color(0xD69962));
		s_Button.setFocusable(false);
		s_Button.addActionListener(this);
		s_Button.setFont(new Font("MS Gothic",Font.BOLD,18));
		
		bat_Button.setText("     My Cart     ");
		bat_Button.setBackground(new Color(0xD69962));
		bat_Button.setFocusable(false);
		bat_Button.addActionListener(this);
		bat_Button.setFont(new Font("MS Gothic",Font.BOLD,18));
		
		pay_Button.setText("     Pay Order     ");
		pay_Button.setBackground(new Color(0xD69962));
		pay_Button.setFocusable(false);
		pay_Button.addActionListener(this);
		pay_Button.setFont(new Font("MS Gothic",Font.BOLD,18));
		
		return_Button.setText("      Return      ");
		return_Button.setBackground(new Color(0xD69962));
		return_Button.setFocusable(false);
		return_Button.addActionListener(this);
		return_Button.setFont(new Font("MS Gothic",Font.BOLD,18));
		
		frame.setTitle("TIP FOODCOURT");  
		frame.setVisible(true); 
		frame.setSize(700,500); 
		frame.setResizable(false); 
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setIconImage(icon.getImage()); 
		frame.getContentPane().setBackground(Color.RED);

		Menu.setBackground(new Color(0xCFA47E));
		Menu.setBounds(0, 0, 200, 500);
		Menu1.setBounds(200, 0, 500, 250);
		b.setBackground(new Color(0xCFA47E));
		ba.setBackground(new Color(0xCFA47E));
		bac.setBackground(new Color(0xCFA47E));
		ac.setBackground(new Color(0xCFA47E));
		acd.setBackground(new Color(0xCFA47E));
		
		
		frame.getContentPane().add(Menu);
		frame.getContentPane().add(Menu1);
		Menu1.add(label);
		Menu.add(lLabel);
		Menu.add(b_Button);
		Menu.add(b);
		Menu.add(a_Button);
		Menu.add(ba);
		Menu.add(s_Button);
		Menu.add(bac);
		Menu.add(bat_Button);
		Menu.add(ac);
		Menu.add(pay_Button);
		Menu.add(acd);
		Menu.add(return_Button);
		
		JTextArea txtrJollibeeIsThe = new JTextArea();
		txtrJollibeeIsThe.setForeground(Color.WHITE);
		txtrJollibeeIsThe.setEditable(false);
		txtrJollibeeIsThe.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtrJollibeeIsThe.setText("We have deep roots and we have an original founder. We cook our chicken from scratch \r\nand our restaurants celebrate that story. We use natural, high-quality materials and have all theconveniences to make everyone feel welcomed and comfortable. From innovate way\r\n   to order to new restaurant formats, we are not afraid to constantly try new things that\r\n\t\tmake it easier to enjoy our chicken.\r\nA lot has happend since Colonel Harland Sanders perfected his secret recipe over 75 years\r\n    ago. But through all the ups and downs in KFC's pretty incredible history, there's one \r\n        thing we know for sure: the secret to being an iconic brand - one that grows older,\r\n               but never gets old - is to deeply understand who we are and why we exist.");
		txtrJollibeeIsThe.setBounds(210, 292, 474, 130);
		txtrJollibeeIsThe.setLineWrap(true);
		txtrJollibeeIsThe.setBackground(Color.RED);
		frame.getContentPane().add(txtrJollibeeIsThe);
	}
	public static void main(String[] args) 
    {
	 KFC guix = new KFC();
    }
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==b_Button) {
			frame.dispose();
			KFC_BM BM = new KFC_BM();
		 } 
		 else if(e.getSource()==a_Button) {
			 frame.dispose();
			 KFC_ACB ACB = new KFC_ACB();
		 }
		 else if(e.getSource()==s_Button) {
			 frame.dispose();
			 KFC_Bev bev2 = new KFC_Bev();
		 }
		 else if(e.getSource()==bat_Button) {
			 frame.dispose();
			 KFC_Cart cart1 = new KFC_Cart();
		 }
		 else if(e.getSource()==pay_Button) {
			 frame.dispose();
			 KFC_Pay Pay2 = new KFC_Pay();
		 }
		 else if(e.getSource()==return_Button) {
			 frame.dispose();
			 Main_TIP_FC gui = new Main_TIP_FC();
		 }
	 }
}

