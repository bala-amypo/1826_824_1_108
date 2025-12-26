package com.example.demo.security;

import com.example.demo.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final Map<String, User> users = new HashMap<>();
    private long userIdSequence = 1L;

    public Map<String, Object> registerUser(String fullName, String email, String password, String role) {
        if (users.containsKey(email)) {
            throw new RuntimeException("User already exists");
        }

        User user = new User();
        user.setId(userIdSequence++);
        user.setFullName(fullName);
        user.setEmail(email);
        user.setPassword(password); // assume BCrypt hashed before storing
        user.setRole(role);

        users.put(email, user);

        Map<String, Object> response = new HashMap<>();
        response.put("userId", user.getId());
        response.put("role", user.getRole());
        response.put("email", user.getEmail());

        return response;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = users.get(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        }

        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getEmail())
                .password(user.getPassword())
                .roles(user.getRole())
                .build();
    }
}
