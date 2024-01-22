import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class AbsReturn extends JFrame implements ActionListener {
	
	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon("img/icon.png"); //Icon
	Border border = BorderFactory.createLineBorder(Color.WHITE, 2);
	JButton N1 = new JButton ("Next");
	JButton B1 = new JButton ("Back");
	
public AbsReturn() {
		
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
		JBscr1p.setIcon (new ImageIcon("img/Return.png"));
		JBscr1p.setBounds(10, 57, 200, 150);
		JBscr1p.setBorder(border);
		frame.getContentPane().add(JBscr1p);
		
		JLabel JBscr2p = new JLabel("");
		JBscr2p.setIcon (new ImageIcon("img/Return1.png"));
		JBscr2p.setBounds(230, 57, 200, 150);
		JBscr2p.setBorder(border);
		frame.getContentPane().add(JBscr2p);
		
		JLabel JBscr3p = new JLabel("");
		JBscr3p.setIcon (new ImageIcon("img/StartPage.png"));
		JBscr3p.setBounds(450, 57, 200, 150);
		JBscr3p.setBorder(border);
		frame.getContentPane().add(JBscr3p);
				
		JLabel Txt1 = new JLabel ("Return Frame :");
		Txt1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Txt1.setBounds(10, 0, 200, 450);
		frame.getContentPane().add(Txt1);
		
		JLabel Txt2 = new JLabel ("Return button can be seen in menu frames in every fastfood selection which you can click for you to reselect your");
		Txt2.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt2.setBounds(10, 0, 1920, 500);
		frame.getContentPane().add(Txt2);
		
		JLabel Txt3 = new JLabel ("choice of fastfood chain you want to order with.");
		Txt3.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt3.setBounds(10, 0, 1920, 530);
		frame.getContentPane().add(Txt3);
			
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
AbsReturn absR = new AbsReturn();
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==N1) {
			frame.dispose();
			About_System3 Abs3 = new About_System3();
		}
			else if (e.getSource()==B1) {
				frame.dispose();
				AbsPayment absP = new AbsPayment();			
			}
		
	}

}
