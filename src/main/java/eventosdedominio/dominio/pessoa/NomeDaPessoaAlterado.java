package eventosdedominio.dominio.pessoa;

import eventosdedominio.dominio.base.EventoDeDominio;

import java.time.LocalDateTime;

public class NomeDaPessoaAlterado extends EventoDeDominio {

    private String nomeAntigo;
    private String nomeAtual;

    public NomeDaPessoaAlterado(Object source, LocalDateTime data, String nomeAntigo, String nomeAtual) {
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
