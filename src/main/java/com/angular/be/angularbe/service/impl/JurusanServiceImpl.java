package com.angular.be.angularbe.service.impl;

import com.angular.be.angularbe.dao.IJurusanDAO;
import com.angular.be.angularbe.data.model.Jurusan;
import com.angular.be.angularbe.service.IJurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class JurusanServiceImpl implements IJurusanService{
    @Autowired
    IJurusanDAO iJurusanDAO;


    @Override
    public ResponseEntity save(Jurusan jurusan) {
        return null;
    }

    @Override
    public ResponseEntity findAll() {
        return null;
    }
}
