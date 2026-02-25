package com.moraes.school.models;

import jakarta.persistence.*;

@Entity // ENTIDADE (TABELA)
@Table(name = "TBL_ALUNO") // NOMEIA A ENTIDADE
public class AlunoModel {

    @Id //CRIA CHAVE PRIMARIA NO BANCO
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GERA ID AUTOMATICAMENTE
    private Long id;
    private String nome;
    private String matricula;
    private String endereco;

    public AlunoModel(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
