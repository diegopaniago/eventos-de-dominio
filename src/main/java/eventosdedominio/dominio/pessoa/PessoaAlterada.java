package eventosdedominio.dominio.pessoa;

import eventosdedominio.dominio.base.EventoDeDominio;

import java.time.LocalDate;

public class PessoaAlterada extends EventoDeDominio {

    private String nomeAntigo;
    private String nomeAtual;

    public PessoaAlterada(Object source, LocalDate data, String nomeAntigo, String nomeAtual) {
        super(source, data);
        this.nomeAntigo = nomeAntigo;
        this.nomeAtual = nomeAtual;
    }

    public String getNomeAntigo() {
        return nomeAntigo;
    }

    public String getNomeAtual() {
        return nomeAtual;
    }
}
