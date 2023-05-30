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
@Table(name = "CUSTOMER")
@NamedQueries({
    @NamedQuery(name = "Customer_1.findAll", query = "SELECT c FROM Customer_1 c"),
    @NamedQuery(name = "Customer_1.findByIdcustomer", query = "SELECT c FROM Customer_1 c WHERE c.idcustomer = :idcustomer"),
    @NamedQuery(name = "Customer_1.findByNamecustomer", query = "SELECT c FROM Customer_1 c WHERE c.namecustomer = :namecustomer"),
    @NamedQuery(name = "Customer_1.findByAddress", query = "SELECT c FROM Customer_1 c WHERE c.address = :address"),
    @NamedQuery(name = "Customer_1.findByCardinfo", query = "SELECT c FROM Customer_1 c WHERE c.cardinfo = :cardinfo"),
    @NamedQuery(name = "Customer_1.findByAccountbalance", query = "SELECT c FROM Customer_1 c WHERE c.accountbalance = :accountbalance"),
    @NamedQuery(name = "Customer_1.findByShop", query = "SELECT c FROM Customer_1 c WHERE c.shop = :shop"),
    @NamedQuery(name = "Customer_1.findByCPassowrd", query = "SELECT e FROM Customer_1 e WHERE e.cpassowrd = :cpassowrd"),
    @NamedQuery(name = "Customer_1.findByProductlist", query = "SELECT c FROM Customer_1 c WHERE c.productlist = :productlist")})
public class Customer_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCUSTOMER")
    private Integer idcustomer;
    @Column(name = "NAMECUSTOMER")
    private String namecustomer;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CARDINFO")
    private String cardinfo;
    @Column(name = "ACCOUNTBALANCE")
    private double accountbalance;
    @Column(name = "SHOP")
    private int shop;
    @Column(name = "PRODUCTLIST")
    private String productlist;
    @Column(name = "CPASSWORD")
    private String cpassword;

    public Customer_1() {
    }

    public Customer_1(Integer idcustomer) {
        this.idcustomer = idcustomer;
    }

    public Integer getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(Integer idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getNamecustomer() {
        return namecustomer;
    }

    public void setNamecustomer(String namecustomer) {
        this.namecustomer = namecustomer;
    }

    public String getAddress() {
        return address;
    }
    public String getPassowrd() {
        return cpassword;
    }

    public void setPassowrd(String passowrd) {
        this.cpassword = passowrd;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardinfo() {
        return cardinfo;
    }

    public void setCardinfo(String cardinfo) {
        this.cardinfo = cardinfo;
    }

    public double getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(double accountbalance) {
        this.accountbalance = accountbalance;
    }

    public int getShop() {
        return shop;
    }
 public int get1Shop(int x) {
        return this.shop=x;
    }
  public String get2Shop(int x) {
      if(x==this.shop)
      return this.namecustomer;
      else return "no customer is found";
  }
   public double get3Shop(int x) {
      if(x==this.shop)
      return this.accountbalance;
      else return 0.00;
  }
    public void setShop(int shop) {
        this.shop = shop;
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
        hash += (idcustomer != null ? idcustomer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer_1)) {
            return false;
        }
        Customer_1 other = (Customer_1) object;
        if ((this.idcustomer == null && other.idcustomer != null) || (this.idcustomer != null && !this.idcustomer.equals(other.idcustomer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "farm.Customer_1[ idcustomer=" + idcustomer + " ]";
    }
    
}
