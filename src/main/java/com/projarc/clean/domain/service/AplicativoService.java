package com.projarc.clean.domain.service;

import com.projarc.clean.domain.entity.Aplicativo;
import com.projarc.clean.domain.repository.IAplicativoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AplicativoService {
    private final IAplicativoRepository aplicativoRepository;

    @Autowired
    public AplicativoService(IAplicativoRepository aplicativoRepository) {
        this.aplicativoRepository = aplicativoRepository;
    }

    public List<Aplicativo> listaTodosAplicativos() {
        return aplicativoRepository.findAll();
    }
}
