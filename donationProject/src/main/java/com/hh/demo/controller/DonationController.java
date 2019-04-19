package com.hh.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hh.demo.entities.Donation;
import com.hh.demo.service.DonationService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class DonationController {

	@Autowired
	private DonationService donationService;
	
	@GetMapping("/donations")
	public List<Donation> get(){
		return donationService.get();
	}
	
	@GetMapping("/donation/{id}")
	public Donation get(@PathVariable int id) {
		Donation donation = donationService.get(id);
		if(donation == null) {
			throw new RuntimeException("Player with id "+id+" not found");
		}
		return donation;
	}
	
	@PostMapping("/donation")
	public Donation save(@RequestBody Donation donation) {
		donationService.save(donation);
		return donation;
	}
	
	@DeleteMapping("donation/{id}")
	public boolean delete(@PathVariable int id) {
		donationService.delete(id);
		return true;
	}
	
	@PutMapping("/donation")
	public Donation update(@RequestBody Donation donation) {
		donationService.update(donation);
		return donation;
	}
}
