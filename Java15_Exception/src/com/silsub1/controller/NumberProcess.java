package com.silsub1.controller;

import com.silsub1.exception.NumberRangeException;

public class NumberProcess {
	public boolean checkDouble(int a, int b) throws NumberRangeException {
		if(a<1||a>100||b<1||b>100) throw new NumberRangeException();
		
		if(a%b==0) return true;
		else return false;
	}
}
