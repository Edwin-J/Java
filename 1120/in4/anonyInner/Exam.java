package in4.anonyInner;

import java.awt.event.*;
import javax.swing.*;
public class Exam extends JFrame {
	public Exam() {
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("��������");
		add(button);
		button.addActionListener(  new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button.getText().equals("��������"))
					button.setText("Click now");
				else button.setText("��������");
			}
		}  );
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam();
	}
}
