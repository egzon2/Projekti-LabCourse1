/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author qendrimrexhepi
 */
@Entity
@Table(name = "Perdoruesi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Perdoruesi.findAll", query = "SELECT p FROM Perdoruesi p"),
    @NamedQuery(name = "Perdoruesi.findById", query = "SELECT p FROM Perdoruesi p WHERE p.id = :id"),
    @NamedQuery(name = "Perdoruesi.findByUsername", query = "SELECT p FROM Perdoruesi p WHERE p.username = :username"),
    @NamedQuery(name = "Perdoruesi.findByPassword", query = "SELECT p FROM Perdoruesi p WHERE p.password = :password")})
public class Perdoruesi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer id;
    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String password;
    @JoinColumn(name = "RoliID", referencedColumnName = "ID")
    @ManyToOne
    private Roli roliID;

    public Perdoruesi() {
    }

    public Perdoruesi(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roli getRoliID() {
        return roliID;
    }

    public void setRoliID(Roli roliID) {
        this.roliID = roliID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perdoruesi)) {
            return false;
        }
        Perdoruesi other = (Perdoruesi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Perdoruesi[ id=" + id + " ]";
    }
    
}
