import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;

public class KFC_Pay extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel Menu = new JPanel();
	JPanel b = new JPanel();
	JPanel ba = new JPanel();
	JPanel bac = new JPanel();
	JPanel ac = new JPanel();
	JPanel acd = new JPanel();
	
	JLabel lLabel = new JLabel();
	
	
	JButton b_Button = new JButton();
	JButton a_Button = new JButton();
	JButton s_Button = new JButton();
	JButton bat_Button = new JButton();
	JButton pay_Button = new JButton();
	JButton return_Button = new JButton();
	
	ImageIcon icon = new ImageIcon("img/icon.png");
	ImageIcon kfc = new ImageIcon("img/kfc.png"); //Logo KFC
	ImageIcon c = new ImageIcon("img/Cash.jpg"); 
	ImageIcon gc = new ImageIcon("img/GCash.png"); 
	ImageIcon pm = new ImageIcon("img/Paymaya.jpg"); 
	
	private final JLabel lblNewLabel = new JLabel("BILLING");
	private final JLabel Date = new JLabel("Date :");
	private final JTextField Date_Txt = new JTextField();
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YY");
	SimpleDateFormat timeFormat;
	String time;
	Date date = new Date();
	Calendar cal = Calendar.getInstance();
	private final JLabel Time = new JLabel("Time :");
	private final JTextField Time_Txt = new JTextField();
	private final JPanel BG = new JPanel();
	private final JPanel panel_1 = new JPanel();
	private final JLabel lblNewLabel_3 = new JLabel();
	private final JPanel panel_2 = new JPanel();
	private final JPanel panel_3 = new JPanel();
	private final JLabel lblNewLabel_4 = new JLabel();
	private final JLabel lblNewLabel_5 = new JLabel();
	private final JButton Cash = new JButton("PROCEED");
	private final JButton Gcash = new JButton("PROCEED");
	private final JButton Paymaya = new JButton("PROCEED");

	
	public KFC_Pay() {
		
		Time_Txt.setEditable(false);
		Time_Txt.setHorizontalAlignment(SwingConstants.CENTER);
		Time_Txt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Time_Txt.setBounds(572, 85, 112, 20);
		Time_Txt.setColumns(10);
		Date_Txt.setEditable(false);
		Date_Txt.setHorizontalAlignment(SwingConstants.CENTER);
		Date_Txt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Date_Txt.setBounds(572, 28, 112, 20);
		Date_Txt.setColumns(10);
		
		lLabel.setIcon(kfc);
		lLabel.setVerticalAlignment(JLabel.TOP);
		lLabel.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_3.setIcon(c);
		lblNewLabel_3.setVerticalAlignment(JLabel.TOP);
		lblNewLabel_3.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_4.setIcon(gc);
		lblNewLabel_4.setVerticalAlignment(JLabel.TOP);
		lblNewLabel_4.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_5.setIcon(pm);
		lblNewLabel_5.setVerticalAlignment(JLabel.TOP);
		lblNewLabel_5.setHorizontalAlignment(JLabel.CENTER);
		
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
		frame.getContentPane().setBackground(new Color(0xFDCA99)); 

		Menu.setBackground(new Color(0xCFA47E));
		Menu.setBounds(0, 0, 200, 500);
		b.setBackground(new Color(0xCFA47E));
		ba.setBackground(new Color(0xCFA47E));
		bac.setBackground(new Color(0xCFA47E));
		ac.setBackground(new Color(0xCFA47E));
		acd.setBackground(new Color(0xCFA47E));
		 
		
		frame.getContentPane().add(Menu);
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
		
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Adobe Arabic", Font.BOLD, 24));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(252, 28, 228, 89);
		
		frame.getContentPane().add(lblNewLabel);
		Date.setForeground(Color.BLACK);
		Date.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Date.setHorizontalAlignment(SwingConstants.CENTER);
		Date.setBounds(503, 28, 59, 20);
		frame.getContentPane().add(Date);
		
		Date_Txt.setText(" " + dateFormat.format(date));
		
		frame.getContentPane().add(Date_Txt);
		Time.setForeground(Color.BLACK);
		Time.setHorizontalAlignment(SwingConstants.CENTER);
		Time.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Time.setBounds(503, 83, 59, 20);
		
		frame.getContentPane().add(Time);
		
		timeFormat = new SimpleDateFormat("hh:mm a");
		time = timeFormat.format(Calendar.getInstance().getTime());
		Time_Txt.setText(time);

		frame.getContentPane().add(Time_Txt);
		BG.setBackground(new Color(0xFFBC8F));
		BG.setBounds(205, 11, 485, 127);
		
		frame.getContentPane().add(BG);
		panel_1.setBounds(242, 145, 300, 100);
		
		frame.getContentPane().add(panel_1);
		
		panel_1.add(lblNewLabel_3);
		panel_2.setBounds(242, 250, 300, 100);
		
		frame.getContentPane().add(panel_2);
		
		panel_2.add(lblNewLabel_4);
		panel_3.setBounds(242, 355, 300, 100);
		
		frame.getContentPane().add(panel_3);
		
		panel_3.add(lblNewLabel_5);
		Cash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				KFC_Cash cash2 = new KFC_Cash();
			}
		});
		Cash.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Cash.setBackground(new Color(0xD69962));
		Cash.setBounds(552, 145, 120, 100);
		
		frame.getContentPane().add(Cash);
		Gcash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				KFC_Gcash Gcash2 = new KFC_Gcash();
			}
		});
		Gcash.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Gcash.setBackground(new Color(0xD69962));
		Gcash.setBounds(552, 250, 120, 100);
		
		frame.getContentPane().add(Gcash);
		Paymaya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				KFC_Paymaya Paymaya2 = new KFC_Paymaya();
			}
		});
		Paymaya.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Paymaya.setBackground(new Color(0xD69962));
		Paymaya.setBounds(552, 355, 120, 100);
		
		frame.getContentPane().add(Paymaya);
		
	}

	public static void main(String[] args) 
    {
	 KFC_Pay Pay2 = new KFC_Pay();
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


