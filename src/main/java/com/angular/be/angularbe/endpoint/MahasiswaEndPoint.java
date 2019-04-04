package com.angular.be.angularbe.endpoint;


import com.angular.be.angularbe.core.impl.BaseEndPointImpl;
import com.angular.be.angularbe.data.model.Mahasiswa;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mahasiswa")
@RestController
public class MahasiswaEndPoint extends BaseEndPointImpl<Mahasiswa,Integer> {

}
