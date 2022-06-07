package com.inexture.user_service.service;

import com.inexture.user_service.model.UserBean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;

@Service
public class UserService {
    List<UserBean> userBeanList = List.of(
            new UserBean(1,"Yash"),
            new UserBean(2,"Brijesh"),
            new UserBean(3,"Jaydeep")
    );

    public UserBean getUser(int id){
        return userBeanList.stream().filter(userBean -> userBean.getId()==id).findAny().orElse(null);
    }
}
