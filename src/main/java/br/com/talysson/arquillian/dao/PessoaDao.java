package br.com.talysson.arquillian.dao;

import br.com.talysson.arquillian.orm.Pessoa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by talyssoncastro on 07/11/15.
 */
@Stateless
public class PessoaDao {
    @PersistenceContext(unitName = "teste")
    EntityManager em;

    public void salvar(Pessoa p) {
        em.persist(p);
    }

    public void atualizar(Pessoa p) {
        em.merge(p);
    }

    public Pessoa buscar(int id) {
        return em.find(Pessoa.class, id);
    }

    public List<Pessoa> buscarTodasPessoas() {
        return em.createQuery("SELECT p FROM Pessoa p ORDER BY p.id", Pessoa.class).getResultList();
    }
}
