package br.cefetmg.mockloginapi.entity;

import br.cefetmg.mockloginapi.entity.Campus;
import br.cefetmg.mockloginapi.entity.Usuario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-16T22:54:58", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, String> telefone;
    public static volatile SingularAttribute<Departamento, Campus> campus;
    public static volatile SingularAttribute<Departamento, String> nome;
    public static volatile SingularAttribute<Departamento, Integer> id;
    public static volatile ListAttribute<Departamento, Usuario> funcionarios;
    public static volatile SingularAttribute<Departamento, String> email;

}