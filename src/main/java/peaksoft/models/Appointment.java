package peaksoft.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;


import java.time.LocalDate;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "appointments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "doctor_gen")
    @SequenceGenerator(name = "doctor_gen",
            sequenceName = "department_seq",
            allocationSize = 1)
    private Long id;
    @NotNull
    private LocalDate localDate;
   // @ManyToOne(cascade = {REFRESH, PERSIST, MERGE, DETACH})
    @ManyToOne
    @ToString.Exclude
    private Patient patient;
    @ManyToOne(cascade = {REFRESH, PERSIST, MERGE, DETACH})
    @ToString.Exclude
    private Doctor doctor;
    @ManyToOne
    private Department department;


}

