package eventosdedominio.aplicacao;

import eventosdedominio.dominio.pessoa.Pessoa;
import eventosdedominio.dominio.pessoa.PessoaAlterada;
import eventosdedominio.dominio.pessoa.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AtualizaPessoa {

    private PessoaRepositorio pessoaRepositorio;
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public AtualizaPessoa(PessoaRepositorio pessoaRepositorio, ApplicationEventPublisher applicationEventPublisher) {
        this.pessoaRepositorio = pessoaRepositorio;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void atualizar(PessoaDto pessoaDto) throws Exception {
        Pessoa pessoa = pessoaRepositorio.findById(pessoaDto.id).get();
        PessoaAlterada pessoaAlterada = new PessoaAlterada(this, LocalDate.now(), pessoa.getNome(), pessoaDto.nome);
        pessoa.alterarNome(pessoaDto.nome);
        pessoaRepositorio.save(pessoa);
        applicationEventPublisher.publishEvent(pessoaAlterada);
    }
}
