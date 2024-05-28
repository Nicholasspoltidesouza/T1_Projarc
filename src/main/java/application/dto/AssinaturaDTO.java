package application.dto;

import lombok.Data;

public record AssinaturaDTO(Long id, AplicativoDTO aplicativo, ClienteDTO cliente, Data inicioVigencia,
        Data fimVigencia) {
}
