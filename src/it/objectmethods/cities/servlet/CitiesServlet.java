package it.objectmethods.cities.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethods.cities.dao.CitiesDao;
import it.objectmethods.cities.dao.CitiesDaoImpl;

public class CitiesServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 
		String country = req.getParameter("paese");
		ArrayList<String> res = new ArrayList<>();
		CitiesDao dao = new CitiesDaoImpl();
		res = dao.findCitiesByCountry(country);
		req.setAttribute("res", res);
		
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, resp);
	}

}
