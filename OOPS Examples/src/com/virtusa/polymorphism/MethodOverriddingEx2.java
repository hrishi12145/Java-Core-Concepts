package com.virtusa.polymorphism;

class Plane {
	void takeoff() {
		System.out.println("Plane is taking off");
	}

	void fly() {
		System.out.println("Plane is flying");
	}

	void land() {
		System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane {
	void takeoff() {
		System.out.println("CargoPlane is taking off");
	}

	void fly() {
		System.out.println("CargoPlane is flying");
	}

	void land() {
		System.out.println("CargoPlane is landing");
	}
}

class Airport {
	public void permit(Plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}

public class MethodOverriddingEx2 {
	public static void main(String[] args) {
		Plane p = new Plane();
		CargoPlane cp = new CargoPlane();
		Airport a = new Airport();
		a.permit(p);
		System.out.println();
		System.out.println("After Overridding : ");
		System.out.println();
		a.permit(cp);
	}
}
