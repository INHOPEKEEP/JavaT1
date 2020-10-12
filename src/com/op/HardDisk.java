package com.op;

public class HardDisk {
	
	private int amount;
	
	private int zs;
	
	private float size;
	
	public HardDisk() {
		
	}
	
	public HardDisk(int amount){
		this.amount=amount;
		
	}
	
	public HardDisk(int amount,int zs){
		this.amount=amount;
		
		this.zs=zs;
		
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}

}
