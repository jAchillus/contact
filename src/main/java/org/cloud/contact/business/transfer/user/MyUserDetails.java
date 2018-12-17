package org.cloud.contact.business.transfer.user;

import org.springframework.security.core.userdetails.User;

import java.util.Collections;

public class MyUserDetails extends User {

    private User user;

    public MyUserDetails(User user) {
        super(user.getUsername(), user.getPassword(), true, true, true, true, Collections.EMPTY_SET);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
