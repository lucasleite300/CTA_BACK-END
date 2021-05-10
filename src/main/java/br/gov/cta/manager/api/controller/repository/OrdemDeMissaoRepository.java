package br.gov.cta.manager.api.controller.repository;

import br.gov.cta.manager.api.model.OrdemDeMissao.OrdemDeMissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemDeMissaoRepository extends JpaRepository<OrdemDeMissao,Long> {

}
