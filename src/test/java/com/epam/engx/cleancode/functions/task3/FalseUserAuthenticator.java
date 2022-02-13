package com.epam.engx.cleancode.functions.task3;

import com.epam.engx.cleancode.functions.task3.thirdpartyjar.User;

class FalseUserAuthenticator extends UserAuthenticator {
    public boolean isPasswordCorrect(User user, String password) {
        return false;
    }

    public User getUserByName(String userName) {
        return new User() {};
    }
}
