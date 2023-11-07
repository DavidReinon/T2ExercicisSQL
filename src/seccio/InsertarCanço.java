package seccio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.Scanner;


public class InsertarCanço {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cançons", "root", "");

			System.out.println("Conexio realitzada amb exit");

			Cançons cançons = new Cançons();
			Scanner teclat = new Scanner(System.in);
			System.out.println("Introdueix el nom de la canço: ");
			cançons.setNom(teclat.nextLine());

			System.out.println("Introdueix el artista de la canço: ");
			cançons.setArtista(teclat.nextLine());

			System.out.println("Introdueix la duració de la canço: ");
			cançons.setDuraçio(teclat.nextLine());

			System.out.println("Introdueix el any de salida de la canço: ");
			cançons.setAnyo(Integer.parseInt(teclat.nextLine()));
			teclat.close();

			PreparedStatement psInsertar = con
					.prepareStatement("INSERT INTO cançons (nom,artista,duracion,anyo) VALUES (?,?,?,?)");
			psInsertar.setString(1, cançons.getNom());
			psInsertar.setString(2, cançons.getArtista());
			psInsertar.setString(3, cançons.getDuraçio());
			psInsertar.setInt(4, cançons.getAnyo());
			int resultadoInsertar = psInsertar.executeUpdate();

			if (resultadoInsertar == 0)
				System.out.print("No se ha pogut insertar la informacio");
			else
				System.out.println("Inserccio realitzada correctament.");

			con.close();
		} catch (

		Exception e) {
			System.out.println(e);
		}

	}

}
