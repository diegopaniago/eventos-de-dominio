package eventosdedominio.dominio;

public interface PessoaRepositorio {
    void adicionar(Pessoa pessoa);
    void atualizar(Pessoa pessoa);
    Pessoa buscarPorId(String id);
}
