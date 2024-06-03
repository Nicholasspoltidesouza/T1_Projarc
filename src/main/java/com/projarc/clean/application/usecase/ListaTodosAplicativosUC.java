package com.projarc.clean.application.usecase;

import com.projarc.clean.application.dto.AplicativoDTO;
import com.projarc.clean.domain.service.AplicativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class ListaTodosAplicativosUC {
    private final AplicativoService aplicativoService;

    @Autowired
    public ListaTodosAplicativosUC(AplicativoService aplicativoService) {
        this.aplicativoService = aplicativoService;
    }

    public Collection<AplicativoDTO> run() {
        return aplicativoService.listaTodosAplicativos().stream()
                .map(aplicativo -> new AplicativoDTO(aplicativo.getId(), aplicativo.getNome(), aplicativo.getCustoMensal()))
                .collect(Collectors.toList());
    }
}
