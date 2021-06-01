/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Flakron
 */
@Entity
@Table(name = "Stafi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stafi.findAll", query = "SELECT s FROM Stafi s"),
    @NamedQuery(name = "Stafi.findBySid", query = "SELECT s FROM Stafi s WHERE s.sid = :sid"),
    @NamedQuery(name = "Stafi.findByEmri", query = "SELECT s FROM Stafi s WHERE s.emri = :emri"),
    @NamedQuery(name = "Stafi.findByMbiemri", query = "SELECT s FROM Stafi s WHERE s.mbiemri = :mbiemri"),
    @NamedQuery(name = "Stafi.findByMosha", query = "SELECT s FROM Stafi s WHERE s.mosha = :mosha"),
    @NamedQuery(name = "Stafi.findByNrPersonal", query = "SELECT s FROM Stafi s WHERE s.nrPersonal = :nrPersonal"),
    @NamedQuery(name = "Stafi.findByPershkrimi", query = "SELECT s FROM Stafi s WHERE s.pershkrimi = :pershkrimi")})
public class Stafi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SID")
    
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    
    private Integer sid;
    @Column(name = "Emri")
    private String emri;
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Column(name = "Mosha")
    private Integer mosha;
    @Column(name = "NrPersonal")
    private Integer nrPersonal;
    @Column(name = "Pershkrimi")
    private String pershkrimi;
    @OneToMany(mappedBy = "sid")
    private Collection<Menagjeri> menagjeriCollection;
    @JoinColumn(name = "FID", referencedColumnName = "FID")
    @ManyToOne
    private Fitnesi fid;
    @OneToMany(mappedBy = "sid")
    private Collection<Puntori> puntoriCollection;
    @OneToMany(mappedBy = "sid")
    private Collection<Trajneri> trajneriCollection;

    public Stafi() {
    }

    public Stafi(Integer sid) {
        this.sid = sid;
    }
    
    public Stafi(Integer sid, String emri, String mbiemri, Integer mosha, Integer nrPersonal, String pershkrimi) {
        this.sid = sid;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = mosha;
        this.nrPersonal = nrPersonal;
        this.pershkrimi = pershkrimi;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public Integer getMosha() {
        return mosha;
    }

    public void setMosha(Integer mosha) {
        this.mosha = mosha;
    }

    public Integer getNrPersonal() {
        return nrPersonal;
    }

    public void setNrPersonal(Integer nrPersonal) {
        this.nrPersonal = nrPersonal;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }

    public void setPershkrimi(String pershkrimi) {
        this.pershkrimi = pershkrimi;
    }

    @XmlTransient
    public Collection<Menagjeri> getMenagjeriCollection() {
        return menagjeriCollection;
    }

    public void setMenagjeriCollection(Collection<Menagjeri> menagjeriCollection) {
        this.menagjeriCollection = menagjeriCollection;
    }

    public Fitnesi getFid() {
        return fid;
    }

    public void setFid(Fitnesi fid) {
        this.fid = fid;
    }

    @XmlTransient
    public Collection<Puntori> getPuntoriCollection() {
        return puntoriCollection;
    }

    public void setPuntoriCollection(Collection<Puntori> puntoriCollection) {
        this.puntoriCollection = puntoriCollection;
    }

    @XmlTransient
    public Collection<Trajneri> getTrajneriCollection() {
        return trajneriCollection;
    }

    public void setTrajneriCollection(Collection<Trajneri> trajneriCollection) {
        this.trajneriCollection = trajneriCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sid != null ? sid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stafi)) {
            return false;
        }
        Stafi other = (Stafi) object;
        if ((this.sid == null && other.sid != null) || (this.sid != null && !this.sid.equals(other.sid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + sid + "";
    }
    
}
