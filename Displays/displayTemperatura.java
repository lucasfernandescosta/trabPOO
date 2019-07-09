package com.lucas.interface.Displays;

import com.lucas.interface.Classes.temp;

public class displayTemperatura extends display<graus> {

	private float temp;

	public setTemperatura(float temp) {

	}

	public float getTemperatura() {
		return temp;
	}

	public void show() {
		System.out.println(formatter(this.temp));	
	}

}
