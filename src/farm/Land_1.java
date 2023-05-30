/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farm;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "LAND")
@NamedQueries({
    @NamedQuery(name = "Land_1.findAll", query = "SELECT l FROM Land_1 l"),
    @NamedQuery(name = "Land_1.findByIdland", query = "SELECT l FROM Land_1 l WHERE l.idland = :idland"),
    @NamedQuery(name = "Land_1.findByCrop", query = "SELECT l FROM Land_1 l WHERE l.crop = :crop"),
    @NamedQuery(name = "Land_1.findByArea", query = "SELECT l FROM Land_1 l WHERE l.area = :area"),
    @NamedQuery(name = "Land_1.findByKproducts", query = "SELECT l FROM Land_1 l WHERE l.kproducts = :kproducts")})
public class Land_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDLAND")
    private Long idland;
    @Basic(optional = false)
    @Column(name = "CROP")
    private String crop;
    @Column(name = "AREA")
    private Integer area;
    @Column(name = "KPRODUCTS")
    private Long kproducts;
    @OneToMany(mappedBy = "pkland")
    private Collection<Employee_1> employeeCollection;

    public Land_1() {
    }

    public Land_1(Long idland) {
        this.idland = idland;
    }

    public Land_1(Long idland, String crop) {
        this.idland = idland;
        this.crop = crop;
    }

    public Long getIdland() {
        return idland;
    }

    public void setIdland(Long idland) {
        this.idland = idland;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Long getKproducts() {
        return kproducts;
    }

    public void setKproducts(Long kproducts) {
        this.kproducts = kproducts;
    }

    public Collection<Employee_1> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<Employee_1> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idland != null ? idland.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Land_1)) {
            return false;
        }
        Land_1 other = (Land_1) object;
        if ((this.idland == null && other.idland != null) || (this.idland != null && !this.idland.equals(other.idland))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "farm.Land_1[ idland=" + idland + " ]";
    }
    
}
