package domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes", uniqueConstraints = @UniqueConstraint(columnNames = { "id" }))
public class Cliente {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String email;
}
