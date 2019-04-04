package com.angular.be.angularbe.endpoint;

import com.angular.be.angularbe.dao.IKecamatanDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kecamatan")
public class KecamatanEndPoint {
    @Autowired
    IKecamatanDAO iKecamatanDAO;

    @GetMapping("/{id}")
    public ResponseEntity getKota(@PathVariable("id") String id){
        return ResponseEntity.ok(iKecamatanDAO.getKecamatanByKota(id));
    }
}

