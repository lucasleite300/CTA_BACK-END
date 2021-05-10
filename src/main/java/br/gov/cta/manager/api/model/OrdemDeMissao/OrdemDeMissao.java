package br.gov.cta.manager.api.model.OrdemDeMissao;

import br.gov.cta.manager.api.modelDTO.AttOrdemDeMissao;
import br.gov.cta.manager.api.modelDTO.OrdemDeMissaoForm;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity
public class OrdemDeMissao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull @NotNull
    private String nomeOrdem;

    private LocalDateTime inicioMissao;
    private LocalDateTime terminoMissao;
    // private String solicitante;
    @NotNull @NotNull
    private String descricaoMissao;
    @NotNull @NotNull
    private String descricaoOperacoes;
    @NotNull @NotNull
    private String descricaoAdm;
    @NotNull @NotNull
    private String descricaoManutencao;
    @NotNull @NotNull
    private String descricaoSeguranca;
    @NotNull @NotNull
    private String descricaoResponsavelTec;

    public OrdemDeMissao(OrdemDeMissaoForm ordemDeMissaoForm){
        //this.id = ordemDeMissaoForm.getId();
        this.nomeOrdem = ordemDeMissaoForm.getNomeOrdem();
        this.inicioMissao = ordemDeMissaoForm.getInicioMissao();
        this.terminoMissao = ordemDeMissaoForm.getTerminoMissao();
        this.descricaoMissao = ordemDeMissaoForm.getDescricaoMissao();
        this.descricaoOperacoes = ordemDeMissaoForm.getDescricaoOperacoes();
        this.descricaoAdm = ordemDeMissaoForm.getDescricaoAdm();
        this.descricaoManutencao = ordemDeMissaoForm.getDescricaoManutencao();
        this.descricaoSeguranca = ordemDeMissaoForm.getDescricaoSeguranca();
        this.descricaoResponsavelTec = ordemDeMissaoForm.getDescricaoResponsavelTec();
    }

    public OrdemDeMissao() {

    }
}
