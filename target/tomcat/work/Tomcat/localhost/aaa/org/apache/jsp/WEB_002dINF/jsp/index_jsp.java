/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2019-07-10 00:39:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("   /*     $(function () {\r\n");
      out.write("\r\n");
      out.write("            //发送ajax请求，加载所有省份数据\r\n");
      out.write("            $.get(\"provinceServlet\",{},function (data) {\r\n");
      out.write("                //[{\"id\":1,\"name\":\"北京\"},{\"id\":2,\"name\":\"上海\"},{\"id\":3,\"name\":\"广州\"},{\"id\":4,\"name\":\"陕西\"}]\r\n");
      out.write("\r\n");
      out.write("                //1.获取select\r\n");
      out.write("                var province = $(\"#province\");\r\n");
      out.write("                //2.遍历json数组\r\n");
      out.write("                $(data).each(function () {\r\n");
      out.write("                    //3.创建<option>\r\n");
      out.write("                    var option = \"<option name='\"+this.id+\"'>\"+this.name+\"</option>\";\r\n");
      out.write("\r\n");
      out.write("                    //4.调用select的append追加option\r\n");
      out.write("                    province.append(option);\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        });*/\r\n");
      out.write("    function selectS() {\r\n");
      out.write("        alert(\"++\")\r\n");
      out.write("        //发送ajax请求，加载所有省份数据\r\n");
      out.write("        $.get(\"provinceServlet\",{},function (data) {\r\n");
      out.write("            //[{\"id\":1,\"name\":\"北京\"},{\"id\":2,\"name\":\"上海\"},{\"id\":3,\"name\":\"广州\"},{\"id\":4,\"name\":\"陕西\"}]\r\n");
      out.write("\r\n");
      out.write("            //1.获取select\r\n");
      out.write("            var province = $(\"#province\");\r\n");
      out.write("            //2.遍历json数组\r\n");
      out.write("            $(data).each(function () {\r\n");
      out.write("                //3.创建<option>\r\n");
      out.write("                var option = \"<option name='\"+this.id+\"'>\"+this.name+\"</option>\";\r\n");
      out.write("\r\n");
      out.write("                //4.调用select的append追加option\r\n");
      out.write("                province.append(option);\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<select id=\"province\" onchange=\"selectS()\">\r\n");
      out.write("    <option id=\"option01\">--请选择省份--</option>\r\n");
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
