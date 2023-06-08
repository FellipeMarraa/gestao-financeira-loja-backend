package com.loja.domain.enums;

public enum TipoDespesaEnum {

    ALUGUEL("aluguel");

    private String description;

    TipoDespesaEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
