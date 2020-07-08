package com.rihongo.rest.domain;

import com.rihongo.rest.domain.enums.UserType;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;

    private String name;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
