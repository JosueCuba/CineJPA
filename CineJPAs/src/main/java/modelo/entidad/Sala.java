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
import javax.persistence.CascadeType;
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
@Table(name = "SALA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sala.findAll", query = "SELECT s FROM Sala s")
    , @NamedQuery(name = "Sala.findByIdsal", query = "SELECT s FROM Sala s WHERE s.idsal = :idsal")
    , @NamedQuery(name = "Sala.findByNomsal", query = "SELECT s FROM Sala s WHERE s.nomsal = :nomsal")
    , @NamedQuery(name = "Sala.findByEstsal", query = "SELECT s FROM Sala s WHERE s.estsal = :estsal")
    , @NamedQuery(name = "Sala.findByCapacsal", query = "SELECT s FROM Sala s WHERE s.capacsal = :capacsal")})
public class Sala implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSAL")
    private BigDecimal idsal;
    @Size(max = 20)
    @Column(name = "NOMSAL")
    private String nomsal;
    @Column(name = "ESTSAL")
    private Character estsal = 'A';
    @Column(name = "CAPACSAL")
    private BigInteger capacsal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsal")
    private List<Funcion> funcionList;

    public Sala() {
    }

    public Sala(BigDecimal idsal) {
        this.idsal = idsal;
    }

    public BigDecimal getIdsal() {
        return idsal;
    }

    public void setIdsal(BigDecimal idsal) {
        this.idsal = idsal;
    }

    public String getNomsal() {
        return nomsal;
    }

    public void setNomsal(String nomsal) {
        this.nomsal = nomsal;
    }

    public Character getEstsal() {
        return estsal;
    }

    public void setEstsal(Character estsal) {
        this.estsal = estsal;
    }

    public BigInteger getCapacsal() {
        return capacsal;
    }

    public void setCapacsal(BigInteger capacsal) {
        this.capacsal = capacsal;
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
        hash += (idsal != null ? idsal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala other = (Sala) object;
        if ((this.idsal == null && other.idsal != null) || (this.idsal != null && !this.idsal.equals(other.idsal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nomsal;
    }

}
