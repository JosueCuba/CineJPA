/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "GENERO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Genero.findAll", query = "SELECT g FROM Genero g")
    , @NamedQuery(name = "Genero.findByIdgen", query = "SELECT g FROM Genero g WHERE g.idgen = :idgen")
    , @NamedQuery(name = "Genero.findByNomgen", query = "SELECT g FROM Genero g WHERE g.nomgen = :nomgen")
    , @NamedQuery(name = "Genero.findByDescpel", query = "SELECT g FROM Genero g WHERE g.descpel = :descpel")})
public class Genero implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGEN")
    private BigDecimal idgen;
    @Size(max = 100)
    @Column(name = "NOMGEN")
    private String nomgen;
    @Size(max = 225)
    @Column(name = "DESCPEL")
    private String descpel;
    @OneToMany(mappedBy = "idgen")
    private List<Pelicula> peliculaList;

    public Genero() {
    }

    public Genero(BigDecimal idgen) {
        this.idgen = idgen;
    }

    public BigDecimal getIdgen() {
        return idgen;
    }

    public void setIdgen(BigDecimal idgen) {
        this.idgen = idgen;
    }

    public String getNomgen() {
        return nomgen;
    }

    public void setNomgen(String nomgen) {
        this.nomgen = nomgen;
    }

    public String getDescpel() {
        return descpel;
    }

    public void setDescpel(String descpel) {
        this.descpel = descpel;
    }

    @XmlTransient
    public List<Pelicula> getPeliculaList() {
        return peliculaList;
    }

    public void setPeliculaList(List<Pelicula> peliculaList) {
        this.peliculaList = peliculaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgen != null ? idgen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Genero)) {
            return false;
        }
        Genero other = (Genero) object;
        if ((this.idgen == null && other.idgen != null) || (this.idgen != null && !this.idgen.equals(other.idgen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  nomgen ;
    }
    
}
