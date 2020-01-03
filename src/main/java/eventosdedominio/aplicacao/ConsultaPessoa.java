package eventosdedominio.aplicacao;

import eventosdedominio.dominio.Pessoa;
import eventosdedominio.dominio.PessoaRepositorio;
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
        Pessoa pessoa = pessoaRepositorio.buscarPorId(id);
        PessoaDto pessoaDto = new PessoaDto();
        pessoaDto.id = pessoa.getId();
        pessoaDto.nome = pessoa.getNome();
        return pessoaDto;
    }


}
