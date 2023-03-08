package com.PWS.AdminService.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserRoleRef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_Id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "role_Id")
    private Role role;

    @ColumnDefault("TRUE")
    private Boolean isActive;

    @CreatedDate
    @Column(nullable = false)
    private Date createdAt=new Date();
    @LastModifiedDate
    @Column(nullable = false)
    private Date updatedAt=new Date();

}
