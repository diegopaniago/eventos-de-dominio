package eventosdedominio.aplicacao;

import eventosdedominio.dominio.pessoa.Pessoa;
import eventosdedominio.dominio.pessoa.PessoaCriada;
import eventosdedominio.dominio.pessoa.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AdicionaPessoa {

    private PessoaRepositorio pessoaRepositorio;
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public AdicionaPessoa(PessoaRepositorio pessoaRepositorio, ApplicationEventPublisher applicationEventPublisher) {
        this.pessoaRepositorio = pessoaRepositorio;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void adicionar(PessoaDto pessoaDto) throws Exception {
        Pessoa pessoa = new Pessoa(pessoaDto.nome);
        pessoaRepositorio.save(pessoa);
        applicationEventPublisher.publishEvent(new PessoaCriada(this, LocalDate.now(),pessoa.getNome()));
    }
}
