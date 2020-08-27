import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Find primes under a number", urlPatterns = { "/PrimeList" })
public class PrimeList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		int number = Integer.parseInt(request.getParameter("number"));

		ArrayList<Integer> primeList = new ArrayList<>();

		for (int i = 0; i < number; i++) {
			if (isPrime(i))
				primeList.add(i);
		}

		request.setAttribute("primeList", primeList);
		request.getRequestDispatcher("primeList.jsp").forward(request, response);

		out.close();
	}

	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i <= (int) Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
