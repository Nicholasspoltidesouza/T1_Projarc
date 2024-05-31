package application.usecase;

import application.dto.ClienteDTO;
import application.mapper.ClienteMapper;
import domain.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collection;

@RequiredArgsConstructor
@Component
public class ListaTodosClientesUC {
    private final ClienteMapper clienteMapper;
    private final ClienteService clienteService;

    public Collection<ClienteDTO> run() {
        return clienteMapper.toClienteDTOs(clienteService.listaTodosClientes());
    }
}