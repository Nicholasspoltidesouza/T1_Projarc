package com.projarc.clean.application.dto;

import com.projarc.clean.domain.entity.Aplicativo;
import com.projarc.clean.domain.entity.Cliente;
import com.projarc.clean.domain.enumeration.AssinaturaStatusEnum;

import java.util.Date;

public class AssinaturaNovaDTO {
    private Aplicativo aplicativo;
    private Cliente cliente;
    private Date data_inicio;
    private Date data_fim;
    private AssinaturaStatusEnum status;

    public AssinaturaNovaDTO(Aplicativo aplicativo, Cliente cliente, Date data_inicio, Date data_fim, AssinaturaStatusEnum status) {
        this.aplicativo = aplicativo;
        this.cliente = cliente;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.status = status;
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

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public AssinaturaStatusEnum getStatus() {
        return status;
    }

    public void setStatus(AssinaturaStatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AssinaturaNovaDTO{" +
                "aplicativo=" + aplicativo +
                ", cliente=" + cliente +
                ", data_inicio=" + data_inicio +
                ", data_fim=" + data_fim +
                ", status=" + status +
                '}';
    }
}
