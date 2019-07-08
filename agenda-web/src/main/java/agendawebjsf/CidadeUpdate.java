package agendawebjsf;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;

import agendabusiness.BusinessException;
import agendabusiness.ICidadeBUSINESS;
import entity.Cidade;
import impl.CidadeBUSINESS;

@ManagedBean(name = "cidadeUpdate")
public class CidadeUpdate {
	private ICidadeBUSINESS business = new CidadeBUSINESS();
	
	private Cidade cidade = new Cidade();

	public Cidade getCidade() {
		return cidade;
	}
	
	public void setCidade(Cidade cidade) {
		this.cidade=cidade;
	}
	
	public String edit(Cidade cidade) {
		this.cidade = cidade;
		
		return "updateform"; 
		  
	}
	
	public String update() /*throws ServletException*/ {
		 try { 
		  business.update(cidade);
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Atenção:", e.getLocalizedMessage()));
			  return null;
		}
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "-", "Actualizado com sucesso."));
		 return "read";
	}
}
