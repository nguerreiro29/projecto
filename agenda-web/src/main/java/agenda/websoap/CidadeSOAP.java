package agenda.websoap;

import java.util.Collection;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;

import agenda.business.BusinessException;
import agenda.business.ICidadeBUSINESS;
import agenda.entity.Cidade;
import agenda.impl.CidadeBUSINESS;

import javax.jws.WebResult;
import javax.jws.WebService;

@WebService()
public class CidadeSOAP {
	private ICidadeBUSINESS business = new CidadeBUSINESS();

	@WebMethod(operationName = "create")
	@WebResult(name = "cidade")
	public Cidade create(
			@WebParam(name = "cidade") Cidade cidade)
			throws BusinessException {
		business.create(cidade);
		return cidade;
	}
	
	public Collection<Cidade> read() {
		return business.read();
		}
	
	public Cidade update(
			@WebParam(name = "cidade") Cidade cidade)
			throws BusinessException {
		business.update(cidade);
		return cidade;
	}
	
	public Cidade delete(@WebParam(name = "cidade") Cidade cidade)
			throws BusinessException {
		business.delete(cidade);
		return null;
	}
}
