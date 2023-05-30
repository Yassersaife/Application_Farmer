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
@Table(name = "ANIMAL")
@NamedQueries({
    @NamedQuery(name = "Animal_1.findAll", query = "SELECT a FROM Animal_1 a"),
    @NamedQuery(name = "Animal_1.findByIdaniml", query = "SELECT a FROM Animal_1 a WHERE a.idaniml = :idaniml"),
    @NamedQuery(name = "Animal_1.findByAname", query = "SELECT a FROM Animal_1 a WHERE a.aname = :aname"),
    @NamedQuery(name = "Animal_1.findByCount", query = "SELECT a FROM Animal_1 a WHERE a.count = :count"),
    @NamedQuery(name = "Animal_1.findByAnimalprodect", query = "SELECT a FROM Animal_1 a WHERE a.animalprodect = :animalprodect"),
    @NamedQuery(name = "Animal_1.findByPkproducts", query = "SELECT a FROM Animal_1 a WHERE a.pkproducts = :pkproducts")})
public class Animal_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDANIML")
    private Short idaniml;
    @Basic(optional = false)
    @Column(name = "ANAME")
    private String aname;
    @Column(name = "COUNT")
    private Integer count;
    @Basic(optional = false)
    @Column(name = "ANIMALPRODECT")
    private String animalprodect;
    @Column(name = "PKPRODUCTS")
    private Integer pkproducts;
    @OneToMany(mappedBy = "pkanmil")
    private Collection<Employee_1> employeeCollection;

    public Animal_1() {
    }

    public Animal_1(Short idaniml) {
        this.idaniml = idaniml;
    }

    public Animal_1(Short idaniml, String aname, String animalprodect) {
        this.idaniml = idaniml;
        this.aname = aname;
        this.animalprodect = animalprodect;
    }

    public Short getIdaniml() {
        return idaniml;
    }

    public void setIdaniml(Short idaniml) {
        this.idaniml = idaniml;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getAnimalprodect() {
        return animalprodect;
    }

    public void setAnimalprodect(String animalprodect) {
        this.animalprodect = animalprodect;
    }

    public Integer getPkproducts() {
        return pkproducts;
    }

    public void setPkproducts(Integer pkproducts) {
        this.pkproducts = pkproducts;
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
        hash += (idaniml != null ? idaniml.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animal_1)) {
            return false;
        }
        Animal_1 other = (Animal_1) object;
        if ((this.idaniml == null && other.idaniml != null) || (this.idaniml != null && !this.idaniml.equals(other.idaniml))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "farm.Animal_1[ idaniml=" + idaniml + " ]";
    }
    
}
