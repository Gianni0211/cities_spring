package it.objectmethods.cities.dao;

import java.util.ArrayList;

public interface CitiesDao {

	public ArrayList<String> findCitiesByCountry( String country);
}
