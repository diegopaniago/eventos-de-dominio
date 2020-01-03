package eventosdedominio.aplicacao;

import eventosdedominio.dominio.pessoa.Pessoa;
import eventosdedominio.dominio.pessoa.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaPessoa {

    private PessoaRepositorio pessoaRepositorio;

    @Autowired
    public ConsultaPessoa(PessoaRepositorio pessoaRepositorio) {
        this.pessoaRepositorio = pessoaRepositorio;
    }

    public PessoaDto consultarPorId(String id) {
        Pessoa pessoa = pessoaRepositorio.findById(id).get();
        PessoaDto pessoaDto = new PessoaDto();
        pessoaDto.id = pessoa.getId();
        pessoaDto.nome = pessoa.getNome();
        return pessoaDto;
    }


}
