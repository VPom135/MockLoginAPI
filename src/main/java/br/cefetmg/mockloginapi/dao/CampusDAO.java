package br.cefetmg.mockloginapi.dao;

import br.cefetmg.mockloginapi.entity.Campus;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CampusDAO implements DaoInterface<Campus> {

    @Override
    public List<Campus> getAll(EntityManager em) {

        String jpql = "SELECT c FROM Campus c";

        TypedQuery<Campus> query = em.createQuery(jpql, Campus.class);

        return query.getResultList();

    }

    @Override
    public Campus getById(int id, EntityManager em) {

        String jpql = "SELECT c FROM Campus c WHERE c.id = %d".formatted(id);

        TypedQuery<Campus> query = em.createQuery(jpql, Campus.class);

        List<Campus> result = query.getResultList();

        if (result.isEmpty()) {
            return null;
        }

        return result.getFirst();

    }

    @Override
    public Campus getByName(String name, EntityManager em) {

        String jpql = "SELECT c FROM campus c WHERE c.nome LIKE '%s'".formatted(name);

        TypedQuery<Campus> query = em.createQuery(jpql, Campus.class);

        List<Campus> result = query.getResultList();

        if (result.isEmpty()) {
            return null;
        }

        return result.getFirst();

    }

}