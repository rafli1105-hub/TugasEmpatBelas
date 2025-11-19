/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TampilanData;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "karyawan")
@NamedQueries({
    @NamedQuery(name = "Karyawan.findAll", query = "SELECT k FROM Karyawan k"),
    @NamedQuery(name = "Karyawan.findByIdkaryawan", query = "SELECT k FROM Karyawan k WHERE k.idkaryawan = :idkaryawan"),
    @NamedQuery(name = "Karyawan.findByNama", query = "SELECT k FROM Karyawan k WHERE k.nama = :nama"),
    @NamedQuery(name = "Karyawan.findByAlamat", query = "SELECT k FROM Karyawan k WHERE k.alamat = :alamat"),
    @NamedQuery(name = "Karyawan.findByGender", query = "SELECT k FROM Karyawan k WHERE k.gender = :gender"),
    @NamedQuery(name = "Karyawan.findByShift", query = "SELECT k FROM Karyawan k WHERE k.shift = :shift")})
public class Karyawan implements Serializable {

    @OneToMany(mappedBy = "idkaryawan")
    private Collection<Absensi> absensiCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idkaryawan")
    private String idkaryawan;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "gender")
    private String gender;
    @Column(name = "shift")
    private String shift;

    public Karyawan() {
    }

    public Karyawan(String idkaryawan) {
        this.idkaryawan = idkaryawan;
    }

    public Karyawan(String idkaryawan, String nama) {
        this.idkaryawan = idkaryawan;
        this.nama = nama;
    }

    public String getIdkaryawan() {
        return idkaryawan;
    }

    public void setIdkaryawan(String idkaryawan) {
        this.idkaryawan = idkaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idkaryawan != null ? idkaryawan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Karyawan)) {
            return false;
        }
        Karyawan other = (Karyawan) object;
        if ((this.idkaryawan == null && other.idkaryawan != null) || (this.idkaryawan != null && !this.idkaryawan.equals(other.idkaryawan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TampilanData.Karyawan[ idkaryawan=" + idkaryawan + " ]";
    }

    public Collection<Absensi> getAbsensiCollection() {
        return absensiCollection;
    }

    public void setAbsensiCollection(Collection<Absensi> absensiCollection) {
        this.absensiCollection = absensiCollection;
    }
    
}
