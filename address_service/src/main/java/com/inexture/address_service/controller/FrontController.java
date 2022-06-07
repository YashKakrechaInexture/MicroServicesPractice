package com.inexture.address_service.controller;

import com.inexture.address_service.model.AddressBean;
import com.inexture.address_service.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class FrontController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/{uid}")
    public List<AddressBean> getAddress(@PathVariable int uid){
        return addressService.getAddressBeans(uid);
    }
}
