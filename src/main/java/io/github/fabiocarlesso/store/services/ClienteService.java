package io.github.fabiocarlesso.store.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.fabiocarlesso.store.domain.Cliente;
import io.github.fabiocarlesso.store.repositories.ClienteRepository;
import io.github.fabiocarlesso.store.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }

}
