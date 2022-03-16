package br.com.godoydev.festa.repository;

import br.com.godoydev.festa.model.Computador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Computadores extends JpaRepository<Computador, Long> {
}
