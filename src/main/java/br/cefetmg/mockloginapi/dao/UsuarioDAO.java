package br.cefetmg.mockloginapi.dao;

//import br.cefetmg.mockloginapi.entity.Departamento;
import br.cefetmg.mockloginapi.entity.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UsuarioDAO implements DaoInterface<Usuario>{

    @Override
    public List<Usuario> getAll(EntityManager em) {

        String jpql = "SELECT u FROM Usuario u";

        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);

        return query.getResultList();

    }

    public Usuario getByJpql(String jpql, EntityManager em) {

        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);

        List<Usuario> result = query.getResultList();

        if (result.isEmpty()) {
            return null;
        }

        return result.getFirst();

    }

    @Override
    public Usuario getById(int id, EntityManager em) {
        
        String jpql = "SELECT u FROM Usuario u WHERE u.id = %d".formatted(id);
        return getByJpql(jpql, em);
        
    }

    @Override
    public Usuario getByName(String name, EntityManager em) {

        String jpql = "SELECT u FROM Usuario u WHERE u.nome LIKE '%s'".formatted(name);
        return getByJpql(jpql, em);

    }

    public Usuario getByCpf(String cpf, EntityManager em) {

        String jpql = "SELECT u FROM Usuario u WHERE u.cpf LIKE '%s'".formatted(cpf);
        return getByJpql(jpql, em);

    }
    
}