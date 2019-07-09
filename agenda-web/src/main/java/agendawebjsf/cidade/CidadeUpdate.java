package agendawebjsf.cidade;

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
	
	public String update()  {
		 try { 
		  business.update(cidade);
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", e.getLocalizedMessage()));
			  return null;
		}
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "-", "Cidade actualizada com sucesso."));
		 return "read?faces-redirect=true";
	}
}
