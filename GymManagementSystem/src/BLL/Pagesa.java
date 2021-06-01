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
@Table(name = "Pagesa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagesa.findAll", query = "SELECT p FROM Pagesa p"),
    @NamedQuery(name = "Pagesa.findByPaid", query = "SELECT p FROM Pagesa p WHERE p.paid = :paid"),
    @NamedQuery(name = "Pagesa.findByPagesaDitore", query = "SELECT p FROM Pagesa p WHERE p.pagesaDitore = :pagesaDitore"),
    @NamedQuery(name = "Pagesa.findByPagesaJavore", query = "SELECT p FROM Pagesa p WHERE p.pagesaJavore = :pagesaJavore"),
    @NamedQuery(name = "Pagesa.findByPagesMujore", query = "SELECT p FROM Pagesa p WHERE p.pagesMujore = :pagesMujore"),
    @NamedQuery(name = "Pagesa.findByOfertaTreMujore", query = "SELECT p FROM Pagesa p WHERE p.ofertaTreMujore = :ofertaTreMujore"),
    @NamedQuery(name = "Pagesa.findByOfertaGjashtMujore", query = "SELECT p FROM Pagesa p WHERE p.ofertaGjashtMujore = :ofertaGjashtMujore"),
    @NamedQuery(name = "Pagesa.findByOfertaVjetore", query = "SELECT p FROM Pagesa p WHERE p.ofertaVjetore = :ofertaVjetore")})
public class Pagesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAID")
    
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    
    private Integer paid;
    @Column(name = "PagesaDitore")
    private String pagesaDitore;
    @Column(name = "PagesaJavore")
    private String pagesaJavore;
    @Column(name = "PagesMujore")
    private String pagesMujore;
    @Column(name = "OfertaTreMujore")
    private String ofertaTreMujore;
    @Column(name = "OfertaGjashtMujore")
    private String ofertaGjashtMujore;
    @Column(name = "OfertaVjetore")
    private String ofertaVjetore;
    @JoinColumn(name = "KID", referencedColumnName = "KID")
    @ManyToOne
    private Klienti kid;

    public Pagesa() {
    }

    public Pagesa(Integer paid) {
        this.paid = paid;
    }

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public String getPagesaDitore() {
        return pagesaDitore;
    }

    public void setPagesaDitore(String pagesaDitore) {
        this.pagesaDitore = pagesaDitore;
    }

    public String getPagesaJavore() {
        return pagesaJavore;
    }

    public void setPagesaJavore(String pagesaJavore) {
        this.pagesaJavore = pagesaJavore;
    }

    public String getPagesMujore() {
        return pagesMujore;
    }

    public void setPagesMujore(String pagesMujore) {
        this.pagesMujore = pagesMujore;
    }

    public String getOfertaTreMujore() {
        return ofertaTreMujore;
    }

    public void setOfertaTreMujore(String ofertaTreMujore) {
        this.ofertaTreMujore = ofertaTreMujore;
    }

    public String getOfertaGjashtMujore() {
        return ofertaGjashtMujore;
    }

    public void setOfertaGjashtMujore(String ofertaGjashtMujore) {
        this.ofertaGjashtMujore = ofertaGjashtMujore;
    }

    public String getOfertaVjetore() {
        return ofertaVjetore;
    }

    public void setOfertaVjetore(String ofertaVjetore) {
        this.ofertaVjetore = ofertaVjetore;
    }

    public Klienti getKid() {
        return kid;
    }

    public void setKid(Klienti kid) {
        this.kid = kid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paid != null ? paid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagesa)) {
            return false;
        }
        Pagesa other = (Pagesa) object;
        if ((this.paid == null && other.paid != null) || (this.paid != null && !this.paid.equals(other.paid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + paid + " ";
    }
    
}
