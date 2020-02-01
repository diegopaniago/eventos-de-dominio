package eventosdedominio.aplicacao;

import eventosdedominio.dominio.pessoa.Pessoa;
import eventosdedominio.dominio.pessoa.NomeDaPessoaAlterado;
import eventosdedominio.dominio.pessoa.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AtualizaPessoa {

    private PessoaRepositorio pessoaRepositorio;
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public AtualizaPessoa(PessoaRepositorio pessoaRepositorio, ApplicationEventPublisher applicationEventPublisher) {
        this.pessoaRepositorio = pessoaRepositorio;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void atualizarNome(PessoaDto pessoaDto) throws Exception {
        Pessoa pessoa = pessoaRepositorio.findById(pessoaDto.id).get();
        NomeDaPessoaAlterado nomeDaPessoaAlterado = new NomeDaPessoaAlterado(this, LocalDateTime.now(),
            pessoa.getNome(),
            pessoaDto.nome);
        pessoa.alterarNome(pessoaDto.nome);
        pessoaRepositorio.save(pessoa);
        applicationEventPublisher.publishEvent(nomeDaPessoaAlterado);
    }
}
