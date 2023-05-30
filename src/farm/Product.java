/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farm;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "PRODUCT")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findByIdprodect", query = "SELECT p FROM Product p WHERE p.idprodect = :idprodect"),
    @NamedQuery(name = "Product.findByItem", query = "SELECT p FROM Product p WHERE p.item = :item"),
    @NamedQuery(name = "Product.findByPrice", query = "SELECT p FROM Product p WHERE p.price = :price"),
    @NamedQuery(name = "Product.findByDatashipped", query = "SELECT p FROM Product p WHERE p.datashipped = :datashipped"),
    @NamedQuery(name = "Product.findByQuanitily", query = "SELECT p FROM Product p WHERE p.quanitily = :quanitily")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPRODECT")
    private Short idprodect;
    @Basic(optional = false)
    @Column(name = "ITEM")
    private String item;
    @Basic(optional = false)
    @Column(name = "PRICE")
    private int price;
    @Column(name = "DATASHIPPED")
    private String datashipped;
    @Basic(optional = false)
    @Column(name = "QUANITILY")
    private int quanitily;

    public Product() {
    }

    public Product(Short idprodect) {
        this.idprodect = idprodect;
    }

    public Product(Short idprodect, String item, int price, int quanitily) {
        this.idprodect = idprodect;
        this.item = item;
        this.price = price;
        this.quanitily = quanitily;
    }

    public Short getIdprodect() {
        return idprodect;
    }
 public String get1Idprodect(int x) {
        if(x==this.idprodect)
            return this.item;
        else return"unfinded product";
            
        
            
    }
    public void setIdprodect(Short idprodect) {
        this.idprodect = idprodect;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDatashipped() {
        return datashipped;
    }

    public void setDatashipped(String datashipped) {
        this.datashipped = datashipped;
    }

    public int getQuanitily() {
        return quanitily;
    }

    public void setQuanitily(int quanitily) {
        this.quanitily = quanitily;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprodect != null ? idprodect.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.idprodect == null && other.idprodect != null) || (this.idprodect != null && !this.idprodect.equals(other.idprodect))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "farm.Product[ idprodect=" + idprodect + " ]";
    }
    
}
