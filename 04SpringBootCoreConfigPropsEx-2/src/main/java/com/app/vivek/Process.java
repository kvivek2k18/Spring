package com.app.vivek;

public class Process {
	private int pid;
	private String pcode;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	@Override
	public String toString() {
		return "Process [pid=" + pid + ", pcode=" + pcode + "]";
	}
	
}
