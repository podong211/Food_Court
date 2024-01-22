import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Mcdo extends JFrame implements ActionListener{
	
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
	ImageIcon mc = new ImageIcon("img/mc.png"); //Logo Mcdo
	ImageIcon mcdo = new ImageIcon("img/mcdoo.png"); //Logo Mcdo
	
	public Mcdo() {
		
		lLabel.setIcon(mc);
		lLabel.setVerticalAlignment(JLabel.TOP);
		lLabel.setHorizontalAlignment(JLabel.CENTER);
		label.setIcon(mcdo);
		
		b_Button.setText("   McShareables   ");
		b_Button.setBackground(new Color(0xD69962));
		b_Button.setFocusable(false);
		b_Button.addActionListener(this);
		b_Button.setFont(new Font("MS Gothic",Font.BOLD,18));
		
		a_Button.setText("Chicken Value Meals");
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
		
		JTextArea mcdonalds = new JTextArea();
		mcdonalds.setForeground(Color.WHITE);
		mcdonalds.setEditable(false);
		mcdonalds.setFont(new Font("Times New Roman", Font.BOLD, 12));
		mcdonalds.setText("        McDonald's serves the world some of its favorite food like the Big Mac.\r\n      Big n' Tasty, Quarter Pounder with Cheese, CheeseBurger, French Fries,\r\n         Egg McMuffin, Apple Pie and Sundae. This is what we are famous for,\r\n\t                       globally and locally.   \r\n     In the Philippines, we are also happy to serve local favorites like Chicken \r\n \r   Mcdo, Burger Mcdo and McSpaghetti. These favorites were specially made\r\n\t        to cater to the unique Filipino  Palate. ");
		mcdonalds.setBounds(244, 292, 416, 130);
		mcdonalds.setLineWrap(true);
		mcdonalds.setBackground(Color.RED);
		frame.getContentPane().add(mcdonalds);
		
	}
	public static void main(String[] args) 
    {
	 Mcdo guixq = new Mcdo();
    }
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==b_Button) {
			frame.dispose();
			Mcdo_Share share = new Mcdo_Share(); 
		 } 
		 else if(e.getSource()==a_Button) {
			 frame.dispose();
			 Mcdo_Chicken chick = new Mcdo_Chicken();
		 }
		 else if(e.getSource()==s_Button) {
			 frame.dispose();
			 Mcdo_Bev bev1 = new Mcdo_Bev();
		 }
		 else if(e.getSource()==bat_Button) {
			 frame.dispose();
			 Mcdo_Cart cart2 = new Mcdo_Cart();
		 }
		 else if(e.getSource()==pay_Button) {
			 frame.dispose();
			 Mcdo_Pay Pay1 = new Mcdo_Pay();
		 }
		 else if(e.getSource()==return_Button) {
			 frame.dispose();
			 Main_TIP_FC gui = new Main_TIP_FC();
		 }
	 }
}

