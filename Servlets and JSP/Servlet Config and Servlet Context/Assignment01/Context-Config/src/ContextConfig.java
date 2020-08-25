import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Display Servlet Context and Config", urlPatterns = { "/" })
public class ContextConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext context;
	ServletConfig config;

	@Override
	public void init() throws ServletException {
		context = getServletContext();
		config = getServletConfig();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h1>Servlet Context Parameters</h1>");
		Enumeration<String> e1 = context.getInitParameterNames();
		while (e1.hasMoreElements()) {
			String paramName = e1.nextElement();
			out.println(paramName + ": " + context.getInitParameter(paramName) + "<br />");
		}

		out.println("<h1>Servlet Config Parameters</h1>");
		Enumeration<String> e2 = config.getInitParameterNames();
		while (e2.hasMoreElements()) {
			String paramName = e2.nextElement();
			out.println(paramName + ": " + config.getInitParameter(paramName) + "<br />");
		}

		out.close();
	}

}
