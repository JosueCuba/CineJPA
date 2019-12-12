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
@Table(name = "CARTELERA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cartelera.findAll", query = "SELECT c FROM Cartelera c")
    , @NamedQuery(name = "Cartelera.findByIdcart", query = "SELECT c FROM Cartelera c WHERE c.idcart = :idcart")
    , @NamedQuery(name = "Cartelera.findByFecinccart", query = "SELECT c FROM Cartelera c WHERE c.fecinccart = :fecinccart")
    , @NamedQuery(name = "Cartelera.findByFecfincart", query = "SELECT c FROM Cartelera c WHERE c.fecfincart = :fecfincart")})
public class Cartelera implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCART")
    private BigDecimal idcart;
    @Column(name = "FECINCCART")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecinccart;
    @Column(name = "FECFINCART")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecfincart;
    @OneToMany(mappedBy = "idcart")
    private List<Funcion> funcionList;

    public Cartelera() {
    }

    public Cartelera(BigDecimal idcart) {
        this.idcart = idcart;
    }

    public BigDecimal getIdcart() {
        return idcart;
    }

    public void setIdcart(BigDecimal idcart) {
        this.idcart = idcart;
    }

    public Date getFecinccart() {
        return fecinccart;
    }

    public void setFecinccart(Date fecinccart) {
        this.fecinccart = fecinccart;
    }

    public Date getFecfincart() {
        return fecfincart;
    }

    public void setFecfincart(Date fecfincart) {
        this.fecfincart = fecfincart;
    }

    @XmlTransient
    public List<Funcion> getFuncionList() {
        return funcionList;
    }

    public void setFuncionList(List<Funcion> funcionList) {
        this.funcionList = funcionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcart != null ? idcart.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartelera)) {
            return false;
        }
        Cartelera other = (Cartelera) object;
        if ((this.idcart == null && other.idcart != null) || (this.idcart != null && !this.idcart.equals(other.idcart))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return fecinccart+"-"+fecfincart;
    }
    
}
