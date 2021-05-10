package br.gov.cta.manager.api.model.Pessoas;

import br.gov.cta.manager.api.modelDTO.PessoaForm;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Pessoas {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull @NotEmpty
    private String nomeCompleto;
    @NotNull @NotEmpty
    private String email;
    @NotNull @NotEmpty
    private String matricula;
    @NotNull @NotEmpty
    private String cpf;
    @NotNull @NotEmpty
    private String instituicao;
    @NotNull @NotEmpty
    private String telefone1;
    @NotNull @NotEmpty
    private String endereco;
    @NotNull @NotEmpty
    private String cep;
    @NotNull @NotEmpty
    private String senha;
    @NotNull
    private String caminhoFile;
    @NotNull
    private String telefone2;
    @NotNull
    private String departamento;
    @NotNull
    private String complemento;
    @NotNull
    private String bairro;
    @NotNull
    private String uf;
    @NotNull
    private String numero;



    public Pessoas(PessoaForm pessoaForm){
        this.nomeCompleto = pessoaForm.getNomeCompleto();
        this.email = pessoaForm.getEmail();
        this.senha = pessoaForm.getSenha();
        this.matricula = pessoaForm.getMatricula();
        this.cpf = pessoaForm.getCpf();
        this.telefone1 = pessoaForm.getTelefone1();
        this.telefone2 = pessoaForm.getTelefone1();
        this.departamento = pessoaForm.getDepartamento();
        this.instituicao = pessoaForm.getInstituicao();
        this.cep = pessoaForm.getCep();
        this.endereco = pessoaForm.getEndereco();
        this.complemento = pessoaForm.getComplemento();
        this.bairro = pessoaForm.getBairro();
        this.uf = pessoaForm.getUf();
        this.numero = pessoaForm.getNumero();
        this.caminhoFile = pessoaForm.getCaminhoFile();
    }


    public Pessoas() {

    }
}
