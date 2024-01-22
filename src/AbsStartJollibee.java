import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class AbsStartJollibee extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon("img/icon.png"); //Icon
	Border border = BorderFactory.createLineBorder(Color.WHITE, 2);
	JButton N1 = new JButton ("Next");
	JButton B1 = new JButton ("Back");
	
	public AbsStartJollibee() {
		
		frame.setTitle("TIP FOODCOURT");  
		frame.setVisible(true); 
		frame.setSize(700,500); 
		frame.setResizable(false); 
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setIconImage(icon.getImage()); 
		frame.getContentPane().setBackground(new Color(0xFDCA99)); 
		
		JLabel ABS = new JLabel("About System");
		ABS.setFont(new Font("Courier New", Font.BOLD, 30));
		ABS.setBounds(0, -13, 400, 86);
		frame.getContentPane().add(ABS);
		
		JLabel JBscr1p = new JLabel("");
		JBscr1p.setIcon (new ImageIcon("img/JollibeeStart.png"));
		JBscr1p.setBounds(10, 57, 200, 150);
		JBscr1p.setBorder(border);
		frame.getContentPane().add(JBscr1p);
		
		JLabel JBscr2p = new JLabel("");
		JBscr2p.setIcon (new ImageIcon("C:\\Users\\Clein\\Pictures\\For Comp Prog 2\\JollibeeBucket.png"));
		JBscr2p.setBounds(230, 57, 200, 150);
		JBscr2p.setBorder(border);
		frame.getContentPane().add(JBscr2p);
		
		JLabel JBscr3p = new JLabel("");
		JBscr3p.setIcon (new ImageIcon("C:\\Users\\Clein\\Pictures\\For Comp Prog 2\\KFC.png"));
		JBscr3p.setBounds(450, 57, 200, 150);
		JBscr3p.setBorder(border);
		frame.getContentPane().add(JBscr3p);
		
		JLabel Txt1 = new JLabel ("Menu Frame :");
		Txt1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Txt1.setBounds(10, 0, 200, 450);
		frame.getContentPane().add(Txt1);
		
		JLabel Txt2 = new JLabel ("In this Menu Frame you will see buttons like Bucket meals, Mcshareble and Beverage button and each button");
		Txt2.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt2.setBounds(10, 0, 1920, 500);
		frame.getContentPane().add(Txt2);
		
		JLabel Txt3 = new JLabel ("will display a new frame that will show the Menu that is available when it's been selected.");
		Txt3.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt3.setBounds(10, 0, 1920, 530);
		frame.getContentPane().add(Txt3);
		
		JLabel Txt4 = new JLabel ("And in every Fast Food selection you can see a different types of button like Menu, My cart, PayOrder and Return");
		Txt4.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt4.setBounds(10, 0, 1920, 580);
		frame.getContentPane().add(Txt4);
		
		JLabel Txt5 = new JLabel ("button.");
		Txt5.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt5.setBounds(10, 0, 1920, 610);
		frame.getContentPane().add(Txt5);
		
		JLabel Txt6 = new JLabel ("And in menu frame you can make your orders and by adding them to cart it will store a value for your own cart and then");
		Txt6.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt6.setBounds(10, 0, 1920, 660);
		frame.getContentPane().add(Txt6);
		
		JLabel Txt7 = new JLabel ("you just need to click the My Cart button, click add then View Price button to check your sub total and your");
		Txt7.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt7.setBounds(10, 0, 1920, 690);
		frame.getContentPane().add(Txt7);
		
		JLabel Txt8 = new JLabel ("Whole order list.");
		Txt8.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt8.setBounds(10, 0, 1920, 720);
		frame.getContentPane().add(Txt8);
			
		N1.setBounds(595, 430, 80, 20);
		N1.setFocusable(false);
		N1.addActionListener(this);
		N1.setBackground(new Color(0xFDB065));
		frame.getContentPane().add(N1);
		
		B1.setBounds(5, 430, 80, 20);
		B1.setFocusable(false);
		B1.addActionListener(this);
		B1.setBackground(new Color(0xFDB065));
		frame.getContentPane().add(B1);
	}
	
	public static void main(String[] args) 
    {
	AbsStartJollibee AbsSJb = new AbsStartJollibee();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==N1) {
			frame.dispose();
			Absmycart AbsmyC = new Absmycart ();
		}
			else if (e.getSource()==B1) {
				frame.dispose();
				About_System2 Abs2 = new About_System2();		
			}
		
	}

}
