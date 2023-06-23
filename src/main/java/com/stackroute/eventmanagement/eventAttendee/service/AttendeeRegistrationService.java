package com.stackroute.eventmanagement.eventAttendee.service;

//create an interface as AttendeeRegistrationService for attendeeEventRegistration model

import com.stackroute.eventmanagement.eventAttendee.model.AttendeeEventRegistration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttendeeRegistrationService {
    
    //implement registerAttendeeEvent method for registering attendee for an event and return the message "Attendee registered for an event successfully"
    public String registerAttendeeEvent(AttendeeEventRegistration register);

    //implement getAttendeeEvent method for getting attendee for an event and return the list of AttendeeEventRegistration
    public List<AttendeeEventRegistration> getAllAttendeesForAnEvent(int eventId);

    public List<AttendeeEventRegistration> getAllEventsOfAttendee (int attendeeId);

    //implement getAllRegisteredAttendees method for getting all registered attendees and return the list of AttendeeEventRegistration
    public List<AttendeeEventRegistration> getAllRegisteredAttendees();


}
