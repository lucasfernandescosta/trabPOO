package com.lucas.interface.Displays;

import com.lucas.interface.Classes.display;

public class displayRelogio extends display<Hora> {

	private int hora;

	private int minuto;

	private int segundo;

	public setHora(int hora) {

	}

	public int getHora() {
		return hora;
	}

	public setMinutos(int minutos) {

	}

	public int getMinutos() {
		return minutos;
	}

	public setSegundos(int segundos) {

	}

	public int getSegundos() {
		return segundos;
	}

	public void show() {
		System.out.println(formatter(this.hora));
	}

}
