package com.bolera.main;

import com.bolera.sql.DatabaseManager;

public class Main {

	static DatabaseManager dBm;
	/**
	 * Este metodo llamara a la ejecucion del programa
	 * 
	 * 
	 * @param args Irrelevante, de serie
	 */
	// hola putitas
	public static void main(String[] args) {
		//Ejemplo de conexion a la base de datos posteriormente probablemente la retiraremos
		dBm = new DatabaseManager("jdbc:mysql://10.2.34.250:3306/", "florida", "qwerty","heartbreaker");
	}

}
