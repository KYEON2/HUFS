package FlowLayout;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class FlowLayoutEX extends JFrame {
	
	public FlowLayoutEX() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		@SuppressWarnings("unused")
		Container flow = getContentPane();
		
		flow.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));
		
		setSize(500, 300);
		
		flow.add(new JButton("Button1"));
		flow.add(new JButton("Button2"));
		flow.add(new JButton("Button3"));
		flow.add(new JButton("Button4"));
		flow.add(new JButton("Button5"));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FlowLayoutEX frame = new FlowLayoutEX();
		frame.setVisible(true);
	}
}
