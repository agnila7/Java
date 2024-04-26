package com.weather;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Servlet implementation class WeatherServlet
 */
public class WeatherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WeatherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String inputData= request.getParameter("userInput");
//		System.out.println(inputData);
		
		//api setup
		String apiKey = "7c01339f2a378119fc56cadc0eb3dce0";
		//get the city from input
		String city = request.getParameter("city");
		//create URL for open weather app request
		String apiURL= "https://api.openweathermap.org/data/2.5/weather?q=" + city + "appid=" + apiKey; 

		// api integration
		URL url = new URL(apiURL);
		//url connection 
		HttpURLConnection connection = (HttpURLConnection) url.openConnection(); //establish the connection, typecasting
		connection.setRequestMethod("GET"); // get connection as we want the data from the aopen weather api network
		
		//read the data from the network = data retrieval
		InputStream inputStream = connection.getInputStream(); //make the input a stream and establish the connection with getInputStream() method
		InputStreamReader reader = new InputStreamReader(inputStream);// read the data from the input stream// kinda like scanner class
		
	}

}
