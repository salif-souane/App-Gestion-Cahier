package com.uasz.demo;

import com.uasz.demo.Model.Cahier.Cahier;
import com.uasz.demo.Repository.Cahier.CahierRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class GestionDaosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionDaosApplication.class, args);
	}

	@Autowired
	private CahierRepository ueRepository;

	@Override
	public void run(String... args) throws Exception{
		ueRepository.save(new Cahier(null, "Pm Luxe",200,"superieur","disponible", new Date()));
		ueRepository.save(new Cahier(null, "new cahier",100,"bonne","disponible" , new Date()));
		ueRepository.save(new Cahier(null, "Pp Oriz",32,"moyenne","vide", new Date()));
		ueRepository.save(new Cahier(null, "Pa New",200,"superieure","vide", new Date()));
		ueRepository.save(new Cahier(null, "best",100,"bonne","disponible", new Date()));
		ueRepository.save(new Cahier(null, "solide",48,"moyenne","vide", new Date()));
		ueRepository.save(new Cahier(null, "power",200,"mauvaise","disponible", new Date()));

	}


}
