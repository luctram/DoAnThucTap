package org.apache.jsp.rungame;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class game1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en-us\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\n");
      out.write("    <title>MAKEFRIEND SOCIAL NETWORK | FlappyBird</title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"TemplateData/favicon.ico\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"TemplateData/style.css\">\n");
      out.write("    <script src=\"TemplateData/UnityProgress.js\"></script>  \n");
      out.write("    <script src=\"Build/UnityLoader.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      var gameInstance = UnityLoader.instantiate(\"gameContainer\", \"Build/Flappybird_final.json\", {onProgress: UnityProgress});\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        #gameContainer{\n");
      out.write("           padding: 70px 0px 5px 0px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"../Home.jsp\"><img src=\"../img/logo.png\" width=\"55px\"/></a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"../UserPage.jsp\">Trâm Lục</a></li>\n");
      out.write("                    <li><a href=\"#\">Lời mời kết bạn</a></li>\n");
      out.write("                    <li><a href=\"../mess.jsp\">Tin nhắn</a></li>\n");
      out.write("                    <li><a href=\"#\">Thông báo</a></li>\n");
      out.write("                    <li><a href=\"../Setting.jsp\">Cài đặt</a></li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"FormLogin.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Đăng xuất</a></li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("                <form class=\"navbar-form navbar-right\" action=\"#\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Tìm kiếm\" name=\"search\">\n");
      out.write("                        <div class=\"input-group-btn\">\n");
      out.write("                            <button class=\"btn btn-default\" type=\"submit\">\n");
      out.write("                                <i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            </div><!--/container-fluid-->\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("    <div class=\"webgl-content\">\n");
      out.write("       <div id=\"gameContainer\" style=\"width: 1100px; height: 600px\"></div>\n");
      out.write("      <div class=\"footer\">\n");
      out.write("        <div class=\"webgl-logo\"></div>\n");
      out.write("        <div class=\"fullscreen\" onclick=\"gameInstance.SetFullscreen(1)\"></div>\n");
      out.write("         <div class=\"title\">FlappyBird</div>\n");
      out.write("         <div class=\"container\">\n");
      out.write("                    MakeFriend Social Network  &copy; 2018\n");
      out.write("                </div>  \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
