package com.epam.engx.cleancode.functions.task2;

import com.epam.engx.cleancode.functions.task2.thirdpartyjar.Level;
import com.epam.engx.cleancode.functions.task2.thirdpartyjar.NotActivUserException;
import com.epam.engx.cleancode.functions.task2.thirdpartyjar.Review;
import com.epam.engx.cleancode.functions.task2.thirdpartyjar.User;

import java.util.TreeMap;

public abstract class Account implements User {

	private TreeMap<Integer, Level> thresholdToLevel = new TreeMap<Integer, Level>();

	public Level getActivityLevel() {
		validateAccountForLevel();

		int reviewAnswers = 0;
		for (Review r : getAllReviews()) {
			reviewAnswers += r.getAnswers().size();
		}
		return getLevelByReviews(reviewAnswers);
	}

	private void validateAccountForLevel() {
		if (isActiveUser()) {
			throw new NotActivUserException();
		}
	}

	public boolean isActiveUser() {
		return isNotRegistered() || getVisitNumber() <= 0;
	}

	private boolean isNotRegistered() {
		return !isRegistered();
	}

	private Level getLevelByReviews(int reviewAnswers) {
		for(Integer threshold : thresholdToLevel.keySet()) {
			if (reviewAnswers >= threshold)
				return thresholdToLevel.get(threshold);
		}

		return Level.defaultLevel();
	}

	public void setThresholdToLevel(TreeMap<Integer, Level> thresholdToLevel) {
		this.thresholdToLevel = thresholdToLevel;
	}
}
