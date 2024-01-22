import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main_TIP_FC extends JFrame implements ActionListener{
	
	// GLOBAL VARIABLES
	JLabel label = new JLabel();
	JLabel tlabel = new JLabel("TIP Food Court offers three fast foods");
	JLabel txlabel = new JLabel("Jollibee, Mcdonalds, KFC. Click the");
	JLabel txtlabel = new JLabel("buttons to see all the available foods and");
	JLabel txtxlabel = new JLabel("drinks in each fast foods. There is also");
	JLabel txtxtlabel = new JLabel("the price of each food and drink.");
	
	JLabel lLabel = new JLabel();
	JLabel qLabel = new JLabel();
	JLabel xLabel = new JLabel();
	
	JPanel AboutSystem = new RoundedPanel(20);
	JPanel plogo = new RoundedPanel(150);
	JPanel qlogo = new RoundedPanel(150);
    JPanel xlogo = new RoundedPanel(150);
	
	JButton k_Button = new JButton();
	JButton m_Button = new JButton();
	JButton j_Button = new JButton();
	JFrame frame = new JFrame();
	
	ImageIcon icon = new ImageIcon("img/icon.png"); //Icon
	ImageIcon logox = new ImageIcon("img/logox.png"); //Logo
	ImageIcon kfc = new ImageIcon("img/kfc.png"); //Logo KFC
	ImageIcon mc = new ImageIcon("img/mc.png"); //Logo McDo
	ImageIcon jb = new ImageIcon("img/jb.png"); //Logo Jollibee
	
	public Main_TIP_FC() {
		
		// MAIN FRAME
				//ALL LABEL
				label.setIcon(logox);
				label.setVerticalAlignment(JLabel.TOP);
				label.setHorizontalAlignment(JLabel.CENTER);
				lLabel.setIcon(jb);
				lLabel.setVerticalAlignment(JLabel.CENTER);
				lLabel.setHorizontalAlignment(JLabel.CENTER);
				qLabel.setIcon(mc);
				qLabel.setVerticalAlignment(JLabel.CENTER);
				qLabel.setHorizontalAlignment(JLabel.CENTER);
				xLabel.setIcon(kfc);
				xLabel.setVerticalAlignment(JLabel.CENTER);
				xLabel.setHorizontalAlignment(JLabel.CENTER);
		
				//TEXT
				tlabel.setVerticalAlignment(JLabel.CENTER);
				txlabel.setVerticalAlignment(JLabel.CENTER);	
				txtlabel.setVerticalAlignment(JLabel.CENTER);
				txtxlabel.setVerticalAlignment(JLabel.CENTER);
				txtxtlabel.setVerticalAlignment(JLabel.CENTER);
			
				//ALL BUTTON
				k_Button.setText("Proceed");
				k_Button.setBounds(290, 195, 160, 30);
				k_Button.setBackground(new Color(0xFFE19B));
				k_Button.setFocusable(false);
				k_Button.addActionListener(this);
				k_Button.setFont(new Font("MS Gothic",Font.BOLD,18));
				m_Button.setText("Proceed");
				m_Button.setBounds(500, 195, 160, 30);
				m_Button.setBackground(new Color(0xFFE19B));
				m_Button.setFocusable(false);
				m_Button.addActionListener(this);
				m_Button.setFont(new Font("MS Gothic",Font.BOLD,18));
				j_Button.setText("Proceed");
				j_Button.setBounds(400, 405, 160, 30);
				j_Button.setBackground(new Color(0xFFE19B));
				j_Button.setFocusable(false);
				j_Button.addActionListener(this);
				j_Button.setFont(new Font("MS Gothic",Font.BOLD,18));
				
				frame.setTitle("TIP FOODCOURT");  
				frame.setVisible(true); 
				frame.setSize(700,500); 
				frame.setResizable(false); 
				frame.setLayout(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				frame.setIconImage(icon.getImage()); 
				frame.getContentPane().setBackground(new Color(0xFDCA99)); 
						
				AboutSystem.setBounds(20,90,250,300);
				AboutSystem.setBackground(new Color(0xFFE19B));
				AboutSystem.setOpaque(false);
				
			     plogo.setBounds(290,30,160,160);
			     plogo.setBackground(Color.BLACK);
			     plogo.setOpaque(false);
			     plogo.setLayout(new BorderLayout());
			   
			     qlogo.setBounds(500,30,160,160);
			     qlogo.setBackground(Color.BLACK);
			     qlogo.setOpaque(false);
			     qlogo.setLayout(new BorderLayout());
			     
			     xlogo.setBounds(400,240,160,160);
			     xlogo.setBackground(Color.BLACK);
			     xlogo.setOpaque(false);
			     xlogo.setLayout(new BorderLayout());
			    
			    frame.add(xlogo);
			    frame.add(qlogo);
			    frame.add(plogo);
			    frame.add(k_Button);
			    frame.add(m_Button);
			    frame.add(j_Button);
			    frame.add(AboutSystem);
			    AboutSystem.add(label);
			    AboutSystem.add(tlabel);
			    AboutSystem.add(txlabel);
			    AboutSystem.add(txtlabel);
			    AboutSystem.add(txtxlabel);
			    AboutSystem.add(txtxtlabel);
			    plogo.add(lLabel);
			    qlogo.add(qLabel);
			    xlogo.add(xLabel);
	}
	 public static void main(String[] args) 
	    {
		 Main_TIP_FC gui = new Main_TIP_FC();
	    }
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==k_Button) {
			frame.dispose();
			 Jobee JbWindow = new Jobee();
		 } 
		 else if(e.getSource()==m_Button) {
			 frame.dispose();
			 Mcdo McWindow = new Mcdo();
		 }
		 else if(e.getSource()==j_Button) {
			 frame.dispose();
			 KFC KFCWindow = new KFC(); 
		 }
	 }
	 class RoundedPanel extends JPanel
	    {
	        private Color backgroundColor;
	        private int cornerRadius = 15;

	        public RoundedPanel(LayoutManager layout, int radius) {
	            super(layout);
	            cornerRadius = radius;
	        }

	        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
	            super(layout);
	            cornerRadius = radius;
	            backgroundColor = bgColor;
	        }

	        public RoundedPanel(int radius) {
	            super();
	            cornerRadius = radius;
	        }

	        public RoundedPanel(int radius, Color bgColor) {
	            super();
	            cornerRadius = radius;
	            backgroundColor = bgColor;
	        }

	        @Override
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
	            int width = getWidth();
	            int height = getHeight();
	            Graphics2D graphics = (Graphics2D) g;
	            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	            //Draws the rounded panel with borders.
	            if (backgroundColor != null) {
	                graphics.setColor(backgroundColor);
	            } else {
	                graphics.setColor(getBackground());
	            }
	            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
	            graphics.setColor(getForeground());
	            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
	        }
	    }
}
