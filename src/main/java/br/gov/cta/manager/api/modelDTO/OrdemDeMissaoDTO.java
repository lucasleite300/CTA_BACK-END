package br.gov.cta.manager.api.modelDTO;


import br.gov.cta.manager.api.model.OrdemDeMissao.OrdemDeMissao;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class OrdemDeMissaoDTO {

    private long id;
    private String nomeOrdem;
    private LocalDateTime inicioMissao;
    private LocalDateTime terminoMissao;
    // private String solicitante;
    private String descricaoMissao;
    private String descricaoOperacoes;
    private String descricaoAdm;
    private String descricaoManutencao;
    private String descricaoSeguranca;
    private String descricaoResponsavelTec;

public OrdemDeMissaoDTO(OrdemDeMissao ordemDeMissao){
    this.id = ordemDeMissao.getId();
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

    public static List<OrdemDeMissaoDTO> converte(List<OrdemDeMissao> ordemDeMissao) {
        return ordemDeMissao.stream().map(OrdemDeMissaoDTO::new).collect(Collectors.toList());
    }
}
