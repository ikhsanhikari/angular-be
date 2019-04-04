package com.angular.be.angularbe.dao;

import com.angular.be.angularbe.data.dto.LovDTO;
import com.angular.be.angularbe.data.model.Fakultas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IFakultasDAO extends JpaRepository<Fakultas,Integer> {
    @Query("select new com.angular.be.angularbe.data.dto.LovDTO(f.codeFakultas,f.namaFakultas) from Fakultas f")
    List<LovDTO> getLovFakultas();
}
