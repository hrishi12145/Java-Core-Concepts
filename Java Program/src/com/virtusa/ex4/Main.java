package com.virtusa.ex4;

public class Main {

	public static void main(String[] args) {

		Room room1 = new Room();
		room1.setRoomNo(1);
		room1.setRoomtype("1BHK");
		room1.setRoomArea(240.0);
		room1.setAcMachine("Yes");
		System.out.println(room1);

		Room room2 = new Room(2, "2BHK", 480.0, "Yes");
		System.out.println(room2);

	}

}
