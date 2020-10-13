

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AucBean;

/**
 * Servlet implementation class AucServ
 */
@WebServlet("/AucServ")
public class AucServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AucServ() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int itemId=Integer.parseInt(request.getParameter("itemid"));
		String itemName=request.getParameter("iname");
		String name=request.getParameter("uname");
		String email=request.getParameter("mail");
		int bid=Integer.parseInt(request.getParameter("bid"));
		String status=request.getParameter("chk");
		AucBean b=new AucBean(itemId,itemName,name,email,bid,status);
		request.setAttribute("b",b);
		request.getRequestDispatcher("Aucjsp.jsp").forward(request,response);
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
