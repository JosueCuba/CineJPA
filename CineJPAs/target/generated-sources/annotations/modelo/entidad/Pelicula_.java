package modelo.entidad;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Funcion;
import modelo.entidad.Genero;
import modelo.entidad.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T15:22:49")
@StaticMetamodel(Pelicula.class)
public class Pelicula_ { 

    public static volatile SingularAttribute<Pelicula, String> paispel;
    public static volatile SingularAttribute<Pelicula, String> clsfpel;
    public static volatile SingularAttribute<Pelicula, Genero> idgen;
    public static volatile ListAttribute<Pelicula, Funcion> funcionList;
    public static volatile SingularAttribute<Pelicula, Character> estpel;
    public static volatile ListAttribute<Pelicula, Venta> ventaList;
    public static volatile SingularAttribute<Pelicula, String> titpel;
    public static volatile SingularAttribute<Pelicula, BigDecimal> idpel;
    public static volatile SingularAttribute<Pelicula, Date> fecestnpel;
    public static volatile SingularAttribute<Pelicula, String> durcpel;

}