package com.test.io.part02_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	public void fileSave() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("sample.txt");
			fw.write("비도 오고 그래서");
			fw.write('A');
			fw.write(' ');
			char[] carr = {'a','b','c','d'};
			fw.write(carr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("sample.txt");
			int val;
			
			while((val=fr.read())!=-1) {
				System.out.print((char)val);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
