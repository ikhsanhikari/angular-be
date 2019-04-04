package com.angular.be.angularbe.endpoint;

import com.angular.be.angularbe.core.impl.BaseEndPointImpl;
import com.angular.be.angularbe.dao.IFakultasDAO;
import com.angular.be.angularbe.data.dto.LovDTO;
import com.angular.be.angularbe.data.model.Jurusan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jurusan")
public class JurusanLovEndPoint extends BaseEndPointImpl<Jurusan,Integer> {
//    private IFakultasDAO iFakultasDAO;
//
//    @GetMapping("/fakultas")
//    private List<LovDTO> lovFakultas(){
//        return iFakultasDAO.getLovFakultas();
//    }
}
