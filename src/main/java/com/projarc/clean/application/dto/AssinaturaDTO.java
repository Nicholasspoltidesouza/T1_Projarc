package com.projarc.clean.application.dto;

import com.projarc.clean.domain.entity.Aplicativo;
import com.projarc.clean.domain.entity.Cliente;

import java.util.Date;

public class AssinaturaDTO {
    private Long id;
    private Aplicativo aplicativo;
    private Cliente cliente;
    private Date dataInicio;
    private Date dataFim;
    private boolean ativa;

    public AssinaturaDTO(Long id, Aplicativo aplicativo, Cliente cliente, Date dataInicio, Date dataFim, boolean ativa) {
        this.id = id;
        this.aplicativo = aplicativo;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.ativa = ativa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aplicativo getAplicativo() {
        return aplicativo;
    }

    public void setAplicativo(Aplicativo aplicativo) {
        this.aplicativo = aplicativo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public String toString() {
        return "AssinaturaDTO{" +
                "id=" + id +
                ", aplicativo=" + aplicativo +
                ", cliente=" + cliente +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", ativa=" + ativa +
                '}';
    }
}
