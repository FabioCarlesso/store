package io.github.fabiocarlesso.store;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.fabiocarlesso.store.domain.Categoria;
import io.github.fabiocarlesso.store.repositories.CategoriaRepository;

@SpringBootApplication
public class StoreApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		Categoria cat3 = new Categoria(null, "Casa");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}

}
