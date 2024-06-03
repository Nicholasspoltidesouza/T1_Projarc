package com.projarc.clean.domain.entity;

import com.projarc.clean.domain.enumeration.AssinaturaStatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "assinaturas", uniqueConstraints = @UniqueConstraint(columnNames = {"id"}))
public class Assinatura {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "aplicativo_id")
    private Aplicativo aplicativo;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_fim")
    private Date dataFim;

    @Enumerated(EnumType.ORDINAL)
    private AssinaturaStatusEnum status;
}
