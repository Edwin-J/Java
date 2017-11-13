package java1101;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam01 extends JFrame implements ActionListener {

	public Exam01(){
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("안녕하세요");
		Container ct = this.getContentPane();
		ct.add(btn);
		
		setLayout(new FlowLayout());
		
		add(new JLabel("레이블"));
		
		btn.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Exam01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

}
