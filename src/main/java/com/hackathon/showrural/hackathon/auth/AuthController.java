package com.hackathon.showrural.hackathon.auth;

import com.hackathon.showrural.hackathon.auth.requests.AuthenticationRequest;
import com.hackathon.showrural.hackathon.auth.requests.RegisterRequest;
import com.hackathon.showrural.hackathon.auth.responses.AuthenticationResponse;
import com.hackathon.showrural.hackathon.auth.responses.RegisterResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@Valid @RequestBody RegisterRequest request){
        return new ResponseEntity<>(authService.register(request), HttpStatus.CREATED);
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody @Valid AuthenticationRequest request){
        return new ResponseEntity<>(authService.authenticate(request), HttpStatus.OK);
    }

}
