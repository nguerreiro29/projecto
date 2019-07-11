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
			throw new BusinessException("O Nome é de preenchimento obrigatório!!");
		}
		/*
		 * if(prestador.getCidade() == null) { throw new
		 * BusinessException("A Cidade é de preenchimento obrigatório!!"); }
		 */
		if(prestador.getBairro() == null || prestador.getBairro().trim().isEmpty()) {
			throw new BusinessException("O Bairro é de preenchimento obrigatório!!");
		}
		if(prestador.getCep() == null || prestador.getCep().trim().isEmpty()) {
			throw new BusinessException("O Cep é de preenchimento obrigatório!!");
		}
		/*
		 * if(prestador.getTipoLogradouro() == null) { throw new
		 * BusinessException("O Tipo de Logradouro é de preenchimento obrigatório!!"); }
		 */
		if(prestador.getLogradouro() == null || prestador.getLogradouro().trim().isEmpty()) {
			throw new BusinessException("O Logradouro é de preenchimento obrigatório!!");
		}
		if(prestador.getComplemento() == null || prestador.getComplemento().trim().isEmpty()) {
			throw new BusinessException("O Complemento é de preenchimento obrigatório!!");
		}
		if(prestador.getNumero() == null || prestador.getNumero().trim().isEmpty()) {
			throw new BusinessException("O Numero é de preenchimento obrigatório!!");
		}
		if(prestador.getEmail() == null || prestador.getEmail().trim().isEmpty()) {
			throw new BusinessException("O Email é de preenchimento obrigatório!!");
		}
		if(dao.jaExisteEmail(prestador.getEmail())) { 
			throw new BusinessException("O email já existe!!"); 
		}
		/*
		 * if(prestador.getTelefones() == null || prestador.getTelefones().isEmpty()) {
		 * throw new BusinessException("O Telefone é de preenchimento obrigatório!!"); }
		 */
		/*
		 * if(prestador.getServicosCredenciados() == null ||
		 * prestador.getServicosCredenciados().isEmpty()) { throw new
		 * BusinessException("O servico credenciado é de preenchimento obrigatório!!");
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
			throw new BusinessException("O Nome é de preenchimento obrigatório!!");
		}
		/*
		 * if(prestador.getCidade() == null) { throw new
		 * BusinessException("A Cidade é de preenchimento obrigatório!!"); }
		 */
		if(prestador.getBairro() == null || prestador.getBairro().trim().isEmpty()) {
			throw new BusinessException("O Bairro é de preenchimento obrigatório!!");
		}
		if(prestador.getCep() == null || prestador.getCep().trim().isEmpty()) {
			throw new BusinessException("O Cep é de preenchimento obrigatório!!");
		}
		/*
		 * if(prestador.getTipoLogradouro() == null) { throw new
		 * BusinessException("O Tipo de Logradouro é de preenchimento obrigatório!!"); }
		 */
		if(prestador.getLogradouro() == null || prestador.getLogradouro().trim().isEmpty()) {
			throw new BusinessException("O Logradouro é de preenchimento obrigatório!!");
		}
		if(prestador.getComplemento() == null || prestador.getComplemento().trim().isEmpty()) {
			throw new BusinessException("O Complemento é de preenchimento obrigatório!!");
		}
		if(prestador.getNumero() == null || prestador.getNumero().trim().isEmpty()) {
			throw new BusinessException("O Numero é de preenchimento obrigatório!!");
		}
		if(prestador.getEmail() == null || prestador.getEmail().trim().isEmpty()) {
			throw new BusinessException("O Email é de preenchimento obrigatório!!");
		}
		if(dao.jaExisteEmailCodigo(prestador.getCodigo(),prestador.getEmail())) { 
			 throw new BusinessException("O email já existe!!"); 
		}
	
		/*
		 * if(prestador.getTelefones() == null || prestador.getTelefones().isEmpty()) {
		 * throw new BusinessException("O Telefone é de preenchimento obrigatório!!"); }
		 * if(prestador.getServicosCredenciados() == null ||
		 * prestador.getServicosCredenciados().isEmpty()) { throw new
		 * BusinessException("O servico credenciado é de preenchimento obrigatório!!");
		 * }
		 */
		
		 
		
		dao.update(prestador);
	}
}
