package modelo.entidad;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Detalleventa;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T14:51:31")
@StaticMetamodel(Combo.class)
public class Combo_ { 

    public static volatile SingularAttribute<Combo, BigDecimal> idcomb;
    public static volatile ListAttribute<Combo, Detalleventa> detalleventaList;
    public static volatile SingularAttribute<Combo, BigInteger> preccomb;
    public static volatile SingularAttribute<Combo, String> nomcomb;
    public static volatile SingularAttribute<Combo, String> desccomb;

}