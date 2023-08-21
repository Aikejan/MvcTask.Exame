package peaksoft.services;

import peaksoft.models.Hospital;

import java.util.List;

public interface HospitalServices {
    void saveHospital(Hospital hospital);
    List<Hospital> getAllHospitals();
    void  deleteHospital(Long id);
    Hospital  findById(Long hospitalId);
    void update(Long hospitalId, Hospital newHospital);
}
