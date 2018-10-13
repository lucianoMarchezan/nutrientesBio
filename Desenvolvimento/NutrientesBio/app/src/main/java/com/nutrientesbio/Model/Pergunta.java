package com.nutrientesbio.Model;

import java.util.ArrayList;

/**
 * Created by Luciano on 02/10/2016.
 */

public class Pergunta {
    private ArrayList<Alternativa> alternativas;
    private ArrayList<Alternativa> respostas;
    private String questao;

    public Pergunta() {
        alternativas = new ArrayList<>();
        respostas = new ArrayList<>();
    }

    public ArrayList<Alternativa> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(ArrayList<Alternativa> alternativas) {
        this.alternativas = alternativas;
    }

    public ArrayList<Alternativa> getRespostas() {
        return respostas;
    }

    public void setRespostas(ArrayList<Alternativa> respostas) {
        this.respostas = respostas;
    }

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }
}
