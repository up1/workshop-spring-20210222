package com.example.workshop01.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void found_user_id_1() {
        // Prepare data
        MyUser somkiat = new MyUser(1, "somkiat", 40);
        userRepository.save(somkiat);
        // Test
        Optional<MyUser> result = userRepository.findById(1);
        assertTrue(result.isPresent());
        assertEquals(1, result.get().getId());
        assertEquals("somkiat", result.get().getName());
        assertEquals(40, result.get().getAge());
    }

    @Test
    public void not_found_user_id_2() {
        // Test
        Optional<MyUser> result = userRepository.findById(2);
        assertFalse(result.isPresent());
    }

}