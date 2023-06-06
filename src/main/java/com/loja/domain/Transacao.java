package com.loja.domain;

import com.loja.domain.enums.TipoTransacaoEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Transacao implements Serializable {

    private int id;
    private Date data;
    private float valor;

    private TipoTransacaoEnum tipo;

    public Transacao() {
    }

    public Transacao(int id, Date data, float valor, TipoTransacaoEnum tipo) {
        this.id = id;
        this.data = data;
        this.valor = valor;
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

    public TipoTransacaoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacaoEnum tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transacao transacao = (Transacao) o;
        return id == transacao.id && Float.compare(transacao.valor, valor) == 0 && Objects.equals(data, transacao.data) && tipo == transacao.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, valor, tipo);
    }
}
