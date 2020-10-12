package com.ht;

import com.bt.CPU;
import com.op.HardDisk;

public class PC {
	
	CPU cpu = new CPU();
	HardDisk HD = new HardDisk();
	
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	
	public void setHD(HardDisk hD) {
		HD = hD;
	}
	
	 public void show(){
		 
		 
		 System.out.println("ËÙ¶È£º"+cpu.getSpeed()+",ÈÝÁ¿£º"+HD.getAmount());
	 }

}
