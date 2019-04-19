package com.hh.demo;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hh.demo.entities.Donation;
import com.hh.demo.service.DonationService;

@SpringBootApplication
public class DonationProjectApplication implements CommandLineRunner{

	@Autowired
	private DonationService donationService;
	
	public static void main(String[] args) {
		SpringApplication.run(DonationProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String str = "2018-01-01";
		Date dod = Date.valueOf(str);
		donationService.save(new Donation("Bill Gates", 6567890897l, "abc", 20000, dod));
		donationService.save(new Donation("John Wick", 4567564523l, "xyz", 10000, dod));
		donationService.save(new Donation("Oprah Winfrey", 9878643568l, "abc", 12000, dod));
		donationService.save(new Donation("Jeff Bezos", 7656745347l, "xyz", 25500, dod));
	}

}
