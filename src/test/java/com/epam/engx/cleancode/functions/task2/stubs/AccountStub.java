package com.epam.engx.cleancode.functions.task2.stubs;

import com.epam.engx.cleancode.functions.task2.Account;
import com.epam.engx.cleancode.functions.task2.thirdpartyjar.Review;

import java.util.List;

public class AccountStub extends Account {

    private List<Review> reviews;

    public AccountStub(List<Review> reviews) {
        this.reviews = reviews;
    }

    public boolean isRegistered() {
        return true;
    }

    public int getVisitNumber() {
        return 1;
    }

    public List<Review> getAllReviews() {
        return reviews;
    }
}
