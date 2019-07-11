package agenda.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import agenda.business.BusinessException;
import agenda.business.IPrestadorBUSINESS;
import agenda.dao.IPrestadorDAO;
import agenda.entity.PrestadorServico;

@Service
public class PrestadorBUSINESS implements IPrestadorBUSINESS{
	@Autowired
	private IPrestadorDAO dao;
	@Override
	public void create(PrestadorServico prestador) throws BusinessException {
		if(prestador.getNome() == null || prestador.getNome().trim().isEmpty()) {
			throw new BusinessException("O Nome � de preenchimento obrigat�rio!!");
		}
		/*
		 * if(prestador.getCidade() == null) { throw new
		 * BusinessException("A Cidade � de preenchimento obrigat�rio!!"); }
		 */
		if(prestador.getBairro() == null || prestador.getBairro().trim().isEmpty()) {
			throw new BusinessException("O Bairro � de preenchimento obrigat�rio!!");
		}
		if(prestador.getCep() == null || prestador.getCep().trim().isEmpty()) {
			throw new BusinessException("O Cep � de preenchimento obrigat�rio!!");
		}
		/*
		 * if(prestador.getTipoLogradouro() == null) { throw new
		 * BusinessException("O Tipo de Logradouro � de preenchimento obrigat�rio!!"); }
		 */
		if(prestador.getLogradouro() == null || prestador.getLogradouro().trim().isEmpty()) {
			throw new BusinessException("O Logradouro � de preenchimento obrigat�rio!!");
		}
		if(prestador.getComplemento() == null || prestador.getComplemento().trim().isEmpty()) {
			throw new BusinessException("O Complemento � de preenchimento obrigat�rio!!");
		}
		if(prestador.getNumero() == null || prestador.getNumero().trim().isEmpty()) {
			throw new BusinessException("O Numero � de preenchimento obrigat�rio!!");
		}
		if(prestador.getEmail() == null || prestador.getEmail().trim().isEmpty()) {
			throw new BusinessException("O Email � de preenchimento obrigat�rio!!");
		}
		if(dao.jaExisteEmail(prestador.getEmail())) { 
			throw new BusinessException("O email j� existe!!"); 
		}
		/*
		 * if(prestador.getTelefones() == null || prestador.getTelefones().isEmpty()) {
		 * throw new BusinessException("O Telefone � de preenchimento obrigat�rio!!"); }
		 */
		/*
		 * if(prestador.getServicosCredenciados() == null ||
		 * prestador.getServicosCredenciados().isEmpty()) { throw new
		 * BusinessException("O servico credenciado � de preenchimento obrigat�rio!!");
		 * }
		 */
		dao.create(prestador);
	}

	@Override
	public Collection<PrestadorServico> read() {
		return dao.read();
	}

	@Override
	public void delete(PrestadorServico prestador) {
		dao.delete(prestador);
	}

	@Override
	public void update(PrestadorServico prestador) throws BusinessException {
		if(prestador.getNome() == null || prestador.getNome().trim().isEmpty()) {
			throw new BusinessException("O Nome � de preenchimento obrigat�rio!!");
		}
		/*
		 * if(prestador.getCidade() == null) { throw new
		 * BusinessException("A Cidade � de preenchimento obrigat�rio!!"); }
		 */
		if(prestador.getBairro() == null || prestador.getBairro().trim().isEmpty()) {
			throw new BusinessException("O Bairro � de preenchimento obrigat�rio!!");
		}
		if(prestador.getCep() == null || prestador.getCep().trim().isEmpty()) {
			throw new BusinessException("O Cep � de preenchimento obrigat�rio!!");
		}
		/*
		 * if(prestador.getTipoLogradouro() == null) { throw new
		 * BusinessException("O Tipo de Logradouro � de preenchimento obrigat�rio!!"); }
		 */
		if(prestador.getLogradouro() == null || prestador.getLogradouro().trim().isEmpty()) {
			throw new BusinessException("O Logradouro � de preenchimento obrigat�rio!!");
		}
		if(prestador.getComplemento() == null || prestador.getComplemento().trim().isEmpty()) {
			throw new BusinessException("O Complemento � de preenchimento obrigat�rio!!");
		}
		if(prestador.getNumero() == null || prestador.getNumero().trim().isEmpty()) {
			throw new BusinessException("O Numero � de preenchimento obrigat�rio!!");
		}
		if(prestador.getEmail() == null || prestador.getEmail().trim().isEmpty()) {
			throw new BusinessException("O Email � de preenchimento obrigat�rio!!");
		}
		if(dao.jaExisteEmailCodigo(prestador.getCodigo(),prestador.getEmail())) { 
			 throw new BusinessException("O email j� existe!!"); 
		}
	
		/*
		 * if(prestador.getTelefones() == null || prestador.getTelefones().isEmpty()) {
		 * throw new BusinessException("O Telefone � de preenchimento obrigat�rio!!"); }
		 * if(prestador.getServicosCredenciados() == null ||
		 * prestador.getServicosCredenciados().isEmpty()) { throw new
		 * BusinessException("O servico credenciado � de preenchimento obrigat�rio!!");
		 * }
		 */
		
		 
		
		dao.update(prestador);
	}
}
