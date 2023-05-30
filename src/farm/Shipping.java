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
@Table(name = "SHIPPING")
@NamedQueries({
    @NamedQuery(name = "Shipping.findAll", query = "SELECT s FROM Shipping s"),
    @NamedQuery(name = "Shipping.findByShippingid", query = "SELECT s FROM Shipping s WHERE s.shippingid = :shippingid"),
    @NamedQuery(name = "Shipping.findByTypeshipping", query = "SELECT s FROM Shipping s WHERE s.typeshipping = :typeshipping"),
    @NamedQuery(name = "Shipping.findByCostshipping", query = "SELECT s FROM Shipping s WHERE s.costshipping = :costshipping"),
    @NamedQuery(name = "Shipping.findByQuanititytupe", query = "SELECT s FROM Shipping s WHERE s.quanititytupe = :quanititytupe"),
    @NamedQuery(name = "Shipping.findByProductlist", query = "SELECT s FROM Shipping s WHERE s.productlist = :productlist")})
public class Shipping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SHIPPINGID")
    private Short shippingid;
    @Basic(optional = false)
    @Column(name = "TYPESHIPPING")
    private String typeshipping;
    @Column(name = "COSTSHIPPING")
    private Integer costshipping;
    @Column(name = "QUANITITYTUPE")
    private Integer quanititytupe;
    @Column(name = "PRODUCTLIST")
    private String productlist;

    public Shipping() {
    }

    public Shipping(Short shippingid) {
        this.shippingid = shippingid;
    }

    public Shipping(Short shippingid, String typeshipping) {
        this.shippingid = shippingid;
        this.typeshipping = typeshipping;
    }

    public Short getShippingid() {
        return shippingid;
    }

    public void setShippingid(Short shippingid) {
        this.shippingid = shippingid;
    }

    public String getTypeshipping() {
        return typeshipping;
    }

    public void setTypeshipping(String typeshipping) {
        this.typeshipping = typeshipping;
    }

    public Integer getCostshipping() {
        return costshipping;
    }

    public void setCostshipping(Integer costshipping) {
        this.costshipping = costshipping;
    }

    public Integer getQuanititytupe() {
        return quanititytupe;
    }

    public void setQuanititytupe(Integer quanititytupe) {
        this.quanititytupe = quanititytupe;
    }

    public String getProductlist() {
        return productlist;
    }

    public void setProductlist(String productlist) {
        this.productlist = productlist;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shippingid != null ? shippingid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shipping)) {
            return false;
        }
        Shipping other = (Shipping) object;
        if ((this.shippingid == null && other.shippingid != null) || (this.shippingid != null && !this.shippingid.equals(other.shippingid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "farm.Shipping[ shippingid=" + shippingid + " ]";
    }
    
}
