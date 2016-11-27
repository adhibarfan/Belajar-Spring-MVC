package com.adhib.arfan.belajar.spring.mvc.domain;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by adhibarfan on 11/26/16.
 */

@Entity
@Table(name = "tb_barang")
public class Barang implements Serializable {

    @Id
    @Column(name = "id_barang", length = 36)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String idBarang;

    @Column(name = "nama_barang", length = 30, nullable = false)
    private String namaBarang;


    @Enumerated(EnumType.STRING)
    @Column(name = "jenis_barang", length = 5, nullable = false)
    private JenisBarang jenisBarang;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Temporal(TemporalType.DATE)
    @Column(name = "tanggal_kadaluarsa")
    private Date tanggalKadaluarsa;

    @Lob
    @Column(name = "deskripsi")
    private String deskripsi;

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public JenisBarang getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(JenisBarang jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public Date getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public void setTanggalKadaluarsa(Date tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
