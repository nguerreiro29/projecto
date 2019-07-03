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

@WebServlet(name = "cidadeformcontroller", urlPatterns = "/cidadeformcontroller")

public class CidadeFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ICidadeBUSINESS business = new CidadeBUSINESS();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try	
		{
			//recuperacao parametros
			String nome = req.getParameter("nome");
			
			//adicionar cidade
			Cidade cidade = new Cidade();
			cidade.setNome(nome);
			
			business.create(cidade);
			
			//imprimir informacao
			PrintWriter out = resp.getWriter();
			out.println("<html>"); 
			out.println("<body>");
			out.println("Inserido com sucesso"); 
			out.println("<a href=\"/agenda-web/cidadelist\">Voltar</a>");
			out.println("</body>");
			out.println("</html>");
		}
		catch(Exception e)
		{
			throw new ServletException(e);
		}
	}
}
	
