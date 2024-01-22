import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableColumn;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Jobee_Cart extends JFrame implements ActionListener{
	
     static JTable table = new JTable();
	 static JScrollPane scrollPane = new JScrollPane();
	public static DefaultTableModel model = new DefaultTableModel(0,0);
	
	public static String Food_Code;
	public static int Price;
	public static int Qty;
	public static int SubTotal;
	public static String TotalPrice;
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
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
	private JTextField SumOfAll;

	
	public Jobee_Cart() {

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
		panel.setBounds(200,0,500, 500);
		panel.setBackground(Color.black);
		panel.setLayout(null);
		
		b.setBackground(new Color(0xCFA47E));
		ba.setBackground(new Color(0xCFA47E));
		bac.setBackground(new Color(0xCFA47E));
		ac.setBackground(new Color(0xCFA47E));
		acd.setBackground(new Color(0xCFA47E));		
		scrollPane.setBounds(10, 10, 470, 400);
		
		Object[] column = {"Food Code", "Price", "Quantity", "Expiration Date", "Total Price"};
		Object[] row = new Object[5];
		model.setColumnIdentifiers(column);
		
		table.setModel(model);
		scrollPane.setViewportView(table);

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
		frame.getContentPane().add(panel);
		panel.add(scrollPane);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				row[0] = Food_Code;
				row[1] = Price;
			    row[2] = Qty;
			    row[3] = SubTotal;   
			    model.addRow(row);
			    JOptionPane.showMessageDialog(null,"ADD TO CART SUCCESSFULLY!");
			}
		});
		
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(1, 421, 132, 41);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if (i>=0) {
					model.removeRow(i);
					JOptionPane.showMessageDialog(null,"DELETED SUCCESSFULLY!");
				}
				else {
					JOptionPane.showMessageDialog(null,"PLEASE SELECT A ROW");
				}
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(130, 421, 132, 41);
		panel.add(btnNewButton_1);
		
		SumOfAll = new JTextField();
		SumOfAll.setHorizontalAlignment(SwingConstants.CENTER);
		SumOfAll.setFont(new Font("Times New Roman", Font.BOLD, 16));
		SumOfAll.setEditable(false);
		SumOfAll.setBounds(397, 421, 93, 41);
		panel.add(SumOfAll);
		SumOfAll.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("VIEW PRICE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SumOfAll.setText(Integer.toString(getSum()));
				TotalPrice = SumOfAll.getText();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(260, 421, 135, 41);
		panel.add(btnNewButton_2);
	}
/*	public static TableColumn[] getColumnsInView(JTable table) {
		TableColumn[] result = new TableColumn[table.getColumnCount()];
		
		for(int c=0; c < table.getColumnCount(); c++) {
			result [c] = table.getColumnModel().getColumn(c);
		}
		return result;
	}*/
	public static int getSum() {
		int rowCount = table.getRowCount();
		int sum=0;
		for (int i=0; i<rowCount; i++) {
			sum = sum+Integer.parseInt(table.getValueAt(i, 3).toString());
		}
		return sum;
	}
	public static void main(String[] args) 
    {
	 Jobee_Cart cart = new Jobee_Cart();
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


