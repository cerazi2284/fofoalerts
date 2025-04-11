package com.fofoalerts.controller;

import com.fofoalerts.dto.MensagemDTO;
import com.fofoalerts.producer.MensagemProducer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagem")
@Tag(name = "Mensagens", description = "Envio de mensagens solidárias")
public class MensagemController {

    @Autowired
    private MensagemProducer mensagemProducer;

    @PostMapping
    @Operation(summary = "Envia uma mensagem para o sistema e publica no Kafka")
    public ResponseEntity<String> enviarMensagem(@RequestBody MensagemDTO mensagem) {
        System.out.println("📨 Mensagem recebida: " + mensagem);

        mensagemProducer.enviarMensagem(mensagem);

        return ResponseEntity.status(HttpStatus.CREATED).body("Mensagem enviada com sucesso ao Kafka!");
    }
}
