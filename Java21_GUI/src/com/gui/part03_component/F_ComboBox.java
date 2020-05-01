package com.gui.part03_component;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class F_ComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mf = new JFrame();
		mf.setSize(300,200);
		
		String[] animals = {"dog", "cat", "tiger"};
		//콤보박스 생성
		
		JComboBox animalList = new JComboBox(animals);
		
		//처음 선택 값 지정
		animalList.setSelectedIndex(1);
		
//		JPanel pabel = new JPabel();
		JLabel label = new JLabel();
		
		animalList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//어떤 메뉴를 선택했는지에 대한 요소를 가지고 온다.
				JComboBox cb = (JComboBox) e.getSource();
				//선택된 메뉴의 텍스트를 가지고 온다.
				String name= (String) cb.getSelectedItem();
				//선택된 이름에 해당하는 사진을 label에 추가
				Image img = new ImageIcon("images/"+name+".PNG").getImage().getScaledInstance(200, 200, 0);
				label.setIcon(new ImageIcon(img));
			}
		});
		
		//가운데 기준으로 수평 정렬
		label.setHorizontalAlignment(JLabel.CENTER);

		mf.add(label,"Center");		
		mf.add(animalList,"North");
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
