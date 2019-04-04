package com.angular.be.angularbe.dao;

import com.angular.be.angularbe.data.model.Jurusan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IJurusanDAO extends JpaRepository<Jurusan,Integer> {
    @Query("select k from Jurusan k where k.codeFakultas = ?1")
    List<Jurusan> getJurusanByFakultas(String idFakultas);
}
