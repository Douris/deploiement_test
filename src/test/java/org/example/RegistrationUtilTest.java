package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegistrationUtilTest {

    RegistrationUtil registrationUtil;


    @BeforeEach
    void setUp() {
        registrationUtil = new RegistrationUtil();
    }

    @Test
    void test_if_username_isEmpty(){
        boolean actual = registrationUtil.validateUserInput("", "test", "test");
            assertFalse(actual);
        }

    @Test
    void test_password_doesnt_match(){
        boolean actual = registrationUtil.validateUserInput("Kissi","test", "test2");
        assertFalse(actual);
    }

    @Test
    void test_all_field_empty(){
        boolean actual = registrationUtil.validateUserInput("", "", "");
        assertFalse(actual);
    }
    @Test
    void test_correct_input_fields(){
        boolean actual = registrationUtil.validateUserInput("kissi","test","test");
        assertTrue(actual);
    }
}
