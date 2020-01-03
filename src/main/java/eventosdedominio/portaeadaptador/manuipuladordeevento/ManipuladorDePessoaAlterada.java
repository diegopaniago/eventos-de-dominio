package eventosdedominio.portaeadaptador.manuipuladordeevento;

import eventosdedominio.dominio.pessoa.PessoaAlterada;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ManipuladorDePessoaAlterada implements ApplicationListener<PessoaAlterada> {
    @Override
    public void onApplicationEvent(PessoaAlterada pessoaAlterada) {
        System.out.println("Evento Pessoa alterada -------------------------");
        System.out.println(pessoaAlterada.getData().toString());
        System.out.println(pessoaAlterada.getNomeAntigo());
        System.out.println(pessoaAlterada.getNomeAtual());
    }
}
