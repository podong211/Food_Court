import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Log_in extends JFrame {
	JFrame frame = new JFrame();
	 
	ImageIcon icon = new ImageIcon("img/icon.png"); //Icon
	
	public Log_in() { 
		
		frame.setTitle("WE NEVER CLOSED");  
		frame.setVisible(true); 
		frame.setSize(700,500); 
		frame.setResizable(false); 
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setIconImage(icon.getImage()); 
		frame.getContentPane().setBackground(new Color(0xFDCA99)); 
	}
}
