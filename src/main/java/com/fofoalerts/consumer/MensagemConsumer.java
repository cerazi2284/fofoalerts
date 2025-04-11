package com.fofoalerts.consumer;

import com.fofoalerts.dto.MensagemDTO;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.hibernate.annotations.Comment;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MensagemConsumer {

    @KafkaListener(topics = "fofo-mensagem", groupId = "grupo-fofo")
    public void consumeMensagem(ConsumerRecord<String, MensagemDTO> record) {
        System.out.println("📥 Mensagem recebida no Kafka: " + record.value());
    }
}
