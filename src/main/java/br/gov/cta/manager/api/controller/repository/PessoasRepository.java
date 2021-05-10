package br.gov.cta.manager.api.controller.repository;


import br.gov.cta.manager.api.model.Pessoas.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoasRepository extends JpaRepository<Pessoas,Long> {
}
