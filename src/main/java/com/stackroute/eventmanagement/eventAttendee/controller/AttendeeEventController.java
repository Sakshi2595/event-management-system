package com.stackroute.eventmanagement.eventAttendee.controller;

import com.stackroute.eventmanagement.eventAttendee.model.AttendeeEventRegistration;
import com.stackroute.eventmanagement.eventAttendee.service.AttendeeRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AttendeeEventController {
    
    @Autowired
    private AttendeeRegistrationService attendeeEventService;

    // create end point for registering attendee for an event with url /api/v1/attendee/register
    @PostMapping("/attendee/register/event")
    public String registerAttendeeEvent(@RequestBody AttendeeEventRegistration register){
        return this.attendeeEventService.registerAttendeeEvent(register);
    }

    @GetMapping("/attendee/getAll")
    public List<AttendeeEventRegistration> getAllRegisteredAttendees(){
        return this.attendeeEventService.getAllRegisteredAttendees();
    }

    @GetMapping("/attendee/getAll/{eventId}")
    public List<AttendeeEventRegistration> getAllAttendeesForAnEvent(@PathVariable int eventId){
        return this.attendeeEventService.getAllAttendeesForAnEvent(eventId);
    }

    @GetMapping("/event/getAll/{attendeeId}")
    public List<AttendeeEventRegistration> getAllEventsOfAttendee(@PathVariable int attendeeId){
        return this.attendeeEventService.getAllEventsOfAttendee(attendeeId);
    }

}
