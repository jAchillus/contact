package org.cloud.contact.business.transfer.services.controller;

import org.cloud.contact.business.transfer.services.intf.UserServiceIntf;
import org.cloud.contact.business.transfer.services.model.MyUser;
import org.cloud.contact.business.transfer.user.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * user
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
//    @Autowired
    private UserServiceIntf userService;

    /**
     * 显示所有
     * url:"http://localhost/user/findall"
     *
     * @return
     */
    @RequestMapping(value = "/findall")
    public List<MyUser> findAllUserList() {
        return new ArrayList<>();
    }

    @RequestMapping(value = "/login")
    public List<MyUser> login(@PathVariable("code") Integer code) {
        return new ArrayList<>();
    }
    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();

    /**
     * 查找 restful 风格
     * url:"http://localhost/user/find/1"
     *
     * @param id
     * @return
     */

    // == @RequestMapping(value = "/findone/{id}", method = RequestMethod.GET)
    @GetMapping("/find/{id}")
    public MyUser findUser(@PathVariable("id") Integer id) {
        return new MyUser();
    }

//    @Autowired
    private TokenStore tokenStore ;
//    @PostMapping("/auth")
//    public void auth( @RequestHeader("Authorization") String auth) {
//        MyUserDetails userDetails = (MyUserDetails) tokenStore.readAuthentication(auth.split(" ")[1]).getPrincipal();
//
//        User user = userDetails.getUser();
//    }


}