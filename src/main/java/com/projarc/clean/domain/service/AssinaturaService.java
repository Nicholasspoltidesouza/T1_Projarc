package com.projarc.clean.domain.service;

import com.projarc.clean.domain.entity.Assinatura;
import com.projarc.clean.domain.repository.IAssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AssinaturaService {
    private final IAssinaturaRepository assinaturaRepository;

    @Autowired
    public AssinaturaService(IAssinaturaRepository assinaturaRepository) {
        this.assinaturaRepository = assinaturaRepository;
    }

    public Assinatura cadastraAssinatura(Assinatura assinatura) {
        return assinaturaRepository.save(assinatura);
    }
}
