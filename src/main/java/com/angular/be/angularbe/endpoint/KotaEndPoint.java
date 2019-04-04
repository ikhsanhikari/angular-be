package com.angular.be.angularbe.endpoint;

import com.angular.be.angularbe.core.impl.BaseEndPointImpl;
import com.angular.be.angularbe.dao.IKotaDAO;
import com.angular.be.angularbe.data.model.Kota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kota")
public class KotaEndPoint {

    @Autowired
    IKotaDAO iKotaDAO;

    @GetMapping("/{id}")
    public ResponseEntity getKota(@PathVariable("id") String id){
        return ResponseEntity.ok(iKotaDAO.getKotaByProv(id));
    }
}
