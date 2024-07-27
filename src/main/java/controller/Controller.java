package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans rgtd = new JavaBeans();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			register(request, response);
		} else if (action.equals("/insert")) {
			newLogin(request, response);
		}else {
			response.sendRedirect("index.html");
		}
//		if (action.equals("/main")) {
//			newAccount(request, response);
//		} else if (action.equals("/insert")) {
//			newUser(request, response);
//		}else {
//			response.sendRedirect("newAccount.jsp");
//		}
	}

	protected void register(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("register.jsp");
	}

	protected void newLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		System.out.println(request.getParameter("nameUser"));
		System.out.println(request.getParameter("pass"));
		rgtd.setNameUser(request.getParameter("nameUser"));
		rgtd.setPass(request.getParameter("pass"));
		
	}
	
//	protected void newAccount(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		response.sendRedirect("newAccount.jsp");
//	}
//
//	protected void newUser(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException{
//		System.out.println(request.getParameter("uNN"));
//		System.out.println(request.getParameter("cPass"));
//		System.out.println(request.getParameter("confirmPass"));
//		rgtd.setNameUser(request.getParameter("uNN"));
//		rgtd.setPass(request.getParameter("cPass"));
//		rgtd.setPass(request.getParameter("confirmPass"));
//
//		
//		
//	}
	

	
}
