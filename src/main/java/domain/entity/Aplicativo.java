package domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "aplicativos", uniqueConstraints = @UniqueConstraint(columnNames = {"id"}))
public class Aplicativo {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private float custoMensal;
}
