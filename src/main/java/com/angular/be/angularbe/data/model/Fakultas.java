package com.angular.be.angularbe.data.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "mst_fakultas")
@Entity
@Data
public class Fakultas implements Serializable {
    private static final long serialVersionUID = -1213909405843913270L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "code_fakultas")
    private String codeFakultas;

    @Column(name = "nama_fakultas")
    private String namaFakultas;

    @Column(name = "description")
    private String description;
}
