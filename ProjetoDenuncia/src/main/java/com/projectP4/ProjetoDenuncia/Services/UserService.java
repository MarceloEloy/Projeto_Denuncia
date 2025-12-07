package com.projectP4.ProjetoDenuncia.Services;

import com.projectP4.ProjetoDenuncia.Model.DTO.UserDTO;
import com.projectP4.ProjetoDenuncia.Model.Nurse.User;
import com.projectP4.ProjetoDenuncia.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {


    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    public ResponseEntity<User> register(UserDTO dto){
        User user = new User(dto);
        user.setPassword(passwordEncoder.encode(dto.password()));
        return ResponseEntity.ok().body(userRepository.save(user));
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        return userRepository.findByEmail(username);
    }
}
