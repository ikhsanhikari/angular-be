package com.angular.be.angularbe.data.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "mst_mahasiswa")
public class Mahasiswa implements Serializable {
    private static final long serialVersionUID = 5552569758143359970L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "nim")
    private String nim;

    @Column(name = "nama_depan")
    private String namaDepan;

    @Column(name = "nama_belakang")
    private String namaBelakang;

    //alamat :
    @Column(name = "provinsi")
    private String provinsi;

    @Column(name = "kota")
    private String kota;

    @Column(name = "kecamatan")
    private String kecamatan;

    @Column(name = "desa")
    private String desa;

    @Column(name = "rw")
    private String rw;

    @Column(name = "rt")
    private String rt;

    @Column(name = "blok")
    private String blok;

    @Column(name = "jumlah_sodara")
    private Integer jumlahSodara;

    @Column(name = "jurusan")
    private String jurusan;

    @Column(name = "tanggal_lahir")
    private Date tanggalLahir;

    @Column(name = "angkatan_ke")
    private String angkatanKe;

    @Column(name = "fakultas")
    private String fakultas;

    @Column(name = "golongan_darah")
    private String golonganDarah;

    @Column(name = "status_pernikahan")
    private String statusPernikahan;

    //orang tua
    @Column(name = "nama_ayah")
    private String namaAyah;

    @Column(name = "pekerjaan_ayah")
    private String pekerjaanAyah;

    @Column(name = "pendapatan_ayah_perbulan")
    private Double pendapatanAyahPerBUlan;

    @Column(name = "nama_ibu")
    private String namaIbu;

    @Column(name = "pekerjaan_ibu")
    private String pekerjaanIbu;

    @Column(name = "pendapatan_ibu_perbulan")
    private Double pendapatanIbuPebulan;

}
