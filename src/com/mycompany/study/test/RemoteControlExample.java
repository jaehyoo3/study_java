package com.mycompany.study.test;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl television = new Television();		

		television.turnOn();
		television.setMute(true);
		television.setMute(false);
		television.setVolum(-10);
		RemoteControl.changeBattery();
		television.furnOff();
	}
}