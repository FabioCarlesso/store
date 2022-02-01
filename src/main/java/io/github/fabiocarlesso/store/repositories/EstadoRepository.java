package io.github.fabiocarlesso.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.fabiocarlesso.store.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
    
}
