package com.kenobi.cafe.rest;

import com.kenobi.cafe.wrapper.UserWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping("/user")
public interface UserRest {
    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody Map<String, String> requestMap);
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> requestMap);
    @GetMapping("/get")
    public ResponseEntity<List<UserWrapper>> getAllUsers();
    @PostMapping("/update")
    public ResponseEntity<String> update(@RequestBody Map<String, String> requestMap);
    @GetMapping("/check-token")
    public ResponseEntity<String> checkToken();
    @PostMapping("/change-password")
    public ResponseEntity<String> changePassword(@RequestBody Map<String, String> requestMap);
    @PostMapping("/forgot-password")
    public ResponseEntity<String> forgotPassword(@RequestBody Map<String, String> requestMap);


}
