package domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "pagamentos", uniqueConstraints = @UniqueConstraint(columnNames = { "id" }))
public class Pagamento {
    @Id
    @GeneratedValue
    private Long id;

    private Assinatura assinatura;

    private float valorPago;

    private Data dataPagamento;

    private String promocao;
}
