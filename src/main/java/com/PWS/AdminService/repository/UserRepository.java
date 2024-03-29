package com.PWS.AdminService.repository;

import com.PWS.AdminService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("select o from User o where o.email=:email")
    Optional<User> findUserByEmail(String email);

    @Query("select o from User o where o.resetToken=:token")
    Optional<User> findByResetPasswordToken(String token);
    @Query("select o from User o where o.email=:email")
    User findByEmail(String email);

}
