


import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class Update
 */
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		int i=Integer.parseInt(id);
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String designation=request.getParameter("designation");
		String salary=request.getParameter("salary");
		int s=Integer.parseInt(salary);
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		BigInteger m=new BigInteger(mobile);
		System.out.println(id);
		SessionFactory sessionFactory = new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Employee e=new Employee();
		e.setId(i);
		e.setName(name);
		e.setGender(gender);
		e.setDesignation(designation);
		e.setSalary(s);
		e.setCity(city);
		e.setEmail(email);
		e.setMobile(m);
		session.update(e);
		PrintWriter o=response.getWriter();
		o.println("<html><body>Updated successfully </body></html>");
		session.getTransaction().commit();
	    sessionFactory.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
