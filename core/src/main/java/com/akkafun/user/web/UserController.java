package com.akkafun.user.web;

import com.akkafun.user.api.dtos.RegisterDto;
import com.akkafun.user.api.dtos.UserDto;
import com.akkafun.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liubin on 2016/3/29.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/users/register", method = RequestMethod.POST)
    public UserDto searchForm(Model model, RegisterDto registerDto, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
        }

        return null;
    }


}
