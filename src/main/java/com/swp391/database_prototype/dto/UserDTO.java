package com.swp391.database_prototype.dto;

import com.swp391.database_prototype.pojos.Gender;
import com.swp391.database_prototype.pojos.Role;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDTO {
    private String id;
    private String email;
    private LocalDateTime dateCreated;
    private Role role;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    private long phoneNumber;
    private String address;
}
