package com.fofoalerts.producer;

import com.fofoalerts.dto.MensagemDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MensagemProducer {

    private final KafkaTemplate<String, MensagemDTO> kafkaTemplate;
    private final String TOPICO = "fofo-mensagem";

    public void enviarMensagem(MensagemDTO mensagem) {
        System.out.println("📤 Enviando mensagem pro Kafka...: " + mensagem);
        kafkaTemplate.send(TOPICO, mensagem);
    }
}
