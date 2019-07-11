package agenda.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import agenda.business.BusinessException;
import agenda.business.ITipoBUSINESS;
import agenda.dao.ITipoDAO;
import agenda.entity.TipoServico;

@Service
public class TipoBUSINESS implements ITipoBUSINESS{
	@Autowired
	private ITipoDAO dao;
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void create(TipoServico tipo) throws BusinessException {
		if(tipo.getDescricao() == null || tipo.getDescricao().trim().isEmpty()) {
			throw new BusinessException("A descricao é de preenchimento obrigatório!!");
		}
		if(dao.jaExisteTipo(tipo)) {
			throw new BusinessException("O tipo de serviço já existe");
		}
		dao.create(tipo);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<TipoServico> read() {
		return dao.read();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(TipoServico tipo) {
		dao.delete(tipo);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void update(TipoServico tipo) throws BusinessException {
		 if(tipo.getDescricao() == null || tipo.getDescricao().trim().isEmpty()) {
			 throw new BusinessException("A descricao é de preenchimento obrigatório!!");
		  } 
		 if(dao.jaExisteTipo(tipo)) { 
			 throw new BusinessException("O tipo de serviço já existe"); }
		 
		
		dao.update(tipo);
	}

}
