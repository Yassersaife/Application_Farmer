/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farm;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "EMPLOYEE")
@NamedQueries({
    @NamedQuery(name = "Employee_1.findAll", query = "SELECT e FROM Employee_1 e"),
    @NamedQuery(name = "Employee_1.findBySsn", query = "SELECT e FROM Employee_1 e WHERE e.ssn = :ssn"),
    @NamedQuery(name = "Employee_1.findByFname", query = "SELECT e FROM Employee_1 e WHERE e.fname = :fname"),
    @NamedQuery(name = "Employee_1.findByLname", query = "SELECT e FROM Employee_1 e WHERE e.lname = :lname"),
    @NamedQuery(name = "Employee_1.findBySex", query = "SELECT e FROM Employee_1 e WHERE e.sex = :sex"),
    @NamedQuery(name = "Employee_1.findBySalary", query = "SELECT e FROM Employee_1 e WHERE e.salary = :salary"),
    @NamedQuery(name = "Employee_1.findByPassowrd", query = "SELECT e FROM Employee_1 e WHERE e.passowrd = :passowrd"),
    @NamedQuery(name = "Employee_1.findByBirthdate", query = "SELECT e FROM Employee_1 e WHERE e.birthdate = :birthdate")})
public class Employee_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SSN")
    private Long ssn;
    @Basic(optional = false)
    @Column(name = "FNAME")
    private String fname;
    @Basic(optional = false)
    @Column(name = "LNAME")
    private String lname;
    @Column(name = "SEX")
    private String sex;
    @Column(name = "SALARY")
    private double salary;
    @Basic(optional = false)
    @Column(name = "PASSOWRD")
    private String passowrd;
    @Column(name = "BIRTHDATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthdate;
    @JoinColumn(name = "PKANMIL", referencedColumnName = "IDANIML")
    @ManyToOne
    private Animal_1 pkanmil;
    @JoinColumn(name = "PKLAND", referencedColumnName = "IDLAND")
    @ManyToOne
    private Land_1 pkland;

    public Employee_1() {
    }

    public Employee_1(Long ssn) {
        this.ssn = ssn;
    }

    public Employee_1(Long ssn, String fname, String lname, String passowrd) {
        this.ssn = ssn;
        this.fname = fname;
        this.lname = lname;
        this.passowrd = passowrd;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Animal_1 getPkanmil() {
        return pkanmil;
    }

    public void setPkanmil(Animal_1 pkanmil) {
        this.pkanmil = pkanmil;
    }

    public Land_1 getPkland() {
        return pkland;
    }

    public void setPkland(Land_1 pkland) {
        this.pkland = pkland;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ssn != null ? ssn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee_1)) {
            return false;
        }
        Employee_1 other = (Employee_1) object;
        if ((this.ssn == null && other.ssn != null) || (this.ssn != null && !this.ssn.equals(other.ssn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "farm.Employee_1[ ssn=" + ssn + " ]";
    }
    
}
