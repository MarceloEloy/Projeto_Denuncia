package com.projectP4.ProjetoDenuncia.Repositorys;

import com.projectP4.ProjetoDenuncia.Model.Nurse.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByPassword(String password);

    User findByEmail(String email);

}
