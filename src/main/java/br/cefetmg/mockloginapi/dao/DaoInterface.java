package br.cefetmg.mockloginapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

public interface DaoInterface<T> {

    public List<T> getAll(EntityManager em);

    public T getById(int id, EntityManager em);

    public T getByName(String name, EntityManager em);

}
