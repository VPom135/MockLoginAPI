package br.cefetmg.mockloginapi.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-16T22:54:58", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Departament.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departament, String> telefone;
    public static volatile SingularAttribute<Departament, Campus> campus;
    public static volatile SingularAttribute<Departament, String> nome;
    public static volatile SingularAttribute<Departament, Integer> id;
    public static volatile ListAttribute<Departament, User> funcionarios;
    public static volatile SingularAttribute<Departament, String> email;

}