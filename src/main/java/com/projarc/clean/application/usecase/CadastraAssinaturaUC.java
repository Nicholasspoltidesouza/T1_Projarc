package com.projarc.clean.application.usecase;

import com.projarc.clean.application.dto.AssinaturaDTO;
import com.projarc.clean.application.dto.AssinaturaNovaDTO;
import com.projarc.clean.application.mapper.AssinaturaMapper;
import com.projarc.clean.domain.service.AssinaturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CadastraAssinaturaUC {
    private final AssinaturaService assinaturaService;
    private final AssinaturaMapper assinaturaMapper;

    public AssinaturaDTO run(AssinaturaNovaDTO assinaturaNovaDTO){
        return assinaturaMapper.toAssinaturaDTO(assinaturaService.cadastraAssinatura(assinaturaMapper.toAssinatura(assinaturaNovaDTO)));
    }

}
