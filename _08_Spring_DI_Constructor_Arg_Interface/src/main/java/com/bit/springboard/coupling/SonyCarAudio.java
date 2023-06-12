package com.bit.springboard.coupling;

public class SonyCarAudio implements CarAudio{

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("소니 볼륨업");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("소니 볼륨다운");
	}
	
}
