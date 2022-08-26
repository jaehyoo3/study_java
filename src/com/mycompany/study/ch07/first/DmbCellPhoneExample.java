package com.mycompany.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbcellphone = new DmbCellPhone();
		dmbcellphone.powerOn();
		dmbcellphone.powerOff();
		
		CellPhone cellphone = new CellPhone();
		cellphone.bell();
		cellphone.sendVoice("하이루?");
		cellphone.receiveVoice("방가방가");
		
		DmbCellPhone dmbcellphone2 = new DmbCellPhone("IPhone13","graphite", 19);
		dmbcellphone2.changeChannelDmb(12);
		dmbcellphone2.turnOnDmb();
		dmbcellphone2.changeChannelDmb(21);
		
		dmbcellphone2.powerOff();
	
	}

}
