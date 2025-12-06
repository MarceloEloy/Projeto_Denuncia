package com.projectP4.ProjetoDenuncia.Controller;

import com.projectP4.ProjetoDenuncia.Model.DTO.UserDTO;
import com.projectP4.ProjetoDenuncia.Model.Nurse.User;
import com.projectP4.ProjetoDenuncia.Repositorys.UserRepository;
import com.projectP4.ProjetoDenuncia.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "Users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @PostMapping(path = "/register")
    public ResponseEntity<User> register(@RequestBody UserDTO dto){
        return userService.register(dto);
    };

    @PostMapping(path = "login")
    public ResponseEntity<User> login(@RequestBody UserDTO dto){
        User user = userRepository.findByEmail(dto.email());
        var usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(dto.email(), dto.password());
        var auth = authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        return ResponseEntity.ok().body(user);
    }




}

