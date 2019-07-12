package agenda.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import agenda.dao.IPrestadorDAO;
import agenda.entity.Cidade;
import agenda.entity.PrestadorServico;
import agenda.entity.TipoServico;

@Repository
public class PrestadorHibernateDAO implements IPrestadorDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void create(PrestadorServico prestador) {
		Session session = sessionFactory.getCurrentSession();
		session.save(prestador);
		session.flush();
	}

	@Override
	public Collection<PrestadorServico> read() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(PrestadorServico.class);
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return criteria.list();
	}

	@Override
	public void delete(PrestadorServico prestador) {
		Session session = sessionFactory.getCurrentSession();
		prestador = session.get(PrestadorServico.class, prestador.getCodigo());
		session.delete(prestador);
	}

	@Override
	public void update(PrestadorServico prestador) {
		Session session = sessionFactory.getCurrentSession();
		session.update(prestador);
		session.flush(); 
	}
	
	@Override
	public Boolean jaExisteEmail(PrestadorServico prestador) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(PrestadorServico.class);
		criteria.add(Restrictions.and(Restrictions.eq("email", prestador.getEmail()).ignoreCase(),
				Restrictions.neOrIsNotNull("codigo", prestador.getCodigo())));
		criteria.setProjection(Projections.count("codigo"));
		return (Long) criteria.uniqueResult()>0;
	}
}
