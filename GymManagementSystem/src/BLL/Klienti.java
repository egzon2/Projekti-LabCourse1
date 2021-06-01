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
@Table(name = "Klienti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Klienti.findAll", query = "SELECT k FROM Klienti k"),
    @NamedQuery(name = "Klienti.findByKid", query = "SELECT k FROM Klienti k WHERE k.kid = :kid"),
    @NamedQuery(name = "Klienti.findByEmri", query = "SELECT k FROM Klienti k WHERE k.emri = :emri"),
    @NamedQuery(name = "Klienti.findByMbiemri", query = "SELECT k FROM Klienti k WHERE k.mbiemri = :mbiemri"),
    @NamedQuery(name = "Klienti.findByGjinia", query = "SELECT k FROM Klienti k WHERE k.gjinia = :gjinia"),
    @NamedQuery(name = "Klienti.findByNrPersonal", query = "SELECT k FROM Klienti k WHERE k.nrPersonal = :nrPersonal"),
    @NamedQuery(name = "Klienti.findByMosha", query = "SELECT k FROM Klienti k WHERE k.mosha = :mosha"),
    @NamedQuery(name = "Klienti.findByQyteti", query = "SELECT k FROM Klienti k WHERE k.qyteti = :qyteti"),
    @NamedQuery(name = "Klienti.findByAdresa", query = "SELECT k FROM Klienti k WHERE k.adresa = :adresa")})
public class Klienti implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KID")
    
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    
    private Integer kid;
    @Column(name = "Emri")
    private String emri;
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Column(name = "Gjinia")
    private Character gjinia;
    @Column(name = "NrPersonal")
    private Integer nrPersonal;
    @Column(name = "Mosha")
    private Integer mosha;
    @Column(name = "Qyteti")
    private String qyteti;
    @Column(name = "Adresa")
    private String adresa;
    @JoinColumn(name = "FID", referencedColumnName = "FID")
    @ManyToOne
    private Fitnesi fid;
    @JoinColumn(name = "TID", referencedColumnName = "TID")
    @ManyToOne
    private Trajneri tid;
    @OneToMany(mappedBy = "kid")
    private Collection<Pagesa> pagesaCollection;

    public Klienti() {
    }

    public Klienti(Integer kid) {
        this.kid = kid;
    }
    
    public Klienti(Integer sid, String emri, String mbiemri, Character gjinia, Integer nrPersonal, Integer mosha,  String qyteti, String adresa) {
        this.kid = kid;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.gjinia = gjinia;
        this.nrPersonal = nrPersonal;
        this.mosha = mosha;
        this.qyteti = qyteti;
        this.adresa = adresa;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
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

    public Integer getNrPersonal() {
        return nrPersonal;
    }

    public void setNrPersonal(Integer nrPersonal) {
        this.nrPersonal = nrPersonal;
    }

    public Integer getMosha() {
        return mosha;
    }

    public void setMosha(Integer mosha) {
        this.mosha = mosha;
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

    public Fitnesi getFid() {
        return fid;
    }

    public void setFid(Fitnesi fid) {
        this.fid = fid;
    }

    public Trajneri getTid() {
        return tid;
    }

    public void setTid(Trajneri tid) {
        this.tid = tid;
    }

    @XmlTransient
    public Collection<Pagesa> getPagesaCollection() {
        return pagesaCollection;
    }

    public void setPagesaCollection(Collection<Pagesa> pagesaCollection) {
        this.pagesaCollection = pagesaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kid != null ? kid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Klienti)) {
            return false;
        }
        Klienti other = (Klienti) object;
        if ((this.kid == null && other.kid != null) || (this.kid != null && !this.kid.equals(other.kid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + kid + " ";
    }
    
}
