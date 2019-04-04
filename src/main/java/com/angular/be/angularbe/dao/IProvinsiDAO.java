package com.angular.be.angularbe.dao;


import com.angular.be.angularbe.data.model.Provinsi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProvinsiDAO extends JpaRepository<Provinsi,String> {
}
