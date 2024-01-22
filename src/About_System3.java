import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class About_System3 extends JFrame implements ActionListener{
	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon("img/icon.png"); //Icon
	Border border = BorderFactory.createLineBorder(Color.WHITE, 2);
	JButton B1 = new JButton ("Back");
	
	public About_System3() {  
		
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
		FRP.setIcon (new ImageIcon("img/ProgrammerPage.png"));
		FRP.setBounds(225, 57, 200, 150);
		FRP.setBorder(border);
		frame.getContentPane().add(FRP);
		
		JLabel Txt1 = new JLabel ("Programmers Page :");
		Txt1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Txt1.setBounds(10, 0, 200, 450);
		frame.getContentPane().add(Txt1);
		
		JLabel Txt2 = new JLabel ("If you click on the programmers tab, it will give you the information on who made the program, their basic information,");
		Txt2.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt2.setBounds(10, 0, 1920, 500);
		frame.getContentPane().add(Txt2);
		
		JLabel Txt3 = new JLabel ("so that people who use it will have the idea whether it is reliable or not. ");
		Txt3.setFont(new Font("Tahoma",Font.PLAIN,12));
		Txt3.setBounds(10, 0, 1920, 530);
		frame.getContentPane().add(Txt3);
		
		B1.setBounds(5, 430, 70, 20);
		B1.setFocusable(false);
		B1.addActionListener(this);
		B1.setBackground(new Color(0xFDB065));
		frame.getContentPane().add(B1);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if (e.getSource()==B1) {
			frame.dispose();
			AbsReturn AbsR = new AbsReturn();
			
		}
	}

}
