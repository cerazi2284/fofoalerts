package consumer;


import mensagemDTO.MensagemDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MensagemConsumer {

    // Indica que quer escutar no tópico "fofo-mensagem" que foi usado pra publicar as mensagens
    @KafkaListener(topics = "fofo-mensagem", groupId = "grupo-fofo-consumer")
    public void consumeMessage(MensagemDTO mensagem) {
        System.out.println("🔔 Mensagem recebida pelo Consumer: " + mensagem);

        // Aqui tu pode simular diversas ações, tipo:
        atualizarDashboard(mensagem);
        enviarEmail(mensagem);
        notificarUsuario(mensagem);
    }

    // Métodos simulados de ações
    private void atualizarDashboard(MensagemDTO mensagem) {
        // Lógica pra atualizar um dashboard (simulação)
        System.out.println("📊 Dashboard atualizado com a mensagem: " + mensagem.getTexto());
    }

    private void enviarEmail(MensagemDTO mensagem) {
        // Simulação de envio de e-mail
        System.out.println("📧 E-mail enviado para o remetente: " + mensagem.getRemetente());
    }

    private void notificarUsuario(MensagemDTO mensagem) {
        // Simulação de notificação
        System.out.println("🔔 Notificação enviada para o usuário: " + mensagem.getRemetente());
    }
}
