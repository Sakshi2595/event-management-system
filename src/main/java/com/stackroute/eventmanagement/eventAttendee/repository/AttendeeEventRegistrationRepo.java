package com.stackroute.eventmanagement.eventAttendee.repository;

import com.stackroute.eventmanagement.eventAttendee.model.AttendeeEventRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendeeEventRegistrationRepo extends JpaRepository<AttendeeEventRegistration, Integer> {
    
    public List<AttendeeEventRegistration> findByEventId(int eventId);

    public List<AttendeeEventRegistration> findByAttendeeId(int attendeeId);
    
    public AttendeeEventRegistration save(AttendeeEventRegistration attendeeEventRegistration);

    public List<AttendeeEventRegistration> findAll();

   

}
