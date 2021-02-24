package com.example.workshop01.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void success_found_user_1() {
        // Prepare data
        MyUser somkiat = new MyUser(1, "somkiat", 40);
        userRepository.save(somkiat);
        // Test
        UserResponse result
                = restTemplate.getForObject("/users/1", UserResponse.class);
        assertEquals(1, result.getId());
        assertEquals("somkiat", result.getName());
        assertEquals(40, result.getAge());
    }

    @Test
    public void user_not_found() {
        ErrorResponse result
                = restTemplate.getForObject("/users/0", ErrorResponse.class);
        assertEquals(4567, result.getCode());
        assertEquals("User not found with id=0", result.getMessage());
    }

    @Test
    public void failure_with_invalid_id() {
        ErrorResponse result
                = restTemplate.getForObject("/users/abc", ErrorResponse.class);
        assertEquals(1234, result.getCode());
        assertEquals("Invalid id with abc", result.getMessage());
    }

    @Test
    public void get_all_user_with_size_3() {
        List<LinkedHashMap> result
                = restTemplate.getForObject("/users", List.class);
        assertEquals(3, result.size());
        Map mapResult = result.get(2);
        assertEquals(3, mapResult.get("id"));
        assertEquals("somkiat", mapResult.get("name"));
    }

    @Test
    public void create_new_user() {
        UserRequest somkiat = new UserRequest();
        somkiat.setName("somkiat");
        somkiat.setAge(40);

        UserResponse result
                = restTemplate.postForObject("/users", somkiat, UserResponse.class);
        assertEquals(1, result.getId());
        assertEquals("somkiat", result.getName());
        assertEquals(40, result.getAge());
    }

}