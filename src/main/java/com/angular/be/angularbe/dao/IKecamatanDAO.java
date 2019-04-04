package com.angular.be.angularbe.dao;

import com.angular.be.angularbe.data.model.Kecamatan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IKecamatanDAO extends JpaRepository<Kecamatan,String> {
    @Query("select k from Kecamatan k where k.idKota = ?1")
    List<Kecamatan> getKecamatanByKota(String idKota);
}
