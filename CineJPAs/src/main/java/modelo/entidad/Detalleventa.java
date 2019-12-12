/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "DETALLEVENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detalleventa.findAll", query = "SELECT d FROM Detalleventa d")
    , @NamedQuery(name = "Detalleventa.findByIddetvent", query = "SELECT d FROM Detalleventa d WHERE d.iddetvent = :iddetvent")
    , @NamedQuery(name = "Detalleventa.findByPrecio", query = "SELECT d FROM Detalleventa d WHERE d.precio = :precio")
    , @NamedQuery(name = "Detalleventa.findByCantdetvent", query = "SELECT d FROM Detalleventa d WHERE d.cantdetvent = :cantdetvent")})
public class Detalleventa implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDETVENT")
    private BigDecimal iddetvent;
    @Column(name = "PRECIO")
    private BigInteger precio;
    @Column(name = "CANTDETVENT")
    private BigInteger cantdetvent;
    @JoinColumn(name = "IDCOMB", referencedColumnName = "IDCOMB")
    @ManyToOne
    private Combo idcomb;
    @JoinColumn(name = "IDVENT", referencedColumnName = "IDVENT")
    @ManyToOne
    private Venta idvent;

    public Detalleventa() {
    }

    public Detalleventa(BigDecimal iddetvent) {
        this.iddetvent = iddetvent;
    }

    public BigDecimal getIddetvent() {
        return iddetvent;
    }

    public void setIddetvent(BigDecimal iddetvent) {
        this.iddetvent = iddetvent;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public BigInteger getCantdetvent() {
        return cantdetvent;
    }

    public void setCantdetvent(BigInteger cantdetvent) {
        this.cantdetvent = cantdetvent;
    }
    public Combo getIdcomb() {
        return idcomb;
    }

    public void setIdcomb(Combo idcomb) {
        this.idcomb = idcomb;
    }

    public Venta getIdvent() {
        return idvent;
    }

    public void setIdvent(Venta idvent) {
        this.idvent = idvent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetvent != null ? iddetvent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalleventa)) {
            return false;
        }
        Detalleventa other = (Detalleventa) object;
        if ((this.iddetvent == null && other.iddetvent != null) || (this.iddetvent != null && !this.iddetvent.equals(other.iddetvent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  cantdetvent + ","+ idcomb;
    }
    
}
