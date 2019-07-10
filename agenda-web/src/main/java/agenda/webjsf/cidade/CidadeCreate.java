package agenda.webjsf.cidade;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.BusinessException;
import agenda.business.ICidadeBUSINESS;
import agenda.entity.Cidade;
import agenda.impl.CidadeBUSINESS;

@Component
@ManagedBean(name = "cidadeCreate")
@RequestScope
public class CidadeCreate {
	
	@Autowired
	private ICidadeBUSINESS business;
	
	private Cidade cidade = new Cidade();
	/*
	 * private String nome; private Integer codigo;
	 */

	public Cidade getCidade() {
		return cidade;
	}
	/*
	 * public String getNome() {
	 * 
	 * return nome; }
	 */
	
	public void setCidade(Cidade cidade) {
		this.cidade=cidade;
	}
	
	/*
	 * public void setNome(String nome) {
	 * 
	 * this.nome = nome; }
	 */
	
	/*
	 * public Integer getCodigo() { return codigo; }
	 */

	/*
	 * public void setCodigo(Integer codigo) { this.codigo = codigo; }
	 */
	
	public String create() /*throws BusinessException*/{
		// com throws nao e necessario try catch
		 try { 
		  //Cidade cidade = new Cidade(); 
		  //cidade.setNome(nome);
		  business.create(cidade);
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", e.getLocalizedMessage()));
			  return null;
			  
			 // <h:messages globalOnly="true" warnClass="" infoClass="" errorClass="" fatalClass=""/>
			 // <h:messages for="nome"/>
			  //<h:form prependId="false">
			 // FacesContext.getCurrentInstance().addMessage("nome", new FacesMessage(FacesMessage.SEVERITY_INFO, "Atenção:", e.getLocalizedMessage()));
		}
		 
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Cidade inserida com sucesso."));
		 return "read";
	}
	
	public String limpar() {
		//this.nome = null;
		this.cidade = new Cidade();
		return null; 
	}
	
}
