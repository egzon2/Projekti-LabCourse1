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
@Table(name = "Paisjet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paisjet.findAll", query = "SELECT p FROM Paisjet p"),
    @NamedQuery(name = "Paisjet.findByPsid", query = "SELECT p FROM Paisjet p WHERE p.psid = :psid"),
    @NamedQuery(name = "Paisjet.findByNrSerik", query = "SELECT p FROM Paisjet p WHERE p.nrSerik = :nrSerik"),
    @NamedQuery(name = "Paisjet.findByPershkrimi", query = "SELECT p FROM Paisjet p WHERE p.pershkrimi = :pershkrimi")})
public class Paisjet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PSID")
    
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    
    private Integer psid;
    @Column(name = "NrSerik")
    private Integer nrSerik;
    @Column(name = "Pershkrimi")
    private String pershkrimi;
    @JoinColumn(name = "FID", referencedColumnName = "FID")
    @ManyToOne
    private Fitnesi fid;

    public Paisjet() {
    }

    public Paisjet(Integer psid) {
        this.psid = psid;
    }

    public Integer getPsid() {
        return psid;
    }

    public void setPsid(Integer psid) {
        this.psid = psid;
    }

    public Integer getNrSerik() {
        return nrSerik;
    }

    public void setNrSerik(Integer nrSerik) {
        this.nrSerik = nrSerik;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }

    public void setPershkrimi(String pershkrimi) {
        this.pershkrimi = pershkrimi;
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
        hash += (psid != null ? psid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paisjet)) {
            return false;
        }
        Paisjet other = (Paisjet) object;
        if ((this.psid == null && other.psid != null) || (this.psid != null && !this.psid.equals(other.psid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + psid + " ";
    }
    
}
