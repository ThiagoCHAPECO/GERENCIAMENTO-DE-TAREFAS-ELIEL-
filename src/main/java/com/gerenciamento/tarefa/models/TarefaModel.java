package com.gerenciamento.tarefa.models;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_tarefa")
public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;
    private Boolean concluido;


    public TarefaModel() {
    }

    public TarefaModel(Long id, String descricao, LocalDate dataVencimento, Boolean concluido) {
        this.id = id;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.concluido = concluido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TarefaModel that = (TarefaModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
