package modelo.entidad;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-12T14:51:31")
@StaticMetamodel(Personal.class)
public class Personal_ { 

    public static volatile SingularAttribute<Personal, String> apepatper;
    public static volatile SingularAttribute<Personal, Character> estper;
    public static volatile SingularAttribute<Personal, BigDecimal> idper;
    public static volatile SingularAttribute<Personal, String> nomper;
    public static volatile SingularAttribute<Personal, Date> fecreper;
    public static volatile ListAttribute<Personal, Venta> ventaList;
    public static volatile SingularAttribute<Personal, String> apematper;

}