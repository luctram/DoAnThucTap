package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>MAKEFRIEND SOCIAL NETWORK</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\" />\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css.css\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-2 catogory\">\n");
      out.write("                      \n");
      out.write("                            <div class=\"row\">\n");
      out.write("                              \n");
      out.write("                                     <a href=\"UserPage.jsp\" class=\"btn btn-default btn-xs\"><img src=\"img/tram.jpg\" alt=\"Alternate Text\" class=\"img-responsive\" width=\"190px\" height=\"180px\" />\n");
      out.write("                                    Trâm Lục</a>\n");
      out.write("                                \n");
      out.write("                       \n");
      out.write("                        </div>\n");
      out.write("         \n");
      out.write("                        <hr>\n");
      out.write("                        <p>\n");
      out.write("                            Nhóm\n");
      out.write("                        </p>\n");
      out.write("                        <hr>\n");
      out.write("                        <p>\n");
      out.write("                           Game\n");
      out.write("                        </p>\n");
      out.write("                        <a href=\"rungame/index.html\"><img src=\"img/Flappybird-icon.png\" width=\"30px\" height=\"30px\"></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-8 content\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">Panel Heading</div>\n");
      out.write("                            <div class=\"panel-body\">Panel Content</div>\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                <p>\n");
      out.write("                                    <img src=\"/open-iconic/svg/comment-square.svg\">\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">Panel Heading</div>\n");
      out.write("                            <div class=\"panel-body\">Panel Content</div>\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                <p>\n");
      out.write("                                    <img src=\"/open-iconic/svg/comment-square.svg\">\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">Panel Heading</div>\n");
      out.write("                            <div class=\"panel-body\">Panel Content</div>\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                <p>\n");
      out.write("                                    <img src=\"/open-iconic/svg/comment-square.svg\">\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"member_list\">\n");
      out.write("                                <ul class=\"list-unstyled\">\n");
      out.write("                                    <li class=\"left clearfix\">\n");
      out.write("                                        <span class=\"chat-img pull-left\">\n");
      out.write("                                            <img src=\"img/tram.jpg\" alt=\"User Avatar\" class=\"img-circle\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <div class=\"chat-body clearfix\">\n");
      out.write("                                            <div class=\"header_sec\">\n");
      out.write("                                                <strong class=\"primary-font\">Tram Luc</strong> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"left clearfix\">\n");
      out.write("                                        <span class=\"chat-img pull-left\">\n");
      out.write("                                            <img src=\"img/fulllogo.jpg\" alt=\"User Avatar\" class=\"img-circle\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <div class=\"chat-body clearfix\">\n");
      out.write("                                            <div class=\"header_sec\">\n");
      out.write("                                                <strong class=\"primary-font\">Bao Cuong</strong> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"left clearfix\">\n");
      out.write("                                        <span class=\"chat-img pull-left\">\n");
      out.write("                                            <img src=\"img/logo.jpg\" alt=\"User Avatar\" class=\"img-circle\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <div class=\"chat-body clearfix\">\n");
      out.write("                                            <div class=\"header_sec\">\n");
      out.write("                                                <strong class=\"primary-font\">Tram tram</strong> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div> <!--/main-->\n");
      out.write("     \n");
      out.write("    </main><!-- /.container -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
