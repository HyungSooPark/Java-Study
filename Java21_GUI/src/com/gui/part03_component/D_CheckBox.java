package com.gui.part03_component;

import java.awt.Button;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mf = new JFrame();
		String[] fruits = {"apple", "orange", "banana"};
		
		JCheckBox[] btn = new JCheckBox[3];
		
		for(int i=0; i<btn.length; i++	) {
			btn[i] = new JCheckBox(fruits[i]);
		}
		
		//패널에 추가
		JPanel checkPanel = new JPanel();
		for(int i=0; i<btn.length; i++) {
			checkPanel.add(btn[i]);
		}
		
		JPanel resPanel = new JPanel();
		JLabel text= new JLabel("선택한 과일이 없습니다.");
		resPanel.add(text);
		
		//여러개의 이벤트도 동시에 반복문을 통해 연결 가능하다.
		for(int i=0; i<btn.length; i++) {
			btn[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					String result = "";
					int cnt = 0;
					
					for(int i=0; i<btn.length; i++) {
						if(btn[i].isSelected()) {
							result += btn[i].getText()+"";
							cnt++;
						}
						text.setText(result);
					}
					if(cnt==0) {
						text.setText("선택한 과일이 없습니다.");
					}
				}
			});
		}
		
		
		mf.add(checkPanel, "North");
		mf.add(resPanel,"Center");
		
		mf.pack();
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
	}

}
