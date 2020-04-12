package com.poly.test.test05;

public class LgTv implements Tv {
	private int volumn=0;
	
	public LgTv() {
		super();
		System.out.println("LG TV가 켜졌습니다.");
	}

	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	@Override
	public int volumnUp() {
		setVolumn(getVolumn()+1);
		System.out.println("\n볼륨이 1 올라갔습니다.");
		return volumn;
	}

	@Override
	public int volumnDown() {
		setVolumn(getVolumn()-1);
		
		if(volumn>=0) {
			System.out.println("\n볼륨이 1 내려갔습니다.");
			return volumn;
		}
		else {
			setVolumn(0);
			System.out.println("\n이미 볼륨이 0 입니다.");
			return volumn;
		}
	}

	@Override
	public void tvClosed() {
		System.out.println("\nLG TV가 꺼졌습니다.");
	}

}
