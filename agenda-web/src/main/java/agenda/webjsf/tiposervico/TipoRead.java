package agenda.webjsf.tiposervico;

import java.util.Collection;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.ICidadeBUSINESS;
import agenda.entity.Cidade;
import agenda.entity.TipoServico;
import agenda.impl.CidadeBUSINESS;

@Component	
@ManagedBean(name = "tipoRead")
@RequestScope
public class TipoRead {
	@Autowired
	//private ICidadeBUSINESS business;
	
	private Collection<TipoServico> tipos = null; // se colocasse o business.read() nao criava o objecto caso desse erro
	
	@PostConstruct
	public void init() {
		//this.cidades = business.read();
	}
	
	public Collection<TipoServico> getTipos(){
		return tipos;
	}
	
	public void setCidades(Collection<TipoServico> tipos) {
		this.tipos = tipos;
	}
}
