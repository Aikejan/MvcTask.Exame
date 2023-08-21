package peaksoft.repositories.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import peaksoft.models.Appointment;
import peaksoft.repositories.AppointmentRepository;

public class AppointmentImpl implements AppointmentRepository {
@PersistenceContext  //
    private EntityManager entityManager;
    @Override
    public void saveAppointment(Long hospitalId, Appointment appointment) {


    }

    @Override
    public void saveAppointment(Appointment appointment) {
        entityManager.persist(appointment);

    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return null;
    }

    @Override
    @Transactional
    public void deleteAppointmentById(long id) {
        Appointment appointment = entityManager.find(Appointment.class, id);
        entityManager.remove(appointment);
        entityManager.createQuery("delete from Appointment  a where a.id=:id").setParameter("id",id).executeUpdate();

    }
    }

