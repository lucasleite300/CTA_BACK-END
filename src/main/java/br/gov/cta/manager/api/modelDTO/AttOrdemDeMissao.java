package br.gov.cta.manager.api.modelDTO;

import br.gov.cta.manager.api.controller.repository.OrdemDeMissaoRepository;
import br.gov.cta.manager.api.model.OrdemDeMissao.OrdemDeMissao;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class AttOrdemDeMissao {
    //private long id;
    @NotEmpty @NotNull
    private String nomeOrdem;
    private LocalDateTime inicioMissao;
    private LocalDateTime terminoMissao;
    // private String solicitante;
    @NotEmpty @NotNull
    private String descricaoMissao;
    @NotEmpty @NotNull
    private String descricaoOperacoes;
    @NotEmpty @NotNull
    private String descricaoAdm;
    @NotEmpty @NotNull
    private String descricaoManutencao;
    @NotEmpty @NotNull
    private String descricaoSeguranca;
    @NotEmpty @NotNull
    private String descricaoResponsavelTec;


    public OrdemDeMissao atualizar(OrdemDeMissao ordemDeMissao, OrdemDeMissaoRepository ordemDeMissaoRepository) {
            ordemDeMissao.setNomeOrdem(this.getNomeOrdem());
            ordemDeMissao.setInicioMissao(this.getInicioMissao());
            ordemDeMissao.setTerminoMissao(this.getTerminoMissao());
            ordemDeMissao.setDescricaoMissao(this.getDescricaoMissao());
            ordemDeMissao.setDescricaoOperacoes(this.getDescricaoOperacoes());
            ordemDeMissao.setDescricaoAdm(this.getDescricaoAdm());
            ordemDeMissao.setDescricaoManutencao(this.getDescricaoManutencao());
            ordemDeMissao.setDescricaoSeguranca(this.getDescricaoSeguranca());
            ordemDeMissao.setDescricaoResponsavelTec(this.getDescricaoResponsavelTec());

            return ordemDeMissao;
        }
    }