package com.hh.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hh.demo.dao.DonationDAO;
import com.hh.demo.entities.Donation;

@Service
public class DonationServiceImpl implements DonationService {

	@Autowired
	private DonationDAO donationDAO;
	
	@Transactional
	@Override
	public List<Donation> get() {
		return donationDAO.get();
	}

	@Transactional
	@Override
	public Donation get(int id) {
		return donationDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Donation donation) {
		donationDAO.save(donation);

	}

	@Transactional
	@Override
	public void delete(int id) {
		donationDAO.delete(id);

	}

	@Transactional
	@Override
	public void update(Donation donation) {
		donationDAO.update(donation);

	}

}
