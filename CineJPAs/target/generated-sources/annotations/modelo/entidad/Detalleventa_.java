package modelo.entidad;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Combo;
import modelo.entidad.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T15:22:49")
@StaticMetamodel(Detalleventa.class)
public class Detalleventa_ { 

    public static volatile SingularAttribute<Detalleventa, Combo> idcomb;
    public static volatile SingularAttribute<Detalleventa, BigInteger> precio;
    public static volatile SingularAttribute<Detalleventa, BigInteger> cantdetvent;
    public static volatile SingularAttribute<Detalleventa, BigDecimal> iddetvent;
    public static volatile SingularAttribute<Detalleventa, Venta> idvent;

}