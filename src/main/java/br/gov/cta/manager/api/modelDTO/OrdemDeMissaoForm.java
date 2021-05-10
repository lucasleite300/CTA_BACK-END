package br.gov.cta.manager.api.modelDTO;

import br.gov.cta.manager.api.model.OrdemDeMissao.OrdemDeMissao;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
public class OrdemDeMissaoForm {
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

    public OrdemDeMissaoForm(OrdemDeMissao ordemDeMissao) {
        //this.id = ordemDeMissao.getId();
        this.nomeOrdem = ordemDeMissao.getNomeOrdem();
        this.inicioMissao = ordemDeMissao.getInicioMissao();
        this.terminoMissao = ordemDeMissao.getTerminoMissao();
        this.descricaoMissao = ordemDeMissao.getDescricaoMissao();
        this.descricaoOperacoes = ordemDeMissao.getDescricaoOperacoes();
        this.descricaoAdm = ordemDeMissao.getDescricaoAdm();
        this.descricaoManutencao = ordemDeMissao.getDescricaoManutencao();
        this.descricaoSeguranca = ordemDeMissao.getDescricaoSeguranca();
        this.descricaoResponsavelTec = ordemDeMissao.getDescricaoResponsavelTec();
    }
}
