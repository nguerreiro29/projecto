package agenda.webjsf.prestador;

import java.util.Collection;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import agenda.business.IPrestadorBUSINESS;
import agenda.entity.PrestadorServico;

@Component	
@ManagedBean(name = "prestadorRead")
@RequestScope
public class PrestadorRead {
	@Autowired
	private IPrestadorBUSINESS business;
	
	/*
	 * private Collection<PrestadorServico> prestadores = null;
	 * 
	 * @PostConstruct public void init() { this.prestadores = business.read(); }
	 */
	public Collection<PrestadorServico> getPrestadores(){
		return business.read();
	}
	
	/*
	 * public void setPrestadores(Collection<PrestadorServico> prestadores) {
	 * this.prestadores = prestadores; }
	 */
}