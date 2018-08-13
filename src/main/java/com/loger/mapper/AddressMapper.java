package com.loger.mapper;

import com.loger.entity.Address;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface AddressMapper extends Mapper<Address> {

    List<Address> selectPage();

}