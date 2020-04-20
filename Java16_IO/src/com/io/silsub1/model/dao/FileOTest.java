package com.io.silsub1.model.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOTest {

	public static void main(String[] args) {
		FileOTest ft = new FileOTest();
		ft.fileSave();
	}
	
	public void fileSave() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		FileWriter fw = null;
		
		try {
			System.out.print("저장할 파일명: ");
			String fileName = br.readLine();
			
			fw = new FileWriter(fileName);
			
			String str = null;
			
			while(true) {
				System.out.print("파일에 저장할 내용을 입력하시오. : ");
				str = br.readLine();
				
				char[] car = str.toCharArray();
				
				if(!str.equals("exit")) {
					fw.write(car);
					fw.write("\n");
				}
				else {
					System.out.println("파일에 성공적으로 저장되었습니다.");
					break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileRead() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		FileReader fr = null;
		
		try {
			System.out.print("읽을 파일명: ");
			String fileName = br.readLine();
			
			fr = new FileReader(fileName);
			
			StringBuilder sb = new StringBuilder();
		
			int val;
			while((val=fr.read()) != -1) {
				sb.append((char)val);
			}
			
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
