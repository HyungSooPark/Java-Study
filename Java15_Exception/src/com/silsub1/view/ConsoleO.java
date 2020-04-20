package com.silsub1.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.silsub1.controller.CharacterProcess;
import com.silsub1.controller.NumberProcess;
import com.silsub1.exception.CharCheckException;
import com.silsub1.exception.NumberRangeException;

public class ConsoleO {
	public void charInput() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		CharacterProcess cp = new CharacterProcess();
		
		System.out.print("문자열 입력: ");
		String s=null;
		try {
			s = bf.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			cp.countAlpha(s);
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
	}
	
	public void charOutput(String s, int count) {
		System.out.println("문자열 "+s+"에서의 영문자는 "+count+"개 입니다.");
	}
	
	public void numberInput() throws NumberRangeException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자(1~100) 입력: ");
		int num1=0;
		int num2=0;
		try {
			num1 = Integer.parseInt(bf.readLine());
			System.out.print("두번째 숫자(1~100) 입력: ");
			num2 = Integer.parseInt(bf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
		NumberProcess np = new NumberProcess();
		numberOutput(np.checkDouble(num1, num2));
	}
	
	public void numberOutput(boolean isTrue) {
		if(isTrue) System.out.println("배수가 맞습니다.");
		else System.out.println("배수가 아닙니다.");
	}
}
