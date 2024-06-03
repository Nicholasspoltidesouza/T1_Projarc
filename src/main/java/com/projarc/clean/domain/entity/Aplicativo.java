package com.projarc.clean.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "aplicativos", uniqueConstraints = @UniqueConstraint(columnNames = {"id"}))
public class Aplicativo {
    @Id
    @GeneratedValue
    private long id;

    private String nome;

    @Column(name = "custo_mensal")
    private double custoMensal;
}
