


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class DeleteEmp2
 */
public class DeleteEmp2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmp2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int i=Integer.parseInt(request.getParameter("id"));
		
	    try {
	    	SessionFactory sessionFactory = new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			Employee e = new Employee();
			e.setId(i);
			session.delete(e);
			PrintWriter o=response.getWriter();
			o.println("<html><body>Deleted successfully </body></html>");
			session.getTransaction().commit();
		    sessionFactory.close();
	    }
	    catch(Exception e1) {
			System.out.println(e1);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
