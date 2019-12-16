package OilShopOline.web.servlet.customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckVcServlet
 */
@WebServlet("/CheckVcServlet")
public class CheckVcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckVcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charest=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//CustomerService service = new CustomerService();
		String vc = request.getParameter("vc");
		String vc2 = (String)request.getSession().getAttribute("vc");
		if(vc.equals(vc2)&&vc.length()>0&&vc2.length()>0) {
			try {
				String password = (String)request.getSession().getAttribute("password");
				request.setAttribute("pwd", password);
				request.getRequestDispatcher("/LogRegister/FindBackPassword.jsp").forward(request, response);
			} catch (Exception e) {
				// ����������⣬��������Ϣ�洢��request��Χ������ת�ص�¼ҳ����ʾ������Ϣ
				e.printStackTrace();
				request.setAttribute("CheckVc_message", e.getMessage());
				request.getRequestDispatcher("/LogRegister/FindBackPassword.jsp").forward(request, response);
				return;
			}
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
