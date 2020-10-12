package com.qf;

import com.bt.CPU;
import com.ht.PC;
import com.op.HardDisk;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CPU cpu = new CPU(2200);
		
		HardDisk HD = new HardDisk(200);
		
		PC pc = new PC();
		
		pc.setCpu(cpu);
		pc.setHD(HD);
		pc.show();
		
	}

}
