package modelo.entidad;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Pelicula;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T15:22:49")
@StaticMetamodel(Genero.class)
public class Genero_ { 

    public static volatile SingularAttribute<Genero, String> nomgen;
    public static volatile SingularAttribute<Genero, BigDecimal> idgen;
    public static volatile ListAttribute<Genero, Pelicula> peliculaList;
    public static volatile SingularAttribute<Genero, String> descpel;

}