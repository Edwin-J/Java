package java1025;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btn = (JButton) e.getSource();
		
		String txt = btn.getText();
		if (txt.equals("�ȳ��ϼ���"))
			btn.setText("�ݰ����ϴ�");
		else
			btn.setText("�ȳ��ϼ���");
		
	}

	
	
}
