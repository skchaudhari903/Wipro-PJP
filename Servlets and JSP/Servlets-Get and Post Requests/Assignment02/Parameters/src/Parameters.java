import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Display Parameters", urlPatterns = { "/login" })
public class Parameters extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pass = req.getParameter("password");
        String age = req.getParameter("age");
        String date = req.getParameter("date");
		response(resp, "Name : " + name);
		response(resp, "Password : " + pass);
		response(resp, "Age : " + age);
		response(resp, "Date : " + date);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
    }

    private void response(HttpServletResponse resp, String msg) throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title> Received Parameters</title></head>");
        out.println("<body align=\"center\">");
        out.println("<h3>" + msg + "</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}
