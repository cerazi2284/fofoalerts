package com.fofoalerts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MensagemDTO {

    @Schema(description = "Quem enviou a mensagem", example = "Tiago")
    private String remetente;

    @Schema(description = "Conteúdo da mensagem", example = "Fala aí, beleza?")
    private String texto;

    @Override
    public String toString() {
        return "MensagemDTO{" +
                "remetente='" + remetente + '\'' +
                ", texto='" + texto + '\'' +
                '}';
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
