package com.angular.be.angularbe.data.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "provinces")
@Data
public class Provinsi implements Serializable {
    private static final long serialVersionUID = 8072547173660248931L;

    @Column(name = "id")
    @Id
    private String id;

    @Column(name = "name")
    private String name;
}
