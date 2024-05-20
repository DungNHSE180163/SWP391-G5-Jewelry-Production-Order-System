package com.swp391.database_prototype.pojos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.ForeignGenerator;
import org.hibernate.id.IdentifierGenerator;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "User_Info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "first_name", columnDefinition = "nvarchar(200)")
    private String firstName;
    @Column(name = "last_name", columnDefinition = "nvarchar(200)")
    private String lastName;
    @Column(columnDefinition = "date")
    private LocalDate birthDate;
    private Gender gender;
    private long phoneNumber;
    private String address;

    @OneToOne
    private Account account;
}
