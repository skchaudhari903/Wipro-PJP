import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(description = "Count Number Of Visits", urlPatterns = { "/" })
public class CountVisits extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		HttpSession session = req.getSession();
		
		if (session.isNew())
			session.setAttribute("visits", 1);
		else {
			int count = (int) session.getAttribute("visits");
			session.setAttribute("visits", count + 1);
		}
		
		out.print("<div align=\"center\"><h2> Visit Count : " + session.getAttribute("visits") + "</h2></div>");
	}

}
