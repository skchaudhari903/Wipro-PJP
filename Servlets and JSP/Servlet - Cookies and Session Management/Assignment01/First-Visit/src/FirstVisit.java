import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Remember First Visit", urlPatterns = { "/" })
public class FirstVisit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		Cookie[] cookies = req.getCookies();

		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("FirstVisit")) {
					out.println("Welcome Back");
					break;
				}
			}
		} else {
			Cookie firstCookie = new Cookie("FirstVisit", "No");
			resp.addCookie(firstCookie);
			out.println("Welcome! You are visiting for the first time.");
		}
		out.close();
	}
}
