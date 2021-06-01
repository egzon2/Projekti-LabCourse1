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
@Table(name = "Fitnesi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fitnesi.findAll", query = "SELECT f FROM Fitnesi f"),
    @NamedQuery(name = "Fitnesi.findByFid", query = "SELECT f FROM Fitnesi f WHERE f.fid = :fid"),
    @NamedQuery(name = "Fitnesi.findByEmri", query = "SELECT f FROM Fitnesi f WHERE f.emri = :emri"),
    @NamedQuery(name = "Fitnesi.findByNrTelefonit", query = "SELECT f FROM Fitnesi f WHERE f.nrTelefonit = :nrTelefonit"),
    @NamedQuery(name = "Fitnesi.findByQyteti", query = "SELECT f FROM Fitnesi f WHERE f.qyteti = :qyteti"),
    @NamedQuery(name = "Fitnesi.findByAdresa", query = "SELECT f FROM Fitnesi f WHERE f.adresa = :adresa"),
    @NamedQuery(name = "Fitnesi.findByNrBiznesit", query = "SELECT f FROM Fitnesi f WHERE f.nrBiznesit = :nrBiznesit")})
public class Fitnesi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FID")
    
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    
    private Integer fid;
    @Column(name = "Emri")
    private String emri;
    @Column(name = "NrTelefonit")
    private Integer nrTelefonit;
    @Column(name = "Qyteti")
    private String qyteti;
    @Column(name = "Adresa")
    private String adresa;
    @Column(name = "NrBiznesit")
    private Integer nrBiznesit;
    @OneToMany(mappedBy = "fid")
    private Collection<Klienti> klientiCollection;
    @OneToMany(mappedBy = "fid")
    private Collection<Stafi> stafiCollection;
    @OneToMany(mappedBy = "fid")
    private Collection<Paisjet> paisjetCollection;
    @OneToMany(mappedBy = "fid")
    private Collection<Zhveshtore> zhveshtoreCollection;

    public Fitnesi() {
    }

    public Fitnesi(Integer fid) {
        this.fid = fid;
    }
    
    public Fitnesi(Integer fid, String emri, Integer nrTelefonit, String qyteti, String adresa, Integer nrBiznesit) {
        this.fid = fid;
        this.emri = emri;
        this.nrTelefonit = nrTelefonit;
        this.qyteti = qyteti;
        this.adresa = adresa;
        this.nrBiznesit = nrBiznesit;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public Integer getNrTelefonit() {
        return nrTelefonit;
    }

    public void setNrTelefonit(Integer nrTelefonit) {
        this.nrTelefonit = nrTelefonit;
    }

    public String getQyteti() {
        return qyteti;
    }

    public void setQyteti(String qyteti) {
        this.qyteti = qyteti;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Integer getNrBiznesit() {
        return nrBiznesit;
    }

    public void setNrBiznesit(Integer nrBiznesit) {
        this.nrBiznesit = nrBiznesit;
    }

    @XmlTransient
    public Collection<Klienti> getKlientiCollection() {
        return klientiCollection;
    }

    public void setKlientiCollection(Collection<Klienti> klientiCollection) {
        this.klientiCollection = klientiCollection;
    }

    @XmlTransient
    public Collection<Stafi> getStafiCollection() {
        return stafiCollection;
    }

    public void setStafiCollection(Collection<Stafi> stafiCollection) {
        this.stafiCollection = stafiCollection;
    }

    @XmlTransient
    public Collection<Paisjet> getPaisjetCollection() {
        return paisjetCollection;
    }

    public void setPaisjetCollection(Collection<Paisjet> paisjetCollection) {
        this.paisjetCollection = paisjetCollection;
    }

    @XmlTransient
    public Collection<Zhveshtore> getZhveshtoreCollection() {
        return zhveshtoreCollection;
    }

    public void setZhveshtoreCollection(Collection<Zhveshtore> zhveshtoreCollection) {
        this.zhveshtoreCollection = zhveshtoreCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fid != null ? fid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fitnesi)) {
            return false;
        }
        Fitnesi other = (Fitnesi) object;
        if ((this.fid == null && other.fid != null) || (this.fid != null && !this.fid.equals(other.fid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return fid + ":" + emri;
    }
}
