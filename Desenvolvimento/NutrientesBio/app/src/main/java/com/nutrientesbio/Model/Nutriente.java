package com.nutrientesbio.Model;

/**
 * Created by Luciano on 04/09/2016.
 */
public class Nutriente {
    private String nome;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Nutriente() {

    }

    public Nutriente(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Nutriente(String nome) {
        this.nome = nome;
    }
}
