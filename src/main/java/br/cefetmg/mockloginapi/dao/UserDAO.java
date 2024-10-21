package br.cefetmg.mockloginapi.dao;

import br.cefetmg.mockloginapi.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAO implements DaoInterface<User>{

    @Override
    public List<User> getAll(EntityManager em) {

        String jpql = "SELECT u FROM User u";

        TypedQuery<User> query = em.createQuery(jpql, User.class);

        return query.getResultList();

    }

    @Override
    public User getById(int id, EntityManager em) {
        
        String jpql = "SELECT u FROM User u WHERE u.usuarioid = %d".formatted(id);

        TypedQuery<User> query = em.createQuery(jpql, User.class);

        List<User> result = query.getResultList();

        if (result.isEmpty()) {
            return null;
        }

        return result.getFirst();
        
    }

    @Override
    public User getByName(String name, EntityManager em) {

        String jpql = "SELECT u FROM User u WHERE u.nome LIKE '%s'".formatted(name);

        TypedQuery<User> query = em.createQuery(jpql, User.class);

        List<User> result = query.getResultList();

        if (result.isEmpty()) {
            return null;
        }

        return result.getFirst();

    }

    public User getByCpf(String cpf, EntityManager em) {

        String jpql = "SELECT u FROM User u WHERE u.cpf LIKE '%s'".formatted(cpf);

        TypedQuery<User> query = em.createQuery(jpql, User.class);

        List<User> result = query.getResultList();

        if (result.isEmpty()) {
            return null;
        }

        return result.getFirst();

    }
    
}