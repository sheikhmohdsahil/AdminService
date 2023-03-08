package com.PWS.AdminService.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "role")

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Boolean isActive;

    @CreatedDate
    @Column(nullable = false)
    private Date createdAt=new Date();
    @LastModifiedDate
    @Column(nullable = false)
    private Date updatedAt=new Date();
//    @NotNull
//    private Integer createdBy;
//    @NotNull
//    private Integer updatedBy;

}
