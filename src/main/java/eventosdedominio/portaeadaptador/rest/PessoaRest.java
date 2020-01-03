package eventosdedominio.portaeadaptador.rest;

import eventosdedominio.aplicacao.AdicionaPessoa;
import eventosdedominio.aplicacao.ConsultaPessoa;
import eventosdedominio.aplicacao.PessoaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaRest {

    @Autowired
    private ConsultaPessoa consultaPessoa;

    @Autowired
    private AdicionaPessoa adicionaPessoa;

    @GetMapping
    public PessoaDto ObterPessoa() throws Exception {
        PessoaDto pessoaDto = new PessoaDto();
        pessoaDto.nome = "Diego";
        adicionaPessoa.adicionar(pessoaDto);
        return pessoaDto;
    }

}
