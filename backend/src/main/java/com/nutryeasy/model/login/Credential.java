package com.nutryeasy.model.login;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "credential")
public class Credential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_Credential;

    @Setter
    @Column(nullable = false,unique = true, length = 150)
    private String email;

    @Setter
    @Column(nullable = false, length = 255)
    private  String password;

    @OneToOne(mappedBy = "credential")
    private User users;



}
