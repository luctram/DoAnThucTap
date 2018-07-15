package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.User;

public final class UserPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            ");

            User user= new User();
            user.setName("Trâm Lục");
        
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"fb-profile\">\n");
      out.write("                    <img align=\"left\" class=\"profile-img thumbnail\" src=\"img/tram.jpg\" alt=\"Profile image example\"/>\n");
      out.write("                    <div class=\"profile-name\">\n");
      out.write("                        <h1>");
      out.print(user.getName());
      out.write("\n");
      out.write("                            ");
 if(!user.getOtherName().equals("")) // Kiem tra user có dùng othername ko
                                
      out.write("&nbsp;(");
      out.print(user.getOtherName());
      out.write(")\n");
      out.write("                            \n");
      out.write("                            </h1>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"describeNhobby\">\n");
      out.write("                        <div data-spy=\"scroll\" class=\"tabbable-panel\">\n");
      out.write("                            ");
      out.print(user.getDescribe());
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- /container fluid-->  \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <div data-spy=\"scroll\" class=\"tabbable-panel\">\n");
      out.write("                    <div class=\"tabbable-line\">\n");
      out.write("                        <ul class=\"nav nav-tabs \">\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <a href=\"#tab_default_1\" data-toggle=\"tab\">\n");
      out.write("                                    Bài đăng</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#tab_default_2\" data-toggle=\"tab\">\n");
      out.write("                                    Tạo bài đăng mới</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#tab_default_3\" data-toggle=\"tab\">\n");
      out.write("                                    Bạn bè</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#tab_default_4\" data-toggle=\"tab\">\n");
      out.write("                                    Ảnh & video</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"tab-content\">\n");
      out.write("                            <div class=\"tab-pane active\" id=\"tab_default_1\">\n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">Panel Heading</div>\n");
      out.write("                                    <div class=\"panel-body\">Panel Content</div>\n");
      out.write("                                    <div class=\"panel-footer\">\n");
      out.write("                                        <p>\n");
      out.write("                                            <img src=\"/open-iconic/svg/comment-square.svg\">\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">Panel Heading</div>\n");
      out.write("                                    <div class=\"panel-body\">Panel Content</div>\n");
      out.write("                                    <div class=\"panel-footer\">\n");
      out.write("                                        <p>\n");
      out.write("                                            <img src=\"/open-iconic/svg/comment-square.svg\">\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">Panel Heading</div>\n");
      out.write("                                    <div class=\"panel-body\">Panel Content</div>\n");
      out.write("                                    <div class=\"panel-footer\">\n");
      out.write("                                        <p>\n");
      out.write("                                            <img src=\"/open-iconic/svg/comment-square.svg\">\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tab-pane\" id=\"tab_default_2\">\n");
      out.write("                                <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">Panel Heading</div>\n");
      out.write("                                    <div class=\"panel-body\">Panel Content</div>\n");
      out.write("                                    <div class=\"panel-footer\">\n");
      out.write("                                        <p>\n");
      out.write("                                            <img src=\"/open-iconic/svg/comment-square.svg\">\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tab-pane\" id=\"tab_default_3\">\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"member_list\">\n");
      out.write("                                        <ul class=\"list-unstyled\">\n");
      out.write("                                            <div class=\"col-sm-4\">\n");
      out.write("                                                <li class=\"left clearfix\">\n");
      out.write("                                                    <span class=\"chat-img pull-left\">\n");
      out.write("                                                        <img src=\"img/tram.jpg\" alt=\"User Avatar\" class=\"img-circle\">\n");
      out.write("                                                    </span>\n");
      out.write("                                                    <div class=\"chat-body clearfix\">\n");
      out.write("                                                        <div class=\"header_sec\">\n");
      out.write("                                                            <strong class=\"primary-font\">Tram Luc</strong> \n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <span class=\"pull-right\">Hủy kêt bạn icon</span>\n");
      out.write("                                                </li>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-4\">\n");
      out.write("                                                <li class=\"left clearfix\">\n");
      out.write("                                                    <span class=\"chat-img pull-left\">\n");
      out.write("                                                        <img src=\"img/fulllogo.jpg\" alt=\"User Avatar\" class=\"img-circle\">\n");
      out.write("                                                    </span>\n");
      out.write("                                                    <div class=\"chat-body clearfix\">\n");
      out.write("                                                        <div class=\"header_sec\">\n");
      out.write("                                                            <strong class=\"primary-font\">Bao Cuong</strong> \n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </li>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-4\">\n");
      out.write("                                                <li class=\"left clearfix\">\n");
      out.write("                                                    <span class=\"chat-img pull-left\">\n");
      out.write("                                                        <img src=\"img/logo.jpg\" alt=\"User Avatar\" class=\"img-circle\">\n");
      out.write("                                                    </span>\n");
      out.write("                                                    <div class=\"chat-body clearfix\">\n");
      out.write("                                                        <div class=\"header_sec\">\n");
      out.write("                                                            <strong class=\"primary-font\">Tram tram</strong> \n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </li>\n");
      out.write("                                            </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                      \n");
      out.write("                        <div class=\"tab-pane\" id=\"tab_default_4\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                            <div class=\"gallery\">\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <img src=\"img/fulllogo.jpg\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <img src=\"img/fulllogo.jpg\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-3\">\n");
      out.write("                                    <img src=\"img/fulllogo.jpg\" alt=\"\"><img src=\"img/fulllogo.jpg\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"col-sm-3\">\n");
      out.write("                                    <img src=\"img/fulllogo.jpg\" alt=\"\"><img src=\"img/fulllogo.jpg\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            </div>\n");
      out.write("                            </div>\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"menu_title\">\n");
      out.write("                    THÔNG TIN CÁ NHÂN\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <i class=\"fa fa-birthday-cake\"></i>&nbsp;<label for=\"email\">Sinh nhật&nbsp;</label>");
      out.print(user.getBDay());
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <i class=\"fa fa-map-marker\"></i>&nbsp; <label for=\"email\">Đến từ&nbsp;</label>");
      out.print(user.getHometown());
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <i class=\"fa fa-home\"></i>&nbsp;<label for=\"email\">Sống tại&nbsp;</label>");
      out.print(user.getAddress());
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <i class=\"fa fa-phone\"></i> &nbsp; <label for=\"email\">Số điện thoại&nbsp;</label>");
      out.print(user.getPhone());
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <i class=\"fa fa-envelope\"></i> &nbsp;   <label for=\"email\">Email&nbsp;</label>");
      out.print(user.getEmail());
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <i class=\"fa fa-envelope\"></i> &nbsp;   <label for=\"email\">Sở thích&nbsp;</label>");
      out.print(user.getHobby());
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
