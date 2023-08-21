package peaksoft.repositories.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import peaksoft.models.Hospital;
import peaksoft.repositories.HospitalRepository;

import java.util.List;

@Repository
@Component
@Transactional
public class HospitalImpl implements HospitalRepository {
    @PersistenceContext
    private  EntityManager entityManager;




    @Override
    public void saveHospital(Hospital hospital) {
        entityManager.persist(hospital);

    }

    @Override
    public List<Hospital> getAllHospitals() {
        return entityManager.createQuery(
                "select h from Hospital h",Hospital.class).getResultList();
    }

    @Override
    public Hospital findById(Long hospitalId) {
        return entityManager.find(Hospital.class,hospitalId);
    }

    @Override
    public void update(Long hospitalId, Hospital newHospital) {

    }


    @Override
    public void deleteHospital(Long id) {

    }


}
