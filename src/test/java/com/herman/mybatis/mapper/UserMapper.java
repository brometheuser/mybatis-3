package com.herman.mybatis.mapper;

import com.herman.mybatis.test.UserEntity;

public interface UserMapper {

  //
  UserEntity findById(Integer id);
}
