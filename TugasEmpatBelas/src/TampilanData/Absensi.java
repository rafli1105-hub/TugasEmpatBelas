/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TampilanData;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "absensi")
@NamedQueries({
    @NamedQuery(name = "Absensi.findAll", query = "SELECT a FROM Absensi a"),
    @NamedQuery(name = "Absensi.findByIdabsensi", query = "SELECT a FROM Absensi a WHERE a.idabsensi = :idabsensi"),
    @NamedQuery(name = "Absensi.findByTanggal", query = "SELECT a FROM Absensi a WHERE a.tanggal = :tanggal"),
    @NamedQuery(name = "Absensi.findByJamMasuk", query = "SELECT a FROM Absensi a WHERE a.jamMasuk = :jamMasuk"),
    @NamedQuery(name = "Absensi.findByJamKeluar", query = "SELECT a FROM Absensi a WHERE a.jamKeluar = :jamKeluar")})
public class Absensi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idabsensi")
    private String idabsensi;
    @Basic(optional = false)
    @Column(name = "tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @Basic(optional = false)
    @Column(name = "jam_masuk")
    @Temporal(TemporalType.TIME)
    private Date jamMasuk;
    @Basic(optional = false)
    @Column(name = "jam_keluar")
    @Temporal(TemporalType.TIME)
    private Date jamKeluar;
    @JoinColumn(name = "idkaryawan", referencedColumnName = "idkaryawan")
    @ManyToOne(optional = false)
    private Karyawan idkaryawan;

    public Absensi() {
    }

    public Absensi(String idabsensi) {
        this.idabsensi = idabsensi;
    }

    public Absensi(String idabsensi, Date tanggal, Date jamMasuk, Date jamKeluar) {
        this.idabsensi = idabsensi;
        this.tanggal = tanggal;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
    }

    public String getIdabsensi() {
        return idabsensi;
    }

    public void setIdabsensi(String idabsensi) {
        this.idabsensi = idabsensi;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Date getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(Date jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public Date getJamKeluar() {
        return jamKeluar;
    }

    public void setJamKeluar(Date jamKeluar) {
        this.jamKeluar = jamKeluar;
    }

    public Karyawan getIdkaryawan() {
        return idkaryawan;
    }

    public void setIdkaryawan(Karyawan idkaryawan) {
        this.idkaryawan = idkaryawan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idabsensi != null ? idabsensi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Absensi)) {
            return false;
        }
        Absensi other = (Absensi) object;
        if ((this.idabsensi == null && other.idabsensi != null) || (this.idabsensi != null && !this.idabsensi.equals(other.idabsensi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TampilanData.Absensi[ idabsensi=" + idabsensi + " ]";
    }
    
}
