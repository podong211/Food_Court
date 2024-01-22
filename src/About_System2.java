import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class About_System2 extends JFrame implements ActionListener {
	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon("img/icon.png"); //Icon
	Border border = BorderFactory.createLineBorder(Color.WHITE, 2);
	JButton N1 = new JButton ("Next");
	JButton B1 = new JButton ("Back");
	
public About_System2() {  
		
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
		FRP.setIcon (new ImageIcon("img/StartPage.png"));
		FRP.setBounds(225, 57, 200, 150);
		FRP.setBorder(border);
		frame.getContentPane().add(FRP);
		
		JLabel Txt1 = new JLabel ("Start Frame :");
		Txt1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Txt1.setBounds(10, 0, 200, 450);
		frame.getContentPane().add(Txt1);
		
		JLabel Txt2 = new JLabel ("When you press on the start button, you will be given a variety of choices with regards to foods, especially fastfood,");
		Txt2.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt2.setBounds(10, 0, 1920, 500);
		frame.getContentPane().add(Txt2);
		
		JLabel Txt3 = new JLabel ("In this Frame you will see 3 option of a fast food chains and there is a button you can click for you to direct in their");
		Txt3.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt3.setBounds(10, 0, 1920, 530);
		frame.getContentPane().add(Txt3);
		
		JLabel Txt4 = new JLabel ("menu.");
		Txt4.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt4.setBounds(10, 0, 1920, 560);
		frame.getContentPane().add(Txt4);
		
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
		About_System2 ABS2 = new About_System2();
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==N1) {
			frame.dispose();
			AbsStartJollibee absj1 = new AbsStartJollibee();	
	}
		else if (e.getSource()==B1) {
			frame.dispose();
			About_System1 Abs1 = new About_System1();
			
		}
	}

}
