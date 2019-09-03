package com.wg.doc.user.service.impl;

import com.wg.doc.user.dao.UserInfoRepository;
import com.wg.doc.user.entity.UserInfo;
import com.wg.doc.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfoServiceImpl implements UserInfoService {


    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo getUser(long id) {
        return userInfoRepository.getOne(id);
    }
}
