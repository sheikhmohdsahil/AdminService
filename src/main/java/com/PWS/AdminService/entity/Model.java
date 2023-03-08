package com.PWS.AdminService.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Model {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    @Column(name = "model_id")
    private Integer id;
    @Column(nullable = false)
    private String name;

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

@ColumnDefault("true")
    private Boolean isActive=true;

}
