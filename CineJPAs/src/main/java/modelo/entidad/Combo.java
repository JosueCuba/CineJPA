/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Josue Cuba
 */
@Entity
@Table(name = "COMBO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Combo.findAll", query = "SELECT c FROM Combo c")
    , @NamedQuery(name = "Combo.findByIdcomb", query = "SELECT c FROM Combo c WHERE c.idcomb = :idcomb")
    , @NamedQuery(name = "Combo.findByNomcomb", query = "SELECT c FROM Combo c WHERE c.nomcomb = :nomcomb")
    , @NamedQuery(name = "Combo.findByDesccomb", query = "SELECT c FROM Combo c WHERE c.desccomb = :desccomb")
    , @NamedQuery(name = "Combo.findByPreccomb", query = "SELECT c FROM Combo c WHERE c.preccomb = :preccomb")})
public class Combo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCOMB")
    private BigDecimal idcomb;
    @Size(max = 100)
    @Column(name = "NOMCOMB")
    private String nomcomb;
    @Size(max = 100)
    @Column(name = "DESCCOMB")
    private String desccomb;
    @Column(name = "PRECCOMB")
    private BigInteger preccomb;
    @OneToMany(mappedBy = "idcomb")
    private List<Detalleventa> detalleventaList;

    public Combo() {
    }

    public Combo(BigDecimal idcomb) {
        this.idcomb = idcomb;
    }

    public BigDecimal getIdcomb() {
        return idcomb;
    }

    public void setIdcomb(BigDecimal idcomb) {
        this.idcomb = idcomb;
    }

    public String getNomcomb() {
        return nomcomb;
    }

    public void setNomcomb(String nomcomb) {
        this.nomcomb = nomcomb;
    }

    public String getDesccomb() {
        return desccomb;
    }

    public void setDesccomb(String desccomb) {
        this.desccomb = desccomb;
    }

    public BigInteger getPreccomb() {
        return preccomb;
    }

    public void setPreccomb(BigInteger preccomb) {
        this.preccomb = preccomb;
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
        hash += (idcomb != null ? idcomb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Combo)) {
            return false;
        }
        Combo other = (Combo) object;
        if ((this.idcomb == null && other.idcomb != null) || (this.idcomb != null && !this.idcomb.equals(other.idcomb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  nomcomb + " ,"+ preccomb;
    }
    
}
