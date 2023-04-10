package com.example.alten_practicas.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="users")
public class User implements Serializable {

    private static final long serialVersionUID = 185607717167016697L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;
    private String surname;
    @Column(name = "mail", nullable = false, length = 50, unique = true)
    private String email;
    private Boolean enabled;

}
