package com.epam.engx.cleancode.functions.task1;

import com.epam.engx.cleancode.functions.task1.thirdpartyjar.CheckStatus;
import com.epam.engx.cleancode.functions.task1.thirdpartyjar.PasswordChecker;

class OkPasswordChecker implements PasswordChecker {
    public CheckStatus validate(String password) {
        return CheckStatus.OK;
    }
}
