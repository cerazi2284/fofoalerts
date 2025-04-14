package mensagemDTO;

public class MensagemDTO {
    private String remetente;
    private String texto;

    // Getters, setters e um toString() (pra facilitar os logs)
    public String getRemetente() {
        return remetente;
    }
    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    @Override
    public String toString() {
        return "MensagemDTO{" +
                "remetente='" + remetente + '\'' +
                ", texto='" + texto + '\'' +
                '}';
    }
}

