/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-09-21 02:46:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.masterPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class client_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1600655631225L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdec_005ftitle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdec_005fbody_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdec_005ftitle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdec_005fbody_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdec_005ftitle_005fnobody.release();
    _005fjspx_005ftagPool_005fdec_005fbody_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=uft-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>");
      if (_jspx_meth_dec_005ftitle_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<script>\r\n");
      out.write("\taddEventListener(\"load\", function() {\r\n");
      out.write("\t\tsetTimeout(hideURLbar, 0);\r\n");
      out.write("\t}, false);\r\n");
      out.write("\r\n");
      out.write("\tfunction hideURLbar() {\r\n");
      out.write("\t\twindow.scrollTo(0, 1);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/template/client/css/bootstrap.css\"\r\n");
      out.write("\trel='stylesheet' type='text/css' />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/template/client/css/jquery.desoslide.css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/template/client/css/style.css\"\r\n");
      out.write("\trel='stylesheet' type='text/css' />\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/template/client/css/fontawesome-all.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<!--Header-->\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div class=\"top-bar_sub_w3layouts container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 logo text-left\">\r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand\" href=\"index.html\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fab fa-linode\"></i> Weblog</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 top-forms text-center mt-lg-3 mt-md-1 mt-0\">\r\n");
      out.write("\t\t\t\t\t<span>Welcome Back!</span>\r\n");
      out.write("\t\t\t\t\t<span class=\"mx-lg-4 mx-md-2  mx-1\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/login\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-lock\"></i> Sign In</a>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"register.html\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"far fa-user\"></i> Register</a>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 log-icons text-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"social_list1 mt-3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"facebook1 mx-2\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"twitter2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fab fa-twitter\"></i>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dribble3 mx-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fab fa-dribbble\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"pin\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fab fa-pinterest-p\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"header_top\" id=\"home\">\r\n");
      out.write("\t\t\t\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("\t\t\t\t\t<button class=\"navbar-toggler navbar-toggler-right mx-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t\t   </button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"#\">Home\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">(current)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"about.html\">About</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\t    aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tFeatures\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"blog1.html\">Standard Blog</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"blog2.html\">2 Column Blog</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"blog3.html\">3 Column Blog</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"contact.html\">Contact</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" method=\"post\" class=\"form-inline my-2 my-lg-0 header-search\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search here...\" name=\"Search\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn1 my-2 my-sm-0\" type=\"submit\"><i class=\"fas fa-search\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!--//header-->\r\n");
      out.write("\t<!-- Main -->\r\n");
      out.write("\t");
      if (_jspx_meth_dec_005fbody_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<!--  -->\r\n");
      out.write("\t<!--footer-->\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 footer-grid-agileits-w3ls text-left\">\r\n");
      out.write("\t\t\t\t\t<h3>About US</h3>\r\n");
      out.write("\t\t\t\t\t<p>Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. lacinia eget consectetur sed, convallis at tellus..</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"read\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"single.html\" class=\"btn btn-primary read-m\">Read More</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 footer-grid-agileits-w3ls text-left\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"tech-btm\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Latest Posts</h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-grids row mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-5 blog-grid-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/4.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-7 blog-grid-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.html\">Pellentesque dui, non felis. Maecenas male non felis </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sub-meta\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"far fa-clock\"></i> 20 Jan, 2018</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-grids row mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-5 blog-grid-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/5.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-7 blog-grid-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.html\">Pellentesque dui, non felis. Maecenas male non felis </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sub-meta\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"far fa-clock\"></i> 20 Jan, 2018</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-grids row mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-5 blog-grid-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/6.jpg\" class=\"img-fluid\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-7 blog-grid-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"single.html\">Pellentesque dui, non felis. Maecenas male non felis </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sub-meta\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"far fa-clock\"></i> 20 Jan, 2018</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- subscribe -->\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 subscribe-main footer-grid-agileits-w3ls text-left\">\r\n");
      out.write("\t\t\t\t\t<h2>Signup to our newsletter</h2>\r\n");
      out.write("\t\t\t\t\t<div class=\"subscribe-main text-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"subscribe-form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\" class=\"subscribe_form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"email\" placeholder=\"Enter your email...\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary submit\">Submit</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t\t   </div>\r\n");
      out.write("\t\t\t\t\t\t<p>We respect your privacy.No spam ever!</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- //subscribe -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- footer -->\r\n");
      out.write("\t\t\t<div class=\"footer-cpy text-center\">\r\n");
      out.write("\t\t\t\t<div class=\"footer-social\">\r\n");
      out.write("\t\t\t\t\t<div class=\"copyrighttop\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"mx-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"facebook\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Facebook</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"facebook\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-twitter\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Twitter</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"mx-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"facebook\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-google-plus-g\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Google+</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"facebook\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fab fa-pinterest-p\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Pinterest</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"w3layouts-agile-copyrightbottom\">\r\n");
      out.write("\t\t\t\t\t<p>© 2018 Weblog. All Rights Reserved | Design by\r\n");
      out.write("\t\t\t\t\t\t<a href=\"http://w3layouts.com/\">W3layouts</a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- //footer -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!---->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- js -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/template/client/js/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("\t<!-- //js -->\r\n");
      out.write("\t<!-- desoslide-JavaScript -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/template/client/js/jquery.desoslide.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$('#demo1_thumbs').desoSlide({\r\n");
      out.write("\t\t\tmain: {\r\n");
      out.write("\t\t\t\tcontainer: '#demo1_main_image',\r\n");
      out.write("\t\t\t\tcssClass: 'img-responsive'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\teffect: 'sideFade',\r\n");
      out.write("\t\t\tcaption: true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- requried-jsfiles-for owl -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(window).load(function () {\r\n");
      out.write("\t\t\t$(\"#flexiselDemo1\").flexisel({\r\n");
      out.write("\t\t\t\tvisibleItems: 3,\r\n");
      out.write("\t\t\t\tanimationSpeed: 1000,\r\n");
      out.write("\t\t\t\tautoPlay: true,\r\n");
      out.write("\t\t\t\tautoPlaySpeed: 3000,\r\n");
      out.write("\t\t\t\tpauseOnHover: true,\r\n");
      out.write("\t\t\t\tenableResponsiveBreakpoints: true,\r\n");
      out.write("\t\t\t\tresponsiveBreakpoints: {\r\n");
      out.write("\t\t\t\t\tportrait: {\r\n");
      out.write("\t\t\t\t\t\tchangePoint: 480,\r\n");
      out.write("\t\t\t\t\t\tvisibleItems: 1\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tlandscape: {\r\n");
      out.write("\t\t\t\t\t\tchangePoint: 640,\r\n");
      out.write("\t\t\t\t\t\tvisibleItems: 2\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\ttablet: {\r\n");
      out.write("\t\t\t\t\t\tchangePoint: 768,\r\n");
      out.write("\t\t\t\t\t\tvisibleItems: 3\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(window).load(function () {\r\n");
      out.write("\t\t\t$(\"#flexiselDemo2\").flexisel({\r\n");
      out.write("\t\t\t\tvisibleItems: 3,\r\n");
      out.write("\t\t\t\tanimationSpeed: 1000,\r\n");
      out.write("\t\t\t\tautoPlay: true,\r\n");
      out.write("\t\t\t\tautoPlaySpeed: 3000,\r\n");
      out.write("\t\t\t\tpauseOnHover: true,\r\n");
      out.write("\t\t\t\tenableResponsiveBreakpoints: true,\r\n");
      out.write("\t\t\t\tresponsiveBreakpoints: {\r\n");
      out.write("\t\t\t\t\tportrait: {\r\n");
      out.write("\t\t\t\t\t\tchangePoint: 480,\r\n");
      out.write("\t\t\t\t\t\tvisibleItems: 1\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tlandscape: {\r\n");
      out.write("\t\t\t\t\t\tchangePoint: 640,\r\n");
      out.write("\t\t\t\t\t\tvisibleItems: 2\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\ttablet: {\r\n");
      out.write("\t\t\t\t\t\tchangePoint: 768,\r\n");
      out.write("\t\t\t\t\t\tvisibleItems: 3\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/template/client/js/jquery.flexisel.js\"></script>\r\n");
      out.write("\t<!-- //password-script -->\r\n");
      out.write("\t<!--/ start-smoth-scrolling -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/template/client/js/move-top.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/template/client/js/easing.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tjQuery(document).ready(function ($) {\r\n");
      out.write("\t\t\t$(\".scroll\").click(function (event) {\r\n");
      out.write("\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t$('html,body').animate({\r\n");
      out.write("\t\t\t\t\tscrollTop: $(this.hash).offset().top\r\n");
      out.write("\t\t\t\t}, 900);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!--// end-smoth-scrolling -->\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function () {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar defaults = {\r\n");
      out.write("\t\t\t\t\t\t\t  \t\t\tcontainerID: 'toTop', // fading element id\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tscrollSpeed: 1200,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\teasingType: 'linear' \r\n");
      out.write("\t\t\t\t\t\t\t \t\t};\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t$().UItoTop({\r\n");
      out.write("\t\t\t\teasingType: 'easeOutQuart'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<a href=\"#home\" class=\"scroll\" id=\"toTop\" style=\"display: block;\">\r\n");
      out.write("\t\t<span id=\"toTopHover\" style=\"opacity: 1;\"> </span>\r\n");
      out.write("\t</a>\r\n");
      out.write("\r\n");
      out.write("\t<!-- //Custom-JavaScript-File-Links -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/template/client/js/bootstrap.js\"></script>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_dec_005ftitle_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  dec:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_dec_005ftitle_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _005fjspx_005ftagPool_005fdec_005ftitle_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_dec_005ftitle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_dec_005ftitle_005f0.setParent(null);
    int _jspx_eval_dec_005ftitle_005f0 = _jspx_th_dec_005ftitle_005f0.doStartTag();
    if (_jspx_th_dec_005ftitle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdec_005ftitle_005fnobody.reuse(_jspx_th_dec_005ftitle_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdec_005ftitle_005fnobody.reuse(_jspx_th_dec_005ftitle_005f0);
    return false;
  }

  private boolean _jspx_meth_dec_005fbody_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  dec:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_dec_005fbody_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _005fjspx_005ftagPool_005fdec_005fbody_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_dec_005fbody_005f0.setPageContext(_jspx_page_context);
    _jspx_th_dec_005fbody_005f0.setParent(null);
    int _jspx_eval_dec_005fbody_005f0 = _jspx_th_dec_005fbody_005f0.doStartTag();
    if (_jspx_th_dec_005fbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdec_005fbody_005fnobody.reuse(_jspx_th_dec_005fbody_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdec_005fbody_005fnobody.reuse(_jspx_th_dec_005fbody_005f0);
    return false;
  }
}