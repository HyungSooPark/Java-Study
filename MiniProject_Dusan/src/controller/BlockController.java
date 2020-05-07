package controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Block;

public class BlockController {

	public static void main(String[] args) {
		BlockController bc = new BlockController();
		//bc.fileSave();
		bc.fileOpen();
		
	}

	
	public void fileSave() {
		ArrayList<Block> arr = new ArrayList<Block>();
		
		arr.add(new Block("중앙테이블"));
		for(int i=301;i<335;i++) {
			arr.add(new Block(Integer.toString(i)+" 블록"));
		}
		for(int i=101;i<106;i++) {
			arr.add(new Block(Integer.toString(i)+" 블록"));
		}
		arr.add(new Block("외야자유석"));
		
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("block_list.txt"))) {
			
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
		ArrayList<Block> arr = new ArrayList<Block>();
		
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("block_list.txt"))) {
			while(true) {
				arr.add((Block) objIn.readObject());
			}
		} catch(EOFException e){
			for(Block b : arr) {
				System.out.println(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String[] getBlockList() {
		ArrayList<Block> arr = new ArrayList<Block>();
		
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("block_list.txt"))) {
			while(true) {
				arr.add((Block) objIn.readObject());
			}
		} catch(EOFException e){
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Block[] block_list = (Block[]) arr.toArray(new Block[arr.size()]);
		
		String[] list = new String[block_list.length];
		
		for(int i=0;i<list.length;i++) {
			list[i] = block_list[i].toString();
		}
		
		return list;
	}
}
