package br.cefetmg.mockloginapi.entity;

import java.sql.Blob;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-21T11:40:54", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, String> cpf;
    public static volatile SingularAttribute<User, Blob> icon;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Departament> departament;

}