package com.nutryeasy.model.login;

import jakarta.validation.constraints.Pattern;
import lombok.*;
import jakarta.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_User;

    @Setter
    @Column(nullable = false, length = 150)
    private String firstName;

    @Setter
    @Column(nullable = false, length = 150)
    private String lastName;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length =20)
    private String role;

    @Setter
    @Column(nullable = true, unique = true, length = 11)
    @Pattern(regexp = "\\d{11}", message = "CPF deve ter 11 dígitos")
    private String cpf;

    @OneToOne(optional = false)
    @JoinColumn(name = "Id_Credential", nullable = false, unique = true)
    private Credential credential;

}