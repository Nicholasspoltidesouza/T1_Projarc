package com.projarc.clean.adapter;

import com.projarc.clean.application.dto.AplicativoDTO;
import com.projarc.clean.application.usecase.ListaTodosAplicativosUC;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("/servcad")
public class AplicativoController {
    private final ListaTodosAplicativosUC listaTodosAplicativosUC;

    @Operation(description = "Lista todos os clientes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, array = @ArraySchema(schema = @Schema(implementation = AplicativoDTO.class)))),
            @ApiResponse(responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = String.class)))
    })
    @GetMapping("aplicativos")
    public ResponseEntity<Collection<AplicativoDTO>> listarAplicativos() {
        return ResponseEntity.ok(listaTodosAplicativosUC.run());
    }

}
