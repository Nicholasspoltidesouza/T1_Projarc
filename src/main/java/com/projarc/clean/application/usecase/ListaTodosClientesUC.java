package com.projarc.clean.application.usecase;

import com.projarc.clean.application.dto.ClienteDTO;
import com.projarc.clean.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class ListaTodosClientesUC {
    private final ClienteService clienteService;

    @Autowired
    public ListaTodosClientesUC(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public Collection<ClienteDTO> run() {
        return clienteService.listaTodosClientes().stream()
                .map(cliente -> new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getEmail()))
                .collect(Collectors.toList());
    }
}
