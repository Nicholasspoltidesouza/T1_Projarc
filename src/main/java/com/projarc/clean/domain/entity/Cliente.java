package com.projarc.clean.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "clientes", uniqueConstraints = @UniqueConstraint(columnNames = {"id"}))
public class Cliente {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String email;
}