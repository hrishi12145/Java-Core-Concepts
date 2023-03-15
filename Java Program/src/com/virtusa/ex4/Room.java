package com.virtusa.ex4;

/* write a program to create a room class
 * the attributes of this class is roomno,roomtype,roomarea,and Acmachine
 * In this class the member functions are setdata and displaydata .
 * 
 */
public class Room {
	int roomNo;
	String roomtype;
	double roomArea;
	String AcMachine;

	public Room() {
	
	}
	public Room(int roomNo, String roomtype, double roomArea, String acMachine) {
		super();
		this.roomNo = roomNo;
		this.roomtype = roomtype;
		this.roomArea = roomArea;
		AcMachine = acMachine;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public void setRoomArea(double roomArea) {
		this.roomArea = roomArea;
	}

	public void setAcMachine(String acMachine) {
		AcMachine = acMachine;
	}

	@Override
	public String toString() {
		return "roomNo=" + roomNo + ", roomtype=" + roomtype + ", roomArea=" + roomArea + "ft, AcMachine="
				+ AcMachine + "";
	}

}
