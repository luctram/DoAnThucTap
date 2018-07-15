package org.apache.jsp.rungame;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class game_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en-us\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("    <title>MAKEFRIEND SOCIAL NETWORK | FlappyBird</title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"TemplateData/favicon.ico\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"TemplateData/style.css\">\n");
      out.write("    <script src=\"TemplateData/UnityProgress.js\"></script>  \n");
      out.write("    <script src=\"Build/UnityLoader.js\"></script>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../menu.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
      out.write("\n");
      out.write("    <script>\n");
      out.write("      var gameInstance = UnityLoader.instantiate(\"gameContainer\", \"Build/New folder.json\", {onProgress: UnityProgress});\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        body{background-color:#fef6ef;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        #gameContainer{\n");
      out.write("            padding-top: 200px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"webgl-content\">\n");
      out.write("      <div id=\"gameContainer\" style=\"width: 1100px; height: 600px\"></div>\n");
      out.write("      <div id=\"logo\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"footer\">\n");
      out.write("        <div class=\"fullscreen\" onclick=\"gameInstance.SetFullscreen(1)\"></div>\n");
      out.write("        <div class=\"title\">FlappyBird</div>\n");
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
