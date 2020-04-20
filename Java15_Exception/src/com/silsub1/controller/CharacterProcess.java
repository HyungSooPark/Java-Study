package com.silsub1.controller;

import com.silsub1.exception.CharCheckException;
import com.silsub1.view.ConsoleO;

public class CharacterProcess {
	public CharacterProcess() {}
	
	public void countAlpha(String s) throws CharCheckException{
		char[] ch = s.toCharArray();
		int count = 0;
		boolean blank = false;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				count++;
			}
			else if(ch[i]>='A'&&ch[i]<='Z') {
				count++;
			}
			else if(ch[i]==32) {
				blank = true;
			}
		}
		
		if(!blank) {
			ConsoleO co = new ConsoleO();
			co.charOutput(s, count);
		}
		else {
			throw new CharCheckException();
		}
	}
}
