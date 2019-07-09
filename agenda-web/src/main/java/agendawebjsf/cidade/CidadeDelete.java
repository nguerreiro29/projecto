package agendawebjsf.cidade;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import agendabusiness.BusinessException;
import agendabusiness.ICidadeBUSINESS;
import entity.Cidade;
import impl.CidadeBUSINESS;

@ManagedBean(name = "cidadeDelete")
public class CidadeDelete {
	private ICidadeBUSINESS business = new CidadeBUSINESS();
	
	/*
	 * private Cidade cidade = new Cidade();
	 * 
	 * public Cidade getCidade() { return cidade; }
	 * 
	 * public void setCidade(Cidade cidade) { this.cidade=cidade; }
	 */
	
	public String delete(Cidade cidade) { //utilizando o 1 metodo no read tenho que passar parametros
										//caso o segundo tenho que declarar Cidade os metodos get, set e nao e necessario passar parametros
		 try { 
		  business.delete(cidade);
		  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "-", "Cidade apagada com sucesso."));
			
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", "Não foi possivel apagar a cidade."));  
		}
		  return "read?faces-redirect=true"; 
	}
	
	
	
}
