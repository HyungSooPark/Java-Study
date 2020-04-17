package com.test.io.part03_addStream.ch01_byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStream {
	public void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//보조스트림 변수 = new 보조스트림(new 보조스트림(new 기반스트림("외부자원")));
		
		try {
			System.out.print("문자열 입력: ");
			String val = br.readLine();
			System.out.println("val: "+val);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void output() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("Java Oracle JDBC");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
