package ncs.test7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ScoreFrame$ActionHandler implements ActionListener{
	private JTextField total;
	private JTextField average;
	private JTextField javaScore;
	private JTextField sqlScore;
	
	
	public ScoreFrame$ActionHandler() {}
	public ScoreFrame$ActionHandler(JButton button, JTextField total, JTextField average, JTextField javaScore, JTextField sqlScore) {
		button.addActionListener(this);
		this.total = total;
		this.average = average;
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		int totalScore = Integer.parseInt(javaScore.getText())+Integer.parseInt(sqlScore.getText());
		total.setText(String.valueOf(totalScore));
		average.setText(String.valueOf(totalScore/2.0));
		
	}
}
