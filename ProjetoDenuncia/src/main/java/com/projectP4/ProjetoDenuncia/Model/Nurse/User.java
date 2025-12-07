package com.projectP4.ProjetoDenuncia.Model.Nurse;

import com.projectP4.ProjetoDenuncia.Model.DTO.UserDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Table(name = "User")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails {
    public User(UserDTO userDTO){
        this.id = userDTO.id();
        this.email = userDTO.email();
        this.password = userDTO.password();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

}
