package br.cefetmg.mockloginapi.entity;

import br.cefetmg.mockloginapi.entity.Departamento;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-16T22:54:58", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Campus.class)
public class Campus_ { 

    public static volatile SingularAttribute<Campus, String> telefone;
    public static volatile SingularAttribute<Campus, String> endereco;
    public static volatile ListAttribute<Campus, Departamento> departamentos;
    public static volatile SingularAttribute<Campus, String> nome;
    public static volatile SingularAttribute<Campus, Integer> id;
    public static volatile SingularAttribute<Campus, String> email;

}