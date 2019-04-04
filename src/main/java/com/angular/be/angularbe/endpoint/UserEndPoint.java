package com.angular.be.angularbe.endpoint;


import com.angular.be.angularbe.core.impl.BaseEndPointImpl;
import com.angular.be.angularbe.data.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserEndPoint extends BaseEndPointImpl<User,Integer> {

}
