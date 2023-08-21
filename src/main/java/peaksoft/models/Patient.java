package peaksoft.models;

import peaksoft.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Patient {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "patient_gen")
    @SequenceGenerator(
            name = "patient_gen",
            sequenceName = "patient_seq",
            allocationSize = 1)
    private Long id;
    @NotNull
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Pattern(regexp = "^(?!\\+996)\\d+$", message = "phone number mast not start with +996")
    @Size(max = 13)
    @Column(name = "phone_number")
    private String phoneNumber;
    @NotNull(message = "Choose just male of female")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @NotNull
    @Column(unique = true)
    private String email;
    @ManyToOne
    private Hospital hospital;
    @OneToMany(mappedBy = "patient")
    @ToString.Exclude
    private List<Appointment> appointments;
}
