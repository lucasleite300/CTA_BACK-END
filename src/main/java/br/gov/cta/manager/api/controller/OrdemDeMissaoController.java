package br.gov.cta.manager.api.controller;

import br.gov.cta.manager.api.controller.repository.OrdemDeMissaoRepository;
import br.gov.cta.manager.api.model.OrdemDeMissao.OrdemDeMissao;
import br.gov.cta.manager.api.modelDTO.AttOrdemDeMissao;
import br.gov.cta.manager.api.modelDTO.OrdemDeMissaoDTO;
import br.gov.cta.manager.api.modelDTO.OrdemDeMissaoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ordemMissao")
public class OrdemDeMissaoController {

    @Autowired
    OrdemDeMissaoRepository ordemDeMissaoRepository;

    @PostMapping
    @Transactional
    public OrdemDeMissaoForm cadastrar(@RequestBody @Valid OrdemDeMissaoForm ordemDeMissaoForm){
        OrdemDeMissao ordemDeMissao = new OrdemDeMissao(ordemDeMissaoForm);
        ordemDeMissaoRepository.save(ordemDeMissao);
        return ordemDeMissaoForm;
    }

    @GetMapping
    public List<OrdemDeMissaoDTO> listar(){
        List<OrdemDeMissao> ordemDeMissao;

        ordemDeMissao = ordemDeMissaoRepository.findAll();
        return OrdemDeMissaoDTO.converte(ordemDeMissao);
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity deletar(Long id){
        Optional<OrdemDeMissao> ordemDeMissao = ordemDeMissaoRepository.findById(id);
        if(ordemDeMissao.isPresent()){
            ordemDeMissaoRepository.delete(ordemDeMissao.get());
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<OrdemDeMissaoDTO> editar(@PathVariable Long id, @RequestBody @Valid AttOrdemDeMissao form){
        Optional<OrdemDeMissao> ordemDeMissao = ordemDeMissaoRepository.findById(id);
        if (ordemDeMissao.isPresent()){
            form.atualizar(ordemDeMissao.get(),ordemDeMissaoRepository);
            return ResponseEntity.ok(new OrdemDeMissaoDTO(ordemDeMissao.get()));
        }else{
            return ResponseEntity.notFound().build();
        }

    }
}
