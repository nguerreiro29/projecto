package agenda.webjsf.cidade;

import java.util.Collection;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.ICidadeBUSINESS;
import agenda.entity.Cidade;

@Component	
@ManagedBean(name = "cidadeRead")
@RequestScope
public class CidadeRead {
	@Autowired
	private ICidadeBUSINESS business;
	
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
