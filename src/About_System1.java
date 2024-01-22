import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class About_System1 extends JFrame implements ActionListener {
	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon("img/icon.png"); //Icon
	Border border = BorderFactory.createLineBorder(Color.WHITE, 2);
	JButton N1 = new JButton ("Next");
	JButton B1 = new JButton ("Back");
	
	public About_System1() {  
		
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
		

		JLabel FRP = new JLabel("");
		FRP.setIcon (new ImageIcon("img/FrontPage.png"));
		FRP.setBounds(225, 57, 200, 150);
		FRP.setBorder(border);
		frame.getContentPane().add(FRP);
		
		JLabel Txt1 = new JLabel ("FrontPage :");
		Txt1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Txt1.setBounds(10, 0, 200, 450);
		frame.getContentPane().add(Txt1);
		
		JLabel Txt2 = new JLabel ("This is our front page. We choose peach orange for our background because it complements the contents of the");
		Txt2.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt2.setBounds(10, 0, 1920, 500);
		frame.getContentPane().add(Txt2);
		
		JLabel Txt3 = new JLabel ("program and it makes it look neat. We can see the Logo, start button, programmers button, and about system ");
		Txt3.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt3.setBounds(10, 0, 1920, 530);
		frame.getContentPane().add(Txt3);
		
		JLabel Txt4 = new JLabel ("system button. ");
		Txt4.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt4.setBounds(10, 0, 1920, 560);
		frame.getContentPane().add(Txt4);
		
		JLabel Txt5 = new JLabel ("When you press on the start button, you will be given a variety of choices with regards to foods,");
		Txt5.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt5.setBounds(10, 0, 1920, 610);
		frame.getContentPane().add(Txt5);
		
		JLabel Txt6 = new JLabel ("especially fastfood, the programmers button introduces you to who made this program.");
		Txt6.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt6.setBounds(10, 0, 1920, 640);
		frame.getContentPane().add(Txt6);
		
		JLabel Txt7 = new JLabel ("Lastly, the about system button and the reference button, gives you insights about the uses and importance of this ");
		Txt7.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt7.setBounds(10, 0, 1920, 670);
		frame.getContentPane().add(Txt7);
		
		JLabel Txt8 = new JLabel ("program and the references of the images that we used in the system. ");
		Txt8.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt8.setBounds(10, 0, 1920, 700);
		frame.getContentPane().add(Txt8);
		
		N1.setBounds(600, 430, 70, 20);
		N1.setFocusable(false);
		N1.addActionListener(this);
		N1.setBackground(new Color(0xFDB065));
		frame.getContentPane().add(N1);
		
		B1.setBounds(5, 430, 70, 20);
		B1.setFocusable(false);
		B1.addActionListener(this);
		B1.setBackground(new Color(0xFDB065));
		frame.getContentPane().add(B1);
}
	public static void main(String[] args) 
    {
	 About_System1 ABS1 = new About_System1();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==N1) {
			frame.dispose();
			About_System2 ABS2 = new About_System2 ();
		}
			else if (e.getSource()==B1) {
				frame.dispose();
				WNC FFC = new WNC();
				
			}
	}

}
