package agenda.webjsf.prestador;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.IPrestadorBUSINESS;
import agenda.entity.PrestadorServico;

@Component
@ManagedBean(name = "prestadorUpdate")
@RequestScope
public class PrestadorUpdate {
	@Autowired
	private IPrestadorBUSINESS business;
	
	private PrestadorServico prestador = new PrestadorServico();

	public PrestadorServico getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}
	
	public String edit(PrestadorServico prestador) {
		this.prestador = prestador;
		return "updateform"; 
		  
	}
	
	public String update()  {
		 try { 
		  business.update(prestador);
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", e.getLocalizedMessage()));
			  return null;
		}
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Prestador actualizado com sucesso."));
		 return "read";
	}
}