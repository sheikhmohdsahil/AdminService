package com.PWS.AdminService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResetUpdatepassword {

    private String token;
    private String newPassword;

    private String confirmPassword;

}
