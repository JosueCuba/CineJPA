package modelo.entidad;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Funcion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T15:22:49")
@StaticMetamodel(Cartelera.class)
public class Cartelera_ { 

    public static volatile ListAttribute<Cartelera, Funcion> funcionList;
    public static volatile SingularAttribute<Cartelera, Date> fecinccart;
    public static volatile SingularAttribute<Cartelera, BigDecimal> idcart;
    public static volatile SingularAttribute<Cartelera, Date> fecfincart;

}