package com.angular.be.angularbe.data.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mst_negara")
@Data
public class Negara implements Serializable {
    private static final long serialVersionUID = -7441902105095980729L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "code_negara")
    private String codeNegara;

    @Column(name = "nama_negara")
    private String namaNegara;
}
