package agendawebjsf.cidade;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import agendabusiness.ICidadeBUSINESS;
import entity.Cidade;
import impl.CidadeBUSINESS;

@ManagedBean(name = "cidadeRead")
	
public class CidadeRead {
	private ICidadeBUSINESS business = new CidadeBUSINESS();
	
	private Collection<Cidade> cidades = null; // se colocasse o business.read() nao criava o objecto caso desse erro
	
	@PostConstruct
	public void init() {
		this.cidades = business.read();
	}
	
	public Collection<Cidade> getCidades(){
		return cidades;
	}
	
	public void setCidades(Collection<Cidade> cidades) {
		this.cidades = cidades;
	}
}
