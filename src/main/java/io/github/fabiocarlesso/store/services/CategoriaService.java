package io.github.fabiocarlesso.store.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.fabiocarlesso.store.domain.Categoria;
import io.github.fabiocarlesso.store.repositories.CategoriaRepository;
import io.github.fabiocarlesso.store.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}
