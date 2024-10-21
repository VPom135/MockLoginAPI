package br.cefetmg.mockloginapi.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-16T22:54:58", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(User.class)
public class Usuario_ { 

    public static volatile SingularAttribute<User, String> senha;
    public static volatile SingularAttribute<User, String> cpf;
    public static volatile SingularAttribute<User, Departament> departamento;
    public static volatile SingularAttribute<User, String> nome;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> email;

}