package com.gym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GymMembershipTest {

    GymMembership gym = new GymMembership();

    @Test
    void testMembershipFee() {
        double result = gym.calculateMembershipFee(6, 1500);
        assertEquals(9000, result);
    }

    @Test
    void testDiscount() {
        double result = gym.calculateDiscount(6, 9000);
        assertEquals(900, result);
    }

    @Test
    void testPersonalTrainingFee() {
        double result = gym.calculatePersonalTrainingFee(4, 500);
        assertEquals(2000, result);
    }

    @Test
    void testFinalAmount() {
        double result = gym.calculateFinalAmount(9000, 900, 2000);
        assertEquals(10100, result);
    }
}