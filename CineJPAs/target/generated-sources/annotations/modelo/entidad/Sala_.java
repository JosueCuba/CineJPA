package modelo.entidad;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Funcion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T14:51:31")
@StaticMetamodel(Sala.class)
public class Sala_ { 

    public static volatile ListAttribute<Sala, Funcion> funcionList;
    public static volatile SingularAttribute<Sala, BigDecimal> idsal;
    public static volatile SingularAttribute<Sala, String> nomsal;
    public static volatile SingularAttribute<Sala, Character> estsal;
    public static volatile SingularAttribute<Sala, BigInteger> capacsal;

}