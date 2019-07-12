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
import agenda.entity.Cidade;

@Repository
public class CidadeHibernateDAO implements ICidadeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void create(Cidade cidade) {
		Session session = sessionFactory.getCurrentSession();
		session.save(cidade);
		session.flush();
	}

	@Override
	public Collection<Cidade> read() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Cidade.class);
		return criteria.list();
	}

	@Override
	public void delete(Cidade cidade) {
		Session session = sessionFactory.getCurrentSession();
		cidade = session.get(Cidade.class, cidade.getCodigo());
		session.delete(cidade);
	}

	@Override
	public void update(Cidade cidade) {
		Session session = sessionFactory.getCurrentSession();
		session.update(cidade);
		session.flush();  
	}

	@Override
	public Boolean jaExisteCidade(Cidade cidade) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Cidade.class);
		criteria.add(Restrictions.and(Restrictions.eq("nome", cidade.getNome()).ignoreCase(),
				Restrictions.neOrIsNotNull("codigo", cidade.getCodigo())));
		
		/*
		 * if(cidade.getCodigo()!=null) { criteria.add(Restrictions.ne("codigo",
		 * cidade.getCodigo())); }
		 */
		 
		criteria.setProjection(Projections.count("codigo"));
		return (Long) criteria.uniqueResult()>0;
	}
}
