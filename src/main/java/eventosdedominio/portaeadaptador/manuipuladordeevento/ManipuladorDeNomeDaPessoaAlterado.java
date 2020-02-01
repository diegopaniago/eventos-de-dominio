package eventosdedominio.portaeadaptador.manuipuladordeevento;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import eventosdedominio.dominio.pessoa.NomeDaPessoaAlterado;

@Component
public class ManipuladorDeNomeDaPessoaAlterado implements ApplicationListener<NomeDaPessoaAlterado> {
    @Override
    public void onApplicationEvent(NomeDaPessoaAlterado nomeDaPessoaAlterado) {
        System.out.println("Evento Pessoa alterada");
        System.out.println(nomeDaPessoaAlterado.getData().toString());
        System.out.println(nomeDaPessoaAlterado.getNomeAntigo());
        System.out.println(nomeDaPessoaAlterado.getNomeAtual());
    }
}
