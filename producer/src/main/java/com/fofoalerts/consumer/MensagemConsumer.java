package com.fofoalerts.consumer;

import com.fofoalerts.dto.MensagemDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MensagemConsumer {

    @KafkaListener(topics = "fofo-mensagem", groupId = "grupo-fofo", containerFactory = "mensagemKafkaListenerContainerFactory")
    public void consumirMensagem(MensagemDTO mensagem) {
        // Verifica o conteúdo da mensagem
        if (mensagem == null) {
            System.out.println("A mensagem está null");
        } else {
            System.out.println("📥 Mensagem recebida no Kafka: " + mensagem);
        }
    }
}

