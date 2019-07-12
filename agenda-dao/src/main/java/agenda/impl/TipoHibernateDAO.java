package agenda.impl;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import agenda.dao.ICidadeDAO;
import agenda.dao.ITipoDAO;
import agenda.entity.Cidade;
import agenda.entity.PrestadorServico;
import agenda.entity.TipoServico;

@Repository
public class TipoHibernateDAO implements ITipoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void create(TipoServico tipo) {
		Session session = sessionFactory.getCurrentSession();
		session.save(tipo);
		session.flush();
	}

	@Override
	public Collection<TipoServico> read() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(TipoServico.class);
		return criteria.list();
	}

	@Override
	public void delete(TipoServico tipo) {
		Session session = sessionFactory.getCurrentSession();
		tipo = session.get(TipoServico.class, tipo.getCodigo());
		session.delete(tipo);
	}

	@Override
	public void update(TipoServico tipo) {
		Session session = sessionFactory.getCurrentSession();
		session.update(tipo);
		session.flush();  
	}

	@Override
	public Boolean jaExisteTipo(TipoServico tipo) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(TipoServico.class);
		criteria.add(Restrictions.and(Restrictions.eq("descricao", tipo.getDescricao()).ignoreCase(),
				Restrictions.neOrIsNotNull("codigo", tipo.getCodigo())));
		 if(tipo.getCodigo()!=null) {
			 criteria.add(Restrictions.ne("codigo", tipo.getCodigo()));
		 }
		criteria.setProjection(Projections.count("codigo"));
		return (Long) criteria.uniqueResult()>0;
	}
}
