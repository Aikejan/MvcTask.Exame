package peaksoft.repositories;


import peaksoft.models.Appointment;

public interface AppointmentRepository {
    void saveAppointment(Long hospitalId, Appointment appointment);
    void saveAppointment(Appointment appointment);
    Appointment getAppointmentById(Long id);
    void  deleteAppointmentById(long id);
}
