package com.loger.controller;

import com.loger.entity.Address;
import com.loger.mapper.AddressMapper;
import com.loger.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Loger
 * Date: 2018-08-13
 * TIme: 15:56
 * Description :
 */
@RestController
public class TestController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/test/get")
    public Object get(){
        return addressService.getList();
    }

}
