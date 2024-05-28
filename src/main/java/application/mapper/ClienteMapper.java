package application.mapper;

import org.springframework.stereotype.Component;

import application.dto.ClienteDTO;
import domain.entity.Cliente;

import java.util.Collection;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Component
@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ClienteMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "nome", ignore = true)
    @Mapping(target = "email", ignore = true)
    Cliente toCliente(ClienteDTO clienteDTO);

    Collection<ClienteDTO> toClienteDTOs(Collection<Cliente> clientes);
}
