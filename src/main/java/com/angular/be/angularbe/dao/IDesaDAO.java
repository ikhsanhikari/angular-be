package com.angular.be.angularbe.dao;

import com.angular.be.angularbe.data.model.Desa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDesaDAO extends JpaRepository<Desa,String> {
    @Query("select k from Desa k where k.idKecamatan = ?1")
    List<Desa> getDesaByKecamatan(String idKecamatan);
}
