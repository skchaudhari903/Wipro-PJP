


import java.io.IOException;
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
 * Servlet implementation class SelectEmployee
 */
public class SelectEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		int id=Integer.parseInt(request.getParameter("id"));
		@SuppressWarnings("unchecked")
		Query<Employee> q1=session.createQuery("From Employee as e where e.id=?1");
		q1.setParameter(1,id);
		List<Employee> list = q1.list();
		request.setAttribute("list", list);
		request.setAttribute("id",id);
		getServletContext().getRequestDispatcher("/All.jsp").forward(request,response); 
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
