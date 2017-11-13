package java1025;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam1 {

	public static void main(String[] args) {
		JFrame fr = new JFrame();
		fr.setLayout(new FlowLayout());
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(480, 360);
		fr.setLocation(480, 480);
		fr.setTitle("Hello");
		
		JButton btn = new JButton("æ»≥Á«œººø‰");
		fr.add(btn);
		
		btn.addActionListener(new MyListener());
		
		fr.setVisible(true);

	}

}
