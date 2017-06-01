package com.hanbit.car;

public class CarApp {

	public static void main(String[] args) {
		Car car = new Car();
		car.openDoor();
		car.ride();
		car.ride();
		car.startUp();
		car.shiftGear("D");
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.brake();
		car.brake();
		
		car.showState();
	}
	
}
