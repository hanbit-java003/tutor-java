package com.hanbit.car;

public class Car {
	
	private int maxPassengers = 5;
	private int maxSpeed = 300;
	
	private boolean doorOpened;
	private int passengers;
	private boolean startedUp;
	private String gear = "P";
	private int speed;

	public void openDoor() {
		doorOpened = true;
	}
	
	public void ride() {
		if (passengers >= maxPassengers) {
			System.out.println("정원 초과입니다.");
			return;
		}
		
		passengers++;
	}
	
	public void startUp() {
		startedUp = true;
	}
	
	public void shiftGear(String gear) {
		if (!"P".equals(gear) && !"R".equals(gear)
				&& !"N".equals(gear) && !"D".equals(gear)) {
			return;
		}
		
		this.gear = gear;
	}
	
	public void accelerate() {
		speed += 10;
		
		if (speed >= maxSpeed) {
			speed = maxSpeed;
		}
	}
	
	public void brake() {
		speed -= 10;
		
		if (speed <= 0) {
			speed = 0;
		}
	}
	
	public void turnOff() {
		startedUp = false;
	}
	
	public void getOut() {
		if (passengers <= 0) {
			System.out.println("승객이 없습니다.");
			return;
		}
		
		passengers--;
	}
	
	public void closeDoor() {
		doorOpened = false;
	}
	
}
