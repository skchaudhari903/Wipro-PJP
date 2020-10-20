


import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Servlet implementation class Modify
 */
public class Modify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Modify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			String id=request.getParameter("id");
			int i=Integer.parseInt(id);
			SessionFactory sessionFactory = new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
			Session session1 = sessionFactory.openSession();
			session1.beginTransaction();
			@SuppressWarnings("unchecked")
			Query<Employee> q1=session1.createQuery("From Employee as e where e.id=?1");
			q1.setParameter(1, i);
			String name = null,gender = null,designation = null,city = null,email = null;
			int salary = 0;
			BigInteger mobile = null;
			List<Employee> l=q1.getResultList();
			PrintWriter out=response.getWriter();
			if(l.isEmpty()) {
				out.println("There is no employee with the id "+id);
			}
			else {
			Iterator<Employee> it=l.iterator();
			while(it.hasNext()) {
				Object o=(Object)it.next();
				Employee e=(Employee)o;
				name=e.getName();
				gender=e.getGender();
				designation=e.getDesignation();
				city=e.getCity();
				email=e.getEmail();
				salary=e.getSalary();
				mobile=e.getMobile();
				request.setAttribute("id", i);
				request.setAttribute("name",name);
				request.setAttribute("gender",gender);
				request.setAttribute("designation",designation);
				request.setAttribute("city",city);
				request.setAttribute("email",email);
				request.setAttribute("salary",salary);
				request.setAttribute("mobile",mobile);
				getServletContext().getRequestDispatcher("/Edit.jsp").forward(request,response); 
				
				
			}
			}
			session1.getTransaction().commit();
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
