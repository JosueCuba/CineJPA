package modelo.entidad;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Cliente;
import modelo.entidad.Detalleventa;
import modelo.entidad.Pelicula;
import modelo.entidad.Personal;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T14:51:31")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile ListAttribute<Venta, Detalleventa> detalleventaList;
    public static volatile SingularAttribute<Venta, Cliente> idcli;
    public static volatile SingularAttribute<Venta, Personal> idper;
    public static volatile SingularAttribute<Venta, BigDecimal> idvent;
    public static volatile SingularAttribute<Venta, Date> fecvent;
    public static volatile SingularAttribute<Venta, Long> totvent;
    public static volatile SingularAttribute<Venta, Pelicula> idpel;

}