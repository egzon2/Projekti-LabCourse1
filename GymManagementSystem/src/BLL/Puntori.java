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
@Table(name = "Puntori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puntori.findAll", query = "SELECT p FROM Puntori p"),
    @NamedQuery(name = "Puntori.findByPid", query = "SELECT p FROM Puntori p WHERE p.pid = :pid"),
    @NamedQuery(name = "Puntori.findByEmri", query = "SELECT p FROM Puntori p WHERE p.emri = :emri"),
    @NamedQuery(name = "Puntori.findByMbiemri", query = "SELECT p FROM Puntori p WHERE p.mbiemri = :mbiemri"),
    @NamedQuery(name = "Puntori.findByMosha", query = "SELECT p FROM Puntori p WHERE p.mosha = :mosha"),
    @NamedQuery(name = "Puntori.findByGjinia", query = "SELECT p FROM Puntori p WHERE p.gjinia = :gjinia"),
    @NamedQuery(name = "Puntori.findByNrTelefonit", query = "SELECT p FROM Puntori p WHERE p.nrTelefonit = :nrTelefonit"),
    @NamedQuery(name = "Puntori.findByQyteti", query = "SELECT p FROM Puntori p WHERE p.qyteti = :qyteti"),
    @NamedQuery(name = "Puntori.findByAdresa", query = "SELECT p FROM Puntori p WHERE p.adresa = :adresa")})
public class Puntori implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PID")
    
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    
    private Integer pid;
    @Column(name = "Emri")
    private String emri;
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Column(name = "Mosha")
    private Integer mosha;
    @Column(name = "Gjinia")
    private Character gjinia;
    @Column(name = "NrTelefonit")
    private Integer nrTelefonit;
    @Column(name = "Qyteti")
    private String qyteti;
    @Column(name = "Adresa")
    private String adresa;
    @JoinColumn(name = "SID", referencedColumnName = "SID")
    @ManyToOne
    private Stafi sid;

    public Puntori() {
    }

    public Puntori(Integer pid) {
        this.pid = pid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    public Character getGjinia() {
        return gjinia;
    }

    public void setGjinia(Character gjinia) {
        this.gjinia = gjinia;
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

    public Stafi getSid() {
        return sid;
    }

    public void setSid(Stafi sid) {
        this.sid = sid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puntori)) {
            return false;
        }
        Puntori other = (Puntori) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + pid + " ";
    }
    
}
