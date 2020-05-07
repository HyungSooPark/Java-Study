package controller;

import java.util.LinkedHashSet;

import model.TicketingInfo;

public class PriceController {
	
	public int getPrice(TicketingInfo ti) {
		int price=0;
	
		String[] str = ti.getSeatList();
			
		int[] seatno = new int[str.length];
		for(int i=0;i<seatno.length;i++) {
			seatno[i] = Integer.parseInt(str[i]);
			
			if(seatno[i]<15) {
				price+=23000;
			}
			else if(seatno[i]>49) {
				price+=18000;
			}
			else {
				price+=21000;
			}
		}
		
		ti.setTotalPrice(price);
		
		return price;
	}
}
