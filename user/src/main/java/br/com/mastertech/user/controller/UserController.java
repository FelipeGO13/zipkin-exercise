package br.com.mastertech.user.controller;

import br.com.mastertech.user.dto.UserRequest;
import br.com.mastertech.user.dto.mapper.UserMapper;
import br.com.mastertech.user.model.User;
import br.com.mastertech.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/usuario")
    public User create(@Valid @RequestBody UserRequest userRequest){
        return userService.create(userMapper.toUser(userRequest));
    }

}
