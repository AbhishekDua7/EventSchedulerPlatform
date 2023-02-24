package com.events.scheduler.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest {

    private User userUnderTest;

    @BeforeEach
    void setUp() throws Exception {
        userUnderTest = new User(2, "Mark", "mark@gmail.com", "passwd", UserRole.CUSTOMER);
    }

    @Test
    void testVerifyLogin() {

        final boolean result = userUnderTest.verifyLogin("mark@gmail.com", "passwd");

        assertTrue(result);
    }
}
