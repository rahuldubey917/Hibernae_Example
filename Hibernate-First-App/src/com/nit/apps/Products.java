package com.nit.apps;


public class Products {

	private int pid;
	private String bname;
	private int bprice;
	 private String bauther;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	public String getBauther() {
		return bauther;
	}
	public void setBauther(String bauther) {
		this.bauther = bauther;
	}
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", bname=" + bname + ", bprice=" + bprice + ", bauther=" + bauther + "]";
	}

}
