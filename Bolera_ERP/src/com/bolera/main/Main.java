package com.bolera.main;

import com.bolera.sql.DatabaseManager;

public class Main {

	static DatabaseManager dBm;
	/**
	 * Este metodo llamar� a la ejecuci�n del programa
	 * 
	 * @param args Irrelevante, de serie
	 */
	public static void main(String[] args) {
		//Ejemplo de conexi�n a la base de datos posteriormente probablemente la retiraremos
		dBm = new DatabaseManager("jdbc:mysql://10.2.34.250:3306/", "florida", "qwerty","heartbreaker");
	}

}
