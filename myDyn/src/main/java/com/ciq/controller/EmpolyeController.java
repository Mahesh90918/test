package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpolyeController
 */
public class EmpolyeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmpolyeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter p = resp.getWriter();
		p.println("welcome to EmpolyeeController");
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		double salary = Double.parseDouble(req.getParameter("salary"));
		p.println("<p>");
		p.println(id + " " + name + " " + salary);
		p.println("</p>");
		p.close();
		System.out.println(id + " " + name + " " + salary);
	}

	
}
