package agendawebjsf.telefone;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;

import agendabusiness.BusinessException;
import agendabusiness.ICidadeBUSINESS;
import entity.Cidade;
import entity.Telefone;
import impl.CidadeBUSINESS;

@ManagedBean(name = "cidadeUpdate")
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
