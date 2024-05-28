package domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
