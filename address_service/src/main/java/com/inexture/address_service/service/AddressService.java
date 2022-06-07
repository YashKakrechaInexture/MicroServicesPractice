package com.inexture.address_service.service;

import com.inexture.address_service.model.AddressBean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressService {

    List<AddressBean> addressBeanList = List.of(
            new AddressBean("123","Ahmedabad", "Gujarat", "India", 1),
            new AddressBean("124","Ahmedabad", "Gujarat", "India", 2),
            new AddressBean("125","Ahmedabad", "Gujarat", "India", 3),
            new AddressBean("126","Ahmedabad", "Gujarat", "India", 1),
            new AddressBean("127","Ahmedabad", "Gujarat", "India", 2)
            );

    public List<AddressBean> getAddressBeans(int uid){
        return addressBeanList.stream().filter(addressBean -> addressBean.getUid()==uid).collect(Collectors.toList());
    }
}
