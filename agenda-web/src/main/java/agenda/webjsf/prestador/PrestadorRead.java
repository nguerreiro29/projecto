package agenda.webjsf.prestador;

import java.util.Collection;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import agenda.business.ICidadeBUSINESS;
import agenda.entity.Cidade;
import agenda.entity.PrestadorServico;
import agenda.impl.CidadeBUSINESS;

//@Component	
@ManagedBean(name = "prestadorRead")
public class PrestadorRead {
	//@Autowired
	private ICidadeBUSINESS business  = new CidadeBUSINESS();
	
	private Collection<PrestadorServico> prestadores = null; // se colocasse o business.read() nao criava o objecto caso desse erro
	
	@PostConstruct
	public void init() {
		//this.prestadores = business.read();
	}
	
	public Collection<PrestadorServico> getPrestadores(){
		return prestadores;
	}
	
	public void setPrestadores(Collection<PrestadorServico> prestadores) {
		this.prestadores = prestadores;
	}
}
