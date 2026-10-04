package com.gym;

public class GymMembership {

    // Calculate basic membership fee
    public double calculateMembershipFee(int months, double monthlyFee) {
        return months * monthlyFee;
    }

    // Calculate discount based on membership duration
    public double calculateDiscount(int months, double membershipFee) {
        if (months >= 12) {
            return membershipFee * 0.20;
        } else if (months >= 6) {
            return membershipFee * 0.10;
        } else {
            return 0;
        }
    }

    // Calculate personal training fee
    public double calculatePersonalTrainingFee(int sessions, double feePerSession) {
        return sessions * feePerSession;
    }

    // Calculate final amount after discount and training charges
    public double calculateFinalAmount(
            double membershipFee,
            double discount,
            double trainingFee) {

        return membershipFee - discount + trainingFee;
    }
}