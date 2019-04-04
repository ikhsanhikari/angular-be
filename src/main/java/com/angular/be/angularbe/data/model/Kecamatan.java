package com.angular.be.angularbe.data.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "districts")
@Data
public class Kecamatan implements Serializable {

    private static final long serialVersionUID = -4005971207515594227L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "regency_id")
    private String idKota;

    @Column(name = "name")
    private String name;
}
