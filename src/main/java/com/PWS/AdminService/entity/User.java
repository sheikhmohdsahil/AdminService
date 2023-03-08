package com.PWS.AdminService.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date dateOfBirth;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private long phoneNumber;

    @Column(nullable = false)
    private String password;

    @CreatedDate
    @Column(nullable = false)
     private Date createdAt=new Date();
    @LastModifiedDate
    @Column(nullable = false)
    private Date updatedAt=new Date();
}
