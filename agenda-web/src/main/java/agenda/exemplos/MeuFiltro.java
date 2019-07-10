package agenda.exemplos;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "MeuFiltro", urlPatterns = "/*")

public class MeuFiltro implements Filter{

	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//long tempoI = System.currentTimeMillis();
		//chain.doFilter(request, response);
		//long tempoF = System.currentTimeMillis();
		//String uri = ((HttpServletRequest) request).getRequestURI();
		//String nome = ((HttpServletRequest) request).getParameter("nome");
		//request.getParameterMap().forEach(key, value);
		 
			
		
		
		
		Map<String, String[]> array = request.getParameterMap();
		for(Map.Entry<String, String[]> entry : array.entrySet())
		{
			String uri = ((HttpServletRequest) request).getRequestURI();
			System.out.println(entry.getKey()+"," + Arrays.toString(entry.getValue()));
			System.out.println(uri);
		}
		
		array.forEach((k,v)->System.out.println(k + "," + Arrays.toString(v)));
		
		
		
		
		
		
		
		
		//String nome = ((HttpServletRequest) request).getParameter("codigo");
		
		/*
		 * System.out.println("Tempo da requisicao de " + uri + "demorou (ms):" +
		 * (tempoF - tempoI));
		 */
		
		
		
		
		
		chain.doFilter(request, response);
	}

	public void destroy() {
		
	}
	
}
