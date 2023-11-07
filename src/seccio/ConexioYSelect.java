package seccio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.lang.model.element.NestingKind;

public class ConexioYSelect {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cançons", "root", "");

			System.out.println("Conexio realitzada amb exit");

			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM cançons");
			while (rs.next()) {
				String registre = "";
				for (int i = 1; i < rs.getMetaData().getColumnCount(); i++) {
					// Comença per 1 el length de las columnes, no 0.
					registre += " - " + rs.getString(i);
				}
				System.out.println(registre);
			}

			rs.close();
			stmt.close();
			con.close();
		} catch (

		Exception e) {
			System.out.println(e);
		}

	}

}
