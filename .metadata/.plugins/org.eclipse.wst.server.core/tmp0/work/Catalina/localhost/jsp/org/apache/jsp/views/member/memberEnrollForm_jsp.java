/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.99
 * Generated at: 2025-02-20 00:05:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.member.vo.Member;

public final class memberEnrollForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/common/menubar.jsp", Long.valueOf(1739963700761L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("com.kh.member.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("    .outer{\r\n");
      out.write("        background-color: black;\r\n");
      out.write("        color: white;\r\n");
      out.write("\r\n");
      out.write("        width: 1000px;\r\n");
      out.write("        margin: auto;\r\n");
      out.write("        margin-top: 50px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #enroll-form table{\r\n");
      out.write("        margin: auto;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #enroll-form input{\r\n");
      out.write("        margin: 5px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");

	String contextPath = request.getContextPath(); // "/jsp"

	Member loginUser = (Member)session.getAttribute("loginUser");
	// 로그인 시도 전 menubar.jsp 로딩시 : null
	// 로그인 성공 후 menubar.jsp 로딩시 : 로그인 성공한 회원의 정보가 담겨있는 Member 객체 

	String alertMsg = (String)session.getAttribute("alertMsg");
	// 서비스 요청 전 menubar.jsp 로딩 시 : null
	// 서비스 요청 후 menubar.jsp 로딩 시 : alert 띄워 줄 메시지 문구

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("    .login-area>*{\r\n");
      out.write("        float: right;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .login-area a{\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: black;\r\n");
      out.write("        font-size: 12px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .nav_area{\r\n");
      out.write("        background-color: black;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .menu{\r\n");
      out.write("        display: table-cell;\r\n");
      out.write("        width: 150px;\r\n");
      out.write("        height: 50px;\r\n");
      out.write("    }\r\n");
      out.write("    .menu a{\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: white;\r\n");
      out.write("        font-size: 20px;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        display: block;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        line-height: 50px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .menu a:hover{\r\n");
      out.write("        background-color: darkgray;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Popper JS -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
 if(alertMsg != null) {
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			// alert(\"문구\")\r\n");
      out.write("			alert(\"");
      out.print( alertMsg );
      out.write("\");\r\n");
      out.write("		</script>\r\n");
      out.write("		");
 session.removeAttribute("alertMsg"); 
      out.write('\r');
      out.write('\n');
      out.write('	');
 } 
      out.write("\r\n");
      out.write("		<!-- session을 빼지 않으면 회원가입 버튼 클릭할 때마다 회원가입 축하메시지가 뜬다. -->\r\n");
      out.write("	\r\n");
      out.write("    <h1 align=\"center\">Welcome Yong Hun World</h1>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"login-area\">\r\n");
      out.write("	");
 if(loginUser == null) { 
      out.write("\r\n");
      out.write("	\r\n");
      out.write("        <!-- case1. 로그인 전 -->\r\n");
      out.write("        <!-- <form action=\"/jsp/서블릿주소\" method=\"post\"> -->\r\n");
      out.write("        <form action= \"");
      out.print( contextPath );
      out.write("/login.me\" method=\"post\">\r\n");
      out.write("            <table border=\"1\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>아이디 : </th>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userId\" required></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>비밀번호 : </th>\r\n");
      out.write("                    <td><input type=\"password\" name=\"userPwd\" required></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th colspan=\"2\">\r\n");
      out.write("                        <button type=\"submit\">로그인</button>\r\n");
      out.write("                        <button type=\"button\" onclick=\"enrollPage()\">회원가입</button>\r\n");
      out.write("                    </th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("            <script>\r\n");
      out.write("            	function enrollPage(){\r\n");
      out.write("            		// location.href = \"");
      out.print( contextPath );
      out.write("/views/member/memberEnrollForm.jsp\";\r\n");
      out.write("            		// 위에 주석 걸린 게 맞음.\r\n");
      out.write("            		// 웹 애플리케이션의 디렉토리 구조가 url 노출되면 보안에 취약\r\n");
      out.write("            		\r\n");
      out.write("            		// 단순한 페이지 요청도 servlet 호출해서 servlet을 거쳐갈 것.\r\n");
      out.write("            		location.href = \"");
      out.print( contextPath );
      out.write("/enrollForm.me\";\r\n");
      out.write("            	}\r\n");
      out.write("            </script>\r\n");
      out.write("            \r\n");
      out.write("        </form> \r\n");
      out.write("    ");
 }else { 
      out.write("  \r\n");
      out.write("\r\n");
      out.write("        <!-- case2. 로그인 후 -->\r\n");
      out.write("        <div>\r\n");
      out.write("            <b>");
      out.print( loginUser.getUserName() );
      out.write("님</b>의 방문을 환영합니다. <br><br>\r\n");
      out.write("            <div align=\"center\">\r\n");
      out.write("                <a href=\"");
      out.print( contextPath );
      out.write("/myPage.me\">마이페이지</a>\r\n");
      out.write("                <a href=\"");
      out.print( contextPath );
      out.write("/logout.me\">로그아웃</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    ");
 } 
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <!-- float이다 보니까 왼쪽 옆에 써진다 -->\r\n");
      out.write("    <br clear=\"both\">\r\n");
      out.write("    <div class=\"nav_area\" align=\"center\">\r\n");
      out.write("        <div class=\"menu\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("\">HOME</a></div>\r\n");
      out.write("        <div class=\"menu\"><a href=\"\">공지사항</a></div>\r\n");
      out.write("        <div class=\"menu\"><a href=\"\">일반게시판</a></div>\r\n");
      out.write("        <div class=\"menu\"><a href=\"\">사진게시판</a></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"outer\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <h2 align=\"center\">회원가입</h2>\r\n");
      out.write("\r\n");
      out.write("        <form id=\"enroll-form\" action=\"");
      out.print( contextPath );
      out.write("/insert.me\" method=\"post\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>* 아이디</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userId\" maxlength=\"12\" required></td>\r\n");
      out.write("                    <td><button type=\"button\">중복확인</button></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>* 비밀번호</td>\r\n");
      out.write("                    <td><input type=\"password\" name=\"userPwd\" maxlength=\"15\" required></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>* 비밀번호 확인</td> <!-- 비밀번호 중 하나만 넘기면 되서 name은 하나만 -->\r\n");
      out.write("                    <td><input type=\"password\" maxlength=\"15\" required></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>* 이름</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userName\" maxlength=\"6\" required></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;&nbsp;전화번호</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"phone\" placeholder=\"- 포함해서 입력\"></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;&nbsp;이메일</td>\r\n");
      out.write("                    <td><input type=\"email\" name=\"email\"></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;&nbsp;주소</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"address\"></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;&nbsp;관심분야</td>\r\n");
      out.write("                    <td colspan=\"2\">\r\n");
      out.write("                        <input type=\"checkbox\" name=\"interest\" id=\"sports\" value=\"운동\">\r\n");
      out.write("                        <label for=\"sports\">운동</label>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"checkbox\" name=\"interest\" id=\"hiking\" value=\"등산\">\r\n");
      out.write("                        <label for=\"hiking\">등산</label>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"checkbox\" name=\"interest\" id=\"fishing\" value=\"낚시\">\r\n");
      out.write("                        <label for=\"fishing\">낚시</label>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <input type=\"checkbox\" name=\"interest\" id=\"cooking\" value=\"요리\">\r\n");
      out.write("                        <label for=\"cooking\">요리</label>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"checkbox\" name=\"interest\" id=\"game\" value=\"게임\">\r\n");
      out.write("                        <label for=\"game\">게임</label>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"checkbox\" name=\"interest\" id=\"movie\" value=\"영화\">\r\n");
      out.write("                        <label for=\"movie\">영화</label>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("            <br><br>\r\n");
      out.write("\r\n");
      out.write("            <div align=\"center\">\r\n");
      out.write("                <button type=\"submit\">회원가입</button>\r\n");
      out.write("                <button type=\"reset\">초기화</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
