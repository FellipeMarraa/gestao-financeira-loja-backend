package com.loja.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Venda implements Serializable {

    private int id;
    private Date data;
    private float total;

    public Venda() {
    }

    public Venda(int id, Date data, float total) {
        this.id = id;
        this.data = data;
        this.total = total;
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return id == venda.id && Float.compare(venda.total, total) == 0 && Objects.equals(data, venda.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, total);
    }
}
