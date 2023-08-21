package peaksoft.repositories;

import peaksoft.models.Hospital;

import java.util.List;

public interface HospitalRepository {

    void saveHospital(Hospital hospital);

    List<Hospital> getAllHospitals();

    Hospital  findById(Long hospitalId);
    void update(Long hospitalId, Hospital newHospital);


    void deleteHospital(Long id);


}
