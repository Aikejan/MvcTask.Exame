package peaksoft.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.FetchType.EAGER;

@Entity
@Table(name = "hospitals")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "hospital_gen")
    @SequenceGenerator(name = "hospital_gen",
            sequenceName = "hospital_seq",
            allocationSize = 1)

    private Long id;
    @Column(length = 2000)
    private String image;
    private String name;
    private String address;

    @OneToMany(mappedBy = "hospital", cascade = {REFRESH, DETACH, REMOVE, MERGE}, fetch = EAGER)
    @ToString.Exclude
    private List<Department> departments;

    @OneToMany(mappedBy = "hospital", cascade = {REFRESH, MERGE, DETACH, REMOVE}, fetch = EAGER)
    @ToString.Exclude
    private List<Doctor> doctors;

    @OneToMany(mappedBy = "hospital", cascade = {REFRESH, MERGE, REMOVE, DETACH}, fetch = EAGER)
    @ToString.Exclude
    private List<Patient> patients;

    @OneToMany
    private List<Appointment> appointments;

    @Override
    public String toString() {
        return "\nid=" + id +
                "\n image: " + image +
                "\n nam: '" + name +
                "\n address: " + address;
    }
}
