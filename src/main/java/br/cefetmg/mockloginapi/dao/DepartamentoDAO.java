package br.cefetmg.mockloginapi.dao;

import br.cefetmg.mockloginapi.entity.Departamento;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class DepartamentoDAO implements DaoInterface<Departamento> {

    @Override
    public List<Departamento> getAll(EntityManager em) {

        String jpql = "SELECT d FROM departamento d";

        TypedQuery<Departamento> query = em.createQuery(jpql, Departamento.class);

        return query.getResultList();

    }

    @Override
    public Departamento getById(int id, EntityManager em) {

        String jpql = "SELECT d FROM Departamento d WHERE d.id = %d".formatted(id);

        TypedQuery<Departamento> query = em.createQuery(jpql, Departamento.class);

        List<Departamento> result = query.getResultList();

        if (result.isEmpty()) {
            return null;
        }

        return result.getFirst();

    }

    @Override
    public Departamento getByName(String name, EntityManager em) {

        String jpql = "SELECT d FROM Departamento d WHERE d.nome LIKE '%s'".formatted(name);

        TypedQuery<Departamento> query = em.createQuery(jpql, Departamento.class);

        List<Departamento> result = query.getResultList();

        if (result.isEmpty()) {
            return null;
        }

        return result.getFirst();

    }

}