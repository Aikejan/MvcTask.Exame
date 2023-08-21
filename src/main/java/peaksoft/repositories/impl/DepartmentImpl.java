package peaksoft.repositories.impl;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import peaksoft.models.Department;
import peaksoft.repositories.DepartmentRepository;


import java.util.List;

public class DepartmentImpl implements DepartmentRepository {
    private EntityManager entityManager;


    @Override
    public void updateDepartment(Long id, Department department) {

    }

    @Override
    @Transactional
    public void deleteDepartmentById(Long departmentId) {
        entityManager.persist(departmentId);

    }

    @Override
    public void assignDoctor(Long doctorId, Long departmentId) {

    }
}

