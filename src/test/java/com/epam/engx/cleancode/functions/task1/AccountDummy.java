package com.epam.engx.cleancode.functions.task1;

import com.epam.engx.cleancode.functions.task1.thirdpartyjar.Account;
import com.epam.engx.cleancode.functions.task1.thirdpartyjar.Address;

import java.util.Date;
import java.util.List;

public class AccountDummy implements Account {
    public String getId() {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getPassword() {
        return null;
    }

    public void setCreatedDate(Date date) {

    }

    public Address getAdditionalAddress() {
        return null;
    }

    public Address getWorkAddress() {
        return null;
    }

    public Address getHomeAddress() {
        return null;
    }

    public void setAddresses(List<Address> addresses) {

    }
}
