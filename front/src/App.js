import React, { useState } from 'react';
import axios from 'axios';

function App() {
    const [message, setMessage] = useState("");

    const handleChange = (e) => {
        setMessage(e.target.value);
    };

    const sendMessage = async () => {
        try {
            const response = await axios.post("http://localhost:8080/send-message", {
                message: message
            });
            console.log("Mensagem enviada:", response.data);
        } catch (error) {
            console.error("Erro ao enviar a mensagem:", error);
        }
    };

    return (
        <div className="App">
            <h1>Enviar Mensagem para o Kafka</h1>
            <input
                type="text"
                value={message}
                onChange={handleChange}
                placeholder="Digite sua mensagem"
            />
            <button onClick={sendMessage}>Enviar</button>
        </div>
    );
}

export default App;
