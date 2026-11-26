package kh.edu.istad.restapi.model;

import jakarta.persistence.*;
import lombok.

        Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "m2_customers")
public class Customer {
    @Id
    private UUID id;
    @Column(length = 11, unique = true, nullable = false)
    private String phoneNumber;
    @Column(length = 40, unique = true, nullable = false)
    private String email;
    @Column(columnDefinition = "TEXT")
    private String address;
    @Column(nullable = false)
    private Boolean isDeleted;
    @OneToOne
    private User user;

}
