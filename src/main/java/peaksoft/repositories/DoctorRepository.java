package peaksoft.repositories;

import peaksoft.models.Doctor;

public interface DoctorRepository {
    void updateDoctor(Long id, Doctor doctor);

    void deleteDoctorById(Long doctorId);
    void assignDoctor(Long doctorId, Long departmentId);
}
