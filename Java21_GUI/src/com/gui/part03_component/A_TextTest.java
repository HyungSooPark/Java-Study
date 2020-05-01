package com.gui.part03_component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_TextTest extends JFrame {
	
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setSize(800,300);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.setSize(800,300);
		
		JTextField id = new JTextField(30);
		
		//입력되는 값을 화면에서 볼수 없다, 한글 입력x
		JPasswordField password = new JPasswordField(30);
		
		panel.add(new JLabel("ID"));
		panel.add(id);
		
		panel.add(new JLabel("PW"));
		panel.add(password);
		
		//여러 줄 입력가능
		JTextArea textArea = new JTextArea(10,30);
		//내용 수정 불가
		textArea.setEditable(false);
		
		//panel.add(textArea);
		
		JButton btn = new JButton("보내기");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = "id = "+id.getText()+"\n";
				text += "pw = "+password.getPassword()+"\n";
				
				textArea.append(text);
			}
		});
	
		mf.add(panel, BorderLayout.NORTH);
		mf.add(btn,BorderLayout.SOUTH);
		mf.add(textArea,BorderLayout.CENTER);
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}

}
