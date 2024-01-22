import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Programmers2 extends JFrame implements ActionListener {
	
	// GLOBAL VARIABLES
	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon("img/icon.png"); //Icon
	JButton B1 = new JButton ("Back");
	
	public Programmers2() {
		// MAIN FRAME
				frame.setTitle("TIP FOODCOURT");  
				frame.setVisible(true); 
				frame.setSize(700,500); 
				frame.setResizable(false); 
				frame.getContentPane().setLayout(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				frame.setIconImage(icon.getImage()); 
				frame.getContentPane().setBackground(new Color(0xFDCA99)); 
				
				JLabel lblNewLabel = new JLabel("Programmers");
				lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 30));
				lblNewLabel.setBounds(0, -13, 400, 86);
				frame.getContentPane().add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon("img/berdan.png"));
				lblNewLabel_1.setBounds(47, 57, 152, 151);
				frame.getContentPane().add(lblNewLabel_1);
				
				JLabel lblNewLabel_2 = new JLabel("Programmer");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_2.setBounds(60, 198, 114, 45);
				frame.getContentPane().add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("Name: BERDAN, Kim David \r\n");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_3.setBounds(10, 230, 270, 36);
				frame.getContentPane().add(lblNewLabel_3);
				
				JLabel lblNewLabel_3_1 = new JLabel("Age: 20 y/o\r\n");
				lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_3_1.setBounds(10, 250, 270, 31);
				frame.getContentPane().add(lblNewLabel_3_1);
				
				JLabel lblNewLabel_3_2 = new JLabel("Location: Cainta, Rizal");
				lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_3_2.setBounds(10, 265, 270, 36);
				frame.getContentPane().add(lblNewLabel_3_2);
				
				
				JLabel lblNewLabel_1_1 = new JLabel("");
				lblNewLabel_1_1.setIcon(new ImageIcon("img/olanio.png"));
				lblNewLabel_1_1.setBounds(275, 57, 152, 151);
				frame.getContentPane().add(lblNewLabel_1_1);
				
				JLabel lblNewLabel_1_2 = new JLabel("");
				lblNewLabel_1_2.setIcon(new ImageIcon("img/vezy2.png"));
				lblNewLabel_1_2.setBounds(497, 57, 152, 151);
				frame.getContentPane().add(lblNewLabel_1_2);
				
				JLabel lblNewLabel_3_2_1 = new JLabel("About me:");
				lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel_3_2_1.setBounds(10, 292, 270, 36);
				frame.getContentPane().add(lblNewLabel_3_2_1);
				
				JLabel lblNewLabel_3_2_1_1 = new JLabel("I like watching anime and reading\r\n");
				lblNewLabel_3_2_1_1.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1.setBounds(10, 321, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1);
				
				JLabel lblNewLabel_3_2_1_1_1 = new JLabel("reading manga and manwha,");
				lblNewLabel_3_2_1_1_1.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_1.setBounds(-24, 339, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_1);
				
				JLabel lblNewLabel_3_2_1_1_2 = new JLabel("I also like watching video");
				lblNewLabel_3_2_1_1_2.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_2.setBounds(10, 355, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_2);
				
				JLabel lblNewLabel_3_2_1_1_2_1 = new JLabel("clips from kpop girl group, ");
				lblNewLabel_3_2_1_1_2_1.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_2_1.setBounds(10, 374, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_2_1);
				
				JLabel lblNewLabel_3_2_1_1_2_1_1 = new JLabel("especially TWICE. I enjoy\r\n");
				lblNewLabel_3_2_1_1_2_1_1.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_2_1_1.setBounds(10, 389, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_2_1_1);
				
				JLabel lblNewLabel_3_2_1_1_2_1_1_1 = new JLabel("playing online games ft. music.");
				lblNewLabel_3_2_1_1_2_1_1_1.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_2_1_1_1.setBounds(10, 408, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_2_1_1_1);
				
				JLabel lblNewLabel_3_1_1 = new JLabel("Age: 20 y/o\r\n");
				lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_3_1_1.setBounds(256, 250, 270, 31);
				frame.getContentPane().add(lblNewLabel_3_1_1);
				
				JLabel lblNewLabel_3_3 = new JLabel("Name: OLANIO, Robert Clein\r\n");
				lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_3_3.setBounds(256, 230, 270, 36);
				frame.getContentPane().add(lblNewLabel_3_3);
				
				JLabel lblNewLabel_3_2_2 = new JLabel("Location: Quezon City");
				lblNewLabel_3_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_3_2_2.setBounds(256, 265, 270, 36);
				frame.getContentPane().add(lblNewLabel_3_2_2);
				
				JLabel lblNewLabel_3_2_1_2 = new JLabel("About me:");
				lblNewLabel_3_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel_3_2_1_2.setBounds(256, 292, 270, 36);
				frame.getContentPane().add(lblNewLabel_3_2_1_2);
				
				JLabel lblNewLabel_2_1 = new JLabel("Programmer");
				lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_2_1.setBounds(290, 198, 114, 45);
				frame.getContentPane().add(lblNewLabel_2_1);
				
				JLabel lblNewLabel_3_2_1_1_3 = new JLabel(" I really enjoy doing things like outdoor");
				lblNewLabel_3_2_1_1_3.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_3.setBounds(223, 321, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_3);
				
				JLabel lblNewLabel_3_2_1_1_4 = new JLabel("sports, I also enjoy playing online games ");
				lblNewLabel_3_2_1_1_4.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_4.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_4.setBounds(223, 339, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_4);
				
				JLabel lblNewLabel_3_2_1_1_5 = new JLabel("like fps games and strategic games, and ");
				lblNewLabel_3_2_1_1_5.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_5.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_5.setBounds(223, 355, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_5);
				
				JLabel lblNewLabel_3_2_1_1_6 = new JLabel("also i enjoy editing images ");
				lblNewLabel_3_2_1_1_6.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_6.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_6.setBounds(223, 374, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_6);
				
				JLabel lblNewLabel_3_2_1_1_7 = new JLabel("and debugging a programs.");
				lblNewLabel_3_2_1_1_7.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_7.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_7.setBounds(223, 389, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_7);
				
				JLabel lblNewLabel_2_1_1 = new JLabel("Programmer");
				lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblNewLabel_2_1_1.setBounds(521, 198, 114, 45);
				frame.getContentPane().add(lblNewLabel_2_1_1);
				
				JLabel lblNewLabel_3_3_1 = new JLabel("Name: VELASCO, Matthew\r\n\r\n");
				lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_3_3_1.setBounds(487, 230, 270, 36);
				frame.getContentPane().add(lblNewLabel_3_3_1);
				
				JLabel lblNewLabel_3_1_1_1 = new JLabel("Age: 19 y/o\r\n");
				lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_3_1_1_1.setBounds(487, 250, 270, 31);
				frame.getContentPane().add(lblNewLabel_3_1_1_1);
				
				JLabel lblNewLabel_3_2_2_1 = new JLabel("Location: Cainta, Rizal");
				lblNewLabel_3_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_3_2_2_1.setBounds(487, 265, 270, 36);
				frame.getContentPane().add(lblNewLabel_3_2_2_1);
				
				JLabel lblNewLabel_3_2_1_2_1 = new JLabel("About me:");
				lblNewLabel_3_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel_3_2_1_2_1.setBounds(487, 292, 270, 36);
				frame.getContentPane().add(lblNewLabel_3_2_1_2_1);
				
				JLabel lblNewLabel_3_2_1_1_3_1 = new JLabel("I love playing basketball,");
				lblNewLabel_3_2_1_1_3_1.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_3_1.setBounds(484, 321, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_3_1);
				
				JLabel lblNewLabel_3_2_1_1_4_1 = new JLabel("playing basketball is my passion");
				lblNewLabel_3_2_1_1_4_1.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_4_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_4_1.setBounds(484, 339, 191, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_4_1);
				
				JLabel lblNewLabel_3_2_1_1_6_1 = new JLabel("I also love playing online games");
				lblNewLabel_3_2_1_1_6_1.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_6_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_6_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_6_1.setBounds(484, 355, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_6_1);
				
				JLabel lblNewLabel_3_2_1_1_7_1 = new JLabel("and playing guitar");
				lblNewLabel_3_2_1_1_7_1.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3_2_1_1_7_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_3_2_1_1_7_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3_2_1_1_7_1.setBounds(484, 374, 251, 23);
				frame.getContentPane().add(lblNewLabel_3_2_1_1_7_1);
				
				
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
			Programmers Prg = new Programmers();
		}
}
}