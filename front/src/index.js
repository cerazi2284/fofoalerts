import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App'; // Esse é o arquivo App.js que você acabou de configurar
import reportWebVitals from './reportWebVitals';

ReactDOM.render(
    <React.StrictMode>
        <App />
    </React.StrictMode>,
    document.getElementById('root')
);

// Se você quiser medir o desempenho, pode passar uma função para reportWebVitals
reportWebVitals();
