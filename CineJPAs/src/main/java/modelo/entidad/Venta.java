/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Josue Cuba
 */
@Entity
@Table(name = "VENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")
    , @NamedQuery(name = "Venta.findByIdvent", query = "SELECT v FROM Venta v WHERE v.idvent = :idvent")
    , @NamedQuery(name = "Venta.findByFecvent", query = "SELECT v FROM Venta v WHERE v.fecvent = :fecvent")
    , @NamedQuery(name = "Venta.findByTotvent", query = "SELECT v FROM Venta v WHERE v.totvent = :totvent")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDVENT")
    private BigDecimal idvent;
    @Column(name = "FECVENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecvent;
    @Column(name = "TOTVENT")
    private Long totvent;
    @JoinColumn(name = "IDCLI", referencedColumnName = "IDCLI")
    @ManyToOne
    private Cliente idcli;
    @JoinColumn(name = "IDPEL", referencedColumnName = "IDPEL")
    @ManyToOne
    private Pelicula idpel;
    @JoinColumn(name = "IDPER", referencedColumnName = "IDPER")
    @ManyToOne
    private Personal idper;
    @OneToMany(mappedBy = "idvent")
    private List<Detalleventa> detalleventaList;

    public Venta() {
    }

    public Venta(BigDecimal idvent) {
        this.idvent = idvent;
    }

    public BigDecimal getIdvent() {
        return idvent;
    }

    public void setIdvent(BigDecimal idvent) {
        this.idvent = idvent;
    }

    public Date getFecvent() {
        return fecvent;
    }

    public void setFecvent(Date fecvent) {
        this.fecvent = fecvent;
    }

    public Long getTotvent() {
        return totvent;
    }

    public void setTotvent(Long totvent) {
        this.totvent = totvent;
    }

    public Cliente getIdcli() {
        return idcli;
    }

    public void setIdcli(Cliente idcli) {
        this.idcli = idcli;
    }

    public Pelicula getIdpel() {
        return idpel;
    }

    public void setIdpel(Pelicula idpel) {
        this.idpel = idpel;
    }

    public Personal getIdper() {
        return idper;
    }

    public void setIdper(Personal idper) {
        this.idper = idper;
    }

    @XmlTransient
    public List<Detalleventa> getDetalleventaList() {
        return detalleventaList;
    }

    public void setDetalleventaList(List<Detalleventa> detalleventaList) {
        this.detalleventaList = detalleventaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvent != null ? idvent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idvent == null && other.idvent != null) || (this.idvent != null && !this.idvent.equals(other.idvent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idcli+"-"+idpel;
    }
    
}
