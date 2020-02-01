package eventosdedominio.portaeadaptador.rest;

import eventosdedominio.aplicacao.AdicionaPessoa;
import eventosdedominio.aplicacao.AtualizaPessoa;
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

    @Autowired
    private AtualizaPessoa atualizaPessoa;

    @GetMapping("/{id}")
    public PessoaDto ObterPessoa(@PathVariable("id") String id) {
        return consultaPessoa.consultarPorId(id);
    }

    @PostMapping
    public void adicionar(PessoaDto pessoaDto) throws Exception {
        adicionaPessoa.adicionar(pessoaDto);
    }

    @PutMapping
    public void atualizar(PessoaDto pessoaDto) throws Exception {
        atualizaPessoa.atualizarNome(pessoaDto);
    }

}
