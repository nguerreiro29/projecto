package impl;

import java.util.Collection;

import agendabusiness.BusinessException;
import agendabusiness.ICidadeBUSINESS;
import agendadao.ICidadeDAO;
import entity.Cidade;

public class CidadeBUSINESS implements ICidadeBUSINESS{
	private ICidadeDAO dao= new CidadeDAO();
	@Override
	public void create(Cidade cidade) throws BusinessException {
		//validar se o nome e vazio 
		if(cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {
			throw new BusinessException("Preenchimento obrigat�rio!!");
		}
		
		//validar se existe
		if(dao.jaExisteCidade(cidade.getNome())) {
			throw new BusinessException("A cidade j� insiste");
		}
		
		dao.create(cidade);
	}

	@Override
	public Collection<Cidade> read() {
		return dao.read();
	}

	@Override
	public void delete(Cidade cidade) {
		dao.delete(cidade);
	}

	@Override
	public void update(Cidade cidade) throws BusinessException {
		if(cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {
			throw new BusinessException("Preenchimento obrigat�rio!!");
		}
		
		//validar se existe
		if(dao.jaExisteCidadeCodigo(cidade.getCodigo(),cidade.getNome())) {
			throw new BusinessException("A cidade j� insiste");
		}
		
		dao.update(cidade);
	}

}
