package com.example.JPAdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id // to mark this column as primary key
    private int rno ;
    @NotBlank
    private String name ;
    @NotNull
    private String  gender ;
    private String tech ;
}
