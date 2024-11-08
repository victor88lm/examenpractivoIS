package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexFM_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Venta de Productos - Apellido SA de CV</title>\n");
      out.write("    <!-- Bootstrap CSS para el diseño responsivo -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"container\">\n");
      out.write("    <h1 class=\"mt-5\">Registro de Venta</h1>\n");
      out.write("    <form action=\"result.jsp\" method=\"post\" class=\"form-group\">\n");
      out.write("        <!-- Campo para el nombre del producto -->\n");
      out.write("        <label for=\"nombre\">Nombre del Producto:</label>\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"nombre\" name=\"nombre\" required>\n");
      out.write("        \n");
      out.write("        <!-- Campo para el precio del producto -->\n");
      out.write("        <label for=\"precio\">Precio:</label>\n");
      out.write("        <input type=\"number\" step=\"0.01\" class=\"form-control\" id=\"precio\" name=\"precio\" required>\n");
      out.write("        \n");
      out.write("        <!-- Campo para la cantidad -->\n");
      out.write("        <label for=\"cantidad\">Cantidad:</label>\n");
      out.write("        <input type=\"number\" class=\"form-control\" id=\"cantidad\" name=\"cantidad\" required>\n");
      out.write("        \n");
      out.write("        <!-- Botón para enviar el formulario -->\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary mt-3\">Calcular Venta</button>\n");
      out.write("    </form>\n");
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
