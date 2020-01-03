package eventosdedominio.portaeadaptador.rest;

import eventosdedominio.aplicacao.ConsultaPessoa;
import eventosdedominio.aplicacao.PessoaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaRest {

    @Autowired
    private ConsultaPessoa consultaPessoa;

    @GetMapping("/{id}")
    public PessoaDto ObterPessoa(@PathVariable("id") String id) {
        return consultaPessoa.consultarPorId(id);
    }

}
