package eventosdedominio.dominio.pessoa;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

public class PessoaCriada extends ApplicationEvent {

    private LocalDate data;
    private String nome;

    public PessoaCriada(Object source, LocalDate data, String nome) {
        super(source);
        this.data = data;
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }
}
