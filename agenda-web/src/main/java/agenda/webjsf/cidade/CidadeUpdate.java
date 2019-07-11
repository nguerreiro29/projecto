package agenda.webjsf.cidade;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.ICidadeBUSINESS;
import agenda.entity.Cidade;

@Component
@ManagedBean(name = "cidadeUpdate")
//@RequestScope
public class CidadeUpdate {
	@Autowired
	private ICidadeBUSINESS business;
	
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
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Cidade actualizada com sucesso."));
		 return "read";
	}
}
