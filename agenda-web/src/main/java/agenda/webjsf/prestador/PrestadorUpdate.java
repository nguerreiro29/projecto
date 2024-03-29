package agenda.webjsf.prestador;

import java.util.Collection;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.ICidadeBUSINESS;
import agenda.business.IPrestadorBUSINESS;
import agenda.business.ITipoBUSINESS;
import agenda.entity.Cidade;
import agenda.entity.PrestadorServico;
import agenda.entity.Telefone;
import agenda.entity.TipoServico;
import agenda.enums.TipoLogradouro;

@Component
@ManagedBean(name = "prestadorUpdate")
@RequestScope
public class PrestadorUpdate {
	@Autowired
	private IPrestadorBUSINESS business;
	
	@Autowired
	private ICidadeBUSINESS businesscidade;
	
	@Autowired
	private ITipoBUSINESS businesstipo;
	
	private PrestadorServico prestador = new PrestadorServico();
	
	private Telefone telefone = new Telefone();

	public Collection<Cidade> getcidades(){
		return businesscidade.read();
	}
	
	public Collection<TipoServico> gettipos(){
		return businesstipo.read();
	}
	
	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
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
	
	public TipoLogradouro[] getTiposLogradouros()
	{ 
		 return TipoLogradouro.values();
	}
	
	public String update()  {
		 try { 
		  business.update(prestador);
		}
		  catch (Exception e){
			  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Aten��o:", e.getLocalizedMessage()));
			  return null;
		}
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " ", "Prestador actualizado com sucesso."));
		 return "read";
	}
}