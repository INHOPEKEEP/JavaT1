package com.bt;

public class CPU {

	private int speed;
	
	private int core;
	
	private float fq;
	
	
	public CPU(){
		
	}
	
	public CPU(int speed){
		
		this.speed=speed;
		
	}
	
	public CPU(int speed,int core){
		
		this.speed=speed;
		
		this.core=core;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
}
