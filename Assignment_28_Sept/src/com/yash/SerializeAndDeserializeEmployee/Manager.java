package com.yash.SerializeAndDeserializeEmployee;

public class Manager extends Employee {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int managerId;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getManagerId() {
		return managerId;
	}
	
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + "]";
	}
}
