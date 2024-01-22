import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Jobee_Cash extends JFrame implements ActionListener{
	
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
	ImageIcon jb = new ImageIcon("img/jb.png"); //Logo Jobee
	
	public static int x, y;
	
	private final JLabel Date = new JLabel("Date :");
	private final JTextField Date_Txt = new JTextField();
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YY");
	SimpleDateFormat timeFormat;
	String time;
	Date date = new Date();
	Calendar cal = Calendar.getInstance();
	private final JLabel Time = new JLabel("Time :");
	private final JTextField Time_Txt = new JTextField();
	private final JLabel Title = new JLabel("CASH PAYMENT");
	private final JLabel lblNewLabel_1 = new JLabel("CASH METHOD");
	private final JLabel TitleTotalBill = new JLabel("TOTAL BILL");
	private final JTextField TotalBill = new JTextField();
	private final JLabel TitlePM = new JLabel("PAYMENT METHOD");
	private final JTextField txtCash = new JTextField();
	private final JButton PAY = new JButton("PAY");
	private final JLabel lblNewLabel_4 = new JLabel("AMOUNT");
	private final JTextField Amount = new JTextField();
	private final JLabel Amountt = new JLabel("AMOUNT");
	private final JTextField AmountDisplay = new JTextField();
	private final JLabel Totall = new JLabel("TOTAL");
	private final JTextField TotalBillDisplay = new JTextField();
	private final JLabel Changee = new JLabel("CHANGE");
	private final JTextField Change = new JTextField();
	private final JButton Rec = new JButton("RECEIPT");
	private final JPanel BG = new JPanel();
	private final JButton btnNewButton = new JButton("RETURN");

	public Jobee_Cash() {
		Change.setHorizontalAlignment(SwingConstants.CENTER);
		Change.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Change.setEditable(false);
		Change.setBounds(503, 278, 179, 41);
		Change.setColumns(10);
		TotalBillDisplay.setFont(new Font("Times New Roman", Font.BOLD, 14));
		TotalBillDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		TotalBillDisplay.setEditable(false);
		TotalBillDisplay.setBounds(503, 210, 179, 41);
		TotalBillDisplay.setColumns(10);
		AmountDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		AmountDisplay.setFont(new Font("Times New Roman", Font.BOLD, 14));
		AmountDisplay.setEditable(false);
		AmountDisplay.setBounds(503, 143, 179, 41);
		AmountDisplay.setColumns(10);
		
		Amount.setHorizontalAlignment(SwingConstants.CENTER);
		Amount.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Amount.setBounds(255, 278, 179, 41);
		Amount.setColumns(10);
	
		 
		
		txtCash.setText("CASH");
		txtCash.setHorizontalAlignment(SwingConstants.CENTER);
		txtCash.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtCash.setEditable(false);
		txtCash.setBounds(255, 210, 179, 41);
		txtCash.setColumns(10);
		TotalBill.setFont(new Font("Times New Roman", Font.BOLD, 14));
		TotalBill.setHorizontalAlignment(SwingConstants.CENTER);
		TotalBill.setEditable(false);
		TotalBill.setBounds(255, 143, 179, 41);
		TotalBill.setColumns(10);
		
		Time_Txt.setEditable(false);
		Time_Txt.setHorizontalAlignment(SwingConstants.CENTER);
		Time_Txt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Time_Txt.setBounds(572, 49, 112, 20);
		Time_Txt.setColumns(10);
		Date_Txt.setEditable(false);
		Date_Txt.setHorizontalAlignment(SwingConstants.CENTER);
		Date_Txt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Date_Txt.setBounds(572, 18, 112, 20);
		Date_Txt.setColumns(10);
		
		lLabel.setIcon(jb);
		lLabel.setVerticalAlignment(JLabel.TOP);
		lLabel.setHorizontalAlignment(JLabel.CENTER);
		
		b_Button.setText("   Bucket Meal   ");
		b_Button.setBackground(new Color(0xD69962));
		b_Button.setFocusable(false);
		b_Button.addActionListener(this);
		b_Button.setFont(new Font("MS Gothic",Font.BOLD,18));
		
		a_Button.setText("    Super Meal    ");
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
		
		Date.setForeground(Color.BLACK);
		Date.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Date.setHorizontalAlignment(SwingConstants.CENTER);
		Date.setBounds(503, 18, 59, 20);
		frame.getContentPane().add(Date);
		
		Date_Txt.setText(" " + dateFormat.format(date));
		
		frame.getContentPane().add(Date_Txt);
		Time.setForeground(Color.BLACK);
		Time.setHorizontalAlignment(SwingConstants.CENTER);
		Time.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Time.setBounds(503, 49, 59, 20);
		frame.getContentPane().add(Time);
		
		timeFormat = new SimpleDateFormat("hh:mm a");
		time = timeFormat.format(Calendar.getInstance().getTime());
		Time_Txt.setText(time);
		frame.getContentPane().add(Time_Txt);
		Title.setFont(new Font("Adobe Arabic", Font.BOLD, 24));
		Title.setBounds(210, 18, 283, 51);
		
		frame.getContentPane().add(Title);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		lblNewLabel_1.setBounds(255, 69, 179, 41);
		
		frame.getContentPane().add(lblNewLabel_1);
		TitleTotalBill.setHorizontalAlignment(SwingConstants.CENTER);
		TitleTotalBill.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		TitleTotalBill.setBounds(255, 111, 179, 41);
		
		frame.getContentPane().add(TitleTotalBill);
		
		TotalBill.setText(Integer.toString(Jobee_Cart.getSum()));
		frame.getContentPane().add(TotalBill);
		
		
		
		TitlePM.setHorizontalAlignment(SwingConstants.CENTER);
		TitlePM.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		TitlePM.setBounds(247, 181, 201, 41);
		
		frame.getContentPane().add(TitlePM);
		
		frame.getContentPane().add(txtCash);
		PAY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					x = Integer.parseInt(Amount.getText());
					y = Integer.parseInt(TotalBill.getText());
					if (x < y)  {
						JOptionPane optionpane = new JOptionPane();
						optionpane.setMessage("The Amount must be equal or greater than Total Bill");
						optionpane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
						JDialog dialog=optionpane.createDialog(null, "WARNING MESSAGE");
						dialog.setVisible(true);
					} 
					else {
					double one, two;
					TotalBillDisplay.setText(TotalBill.getText());
					AmountDisplay.setText(Amount.getText());
					one = Double.valueOf(TotalBillDisplay.getText());
					two = Double.valueOf(AmountDisplay.getText());
					double change;
					change = two - one;
					Change.setText(""+change);
				    }
				}
		});
		PAY.setBackground(new Color(0xD69962));
		PAY.setFont(new Font("Times New Roman", Font.BOLD, 14));
		PAY.setBounds(255, 330, 179, 41);
		
		frame.getContentPane().add(PAY);
		lblNewLabel_4.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(255, 247, 179, 41);
		
		frame.getContentPane().add(lblNewLabel_4);
		
		frame.getContentPane().add(Amount);
		Amountt.setHorizontalAlignment(SwingConstants.CENTER);
		Amountt.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		Amountt.setBounds(503, 111, 179, 41);
		
		frame.getContentPane().add(Amountt);
		
		frame.getContentPane().add(AmountDisplay);
		Totall.setHorizontalAlignment(SwingConstants.CENTER);
		Totall.setForeground(new Color(0, 0, 0));
		Totall.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		Totall.setBounds(503, 181, 179, 41);
		
		frame.getContentPane().add(Totall);
		
		frame.getContentPane().add(TotalBillDisplay);
		Changee.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		Changee.setHorizontalAlignment(SwingConstants.CENTER);
		Changee.setBounds(505, 247, 179, 41);
		frame.getContentPane().add(Changee);
		frame.getContentPane().add(Change);
		Rec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "<html> <center>Jollibee </center> <br> <center>CASH PAYMENT </center> <br> <center>TIP FOODCOURT </center><br>"
						+ "Date : "+Date_Txt.getText()+"<br>"
						+ "Time : "+Time_Txt.getText()+"<br>"
						+ "<br>"
						+ "Total Due: "+TotalBillDisplay.getText()+"<br>"
						+ "Cash: "+Amount.getText()+"<br>"
						+ "Change: "+Change.getText()+"<br><center>We love to see </center><br><center>your beautiful smile </center><br><center>while eating</center><br><center>THANK YOU FOR ORDERING IN TIP FOODCOURT</center><br><center>CLICK YES OR NO TO EXIT THE SYSTEM</center></html>";
				JOptionPane optionpane = new JOptionPane();
				JOptionPane response = optionpane;
				optionpane.setOptionType(JOptionPane.YES_NO_OPTION);
				optionpane.setMessage(msg);
				optionpane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
				JDialog dialog=optionpane.createDialog(null, "RECEIPT");
				dialog.setVisible(true);
				
				int respone = 0;
				if(respone==JOptionPane.YES_OPTION) {
					System.exit(0);
				} 
			}
		});
		
		Rec.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Rec.setBackground(new Color(0xD69962));
		Rec.setBounds(503, 330, 179, 41);
		
		frame.getContentPane().add(Rec);
		BG.setBackground(new Color(0xFFBC8F));
		BG.setBounds(210, 69, 283, 319);
		
		frame.getContentPane().add(BG);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				 Jobee_Pay Pay = new Jobee_Pay();
			}
		});
		
		btnNewButton.setBackground(new Color(0xD69962));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(503, 419, 179, 41);
		
		frame.getContentPane().add(btnNewButton);
	}
	public static void main(String[] args) 
    {
	 Jobee_Cash cash = new Jobee_Cash();
    }
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==b_Button) {
			frame.dispose();
			Jobee_Family jb = new Jobee_Family();
		 } 
		 else if(e.getSource()==a_Button) {
			 frame.dispose();
			 Jobee_SuperMeal sm = new Jobee_SuperMeal();
		 }
		 else if(e.getSource()==s_Button) {
			 frame.dispose();
			 Jobee_Bev bev = new Jobee_Bev();
		 }
		 else if(e.getSource()==bat_Button) {
			 frame.dispose();
			 Jobee_Cart cart = new Jobee_Cart();
		 }
		 else if(e.getSource()==pay_Button) {
			 frame.dispose();
			 Jobee_Pay Pay = new Jobee_Pay();
		 }
		 else if(e.getSource()==return_Button) {
			 frame.dispose();
			 Main_TIP_FC gui = new Main_TIP_FC();
		 }
	 }
}
