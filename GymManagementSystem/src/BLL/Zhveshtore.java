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
 * @author Flakron
 */
@Entity
@Table(name = "Zhveshtore")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zhveshtore.findAll", query = "SELECT z FROM Zhveshtore z"),
    @NamedQuery(name = "Zhveshtore.findByZhid", query = "SELECT z FROM Zhveshtore z WHERE z.zhid = :zhid"),
    @NamedQuery(name = "Zhveshtore.findByNumri", query = "SELECT z FROM Zhveshtore z WHERE z.numri = :numri"),
    @NamedQuery(name = "Zhveshtore.findByGjinia", query = "SELECT z FROM Zhveshtore z WHERE z.gjinia = :gjinia")})
public class Zhveshtore implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ZHID")
    
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    
    private Integer zhid;
    @Column(name = "Numri")
    private Integer numri;
    @Column(name = "Gjinia")
    private Character gjinia;
    @JoinColumn(name = "FID", referencedColumnName = "FID")
    @ManyToOne
    private Fitnesi fid;

    public Zhveshtore() {
    }

    public Zhveshtore(Integer zhid) {
        this.zhid = zhid;
    }

    public Integer getZhid() {
        return zhid;
    }

    public void setZhid(Integer zhid) {
        this.zhid = zhid;
    }

    public Integer getNumri() {
        return numri;
    }

    public void setNumri(Integer numri) {
        this.numri = numri;
    }

    public Character getGjinia() {
        return gjinia;
    }

    public void setGjinia(Character gjinia) {
        this.gjinia = gjinia;
    }

    public Fitnesi getFid() {
        return fid;
    }

    public void setFid(Fitnesi fid) {
        this.fid = fid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zhid != null ? zhid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zhveshtore)) {
            return false;
        }
        Zhveshtore other = (Zhveshtore) object;
        if ((this.zhid == null && other.zhid != null) || (this.zhid != null && !this.zhid.equals(other.zhid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + zhid + " ";
    }
    
}
