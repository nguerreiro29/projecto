package agendaweb.soap;

import java.util.Collection;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;

import agendabusiness.BusinessException;
import agendabusiness.ICidadeBUSINESS;
import entity.Cidade;
import impl.CidadeBUSINESS;

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
