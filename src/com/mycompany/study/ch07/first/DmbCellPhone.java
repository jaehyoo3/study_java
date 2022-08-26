package com.mycompany.study.ch07.first;

public class DmbCellPhone extends CellPhone{
	//필드
	
	int channal;
	
	//생성자
	DmbCellPhone(String color, String model, int channal) {
		this.channal = channal;
		this.color = color;
		this.model = model;
	}
	DmbCellPhone() {	
	}
	//함수
	void changeChannelDmb(int channal) {
		System.out.println("채널 " + channal + "번 으로 바꿉니다.");
	}
	void turnOnDmb() {
		System.out.println("채널" + channal + "번을 수신합니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
