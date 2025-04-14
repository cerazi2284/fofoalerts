import React, { useState } from 'react';
import axios from 'axios';

function App() {
    const [mensagem, setMensagem] = useState('');

    const handleChange = (e) => {
        setMensagem(e.target.value);
    };

    const enviar = async () => {
        console.log("Enviando mensagem:", mensagem);
        try {
            // Use a URL que bate com o mapping do seu controller (/mensagem)
            const response = await axios.post("http://localhost:8080/mensagem", {
                texto: mensagem,
                remetente: "Tiago"
            });
            console.log("Resposta do back:", response.data);
        } catch (err) {
            console.error("Erro ao enviar:", err);
        }
    };

    return (
        <div style={{ padding: "2rem" }}>
            <h2>Mensagem pro Kafka</h2>
            <input
                type="text"
                placeholder="Digite sua mensagem"
                value={mensagem}
                onChange={handleChange}
            />
            <button onClick={enviar}>Enviar</button>
        </div>
    );
}

export default App;
