package agenda.webjsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloJSF")
public class HelloJSF {

	private String mensagem;

	public String getMensagem() {
	  
		return mensagem; 
	}
	 
	public void setMensagem(String mensagem) {

		this.mensagem = mensagem;
	}
	
	public String digaOi() {
		return null;
	}
}
