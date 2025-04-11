package com.fofoalerts.fofoalerts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO que representa uma mensagem enviada para Kafka")
public class MensagemDTO {

    @Schema(description = "Nome de quem está enviando a mensagem", example = "Tiago")
    private String remetente;
    @Schema(description = "Texto da mensagem", example = "Força, guerreiro!")
    private String texto;
}
