package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;

import controller.TicketingController;

public class TicketingInfo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int TicketingNo;
	private Date TicketingDate;
	
	private String ID;
	private String PW;
	private String name;
	
	private String game;
	private String block;
	private LinkedHashSet<String> Seat = new LinkedHashSet<String>();
	private int totalPrice;
	
	public TicketingInfo() {}
	
	public TicketingInfo(String ID,String PW,String name) {
		this.ID = ID;
		this.PW = PW;
		this.name = name;
		this.TicketingDate = new Date();
		this.TicketingNo = (int) (Math.random()*1000000000);
	}

	public String getName() {
		return name;
	}
	
	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}
	
	public String getAwayTeam() {
		String away = game.substring(27);
		return away;
	}
	
	public String getGameDate() {
		String str = game.substring(0,16);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date tmp = null;
		try {
			tmp = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM.dd(E) HH:mm");
		return sdf2.format(tmp);
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public void setSeat(String Seat) {
		this.Seat.add(Seat);
	}
	
	
	public String[] getSeatList() {
		String[] list = new String[Seat.size()];
		
		Object[] arr = Seat.toArray();
		
		for(int i=0;i<list.length;i++) {
			list[i] = arr[i].toString();
		}
		
		return list;
	}
	
	public String SeatToString() {
		String[] list = new String[Seat.size()];
		
		Object[] arr = Seat.toArray();
		
		StringBuilder stb = new StringBuilder();
		
		for(int i=0;i<list.length;i++) {
			stb.append(arr[i].toString());
			
			if(i<list.length-1) stb.append(", ");
		}
		
		return stb.toString();
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String getTicketingDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (E) HH시 mm분");
		
		return sdf.format(TicketingDate);
	}
	
	public String getTicketingNo() {
		return String.valueOf(TicketingNo);
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(game);
		System.out.println(block);
		System.out.println(SeatToString());
		System.out.println(totalPrice);
		System.out.println();
	}
}
