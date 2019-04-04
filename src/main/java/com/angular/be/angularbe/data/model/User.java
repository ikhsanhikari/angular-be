package com.angular.be.angularbe.data.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tbl_user")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1275311346959134952L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "position")
    private Integer position;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "birth")
    private Date birth;

    @Column(name = "role")
    private String role;

    @Column(name = "username")
    private String username;


}

