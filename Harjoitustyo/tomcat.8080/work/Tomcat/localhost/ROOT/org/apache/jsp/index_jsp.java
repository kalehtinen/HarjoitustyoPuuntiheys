/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.64
 * Generated at: 2021-05-28 14:33:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<!-- Required meta tags -->\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("<!-- Bootstrap CSS -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\n");
      out.write("\tintegrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<title>Harjoitustyö</title>\n");
      out.write("<style>\n");
      out.write("table, th, td {\n");
      out.write("\tborder: 1px solid black;\n");
      out.write("\tborder-collapse: collapse;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<h1>Puun tiheyslaskuri</h1>\n");
      out.write("<table border=\"1\">\n");
      out.write("<form action=\"laske\">\n");
      out.write("  \t<th>\n");
      out.write("   \t\t<td>\n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t\tArvo  \n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("   \t\t</td>\n");
      out.write("\t</th>\n");
      out.write("  \t<tr>\n");
      out.write("   \t\t<td>\n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t\tPaksuus (mm)  \n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t  \t<input type=\"text\"  name=\"paksuus\"\n");
      out.write("  \t\t  \t\n");
      out.write("  \t\t  \t\n");
      out.write("  \t\t  \t\n");
      out.write("  \t\t  \t>\n");
      out.write("   \t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("   \t\t<td>\n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t\tPituus (mm)  \n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t  \t<input type=\"text\"  name=\"pituus\"\n");
      out.write("  \t\t  \t\n");
      out.write("  \t\t  \t\n");
      out.write("  \t\t  \t\n");
      out.write("  \t\t  \t>\n");
      out.write("   \t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("   \t\t<td>\n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t\tLeveys (mm)  \n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t\t<input type=\"text\"  name=\"leveys\"\t\t\t\n");
      out.write("  \t\t  \t\n");
      out.write("  \t\t\t\n");
      out.write("  \t\t\t>\n");
      out.write("   \t\t</td>\n");
      out.write("\t</tr>\t\n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("   \t\t<td>\n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t\tPaino (g)\n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t\t<input type=\"text\"  name=\"paino\"\n");
      out.write("  \t\t\t\n");
      out.write("  \t\t\t\n");
      out.write("  \t\t\t\n");
      out.write("  \t\t\t>\n");
      out.write("   \t\t</td>\n");
      out.write("\t</tr>\t\t\n");
      out.write("\t<tr>\n");
      out.write("   \t\t<td>\n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t\t  \n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t\t<input type=\"submit\"  name=\"action\" value=\"Laske\">\n");
      out.write("  \t\t\t<a href=\"kirjaudu.jsp\">Pro versio</a>\n");
      out.write("  \t\t\t\n");
      out.write("   \t\t</td>\n");
      out.write("\t</tr>\t\n");
      out.write("\t<tr>\n");
      out.write("   \t\t<td>\n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t\tTulos (kg/m3) \n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td> \n");
      out.write("  \t\t\t ");
 out.println(request.getAttribute("tiheys"));  
      out.write(" kg/m3 \n");
      out.write("   \t\t</td>\n");
      out.write("\t</tr>\t\n");
      out.write("\t<tr>\n");
      out.write("   \t\t<td>\n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t\t\n");
      out.write("  \t\t</td>\n");
      out.write("  \t\t<td>\n");
      out.write("  \t\t\t \n");
      out.write("   \t\t</td>\n");
      out.write("\t</tr>\t\n");
      out.write("</form>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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