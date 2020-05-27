package br.com.alura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.modelo.Topico;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
