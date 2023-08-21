package peaksoft.repositories;

import peaksoft.models.Department;

import java.util.List;

public interface DepartmentRepository {
    void updateDepartment(Long id, Department department);

    void deleteDepartmentById(Long departmentId);

    void assignDoctor(Long doctorId, Long departmentId);
}
