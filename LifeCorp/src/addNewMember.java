
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import model.User;
import customTool.DBUtil;

/**
 * Servlet implementation class addNewMember
 */
@WebServlet("/addNewMember")
public class addNewMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addNewMember() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String FName = request.getParameter("firstname");
        String LName = request.getParameter("lastname");
        String EAddress = request.getParameter("emailaddress");
        String Pwd = request.getParameter("password");
        
        
        EntityManager em =DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        
        try
        {
        	User mem = new model.User();
        	mem.setFirstname(FName);
        	mem.setLastname(LName);
        	mem.setEmailid(EAddress);
        	mem.setPassword(Pwd);
        	

        	em.persist(mem);
        	trans.commit();
        }catch (Exception e){
        	System.out.println(e);
        	trans.rollback();
        }finally{
        	em.close();
        }
        
        getServletContext()
		.getRequestDispatcher("/")
		.forward(request, response);
	}

}
