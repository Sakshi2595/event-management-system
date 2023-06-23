package com.stackroute.eventmanagement.eventAttendee.service;

import com.stackroute.eventmanagement.eventAttendee.model.AttendeeEventRegistration;
import com.stackroute.eventmanagement.eventAttendee.repository.AttendeeEventRegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendeeRegistrationServiceImpl implements AttendeeRegistrationService{

    //autowire the AttendeeEventRegistrationRepository
    @Autowired
    private AttendeeEventRegistrationRepo attendeeEventRegistrationRepo;

    //implement registerAttendeeEvent method for registering attendee for an event and return the message "Attendee registered for an event successfully"
    @Override
    public String registerAttendeeEvent(AttendeeEventRegistration register) {
        AttendeeEventRegistration attendeeEventRegistration = new AttendeeEventRegistration();
        attendeeEventRegistration.setAttendeeId(register.getAttendeeId());
        attendeeEventRegistration.setEventId(register.getEventId());
        attendeeEventRegistration.setDate(register.getDate());
        attendeeEventRegistration.setFee(register.getFee());
        attendeeEventRegistration.setTime(register.getTime());
        attendeeEventRegistrationRepo.save(attendeeEventRegistration);
        return "Attendee registered for an event successfully";
    }

    //implement getAttendeeEvent method for getting attendee for an event and return the list of AttendeeEventRegistration
    @Override
    public List<AttendeeEventRegistration> getAllAttendeesForAnEvent(int eventId) {
        return attendeeEventRegistrationRepo.findByEventId(eventId);
    }

    @Override
    public List<AttendeeEventRegistration> getAllEventsOfAttendee(int attendeeId) {
        return attendeeEventRegistrationRepo.findByAttendeeId(attendeeId);
    }

    //implement getAllRegisteredAttendees method for getting all registered attendees and return the list of AttendeeEventRegistration
    @Override
    public List<AttendeeEventRegistration> getAllRegisteredAttendees() {
        return attendeeEventRegistrationRepo.findAll();
    }

    
}
