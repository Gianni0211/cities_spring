package it.objectmethods.cities.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CitiesDaoImpl implements CitiesDao {

	private Connection getConnection() {
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:8081/world", "omdev", "omdev");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	@Override
	public ArrayList<String> findCitiesByCountry(String country) {
		Connection conn = getConnection();
		ArrayList<String> res = new ArrayList<>();
		String city = "";
		String sql = "SELECT c.Name FROM city AS c INNER JOIN country AS ct ON c.CountryCode = ct.Code WHERE ct.Name = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, country);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				city = rs.getString("Name");
				res.add(city);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return res;
	}

}
