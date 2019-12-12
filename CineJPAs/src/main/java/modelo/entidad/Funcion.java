/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Josue Cuba
 */
@Entity
@Table(name = "FUNCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcion.findAll", query = "SELECT f FROM Funcion f")
    , @NamedQuery(name = "Funcion.findByIdfunc", query = "SELECT f FROM Funcion f WHERE f.idfunc = :idfunc")
    , @NamedQuery(name = "Funcion.findByHorfunc", query = "SELECT f FROM Funcion f WHERE f.horfunc = :horfunc")})
public class Funcion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDFUNC")
    private BigDecimal idfunc;
    @Size(max = 20)
    @Column(name = "HORFUNC")
    private String horfunc;
    @JoinColumn(name = "IDCART", referencedColumnName = "IDCART")
    @ManyToOne
    private Cartelera idcart;
    @JoinColumn(name = "IDPEL", referencedColumnName = "IDPEL")
    @ManyToOne(optional = false)
    private Pelicula idpel;
    @JoinColumn(name = "IDSAL", referencedColumnName = "IDSAL")
    @ManyToOne(optional = false)
    private Sala idsal;

    public Funcion() {
    }

    public Funcion(BigDecimal idfunc) {
        this.idfunc = idfunc;
    }

    public BigDecimal getIdfunc() {
        return idfunc;
    }

    public void setIdfunc(BigDecimal idfunc) {
        this.idfunc = idfunc;
    }

    public String getHorfunc() {
        return horfunc;
    }

    public void setHorfunc(String horfunc) {
        this.horfunc = horfunc;
    }

    public Cartelera getIdcart() {
        return idcart;
    }

    public void setIdcart(Cartelera idcart) {
        this.idcart = idcart;
    }

    public Pelicula getIdpel() {
        return idpel;
    }

    public void setIdpel(Pelicula idpel) {
        this.idpel = idpel;
    }

    public Sala getIdsal() {
        return idsal;
    }

    public void setIdsal(Sala idsal) {
        this.idsal = idsal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfunc != null ? idfunc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcion)) {
            return false;
        }
        Funcion other = (Funcion) object;
        if ((this.idfunc == null && other.idfunc != null) || (this.idfunc != null && !this.idfunc.equals(other.idfunc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idpel+"-"+idsal;
    }
    
}
