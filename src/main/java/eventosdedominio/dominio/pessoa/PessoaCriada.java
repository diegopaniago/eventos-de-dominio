package eventosdedominio.dominio.pessoa;

import eventosdedominio.dominio.base.EventoDeDominio;

import java.time.LocalDate;

public class PessoaCriada extends EventoDeDominio {

    private String nome;

    public PessoaCriada(Object source, LocalDate data, String nome) {
        super(source, data);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
