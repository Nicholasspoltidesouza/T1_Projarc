package application.usecase;

import java.util.Collection;

import org.springframework.stereotype.Component;

import application.dto.ClienteDTO;
import application.mapper.ClienteMapper;
import domain.service.ClienteService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class ListaTodosClientesUC {
    private final ClienteService clienteService;
    private final ClienteMapper clienteMapper;

    public Collection<ClienteDTO> run() {
        return clienteMapper.toClienteDTOs(clienteService.listaTodosClientes());
    }
}
