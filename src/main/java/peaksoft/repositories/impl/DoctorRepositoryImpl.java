package peaksoft.repositories.impl;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.models.Doctor;
import peaksoft.repositories.DoctorRepository;


@Repository
@Transactional
public class DoctorRepositoryImpl implements DoctorRepository {
    private EntityManager entityManager;

    @Override
    public void updateDoctor(Long id, Doctor doctor) {


    }

    @Override
    public void deleteDoctorById(Long doctorId) {
        entityManager.remove(doctorId);

    }

    @Override
    public void assignDoctor(Long doctorId, Long departmentId) {
    }
}
