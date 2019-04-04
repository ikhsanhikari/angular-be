package com.angular.be.angularbe.data.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "villages")
@Data
public class Desa implements Serializable {
    private static final long serialVersionUID = 3950658704282119009L;

    @Id
    private String id;

    @Column(name = "district_id")
    private String idKecamatan;

    @Column(name = "name")
    private String name;
}
