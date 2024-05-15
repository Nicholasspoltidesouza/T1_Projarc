package domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "assinaturas", uniqueConstraints = @UniqueConstraint(columnNames = { "id" }))
public class Assinatura {
    @Id
    @GeneratedValue
    private Long id;

    private Aplicativo aplicativo;

    private Cliente cliente;

    private Data inicioVigencia;

    private Data fimVigencia;
}
