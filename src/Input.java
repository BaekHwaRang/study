import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Input extends JFrame{
	JButton pass = new JButton("close");
	//JTextField textfield = new JTextField();
	JLabel la1 = new JLabel("�����ϼ̽��ϴ�");
	
	JPanel panel = new JPanel();
	
	Input(int count)
	{
		JLabel la2 = new JLabel(""+count);
		panel.add(la1);panel.add(la2);panel.add(pass);
		add(panel);
		setLayout(new FlowLayout());
		setTitle("����");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		pass.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==pass)
					setVisible(false);
			}
		});
	}

	
}
