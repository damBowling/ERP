package com.bolera.main;

import com.bolera.sql.DatabaseManager;

public class Main {

	static DatabaseManager dBm;
	/**
	 * Este metodo llamará a la ejecución del programa
	 * 
	 * @param args Irrelevante, de serie
	 */
	public static void main(String[] args) {
		//Ejemplo de conexión a la base de datos posteriormente probablemente la retiraremos
		dBm = new DatabaseManager("jdbc:mysql://10.2.34.250:3306/", "florida", "qwerty","heartbreaker");
	}

}
