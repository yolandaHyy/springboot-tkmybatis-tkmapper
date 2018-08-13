package com.loger.service.impl;

import com.github.pagehelper.PageHelper;
import com.loger.common.page.PageResult;
import com.loger.entity.Address;
import com.loger.mapper.AddressMapper;
import com.loger.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Loger
 * Date: 2018-08-13
 * TIme: 16:21
 * Description :
 */
@Service("addressService")
public class AddressServiceImpl extends BaseServiceImpl<Address> implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public PageResult getList() {
        PageHelper.startPage(1, 1);
        List<Address> list = addressMapper.selectPage();
        return new PageResult<>(list);
    }
}
