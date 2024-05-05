package com.sevletpackage;
//this file works only on apache-tomcat-10.1 server. each time after checkout to the branch always start the server to check if it is working properly.
// Servlets are commonly used to create web applications in Java, providing a server-side programming model for processing HTTP requests and generating HTTP responses.

// servlet is a dynamic web project so that it sets up the project structure and configuration files required for building and deploying web applications
// This structure typically includes directories for web content (e.g., HTML, JSP, CSS, JavaScript files), Java source code (e.g., servlets), configuration files (e.g., web.xml), and libraries (e.g., JAR files).
// java ee is jakarta ee(after 2019 release). this is an enterprise edition to support web development. application server. with most secured. 
//imp to look jdk version atleast 17 and how is it running on server (/ jakarta ee 9 use apache tomcat 10.1, jakarta servelet/ module version 5, jsp 3.)

// create new dynamic web project. tomcat version 10.1, module version 5. Put project name. always configure/generate web.xml in web module
// start servlet. in there alwys create packcage. run on 10.1 tomcat server. if get http error, include /Classname in the url path.
//	create jsp file. always use the name index.jsp, not new file.


import jakarta.servlet.ServletException; //to encapsulate the error information and provide a meaningful error message to the client.
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: MyServlet by Agnila").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
