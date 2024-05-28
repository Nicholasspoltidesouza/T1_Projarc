package application.dto;

import lombok.Data;

public record PagamentoDTO(Long id, AssinaturaDTO assinatura, float valor, Data dataPagamento, String promocao) {
}
