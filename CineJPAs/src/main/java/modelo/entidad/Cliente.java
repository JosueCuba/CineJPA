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
@Table(name = "CLIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByIdcli", query = "SELECT c FROM Cliente c WHERE c.idcli = :idcli")
    , @NamedQuery(name = "Cliente.findByNomcli", query = "SELECT c FROM Cliente c WHERE c.nomcli = :nomcli")
    , @NamedQuery(name = "Cliente.findByApepatcli", query = "SELECT c FROM Cliente c WHERE c.apepatcli = :apepatcli")
    , @NamedQuery(name = "Cliente.findByApematcli", query = "SELECT c FROM Cliente c WHERE c.apematcli = :apematcli")
    , @NamedQuery(name = "Cliente.findBySexcli", query = "SELECT c FROM Cliente c WHERE c.sexcli = :sexcli")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCLI")
    private BigDecimal idcli;
    @Size(max = 100)
    @Column(name = "NOMCLI")
    private String nomcli;
    @Size(max = 100)
    @Column(name = "APEPATCLI")
    private String apepatcli;
    @Size(max = 100)
    @Column(name = "APEMATCLI")
    private String apematcli;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEXCLI")
    private Character sexcli;
    @OneToMany(mappedBy = "idcli")
    private List<Venta> ventaList;

    public Cliente() {
    }

    public Cliente(BigDecimal idcli) {
        this.idcli = idcli;
    }

    public Cliente(BigDecimal idcli, Character sexcli) {
        this.idcli = idcli;
        this.sexcli = sexcli;
    }

    public BigDecimal getIdcli() {
        return idcli;
    }

    public void setIdcli(BigDecimal idcli) {
        this.idcli = idcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getApepatcli() {
        return apepatcli;
    }

    public void setApepatcli(String apepatcli) {
        this.apepatcli = apepatcli;
    }

    public String getApematcli() {
        return apematcli;
    }

    public void setApematcli(String apematcli) {
        this.apematcli = apematcli;
    }

    public Character getSexcli() {
        return sexcli;
    }

    public void setSexcli(Character sexcli) {
        this.sexcli = sexcli;
    }

    @XmlTransient
    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcli != null ? idcli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idcli == null && other.idcli != null) || (this.idcli != null && !this.idcli.equals(other.idcli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nomcli+","+ apepatcli+" "+ apematcli ;
    }
    
}
