package br.com.godoydev.festa.repository;

import br.com.godoydev.festa.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Convidados extends JpaRepository<Convidado, Long> {
}
