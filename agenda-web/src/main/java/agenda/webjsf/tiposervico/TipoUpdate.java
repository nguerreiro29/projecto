package agenda.webjsf.tiposervico;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.BusinessException;
import agenda.business.ICidadeBUSINESS;
import agenda.entity.Cidade;
import agenda.entity.TipoServico;
import agenda.impl.CidadeBUSINESS;

@Component
@ManagedBean(name = "tipoUpdate")
@RequestScope
public class TipoUpdate {
	@Autowired
	//private ICidadeBUSINESS business;
	
	private TipoServico tipo = new TipoServico();
	
	
	public TipoServico getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoServico tipo) {
		this.tipo=tipo;
	}
	
	public String edit(TipoServico tipo) {
		this.tipo = tipo;
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
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Tipo de serviço actualizado com sucesso."));
		 return "read";
	}
}
