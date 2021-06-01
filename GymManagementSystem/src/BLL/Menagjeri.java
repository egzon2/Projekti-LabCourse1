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
@Table(name = "Menagjeri")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menagjeri.findAll", query = "SELECT m FROM Menagjeri m"),
    @NamedQuery(name = "Menagjeri.findByMid", query = "SELECT m FROM Menagjeri m WHERE m.mid = :mid"),
    @NamedQuery(name = "Menagjeri.findByEmri", query = "SELECT m FROM Menagjeri m WHERE m.emri = :emri"),
    @NamedQuery(name = "Menagjeri.findByMbiemri", query = "SELECT m FROM Menagjeri m WHERE m.mbiemri = :mbiemri"),
    @NamedQuery(name = "Menagjeri.findByMosha", query = "SELECT m FROM Menagjeri m WHERE m.mosha = :mosha"),
    @NamedQuery(name = "Menagjeri.findByNrPersonal", query = "SELECT m FROM Menagjeri m WHERE m.nrPersonal = :nrPersonal"),
    @NamedQuery(name = "Menagjeri.findByNrTelefonit", query = "SELECT m FROM Menagjeri m WHERE m.nrTelefonit = :nrTelefonit"),
    @NamedQuery(name = "Menagjeri.findByGjinia", query = "SELECT m FROM Menagjeri m WHERE m.gjinia = :gjinia"),
    @NamedQuery(name = "Menagjeri.findByQyteti", query = "SELECT m FROM Menagjeri m WHERE m.qyteti = :qyteti"),
    @NamedQuery(name = "Menagjeri.findByAdresa", query = "SELECT m FROM Menagjeri m WHERE m.adresa = :adresa")})
public class Menagjeri implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MID")
    
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    
    private Integer mid;
    @Column(name = "Emri")
    private String emri;
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Column(name = "Mosha")
    private Integer mosha;
    @Column(name = "NrPersonal")
    private Integer nrPersonal;
    @Column(name = "NrTelefonit")
    private Integer nrTelefonit;
    @Column(name = "Gjinia")
    private Character gjinia;
    @Column(name = "Qyteti")
    private String qyteti;
    @Column(name = "Adresa")
    private String adresa;
    @JoinColumn(name = "SID", referencedColumnName = "SID")
    @ManyToOne
    private Stafi sid;

    public Menagjeri() {
    }

    public Menagjeri(Integer mid) {
        this.mid = mid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
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

    public Integer getNrTelefonit() {
        return nrTelefonit;
    }

    public void setNrTelefonit(Integer nrTelefonit) {
        this.nrTelefonit = nrTelefonit;
    }

    public Character getGjinia() {
        return gjinia;
    }

    public void setGjinia(Character gjinia) {
        this.gjinia = gjinia;
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

    public Stafi getSid() {
        return sid;
    }

    public void setSid(Stafi sid) {
        this.sid = sid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mid != null ? mid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menagjeri)) {
            return false;
        }
        Menagjeri other = (Menagjeri) object;
        if ((this.mid == null && other.mid != null) || (this.mid != null && !this.mid.equals(other.mid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return mid + ":" + emri;
    }
    
}
