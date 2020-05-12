package ncs.test7;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame {
	private JTextField javaScore = new JTextField();
	private JTextField sqlScore = new JTextField();
	private JTextField total = new JTextField();
	private JTextField average = new JTextField();
	private JButton calcBtn = new JButton("계산하기");
	
	public ScoreFrame() {
		this.setSize(400, 350);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setTitle("문제 7");
		
		JLabel title = new JLabel("점수를 입력하세요");
		title.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		title.setBounds(0,10,380,50);
		title.setHorizontalAlignment(JLabel.CENTER);
		this.add(title);

		JLabel java = new JLabel("자바:");
		java.setFont(new Font("맑은 고딕",Font.BOLD,18));
		java.setBounds(15, 90, 100, 30);
		javaScore.setBackground(Color.white);
		javaScore.setBorder(BorderFactory.createLineBorder(Color.black,1));
		this.add(java);
		
		javaScore.setFont(new Font("맑은 고딕",Font.PLAIN,18));
		javaScore.setHorizontalAlignment(JTextField.CENTER);
		javaScore.setBounds(60, 92, 120, 30);
		javaScore.setBackground(Color.white);
		javaScore.setBorder(BorderFactory.createLineBorder(Color.black,1));
		this.add(javaScore);
		
		JLabel sql = new JLabel("SQL:");
		sql.setFont(new Font("맑은 고딕",Font.BOLD,18));
		sql.setBounds(200, 90, 100, 30);
		this.add(sql);
		
		sqlScore.setFont(new Font("맑은 고딕",Font.PLAIN,18));
		sqlScore.setHorizontalAlignment(JTextField.CENTER);
		sqlScore.setBounds(245, 92, 120, 30);
		sqlScore.setBackground(Color.white);
		sqlScore.setBorder(BorderFactory.createLineBorder(Color.black,1));
		this.add(sqlScore);
		
		calcBtn.setFont(new Font("맑은 고딕",Font.BOLD,16));
		calcBtn.setBounds(140, 160, 100, 30);
		calcBtn.setHorizontalAlignment(JButton.CENTER);
		this.add(calcBtn);
		
		JLabel totalLabel = new JLabel("총점:");
		totalLabel.setFont(new Font("맑은 고딕",Font.BOLD,18));
		totalLabel.setBounds(15, 230, 100, 30);
		this.add(totalLabel);
		
		total.setFont(new Font("맑은 고딕",Font.PLAIN,18));
		total.setHorizontalAlignment(JTextField.CENTER);
		total.setBounds(60, 232, 120, 30);
		total.setEditable(false);
		total.setBackground(Color.white);
		total.setBorder(BorderFactory.createLineBorder(Color.black,1));
		this.add(total);
		
		JLabel avgLabel = new JLabel("평균:");
		avgLabel.setFont(new Font("맑은 고딕",Font.BOLD,18));
		avgLabel.setBounds(200, 230, 100, 30);
		this.add(avgLabel);
		
		average.setFont(new Font("맑은 고딕",Font.PLAIN,18));
		average.setHorizontalAlignment(JTextField.CENTER);
		average.setBounds(245, 232, 120, 30);
		average.setEditable(false);
		average.setBackground(Color.white);
		average.setBorder(BorderFactory.createLineBorder(Color.black,1));
		this.add(average);
		
		calcBtn.addActionListener(new ScoreFrame$ActionHandler(calcBtn,total,average,javaScore,sqlScore));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
