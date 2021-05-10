package br.gov.cta.manager.api.controller;

import br.gov.cta.manager.api.controller.repository.PessoasRepository;
import br.gov.cta.manager.api.model.Pessoas.Pessoas;
import br.gov.cta.manager.api.modelDTO.PessoaForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/Cadastro")
public class PessoasController {

    @Autowired
    PessoasRepository pessoasRepository;

    @PostMapping
    @Transactional
    public PessoaForm cadastro(@RequestBody PessoaForm pessoaForm) {
        Pessoas pessoas = new Pessoas(pessoaForm);
        pessoasRepository.save(pessoas);

        return pessoaForm;
    }
}