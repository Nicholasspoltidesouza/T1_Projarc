package com.projarc.clean.application.mapper;

import com.projarc.clean.application.dto.AssinaturaDTO;
import com.projarc.clean.application.dto.AssinaturaNovaDTO;
import com.projarc.clean.domain.entity.Assinatura;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AssinaturaMapper {

    @Mapping(target = "id", ignore = true)
    Assinatura toAssinatura(AssinaturaNovaDTO assinaturaNovaDTO);

    AssinaturaDTO toAssinaturaDTO(Assinatura assinatura);

}
