package eventosdedominio.portaeadaptador.repositorio;

import eventosdedominio.dominio.Pessoa;
import eventosdedominio.dominio.PessoaRepositorio;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.Optional;

@Repository
public class PessoaRepositorioHibernate extends RepositorioHibernate implements PessoaRepositorio {

    @Override
    public void adicionar(Pessoa pessoa) {
        getEntityManager().persist(pessoa);
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        getEntityManager().merge(pessoa);
    }

    @Override
    public Pessoa buscarPorId(String id) {
        Query query = getEntityManager().createQuery("SELECT p FROM Pessoa p WHERE p.id = :id");
        query.setParameter("id", id);
        Optional resultadoDaConsulta = query.getResultStream().findFirst();
        return resultadoDaConsulta.isPresent() ? (Pessoa) resultadoDaConsulta.get() : null;
    }
}
