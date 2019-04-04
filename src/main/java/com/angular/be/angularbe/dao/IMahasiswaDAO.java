package com.angular.be.angularbe.dao;

import com.angular.be.angularbe.data.model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMahasiswaDAO extends JpaRepository<Mahasiswa,Integer> {
}
