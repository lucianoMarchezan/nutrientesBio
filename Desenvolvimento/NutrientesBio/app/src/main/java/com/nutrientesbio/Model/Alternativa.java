package com.nutrientesbio.Model;

/**
 * Created by Luciano on 02/10/2016.
 */

public class Alternativa {
    private String descricao;
    private boolean selected;

    public Alternativa(String descricao, boolean selected) {
        this.descricao = descricao;
        this.selected = selected;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
