package agenda.client.soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.Holder;

import agenda.cliente.soap.generated.BusinessException_Exception;
import agenda.cliente.soap.generated.Cidade;
import agenda.cliente.soap.generated.CidadeSOAP;
import agenda.cliente.soap.generated.CidadeSOAPService;

public class SOAPMain {
	public static void main(String[] args) throws MalformedURLException, BusinessException_Exception {
		URL url = new URL("http://localhost:8080/agenda-web/soap/ClienteSOAP?wsdl");
		
		CidadeSOAPService service = new CidadeSOAPService(url);
		CidadeSOAP port = service.getCidadeSOAPPort();
		
		Cidade cidade = new Cidade();
		cidade.setNome("Barreiro");
		
		port.create(new Holder<Cidade>(cidade));
		
		
		for(Cidade cidades:port.read()) {
			System.out.println(cidades.getNome());
		}
		
	}

}
