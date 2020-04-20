package com.silsub1.run;

import com.silsub1.exception.NumberRangeException;
import com.silsub1.view.ConsoleO;

public class Run {

	public static void main(String[] args) {
		ConsoleO co = new ConsoleO();
		
		co.charInput();
		
		System.out.println();
		
		try {
			co.numberInput();
		} catch (NumberRangeException e) {
			e.printStackTrace();
		}
	}

}
