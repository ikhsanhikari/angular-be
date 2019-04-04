package com.angular.be.angularbe.data.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "regencies")
@Data
public class Kota implements Serializable {
    private static final long serialVersionUID = -8685232024325715482L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "province_id")
    private String idProvinsi;

    @Column(name = "name")
    private String name;

}
