package br.cefetmg.mockloginapi.dao;

import br.cefetmg.mockloginapi.entity.Departament;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class DepartamentDAO implements DaoInterface<Departament> {

    @Override
    public List<Departament> getAll(EntityManager em) {

        String jpql = "SELECT d FROM departament d";

        TypedQuery<Departament> query = em.createQuery(jpql, Departament.class);

        return query.getResultList();

    }

    @Override
    public Departament getById(int id, EntityManager em) {

        String jpql = "SELECT d FROM departament d WHERE d.departamentoid = %d".formatted(id);

        TypedQuery<Departament> query = em.createQuery(jpql, Departament.class);

        List<Departament> result = query.getResultList();

        if (result.isEmpty()) {
            return null;
        }

        return result.getFirst();

    }

    @Override
    public Departament getByName(String name, EntityManager em) {

        String jpql = "SELECT d FROM departament d WHERE d.nome LIKE '%s'".formatted(name);

        TypedQuery<Departament> query = em.createQuery(jpql, Departament.class);

        List<Departament> result = query.getResultList();

        if (result.isEmpty()) {
            return null;
        }

        return result.getFirst();

    }

}