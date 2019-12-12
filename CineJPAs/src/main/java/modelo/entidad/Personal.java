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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Josue Cuba
 */
@Entity
@Table(name = "PERSONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p")
    , @NamedQuery(name = "Personal.findByIdper", query = "SELECT p FROM Personal p WHERE p.idper = :idper")
    , @NamedQuery(name = "Personal.findByNomper", query = "SELECT p FROM Personal p WHERE p.nomper = :nomper")
    , @NamedQuery(name = "Personal.findByApepatper", query = "SELECT p FROM Personal p WHERE p.apepatper = :apepatper")
    , @NamedQuery(name = "Personal.findByApematper", query = "SELECT p FROM Personal p WHERE p.apematper = :apematper")
    , @NamedQuery(name = "Personal.findByFecreper", query = "SELECT p FROM Personal p WHERE p.fecreper = :fecreper")
    , @NamedQuery(name = "Personal.findByEstper", query = "SELECT p FROM Personal p WHERE p.estper = :estper")})
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPER")
    private BigDecimal idper;
    @Size(max = 100)
    @Column(name = "NOMPER")
    private String nomper;
    @Size(max = 100)
    @Column(name = "APEPATPER")
    private String apepatper;
    @Size(max = 100)
    @Column(name = "APEMATPER")
    private String apematper;
    @Column(name = "FECREPER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecreper;
    @Column(name = "ESTPER")
    private Character estper = 'A';
    @OneToMany(mappedBy = "idper")
    private List<Venta> ventaList;

    public Personal() {
    }

    public Personal(BigDecimal idper) {
        this.idper = idper;
    }

    public BigDecimal getIdper() {
        return idper;
    }

    public void setIdper(BigDecimal idper) {
        this.idper = idper;
    }

    public String getNomper() {
        return nomper;
    }

    public void setNomper(String nomper) {
        this.nomper = nomper;
    }

    public String getApepatper() {
        return apepatper;
    }

    public void setApepatper(String apepatper) {
        this.apepatper = apepatper;
    }

    public String getApematper() {
        return apematper;
    }

    public void setApematper(String apematper) {
        this.apematper = apematper;
    }

    public Date getFecreper() {
        return fecreper;
    }

    public void setFecreper(Date fecreper) {
        this.fecreper = fecreper;
    }

    public Character getEstper() {
        return estper;
    }

    public void setEstper(Character estper) {
        this.estper = estper;
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
        hash += (idper != null ? idper.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personal)) {
            return false;
        }
        Personal other = (Personal) object;
        if ((this.idper == null && other.idper != null) || (this.idper != null && !this.idper.equals(other.idper))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nomper+","+apepatper+""+apematper ;
    }
    
}
