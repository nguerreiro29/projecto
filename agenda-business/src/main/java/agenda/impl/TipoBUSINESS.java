package agenda.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import agenda.business.BusinessException;
import agenda.business.ICidadeBUSINESS;
import agenda.business.ITipoBUSINESS;
import agenda.dao.ICidadeDAO;
import agenda.dao.ITipoDAO;
import agenda.entity.Cidade;
import agenda.entity.TipoServico;

@Service
public class TipoBUSINESS implements ITipoBUSINESS{
	@Autowired
	private ITipoDAO dao;
	@Override
	public void create(TipoServico tipo) throws BusinessException {
		if(tipo.getDescricao() == null || tipo.getDescricao().trim().isEmpty()) {
			throw new BusinessException("A descricao é de preenchimento obrigatório!!");
		}
		if(dao.jaExisteTipo(tipo.getDescricao())) {
			throw new BusinessException("O tipo de serviço já existe");
		}
		
		dao.create(tipo);
	}

	@Override
	public Collection<TipoServico> read() {
		return dao.read();
	}

	@Override
	public void delete(TipoServico tipo) {
		dao.delete(tipo);
	}

	@Override
	public void update(TipoServico tipo) throws BusinessException {
		 if(tipo.getDescricao() == null || tipo.getDescricao().trim().isEmpty()) {
			 throw new BusinessException("A descricao é de preenchimento obrigatório!!");
		  } 
		 if(dao.jaExisteTipoCodigo(tipo.getCodigo(),tipo.getDescricao())) { 
			 throw new BusinessException("O tipo de serviço já existe"); }
		 
		
		dao.update(tipo);
	}

}
