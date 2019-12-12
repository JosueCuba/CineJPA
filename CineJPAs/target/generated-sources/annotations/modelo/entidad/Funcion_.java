package modelo.entidad;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Cartelera;
import modelo.entidad.Pelicula;
import modelo.entidad.Sala;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T15:22:49")
@StaticMetamodel(Funcion.class)
public class Funcion_ { 

    public static volatile SingularAttribute<Funcion, BigDecimal> idfunc;
    public static volatile SingularAttribute<Funcion, Sala> idsal;
    public static volatile SingularAttribute<Funcion, String> horfunc;
    public static volatile SingularAttribute<Funcion, Cartelera> idcart;
    public static volatile SingularAttribute<Funcion, Pelicula> idpel;

}