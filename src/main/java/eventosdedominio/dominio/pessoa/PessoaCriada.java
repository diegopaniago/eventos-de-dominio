package eventosdedominio.dominio.pessoa;

import eventosdedominio.dominio.base.EventoDeDominio;

import java.time.LocalDateTime;

public class PessoaCriada extends EventoDeDominio {

    private String nome;

    public PessoaCriada(Object source, LocalDateTime data, String nome) {
        super(source, data);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
