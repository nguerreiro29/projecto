package agendaweb;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agendabusiness.BusinessException;
import agendabusiness.ICidadeBUSINESS;
import entity.Cidade;
import impl.CidadeBUSINESS;

@WebServlet(name = "cidadeupdatecontroller", urlPatterns = "/cidadeupdatecontroller")

public class CidadeUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ICidadeBUSINESS business = new CidadeBUSINESS();
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try 
		{
			Integer codigo = Integer.valueOf(req.getParameter("codigo"));
			String nome = req.getParameter("nome");
		
			Cidade cidade = new Cidade(codigo, nome);
			
			business.update(cidade);
			
			PrintWriter out = resp.getWriter();
			out.println("<html>"); 
			out.println("<body>");
			out.println("Update realizado com sucesso"); 
			out.println("<a href=\"/agenda-web/cidadelist\">Voltar</a>");
			out.println("</body>");
			out.println("</html>"); 
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
	}
}
