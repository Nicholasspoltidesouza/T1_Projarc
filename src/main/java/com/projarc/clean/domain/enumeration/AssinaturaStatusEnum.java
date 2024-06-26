package com.projarc.clean.domain.enumeration;

public enum AssinaturaStatusEnum {
    ATIVA(1),
    CANCELADA(0);

    private Integer status;

    AssinaturaStatusEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }
}
