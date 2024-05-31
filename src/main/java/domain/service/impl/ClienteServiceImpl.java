package domain.service.impl;

import java.util.Collection;

import org.springframework.stereotype.Service;

import domain.entity.Cliente;
import domain.repository.ClienteRepository;
import domain.service.ClienteService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public Collection<Cliente> listaTodosClientes() {
        return clienteRepository.findAll();

    }

}
