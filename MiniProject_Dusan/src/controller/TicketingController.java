package controller;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import model.TicketingInfo;

public class TicketingController {
	
	public static void main(String[] args) {
		TicketingController tc = new TicketingController();
		tc.readTicketing();
	}
	
	public void writeTicketing(TicketingInfo ti) {				
		ArrayList<TicketingInfo> arr = new ArrayList<TicketingInfo>();
		
		arr.add(ti);
		
		if(new File("ticketing_data.txt").exists()) {
						
			try(MyObjectOutputStream objOut = new MyObjectOutputStream(new FileOutputStream("ticketing_data.txt",true))){
				for(int i=0;i<arr.size();i++) {
					objOut.writeObject(arr.get(i));
				}
				objOut.reset();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			try (ObjectOutputStream objOut =new ObjectOutputStream (new FileOutputStream("ticketing_data.txt",true))) {
				for(int i=0;i<arr.size();i++) {
					objOut.writeObject(arr.get(i));
				}
				objOut.reset();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void readTicketing() {
		ArrayList<TicketingInfo> arr = new ArrayList<TicketingInfo>();
		
		ObjectInputStream objIn = null;
		
		
		try {
			objIn = new ObjectInputStream(new FileInputStream("ticketing_data.txt"));
			
			while(true) {
				arr.add((TicketingInfo) objIn.readObject());
			}
		} catch (EOFException e) {
			for(TicketingInfo t : arr) {
				t.print();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		 
		
		
	}
	
	class MyObjectOutputStream extends ObjectOutputStream {
		public MyObjectOutputStream(OutputStream out) throws IOException {
			super(out);
		}

		@Override
		protected void writeStreamHeader() throws IOException {
			//헤더 처리 
		}
	}
	
	public static int createKey() {
		int key=0;
		
	
		
		return key;
	}
}
