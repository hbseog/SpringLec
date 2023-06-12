package com.bit.springboard.coupling;

public class AppleCarAudio implements CarAudio{

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("애플 볼륨업");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("애플 볼륨다운");
	}

}
