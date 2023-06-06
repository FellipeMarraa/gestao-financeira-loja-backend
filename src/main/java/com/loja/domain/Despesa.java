package com.loja.domain;

import com.loja.domain.enums.TipoDespesaEnum;

import java.util.Date;
import java.util.Objects;

public class Despesa {

    private int id;
    private Date data;
    private float valor;
    private String descricao;
    private TipoDespesaEnum tipo;

    public Despesa() {
    }

    public Despesa(int id, Date data, float valor, String descricao, TipoDespesaEnum tipo) {
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoDespesaEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoDespesaEnum tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Despesa despesa = (Despesa) o;
        return id == despesa.id && Float.compare(despesa.valor, valor) == 0 && Objects.equals(data, despesa.data) && Objects.equals(descricao, despesa.descricao) && tipo == despesa.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, valor, descricao, tipo);
    }
}
