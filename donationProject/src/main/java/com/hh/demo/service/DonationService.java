package com.hh.demo.service;

import java.util.List;

import com.hh.demo.entities.Donation;

public interface DonationService {

	public List<Donation> get();
	public Donation get(int id);
	public void save(Donation donation);
	public void delete(int id);
	public void update(Donation donation);
}
