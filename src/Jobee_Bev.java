import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class  Jobee_Bev extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel Menu = new JPanel();
	JPanel b = new JPanel();
	JPanel ba = new JPanel();
	JPanel bac = new JPanel();
	JPanel ac = new JPanel();
	JPanel acd = new JPanel();
	
	JPanel fm1 = new JPanel();
	JPanel fm11 = new JPanel();
	JPanel fm2 = new JPanel();
	JPanel fm22 = new JPanel();
	JPanel fm3 = new JPanel();
	JPanel fm33 = new JPanel();
	
	JLabel lLabel = new JLabel();
	JLabel fml = new JLabel();
	JLabel fmll = new JLabel();
	JLabel fmlll = new JLabel();
	JLabel fmi = new JLabel();
	JLabel fmii = new JLabel();
	JLabel fmiii = new JLabel();
	JLabel fma = new JLabel();
	JLabel fmaa = new JLabel();
	JLabel fmaaa = new JLabel();
	
	JButton b_Button = new JButton();
	JButton a_Button = new JButton();
	JButton s_Button = new JButton();
	JButton bat_Button = new JButton();
	JButton pay_Button = new JButton();
	JButton return_Button = new JButton();
	
	ImageIcon icon = new ImageIcon("img/icon.png");
	ImageIcon jb = new ImageIcon("img/jb.png"); //Logo Jobee
	ImageIcon pc = new ImageIcon("img/hc.png"); //Logo Jobee-1
	ImageIcon pcc = new ImageIcon("img/sf.png"); //Logo Jobee-2
	ImageIcon pccc = new ImageIcon("img/pj.png"); //Logo Jobee-3
	
	JRadioButton B1 = new JRadioButton("B1");
	JRadioButton B2 = new JRadioButton("B2");
	private final JRadioButton B3 = new JRadioButton("B3");
	private JTextField Quantity;
	private final JButton btnNewButton = new JButton("ADD TO CART");
	private final JLabel lblNewLabel_1 = new JLabel("FOOD CODE");
	private final JTextField textField = new JTextField();
	private final JPanel panel = new JPanel();
	private final JPanel panel_1 = new JPanel();
	private final JLabel lblNewLabel_2 = new JLabel("PRICE (P)");
	private final JPanel panel_2 = new JPanel();
	private final JLabel lblNewLabel_3 = new JLabel("QUANTITY");
	private final JTextField textField_1 = new JTextField();
	private final JTextField textField_2 = new JTextField();
	
	public  Jobee_Bev() {
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.BLACK);
		textField_2.setColumns(10);
		textField_1.setForeground(Color.BLACK);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		lLabel.setIcon(jb);
		lLabel.setVerticalAlignment(JLabel.TOP);
		lLabel.setHorizontalAlignment(JLabel.CENTER);
		
		fml.setIcon(pc);
		fmll.setText("     Hot Chocolate     ");
		fmll.setVerticalAlignment(JLabel.TOP);
		fmll.setHorizontalAlignment(JLabel.CENTER);
		fmlll.setText("P44.00");
		fmlll.setVerticalAlignment(JLabel.CENTER);
		fmlll.setHorizontalAlignment(JLabel.CENTER);
		fmi.setIcon(pcc);
		fmii.setText("      Soda Floats      ");
		fmii.setVerticalAlignment(JLabel.TOP);
		fmii.setHorizontalAlignment(JLabel.CENTER);
		fmiii.setText("P41.00");
		fmiii.setVerticalAlignment(JLabel.CENTER);
		fmiii.setHorizontalAlignment(JLabel.CENTER);
		fma.setIcon(pccc);
		fmaa.setText("   Pineapple Juice   ");
		fmaa.setVerticalAlignment(JLabel.TOP);
		fmaa.setHorizontalAlignment(JLabel.CENTER);
		fmaaa.setText("P61.00");
		fmaaa.setVerticalAlignment(JLabel.CENTER);
		fmaaa.setHorizontalAlignment(JLabel.CENTER);
		
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
		
		fm1.setBounds(210, 50, 150, 210 );
		fm1.setBackground(new Color(0xffac27));
		fm11.setBounds(210, 10, 150, 60 );
		fm11.setBackground(new Color(0xffac27));
		fm2.setBounds(370, 50, 150, 210);
		fm2.setBackground(new Color(0xffac27));
		fm22.setBounds(370, 10, 150, 60 );
		fm22.setBackground(new Color(0xffac27));
		fm3.setBounds(530, 50, 150, 210);
		fm3.setBackground(new Color(0xffac27));
		fm33.setBounds(530, 10, 150, 60 );
		fm33.setBackground(new Color(0xffac27));
		
		b.setBackground(new Color(0xCFA47E));
		ba.setBackground(new Color(0xCFA47E));
		bac.setBackground(new Color(0xCFA47E));
		ac.setBackground(new Color(0xCFA47E));
		acd.setBackground(new Color(0xCFA47E));
		
		
		frame.getContentPane().add(Menu);
		frame.getContentPane().add(fm1);
		frame.getContentPane().add(fm11);
		frame.getContentPane().add(fm2);
		frame.getContentPane().add(fm22);
		frame.getContentPane().add(fm3);
		frame.getContentPane().add(fm33);
		
		fm1.add(fml);
		fm11.add(fmll);
		fm11.add(fmlll);
		fm2.add(fmi);
		fm22.add(fmii);
		fm22.add(fmiii);
		fm3.add(fma);
		fm33.add(fmaa);
		fm33.add(fmaaa);
		
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

		B1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		B1.setForeground(Color.RED);
		B1.setBackground(new Color(0xffac27));
		B1.setHorizontalAlignment(SwingConstants.CENTER);
		B1.setBounds(229, 257, 109, 23);
		frame.getContentPane().add(B1);
		
		B2.setHorizontalAlignment(SwingConstants.CENTER);
		B2.setForeground(Color.RED);
		B2.setBackground(new Color(0xffac27));
		B2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		B2.setBounds(391, 257, 109, 23);
		frame.getContentPane().add(B2);
		
		B3.setForeground(Color.RED);
		B3.setBackground(new Color(0xffac27));
		B3.setHorizontalAlignment(SwingConstants.CENTER);
		B3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		B3.setBounds(549, 257, 109, 23);
		
		frame.getContentPane().add(B3);
		
		Quantity = new JTextField();
		Quantity.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Quantity.setForeground(Color.RED);
		Quantity.setBackground(new Color(0xffac27));
		Quantity.setHorizontalAlignment(SwingConstants.CENTER);
		Quantity.setBounds(324, 287, 176, 53);
		frame.getContentPane().add(Quantity);
		Quantity.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("QUANTITY : ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(229, 287, 73, 53);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton.setBackground(new Color(0xffac27));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(510, 287, 158, 55);
		frame.getContentPane().add(btnNewButton);


		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(B1.isSelected()) {
					textField.setText(B1.getText());
					Jobee_Cart.Food_Code = textField.getText();
					int b1 = 44;
					textField_1.setText(Integer.toString(b1));
					Jobee_Cart.Price = b1;
					int qt1 = Integer.parseInt(Quantity.getText());
					textField_2.setText(Integer.toString(qt1));
					Jobee_Cart.Qty = qt1;
					Jobee_Cart.SubTotal = (b1 * qt1);
					JOptionPane.showMessageDialog(null,"ADD TO CART SUCCESSFULLY!");
					
				} else 	if(B2.isSelected()) {
					textField.setText(B2.getText());
					Jobee_Cart.Food_Code = textField.getText();	
					int b2 = 41;
					textField_1.setText(Integer.toString(b2));
					Jobee_Cart.Price = b2;
					int qt2 = Integer.parseInt(Quantity.getText());
					textField_2.setText(Integer.toString(qt2));
					Jobee_Cart.Qty = qt2;
					Jobee_Cart.SubTotal = (b2 * qt2);
					JOptionPane.showMessageDialog(null,"ADD TO CART SUCCESSFULLY!");
					
				} else {
					textField.setText(B3.getText());
					Jobee_Cart.Food_Code = textField.getText();	
					int b3 = 61;
					textField_1.setText(Integer.toString(b3));
					Jobee_Cart.Price = b3;
					int qt3 = Integer.parseInt(Quantity.getText());
					textField_2.setText(Integer.toString(qt3));
					Jobee_Cart.Qty = qt3;
					Jobee_Cart.SubTotal = (b3 * qt3);
					JOptionPane.showMessageDialog(null,"ADD TO CART SUCCESSFULLY!");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel.setBackground(new Color(0xffac27));
		panel.setBounds(214, 351, 146, 86);
		
		frame.getContentPane().add(panel);
		textField.setForeground(Color.BLACK);
		textField.setEditable(false);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField);
		textField.setColumns(10);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.BLACK);
		panel_1.setBackground(new Color(0xffac27));
		panel_1.setBounds(370, 349, 150, 88);
		
		frame.getContentPane().add(panel_1);
		
		panel_1.add(textField_1);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_1.add(lblNewLabel_2);
		panel_2.setBackground(new Color(0xffac27));
		panel_2.setBounds(530, 351, 150, 86);
		
		frame.getContentPane().add(panel_2);
		
		panel_2.add(textField_2);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0xffac27));
		panel_3.setBounds(215, 287, 465, 53);
		frame.getContentPane().add(panel_3);
	}
	public static void main(String[] args) 
    {
	 Jobee_Bev bev = new Jobee_Bev();
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


