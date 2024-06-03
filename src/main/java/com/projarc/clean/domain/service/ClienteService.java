package com.projarc.clean.domain.service;

import com.projarc.clean.domain.entity.Cliente;
import com.projarc.clean.domain.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final IClienteRepository clienteRepository;

    @Autowired
    public ClienteService(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listaTodosClientes() {
        return clienteRepository.findAll();
    }
}
