package com.angular.be.angularbe.endpoint;

import com.angular.be.angularbe.core.impl.BaseEndPointImpl;
import com.angular.be.angularbe.data.model.Provinsi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provinsi")
public class ProvinsiEndPoint extends BaseEndPointImpl<Provinsi,String> {

}
