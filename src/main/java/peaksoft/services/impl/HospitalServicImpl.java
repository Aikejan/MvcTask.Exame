package peaksoft.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.models.Hospital;
import peaksoft.repositories.HospitalRepository;
import peaksoft.services.HospitalServices;

import java.util.List;
@Service
@RequiredArgsConstructor
public class HospitalServicImpl implements HospitalServices {


    private  final HospitalRepository hospitalRepository;



    @Override
    public void saveHospital(Hospital hospital) {
        hospitalRepository.saveHospital(hospital);

    }

    @Override
    public List<Hospital> getAllHospitals() {
        return hospitalRepository.getAllHospitals();

    }


    @Override
    public void deleteHospital(Long id) {

    }

    @Override
    public Hospital findById(Long hospitalId) {
        return null;
    }

    @Override
    public void update(Long hospitalId, Hospital newHospital) {

    }


}
