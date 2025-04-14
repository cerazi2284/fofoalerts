package com.fofoalerts.producer;

import com.fofoalerts.dto.MensagemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MensagemProducer {

    private final KafkaTemplate<String, MensagemDTO> kafkaTemplate;

    @Autowired
    public MensagemProducer(KafkaTemplate<String, MensagemDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarMensagem(MensagemDTO mensagem) {
        // Verifique o conteúdo da mensagem antes de enviar
        System.out.println("📤 Enviando mensagem para o Kafka: " + mensagem);

        // Envia a mensagem para o tópico Kafka
        kafkaTemplate.send("fofo-mensagem", mensagem);
    }
}
