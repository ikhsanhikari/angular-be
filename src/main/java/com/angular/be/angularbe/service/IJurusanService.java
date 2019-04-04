package com.angular.be.angularbe.service;

import com.angular.be.angularbe.data.model.Jurusan;
import org.springframework.http.ResponseEntity;

public interface IJurusanService {

    ResponseEntity save(Jurusan jurusan);
    ResponseEntity findAll();
}
