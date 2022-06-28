package com.animal;

public class LimitException extends RuntimeException {
    private double RemainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
      this.RemainingAmount = remainingAmount;

    }

    public double getRemainingAmount() {
        return RemainingAmount;
    }
}

