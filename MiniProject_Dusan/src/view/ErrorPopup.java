package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ErrorPopup extends JPanel {
	public ErrorPopup(JFrame pp,String s) {
		this.setSize(250,180);
		this.setLayout(null);
		pp.setTitle("선택 오류");
		
		try {
			pp.setIconImage(ImageIO.read(new File("images/error.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JLabel label = new JLabel(s+" 선택되지 않았습니다.");
		label.setBounds(40, 40, 200, 30);
		
		JButton button = new JButton("확인");
		button.setBounds(30, 90, 190, 30);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pp.dispose();	
			}
		});
		
		this.add(label);
		this.add(button);
		pp.add(this);
	}
}
