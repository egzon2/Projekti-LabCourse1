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
@Table(name = "Trajneri")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trajneri.findAll", query = "SELECT t FROM Trajneri t"),
    @NamedQuery(name = "Trajneri.findByTid", query = "SELECT t FROM Trajneri t WHERE t.tid = :tid"),
    @NamedQuery(name = "Trajneri.findByEmri", query = "SELECT t FROM Trajneri t WHERE t.emri = :emri"),
    @NamedQuery(name = "Trajneri.findByMbiemri", query = "SELECT t FROM Trajneri t WHERE t.mbiemri = :mbiemri"),
    @NamedQuery(name = "Trajneri.findByGjinia", query = "SELECT t FROM Trajneri t WHERE t.gjinia = :gjinia"),
    @NamedQuery(name = "Trajneri.findByMosha", query = "SELECT t FROM Trajneri t WHERE t.mosha = :mosha"),
    @NamedQuery(name = "Trajneri.findByNrTelefonit", query = "SELECT t FROM Trajneri t WHERE t.nrTelefonit = :nrTelefonit"),
    @NamedQuery(name = "Trajneri.findByQyteti", query = "SELECT t FROM Trajneri t WHERE t.qyteti = :qyteti"),
    @NamedQuery(name = "Trajneri.findByAdresa", query = "SELECT t FROM Trajneri t WHERE t.adresa = :adresa")})
public class Trajneri implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TID")
    
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    
    private Integer tid;
    @Column(name = "Emri")
    private String emri;
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Column(name = "Gjinia")
    private Character gjinia;
    @Column(name = "Mosha")
    private Integer mosha;
    @Column(name = "NrTelefonit")
    private Integer nrTelefonit;
    @Column(name = "Qyteti")
    private String qyteti;
    @Column(name = "Adresa")
    private String adresa;
    @OneToMany(mappedBy = "tid")
    private Collection<Klienti> klientiCollection;
    @JoinColumn(name = "SID", referencedColumnName = "SID")
    @ManyToOne
    private Stafi sid;

    public Trajneri() {
    }

    public Trajneri(Integer tid) {
        this.tid = tid;
    }
    
    public Trajneri(Integer tid, String emri, String mbiemri, Character gjinia, Integer mosha, Integer nrTelefonit, String qyteti, String adresa) {
        this.tid = tid;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.gjinia = gjinia;
        this.mosha = mosha;
        this.nrTelefonit = nrTelefonit;
        this.qyteti = qyteti;
        this.adresa = adresa;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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

    public Character getGjinia() {
        return gjinia;
    }

    public void setGjinia(Character gjinia) {
        this.gjinia = gjinia;
    }

    public Integer getMosha() {
        return mosha;
    }

    public void setMosha(Integer mosha) {
        this.mosha = mosha;
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

    @XmlTransient
    public Collection<Klienti> getKlientiCollection() {
        return klientiCollection;
    }

    public void setKlientiCollection(Collection<Klienti> klientiCollection) {
        this.klientiCollection = klientiCollection;
    }

    public Stafi getSid() {
        return sid;
    }

    public void setSid(Stafi sid) {
        this.sid = sid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tid != null ? tid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trajneri)) {
            return false;
        }
        Trajneri other = (Trajneri) object;
        if ((this.tid == null && other.tid != null) || (this.tid != null && !this.tid.equals(other.tid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + tid + " ";
    }
    
}
