package com.loger.service;

import com.loger.common.page.PageResult;
import com.loger.entity.Address;

/**
 * @author Loger
 * Date: 2018-08-13
 * TIme: 16:21
 * Description :
 */
public interface AddressService extends BaseService<Address> {

    PageResult getList();

}
