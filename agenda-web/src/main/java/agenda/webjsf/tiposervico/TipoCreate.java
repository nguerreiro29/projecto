package agenda.webjsf.tiposervico;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.BusinessException;
import agenda.business.ICidadeBUSINESS;
import agenda.business.ITipoBUSINESS;
import agenda.entity.Cidade;
import agenda.entity.TipoServico;
import agenda.impl.CidadeBUSINESS;

@Component
@ManagedBean(name = "tipoCreate")
@RequestScope
public class TipoCreate {
	
	@Autowired
	private ITipoBUSINESS business;
	
	private TipoServico tipo = new TipoServico();
	
	public TipoServico getTipo() {
		return tipo;
	}

	public void setTipo(TipoServico tipo) {
		this.tipo = tipo;
	}

	public String create() {
		 try { 
		  business.create(tipo);
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção:", e.getLocalizedMessage()));
			  return null;
		}
		 
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Tipo de Serviço inserido com sucesso."));
		 return "read";
	}
	
	public String limpar() {
		this.tipo = new TipoServico();
		return null; 
	}
	
}
