package com.angular.be.angularbe.dao;

import com.angular.be.angularbe.data.model.Kota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IKotaDAO  extends JpaRepository<Kota,String> {
    @Query("select k from Kota k where k.idProvinsi = ?1")
    List<Kota> getKotaByProv(String idProvinsi);
}
