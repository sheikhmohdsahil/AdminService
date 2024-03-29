package com.PWS.AdminService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class UpdatePasswordDto {

    private String email;
    private String oldPassword;
    private String newPassword;
    private String confirmPassword;
}
