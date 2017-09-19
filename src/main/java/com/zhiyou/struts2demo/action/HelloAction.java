package com.zhiyou.struts2demo.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloAction extends ActionSupport {

	private String path;
	
	
//	@Override
//	public String execute() throws Exception {
//		
//		HttpServletRequest request = ServletActionContext.getRequest();
//		HttpServletResponse response = ServletActionContext.getResponse();
//		HttpSession session = request.getSession();
//		ServletContext application = ServletActionContext.getServletContext();
//		
//		return "test";
//	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String list() throws Exception {
		
		return INPUT;
	}
	
	public String insert() throws Exception {
		
		return "/pages/create.jsp" ;
	}
}
