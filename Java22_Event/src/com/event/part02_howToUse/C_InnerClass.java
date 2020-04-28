package com.event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_InnerClass extends JFrame{
	private JButton button;
	private JLabel label;
	
	public C_InnerClass() {
		this.setSize(300,300);
		this.setTitle("InnerClass");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러줘요");
		label = new JLabel("아직 버튼이...");
		panel.add(button);
		panel.add(label);
		
		button.addActionListener(new MyEvent());
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("드디어 버튼이.......");
			button.setText("버튼이 눌렸습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		new C_InnerClass();
	}

}
