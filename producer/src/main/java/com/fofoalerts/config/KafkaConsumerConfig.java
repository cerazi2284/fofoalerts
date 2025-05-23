package com.fofoalerts.config;

import com.fofoalerts.dto.MensagemDTO;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
public class KafkaConsumerConfig {

    @Bean
    public ConsumerFactory<String, MensagemDTO> mensagemConsumerFactory() {
        JsonDeserializer<MensagemDTO> deserializer = new JsonDeserializer<>(MensagemDTO.class);
        deserializer.setRemoveTypeHeaders(false); // Não remove os cabeçalhos de tipo
        deserializer.addTrustedPackages("com.fofoalerts.dto"); // Confirma o pacote de confiança
        deserializer.setUseTypeMapperForKey(false);

        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "grupo-fofo");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class); // Corrige aqui

        return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(), deserializer);
    }

    @Bean(name = "mensagemKafkaListenerContainerFactory")
    public ConcurrentKafkaListenerContainerFactory<String, MensagemDTO> mensagemKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, MensagemDTO> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(mensagemConsumerFactory());
        return factory;
    }
}
