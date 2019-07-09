package com.lucas.interface.Displays;

import com.lucas.interface.Classes.fm;

public class displayFM extends display<estacao> {

	private float estacao;

	public setEstacao(float estacao) {

	}

	public float getEstacao() {
		return estacao;
	}

	public void show() {
		System.out.println(formatter(this.estacao));	
	}

}
