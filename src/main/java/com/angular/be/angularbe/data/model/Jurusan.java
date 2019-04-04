package com.angular.be.angularbe.data.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mst_jurusan")
@Data
public class Jurusan implements Serializable {
    private static final long serialVersionUID = -2513502101081453544L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "code_jurusan")
    private String codeJurusan;

    @Column(name = "nama_jurusan")
    private String namaJurusan;

    @Column(name = "code_fakultas")
    private String codeFakultas;

    @Column(name = "description")
    private String description;
}
