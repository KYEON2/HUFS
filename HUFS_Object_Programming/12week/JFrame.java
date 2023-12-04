package Container;

import javax.swing.*;
import java.awt.*;

public class ContainerEX extends JFrame{
	public ContainerEX() {
		setTitle("Absolute Positioning Exercise");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("This is a JLable");
		la.setLocation(50,30);
		la.setSize(150,20);
		c.add(la);
		
		for(int i = 1; i <= 3; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*100+ 40,i*100 +40);
			b.setSize(80,30);
			c.add(b);
			
		}
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ContainerEX();
	}
	
}
