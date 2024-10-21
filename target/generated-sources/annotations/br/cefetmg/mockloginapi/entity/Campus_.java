package br.cefetmg.mockloginapi.entity;

import br.cefetmg.mockloginapi.entity.Departament;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-21T11:40:54", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Campus.class)
public class Campus_ { 

    public static volatile ListAttribute<Campus, Departament> departaments;
    public static volatile SingularAttribute<Campus, String> name;
    public static volatile SingularAttribute<Campus, String> adress;
    public static volatile SingularAttribute<Campus, Integer> id;
    public static volatile SingularAttribute<Campus, String> contactPhone;
    public static volatile SingularAttribute<Campus, String> email;

}