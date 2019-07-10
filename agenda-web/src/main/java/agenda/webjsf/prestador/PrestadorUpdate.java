package agenda.webjsf.prestador;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import agenda.business.BusinessException;
import agenda.business.ICidadeBUSINESS;
import agenda.entity.Cidade;
import agenda.entity.PrestadorServico;
import agenda.impl.CidadeBUSINESS;

//@Component
@ManagedBean(name = "prestadorUpdate")
public class PrestadorUpdate {
	//@Autowired
	private ICidadeBUSINESS business  = new CidadeBUSINESS();
	
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
		  //business.update(cidade);
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", e.getLocalizedMessage()));
			  return null;
		}
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Prestador actualizado com sucesso."));
		 return "read";
	}
}
