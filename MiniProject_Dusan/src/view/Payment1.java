package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Payment1 extends JPanel{
	public Payment1(JFrame pp) {
		this.setSize(250,180);
		this.setLayout(null);
		
		JLabel label = new JLabel("결제하시겠습니까?");
		label.setBounds(65, 30, 120, 30);
		
		JButton button = new JButton("확인");
		button.setBounds(30, 90, 80, 30);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				} finally {
					pp.dispose();
				}
			}
		});
		
		JButton button2 = new JButton("취소");
		button2.setBounds(140, 90, 80, 30);
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pp.dispose();
			}
		});
		
		this.add(label);
		this.add(button);
		this.add(button2);
		
		pp.add(this);
		
	}
	
	

	
}