package agenda.webjsf.telefone;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;

import agenda.business.BusinessException;
import agenda.business.ICidadeBUSINESS;
import agenda.entity.Cidade;
import agenda.entity.Telefone;
import agenda.impl.CidadeBUSINESS;

@ManagedBean(name = "telefoneUpdate")
public class TelefoneUpdate {
	//private ICidadeBUSINESS business = new CidadeBUSINESS();
	
	private Telefone telefone = new Telefone();

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	public String edit(Telefone telefone) {
		this.telefone = telefone;
		
		return "updateform"; 
		  
	}
	
	public String update()  {
		 try { 
		  //business.update(cidade);
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", e.getLocalizedMessage()));
			  return null;
		}
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Telefone actualizado com sucesso."));
		 return "read";
	}
}
