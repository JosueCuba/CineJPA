/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Josue Cuba
 */
@Entity
@Table(name = "PELICULA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pelicula.findAll", query = "SELECT p FROM Pelicula p")
    , @NamedQuery(name = "Pelicula.findByIdpel", query = "SELECT p FROM Pelicula p WHERE p.idpel = :idpel")
    , @NamedQuery(name = "Pelicula.findByTitpel", query = "SELECT p FROM Pelicula p WHERE p.titpel = :titpel")
    , @NamedQuery(name = "Pelicula.findByDurcpel", query = "SELECT p FROM Pelicula p WHERE p.durcpel = :durcpel")
    , @NamedQuery(name = "Pelicula.findByFecestnpel", query = "SELECT p FROM Pelicula p WHERE p.fecestnpel = :fecestnpel")
    , @NamedQuery(name = "Pelicula.findByEstpel", query = "SELECT p FROM Pelicula p WHERE p.estpel = :estpel")
    , @NamedQuery(name = "Pelicula.findByPaispel", query = "SELECT p FROM Pelicula p WHERE p.paispel = :paispel")
    , @NamedQuery(name = "Pelicula.findByClsfpel", query = "SELECT p FROM Pelicula p WHERE p.clsfpel = :clsfpel")})
public class Pelicula implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPEL")
    private BigDecimal idpel;
    @Size(max = 100)
    @Column(name = "TITPEL")
    private String titpel;
    @Column(name = "DURCPEL")
    private String durcpel;
    @Column(name = "FECESTNPEL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecestnpel;
    @Column(name = "ESTPEL")
    private Character estpel = 'A';
    @Size(max = 50)
    @Column(name = "PAISPEL")
    private String paispel;
    @Size(max = 50)
    @Column(name = "CLSFPEL")
    private String clsfpel;
    @OneToMany(mappedBy = "idpel")
    private List<Venta> ventaList;
    @JoinColumn(name = "IDGEN", referencedColumnName = "IDGEN")
    @ManyToOne
    private Genero idgen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpel")
    private List<Funcion> funcionList;

    public Pelicula() {
    }

    public Pelicula(BigDecimal idpel) {
        this.idpel = idpel;
    }

    public BigDecimal getIdpel() {
        return idpel;
    }

    public void setIdpel(BigDecimal idpel) {
        this.idpel = idpel;
    }

    public String getTitpel() {
        return titpel;
    }

    public void setTitpel(String titpel) {
        this.titpel = titpel;
    }

    public String getDurcpel() {
        return durcpel;
    }

    public void setDurcpel(String durcpel) {
        this.durcpel = durcpel;
    }

    public Date getFecestnpel() {
        return fecestnpel;
    }

    public void setFecestnpel(Date fecestnpel) {
        this.fecestnpel = fecestnpel;
    }

    public Character getEstpel() {
        return estpel;
    }

    public void setEstpel(Character estpel) {
        this.estpel = estpel;
    }

    public String getPaispel() {
        return paispel;
    }

    public void setPaispel(String paispel) {
        this.paispel = paispel;
    }

    public String getClsfpel() {
        return clsfpel;
    }

    public void setClsfpel(String clsfpel) {
        this.clsfpel = clsfpel;
    }

    @XmlTransient
    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    public Genero getIdgen() {
        return idgen;
    }

    public void setIdgen(Genero idgen) {
        this.idgen = idgen;
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
        hash += (idpel != null ? idpel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelicula)) {
            return false;
        }
        Pelicula other = (Pelicula) object;
        if ((this.idpel == null && other.idpel != null) || (this.idpel != null && !this.idpel.equals(other.idpel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return titpel+","+ durcpel+"-"+clsfpel;
    }
    
}
