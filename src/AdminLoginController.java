import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import adminDAO;
import Admin;

public class AdminLoginController implements Controller {
	private adminDAO adminDAO;
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String account=request.getParameter("account");
		String password=request.getParameter("password");
	
		
		Map model=new HashMap();

		Admin admin=adminDAO.select(account, password);
		
	if(admin != null){
			model.put("admin", admin);
        	return new ModelAndView("WEB-INF/views/AdminMain.jsp",model);
	}else{
		model.put("error", "Login failed");
		return new ModelAndView("WEB-INF/views/AdminLogin.jsp",model);
	}
		
	}
	public void setAdminDao(adminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}
	public adminDAO getAdminDao() {
		return adminDAO;
	}

}
