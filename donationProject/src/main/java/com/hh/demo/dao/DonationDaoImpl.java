package com.hh.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hh.demo.entities.Donation;

@Repository
public class DonationDaoImpl implements DonationDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Donation> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Donation> query = currentSession.createQuery("from Donation", Donation.class);
		List<Donation> list = query.getResultList();
		return list;
	}

	@Override
	public Donation get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Donation donation = currentSession.get(Donation.class, id);
		return donation;
	}

	@Override
	public void save(Donation donation) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(donation);

	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Donation donation = currentSession.get(Donation.class, id);
		currentSession.delete(donation);

	}

	@Override
	public void update(Donation donation) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(donation);

	}

}
