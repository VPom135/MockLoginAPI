package br.cefetmg.mockloginapi.dao;

import br.cefetmg.mockloginapi.entity.Departamento;
import br.cefetmg.mockloginapi.entity.Usuario;
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

    @Override
    public Usuario getById(int id, EntityManager em) {
        
        String jpql = "SELECT u FROM Usuario u WHERE u.usuarioid = %d".formatted(id);

        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);

        List<Usuario> result = query.getResultList();

        if (result.isEmpty()) {
            return null;
        }

        return result.getFirst();
        
    }

    @Override
    public Usuario getByName(String name, EntityManager em) {

        String jpql = "SELECT u FROM Usuario u WHERE u.nome LIKE '%s'".formatted(name);

        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);

        List<Usuario> result = query.getResultList();

        if (result.isEmpty()) {
            return null;
        }

        return result.getFirst();

    }
    
}