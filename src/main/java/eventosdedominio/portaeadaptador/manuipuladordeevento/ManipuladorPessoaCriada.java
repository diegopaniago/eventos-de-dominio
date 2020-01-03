package eventosdedominio.portaeadaptador.manuipuladordeevento;

import eventosdedominio.dominio.pessoa.PessoaCriada;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ManipuladorPessoaCriada implements ApplicationListener<PessoaCriada> {

    @Override
    public void onApplicationEvent(PessoaCriada pessoaCriada) {
        System.out.println("-------------------------");
        System.out.println(pessoaCriada.getData().toString());
        System.out.println(pessoaCriada.getNome());
    }

}
