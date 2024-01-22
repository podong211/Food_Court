import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mcdo_Gcash extends JFrame implements ActionListener{
	JFrame frame = new JFrame();
	JPanel Menu = new JPanel();
	JPanel b = new JPanel();
	JPanel ba = new JPanel();
	JPanel bac = new JPanel();
	JPanel ac = new JPanel();
	JPanel acd = new JPanel();
	
	JLabel lLabel = new JLabel();
	public static int x,y;
	JButton b_Button = new JButton();
	JButton a_Button = new JButton();
	JButton s_Button = new JButton();
	JButton bat_Button = new JButton();
	JButton pay_Button = new JButton();
	JButton return_Button = new JButton();
	
	ImageIcon icon = new ImageIcon("img/icon.png");
	ImageIcon jb = new ImageIcon("img/mc.png"); //Logo Mcdo
	
	private final JLabel Date = new JLabel("Date :");
	private final JTextField Date_Txt = new JTextField();
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YY");
	SimpleDateFormat timeFormat;
	String time;
	Date date = new Date();
	Calendar cal = Calendar.getInstance();
	private final JLabel Time = new JLabel("Time :");
	private final JTextField Time_Txt = new JTextField();
	private final JLabel Title = new JLabel("GCASH PAYMENT");
	private final JLabel TitleTotalBill = new JLabel("TOTAL BILL");
	private final JTextField TotalBill = new JTextField();
	private final JLabel TitlePM = new JLabel("PAYMENT METHOD");
	private final JTextField txtCash = new JTextField();
	private final JPanel BG = new JPanel();
	private final JLabel lblNewLabel = new JLabel("GCASH METHOD");
	private final JLabel Name = new JLabel("NAME ");
	private final JTextField NameInsert = new JTextField();
	private final JLabel Number = new JLabel("NUMBER");
	private final JTextField NumberInsert = new JTextField();
	private final JLabel Amount = new JLabel("AMOUNT");
	private final JTextField AmountInsert = new JTextField();
	private final JButton PAY = new JButton("PAY");
	private final JPanel BG1 = new JPanel();
	
	private final JLabel Amountt = new JLabel("AMOUNT");
	private final JTextField AmountDisplay = new JTextField();
	private final JLabel Totall = new JLabel("TOTAL");
	private final JTextField TotalBillDisplay = new JTextField();
	private final JLabel Changee = new JLabel("CHANGE");
	private final JTextField Change = new JTextField();
	private final JButton Rec = new JButton("RECEIPT");
	private final JButton btnNewButton = new JButton("RETURN");
	
	public Mcdo_Gcash() {
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
		
		AmountInsert.setHorizontalAlignment(SwingConstants.CENTER);
		AmountInsert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		AmountInsert.setBounds(255, 381, 179, 31);
		AmountInsert.setColumns(10);
		NumberInsert.setHorizontalAlignment(SwingConstants.CENTER);
		NumberInsert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		NumberInsert.setBounds(255, 330, 179, 31);
		NumberInsert.setColumns(10);
		NameInsert.setHorizontalAlignment(SwingConstants.CENTER);
		NameInsert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		NameInsert.setBounds(255, 279, 179, 31);
		NameInsert.setColumns(10);
		
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
		Title.setFont(new Font("Adobe Arabic", Font.BOLD, 22));
		Title.setBounds(210, 18, 293, 51);
		frame.getContentPane().add(Title);
		
		txtCash.setText("GCASH");
		txtCash.setHorizontalAlignment(SwingConstants.CENTER);
		txtCash.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtCash.setEditable(false);
		txtCash.setBounds(255, 177, 179, 41);
		txtCash.setColumns(10);
		TotalBill.setFont(new Font("Times New Roman", Font.BOLD, 14));
		TotalBill.setHorizontalAlignment(SwingConstants.CENTER);
		TotalBill.setEditable(false);
		TotalBill.setBounds(255, 110, 179, 41);
		TotalBill.setColumns(10);
		
		TitleTotalBill.setHorizontalAlignment(SwingConstants.CENTER);
		TitleTotalBill.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		TitleTotalBill.setBounds(255, 80, 179, 41);
		
		frame.getContentPane().add(TitleTotalBill);
		
		TotalBill.setText(Integer.toString(Mcdo_Cart.getSum()));
		frame.getContentPane().add(TotalBill);
		
		TitlePM.setHorizontalAlignment(SwingConstants.CENTER);
		TitlePM.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		TitlePM.setBounds(245, 146, 201, 41);
		
		frame.getContentPane().add(TitlePM);
		
		frame.getContentPane().add(txtCash);
		BG.setBackground(new Color(0xFFBC8F));
		BG.setBounds(210, 80, 271, 149);
		
		frame.getContentPane().add(BG);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		lblNewLabel.setBounds(255, 225, 179, 49);
		
		frame.getContentPane().add(lblNewLabel);
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		Name.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		Name.setBounds(255, 245, 179, 49);
		
		frame.getContentPane().add(Name);
		
		frame.getContentPane().add(NameInsert);
		Number.setHorizontalAlignment(SwingConstants.CENTER);
		Number.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		Number.setBounds(255, 300, 179, 41);
		
		frame.getContentPane().add(Number);
		
		frame.getContentPane().add(NumberInsert);
		Amount.setFont(new Font("Adobe Arabic", Font.BOLD, 14));
		Amount.setHorizontalAlignment(SwingConstants.CENTER);
		Amount.setBounds(255, 357, 179, 31);
		
		frame.getContentPane().add(Amount);
		
		frame.getContentPane().add(AmountInsert);
		PAY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Integer.parseInt(AmountInsert.getText());
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
				AmountDisplay.setText(AmountInsert.getText());
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
		PAY.setBounds(255, 423, 179, 31);
		
		frame.getContentPane().add(PAY);
		BG1.setBackground(new Color(0xFFBC8F));
		BG1.setBounds(210, 240, 271, 220);
		
		frame.getContentPane().add(BG1);
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
				String msg = "<html> <center>McDonald's </center> <br> <center>GCASH PAYMENT </center> <br> <center>TIP FOODCOURT </center><br>"
						+ "Date : "+Date_Txt.getText()+"<br>"
						+ "Time : "+Time_Txt.getText()+"<br>"
						+ "<br>"
						+ "Name : "+NameInsert.getText()+"<br>"
						+ "Gcash Number : "+NumberInsert.getText()+"<br>"
						+ "Total Due: "+TotalBillDisplay.getText()+"<br>"
						+ "Cash: "+AmountInsert.getText()+"<br>"
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
		frame.getContentPane().add(Rec);
		
		Rec.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Rec.setBackground(new Color(0xD69962));
		Rec.setBounds(503, 330, 179, 41);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				 Mcdo_Pay Pay1 = new Mcdo_Pay();
			}
		});
		
		btnNewButton.setBackground(new Color(0xD69962));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(503, 419, 179, 41);
		
		frame.getContentPane().add(btnNewButton);
	}
	public static void main(String[] args) 
    {
		Mcdo_Gcash Gcash1 = new Mcdo_Gcash();
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
