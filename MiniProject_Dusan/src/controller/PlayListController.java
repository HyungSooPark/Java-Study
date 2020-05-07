package controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.PlayList;

public class PlayListController {
	public static void main(String[] args) {
		PlayListController pc = new PlayListController();
		//pc.fileSave();
		pc.fileOpen();
	}
	
	public void fileSave() {
		ArrayList<PlayList> arr = new ArrayList<PlayList>();
		
		arr.add(new PlayList("2020/05/14 18:30","롯데 자이언츠"));
		arr.add(new PlayList("2020/05/15 18:30","KIA 타이거즈"));
		arr.add(new PlayList("2020/05/16 17:00","삼성 라이온즈"));
		arr.add(new PlayList("2020/05/17 14:00","키움 히어로즈"));
		arr.add(new PlayList("2020/05/19 18:30","NC 다이노스"));
		arr.add(new PlayList("2020/05/20 18:30","LG 트윈스"));
		arr.add(new PlayList("2020/05/21 18:30","SK 와이번스"));
		arr.add(new PlayList("2020/05/22 18:30","KT 위즈"));
		arr.add(new PlayList("2020/05/23 17:00","한화 이글스"));
		//arr.add(new PlayList("2020/05/24 20:30","KT 위즈~~"));
		
		
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("play_list.txt"))) {
			
			for(int i=0;i<arr.size();i++) {
				objOut.writeObject(arr.get(i));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		ArrayList<PlayList> arr = new ArrayList<PlayList>();
		
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("play_list.txt"))) {
			while(true) {
				arr.add((PlayList) objIn.readObject());
			}
		} catch(EOFException e){
			for(PlayList p : arr) {
				System.out.println(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String[] getPlayList() {
		ArrayList<PlayList> arr = new ArrayList<PlayList>();
		
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("play_list.txt"))) {
			while(true) {
				arr.add((PlayList) objIn.readObject());
			}
		} catch(EOFException e){
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		PlayList[] play_list = (PlayList[]) arr.toArray(new PlayList[arr.size()]);
		
		String[] list = new String[play_list.length];
		
		for(int i=0;i<list.length;i++) {
			list[i] = play_list[i].toString();
		}
		
		return list;
	}
}
