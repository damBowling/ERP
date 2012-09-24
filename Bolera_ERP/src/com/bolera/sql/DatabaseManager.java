package com.bolera.sql;

import java.sql.DriverManager;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DatabaseManager {
	String url;
	String username;
	String password;
	String database;
	private static String drv;
	Connection ct;
	Statement st;
	
	/**
	 * Contructor que se encarga de crear el objeto y crear una conxión a la base de datos
	 * 
	 * @param url			Variable que contiene Protocolo + url + puerto al servidor EJ: jdbc:mysql://localhost:3306/
	 * @param username		Variable que contiene el nombre de usuario EJ: "usuario"
	 * @param password		Variable que contiene el password del usuario arriba citado EJ: "password"
	 * @param database		Variable que contiene el nombre de la base de datos a la que conectar
	 */
	public DatabaseManager(String url, String username, String password, String database){
		//Preparar las variables que contendrá los datos de conexión//
		this.url = url;
		this.username = username;
		this.password = password;
		this.database = database;
		drv = "com.mysql.jdbc.Driver";
		//Conectar a la base de datos//
		try {
			//-Establecer el driver de tipo ODBC de MySql-//
			Class.forName(drv);
			System.out.println(url+database+","+ username+","+password);
			//-Usar la variable Connection para conectar-//
			ct = (Connection) DriverManager.getConnection(url+database, username,
					password);
			//-Crear un Statement(Conexion a la db) a partir del objeto conexion-//
			st = (Statement) ct.createStatement();
			 System.out.println("Conexion satisfactoria");
		} catch (Exception e) {
			System.out.println("No se pudo conectar a la Base de Datos");
			e.printStackTrace();
		}
	}
	
	/**
	 * Esto retorna todos los Clientes en una Lista
	 * @return
	 */
	public ArrayList<String> getAllClientes(){
		return null;
	}
}
