import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Redirect control to jsp", urlPatterns = { "/redirect" })
public class Redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		int number = Integer.parseInt(req.getParameter("number"));
		
		req.setAttribute("number", number);
		
		if (number < 10)
			req.getRequestDispatcher("smaller.jsp").forward(req, resp);
		else if (number >= 10 && number < 99)
			req.getRequestDispatcher("larger.jsp").forward(req, resp);
		else
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		
		out.close();
	}

}
