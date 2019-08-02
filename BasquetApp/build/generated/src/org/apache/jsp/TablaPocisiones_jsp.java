package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TablaPocisiones_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html amp lang=\"es\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <script async src=\"https://cdn.ampproject.org/v0.js\"></script>\n");
      out.write("\n");
      out.write("    <title>Pasion por el Basquet</title>\n");
      out.write("    <link rel=\"canonical\" href=\"http://example.ampproject.org/article-metadata.html\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,minimum-scale=1,initial-scale=1\">\n");
      out.write("    <script type=\"application/ld+json\">\n");
      out.write("      {\n");
      out.write("        \"@context\": \"http://schema.org\",\n");
      out.write("        \"@type\": \"NewsArticle\",\n");
      out.write("        \"headline\": \"Open-source framework for publishing content\",\n");
      out.write("        \"datePublished\": \"2018-04-05T18:26:41Z\",\n");
      out.write("        \"image\": [\n");
      out.write("          \"logo.jpg\"\n");
      out.write("        ]\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("    <style amp-boilerplate>\n");
      out.write("        body {\n");
      out.write("            -webkit-animation: -amp-start 8s steps(1, end) 0s 1 normal both;\n");
      out.write("            -moz-animation: -amp-start 8s steps(1, end) 0s 1 normal both;\n");
      out.write("            -ms-animation: -amp-start 8s steps(1, end) 0s 1 normal both;\n");
      out.write("            animation: -amp-start 8s steps(1, end) 0s 1 normal both\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @-webkit-keyframes -amp-start {\n");
      out.write("            from {\n");
      out.write("                visibility: hidden\n");
      out.write("            }\n");
      out.write("            to {\n");
      out.write("                visibility: visible\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @-moz-keyframes -amp-start {\n");
      out.write("            from {\n");
      out.write("                visibility: hidden\n");
      out.write("            }\n");
      out.write("            to {\n");
      out.write("                visibility: visible\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @-ms-keyframes -amp-start {\n");
      out.write("            from {\n");
      out.write("                visibility: hidden\n");
      out.write("            }\n");
      out.write("            to {\n");
      out.write("                visibility: visible\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @-o-keyframes -amp-start {\n");
      out.write("            from {\n");
      out.write("                visibility: hidden\n");
      out.write("            }\n");
      out.write("            to {\n");
      out.write("                visibility: visible\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes -amp-start {\n");
      out.write("            from {\n");
      out.write("                visibility: hidden\n");
      out.write("            }\n");
      out.write("            to {\n");
      out.write("                visibility: visible\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <noscript>\n");
      out.write("        <style amp-boilerplate>\n");
      out.write("            body {\n");
      out.write("                -webkit-animation: none;\n");
      out.write("                -moz-animation: none;\n");
      out.write("                -ms-animation: none;\n");
      out.write("                animation: none\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </noscript>\n");
      out.write("\n");
      out.write("    <style amp-custom>\n");
      out.write("        /* Cualquier estilo personalizado va aquí */\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            background-color: white;\n");
      out.write("            height: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            font-family: Helvetica;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            height: 100%;\n");
      out.write("            background-color: black;\n");
      out.write("            padding: 3px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: oldlace;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h3 {\n");
      out.write("            background-color: black;\n");
      out.write("            text-align: center;\n");
      out.write("            color: white;\n");
      out.write("            padding: 3px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            padding: 4px 25px;\n");
      out.write("            background: rgb(245, 29, 29);\n");
      out.write("\n");
      out.write("            color: #fff;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            text-decoration: none;\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        div {\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 0px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 100%;\n");
      out.write("            margin: 0px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th,\n");
      out.write("        td {\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 2px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #f2f2f2\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .tabla {\n");
      out.write("            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <h1>Puntajes</h1>\n");
      out.write("\n");
      out.write("    <div class=\"tabla\">\n");
      out.write("        <h3>Tabla de posiciones</h3>\n");
      out.write("        <br>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td>Equipo</td>\n");
      out.write("                <td>J</td>\n");
      out.write("                <td>G</td>\n");
      out.write("\n");
      out.write("                <td>P</td>\n");
      out.write("                <td>Pts</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>1º</td>\n");
      out.write("                <td>\n");
      out.write("                    <amp-img src=\"./Imagenes/NG.png\" alt=\"Imagen Torneo Prospero Palazzo\" height=\"40\" width=\"40\" layout=\"\"></amp-img>\n");
      out.write("                    </amp-img>\n");
      out.write("                </td>\n");
      out.write("                <td>0</td>\n");
      out.write("                <td>0</td>\n");
      out.write("                <td>0</td>\n");
      out.write("\n");
      out.write("                <td>0</td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div>\n");
      out.write("        <a href=\"index.html\">Pagina Principal</a>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
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
