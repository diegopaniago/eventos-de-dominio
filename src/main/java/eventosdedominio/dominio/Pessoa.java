package eventosdedominio.dominio;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.util.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;

    @Column
    private String nome;

    public Pessoa() {
    }

    public Pessoa(String nome) throws Exception {
        validarCampoObrigatorio(nome);
        this.nome = nome;
    }

    private void validarCampoObrigatorio(String nome) throws Exception {
        if (StringUtils.isEmpty(nome)) {
            throw new Exception("É");
        }
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
