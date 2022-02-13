package com.epam.engx.cleancode.functions.task3;

import com.epam.engx.cleancode.functions.task3.thirdpartyjar.SessionManager;
import com.epam.engx.cleancode.functions.task3.thirdpartyjar.User;
import org.junit.Assert;

public class TrueUserAuthenticatorMock extends UserAuthenticator {

    private final User user = new User() {};
    private  User sessionUser;

    public TrueUserAuthenticatorMock() {
        setSessionManager(new SessionManager() {
            public void setCurrentUser(User user) {
                sessionUser = user;
            }
        });
    }

    public boolean isPasswordCorrect(User user, String password) {
        return true;
    }

    public User getUserByName(String userName) {
        return user;
    }

    public void assertSetCurrentUserToSession(){
        Assert.assertEquals(sessionUser, user);
    }
}
