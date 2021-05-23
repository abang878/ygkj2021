package com.eagleslab.controller;

import com.eagleslab.entity.UserManager;
import com.eagleslab.service.UserManagerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/userManager")
public class UserManagerController {

    @Resource
    UserManagerService userManagerService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public boolean save(UserManager userManager) {
        System.out.println(userManager.toString());
        return userManagerService.insert(userManager);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public boolean delete(String uname) {
        return userManagerService.delete(uname);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public boolean update(UserManager userManager) {
        return userManagerService.update(userManager);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public UserManager query(String uname) {
        return userManagerService.query(uname);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<UserManager> list(UserManager userManager) {
        System.out.println(userManager);
        return userManagerService.list(userManager);
    }
}
