package com.loja.domain;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "LOJA")

public class Loja implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
   private int id;
   private String nome;
   private String endereco;
   private String cnpj;

    @JsonIgnore
    @OneToMany(mappedBy = "loja",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   private List<Venda> vendas = new ArrayList<>();

    public Loja() {
    }
    public Loja(int id, String nome, String endereco, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loja loja = (Loja) o;
        return id == loja.id && Objects.equals(nome, loja.nome) && Objects.equals(endereco, loja.endereco) && Objects.equals(cnpj, loja.cnpj) && Objects.equals(vendas, loja.vendas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, endereco, cnpj, vendas);
    }

}
