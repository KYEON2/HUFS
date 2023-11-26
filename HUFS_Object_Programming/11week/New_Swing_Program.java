package ContentPane;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ContentPane extends JFrame{
	
	public ContentPane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 500);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.GREEN);
		contentPane.setLayout(new FlowLayout());
		
		JButton submitButton = new JButton("Submit");
		JButton editButton = new JButton("Edit");
		JButton deleteButton = new JButton("Delete");
		
		contentPane.add(submitButton);
		contentPane.add(editButton);
		contentPane.add(deleteButton);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ContentPane frame = new ContentPane();
		frame.setVisible(true);
	}
}



