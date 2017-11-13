package java1113;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam1 extends JFrame {
	
	public Exam1(){
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocation(400, 400);
		
		JPanel panel1 = new JPanel();
		add(panel1, BorderLayout.NORTH);
		JPanel panel2 = new JPanel( new GridLayout(2, 2) );
		add(panel2, BorderLayout.CENTER);
		
		for (int i = 1; i < 5; i++)
			panel1.add( new JButton( Integer.toString(i) ) );
		
		for (int i = 5; i < 9; i++)
			panel2.add( new JButton( Integer.toString(i) ) );
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Exam1();
	}
	
}
