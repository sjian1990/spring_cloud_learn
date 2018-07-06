package com.sun.learn.service;

import com.sun.learn.entity.User;

public interface FeignService {

	Object getFeignInfo();

	Object objectParamTest(User user);

}
