package com.orion.controller;

import com.orion.convertors.UserMapper;
import com.orion.domain.UserCommand;
import com.orion.entities.User;

public class UserController {

    User saveUser(UserCommand command){
//        Fake impl
        return UserMapper.INSTANCE.userCommandToUser(command);

    }

}
