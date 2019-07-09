package com.lucas.interface.Displays;

import com.lucas.interface.Classes.calendario;

public class displayCalendario extends display<Calendario> {

	private int ano;

	private int mes;

	private int dia;

	public int getAno() {
		return ano;
	}

	public setAno(int ano) {

	}

	public setMes(int mes) {

	}

	public int getMes() {
		return mes;
	}

	public setAno(int ano) {

	}

	public int getAno() {
		return ano;
	}


	public void show() {
		System.out.println(formatter(this.ano.mes.dia));
	}
}
