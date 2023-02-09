package javapractise;

import java.awt.Button;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class winter {
	private static JFrame frame;
	
	public static void main(String[] args) {
		frame = new JFrame("ATM");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Button button = new Button("Click Me");
		frame.add(button);
		Label label = new Label();
		button.setSize(50, 50);
		button.setLocation(50,50);
		JTextField text = new JTextField();
		text.setSize(250, 20);
		frame.add(text);
		text.setLocation(10, 10);
		
		
	}
	

	}


