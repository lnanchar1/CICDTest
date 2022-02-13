package com.epam.engx.cleancode.functions.task2.stubs;

import com.epam.engx.cleancode.functions.task2.Account;
import com.epam.engx.cleancode.functions.task2.thirdpartyjar.Review;

import java.util.List;

public class NotRegisteredAccountStub extends Account {
    public boolean isRegistered() {
        return false;
    }

    public int getVisitNumber() {
        return 1;
    }

    public List<Review> getAllReviews() {
        return null;
    }
}
