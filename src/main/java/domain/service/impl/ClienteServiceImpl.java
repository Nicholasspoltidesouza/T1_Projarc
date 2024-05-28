package domain.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import domain.entity.Cliente;
import domain.repository.ClienteRepository;
import domain.service.ClienteService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;
    private final ClienteService clienteService;

    @Override
    public Collection<Cliente> listaTodosClientes() {
        return clienteRepository.findAll();

    }

}
