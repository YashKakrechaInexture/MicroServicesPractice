package com.inexture.user_service.controller;

import com.inexture.user_service.model.AddressBean;
import com.inexture.user_service.model.UserBean;
import com.inexture.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class FrontController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("{uid}")
    public UserBean getUser(@PathVariable int uid){
        UserBean userBean = userService.getUser(uid);
        List<AddressBean> addlist = this.restTemplate.getForObject("http://Address-Service/address/"+uid,List.class);

        userBean.setAddressBeanList(addlist);

        return userBean;
    }
}
