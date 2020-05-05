package view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.TicketingInfo;

public class MainFrame extends JFrame{
	private JPanel panel;
	
	public MainFrame() {
		this.setSize(400,600);
		this.setLocationRelativeTo(null);
		//프레임 상단에 타이틀 설정
		this.setTitle("두산 베어스 잠실 야구장 이용 서비스");
		
		this.setLocationRelativeTo(null);
		
		try {
			this.setIconImage(ImageIO.read(new File("images/ball.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Image icon = new ImageIcon("images/icon.jpg").getImage().getScaledInstance(400, 400, 0);
		JLabel image = new JLabel(new ImageIcon(icon));
		
		TicketingInfo ti = new TicketingInfo("ID","PW","박형수");
		new Ticketing(this,ti);
		//new TicketingFinal(this,ti);
	
	
		this.setResizable(false);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
