package br.cefetmg.mockloginapi.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-21T11:40:54", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Departament.class)
public class Departament_ { 

    public static volatile SingularAttribute<Departament, Campus> campus;
    public static volatile SingularAttribute<Departament, String> name;
    public static volatile SingularAttribute<Departament, Integer> id;
    public static volatile ListAttribute<Departament, User> funcionarios;
    public static volatile SingularAttribute<Departament, String> contactPhone;
    public static volatile SingularAttribute<Departament, String> email;

}