package agenda.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import agenda.business.BusinessException;
import agenda.business.ICidadeBUSINESS;
import agenda.dao.ICidadeDAO;
import agenda.entity.Cidade;

@Service
public class CidadeBUSINESS implements ICidadeBUSINESS{
	@Autowired
	private ICidadeDAO dao;
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void create(Cidade cidade) throws BusinessException {
		//validar se o nome e vazio 
		if(cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {
			throw new BusinessException("O Nome é de preenchimento obrigatório!!");
		}
		
		//validar se existe
		if(dao.jaExisteCidade(cidade)) {
			throw new BusinessException("A cidade já existe");
		}
		
		dao.create(cidade);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Cidade> read() {
		return dao.read();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(Cidade cidade) {
		dao.delete(cidade);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void update(Cidade cidade) throws BusinessException {
		if(cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {
			throw new BusinessException("O Nome é de preenchimento obrigatório!!");
		}
		
		//validar se existe
		if(dao.jaExisteCidade(cidade)) {
			throw new BusinessException("A cidade já existe");
		}
		dao.update(cidade);
	}

}
