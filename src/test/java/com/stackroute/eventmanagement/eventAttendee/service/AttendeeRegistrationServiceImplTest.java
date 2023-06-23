package com.stackroute.eventmanagement.eventAttendee.service;

import com.stackroute.eventmanagement.model.AttendeeEventRegistration;
import com.stackroute.eventmanagement.repository.AttendeeEventRegistrationRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AttendeeRegistrationServiceImplTest {

    @Mock
    private AttendeeEventRegistrationRepo attendeeEventRegistrationRepo;

    @InjectMocks
    private AttendeeRegistrationServiceImpl attendeeRegistrationService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRegisterAttendeeEvent() {
        // Mock data
        AttendeeEventRegistration register = new AttendeeEventRegistration();
        register.setAttendeeId(1);
        register.setEventId(1);
        register.setDate("2023-06-22");
        register.setFee("100");
        register.setTime("10:00 AM");

        // Mock behavior
        when(attendeeEventRegistrationRepo.save(any(AttendeeEventRegistration.class)))
                .thenReturn(register);

        // Perform the test
        String result = attendeeRegistrationService.registerAttendeeEvent(register);

        // Verify the interactions and assertions
        verify(attendeeEventRegistrationRepo, times(1)).save(any(AttendeeEventRegistration.class));
        assertEquals("Attendee registered for an event successfully", result);
    }

    @Test
    public void testGetAllAttendeesForAnEvent() {
        // Mock data
        int eventId = 1;
        List<AttendeeEventRegistration> attendees = new ArrayList<>();
        // Add some attendees to the list

        // Mock behavior
        when(attendeeEventRegistrationRepo.findByEventId(eventId))
                .thenReturn(attendees);

        // Perform the test
        List<AttendeeEventRegistration> result = attendeeRegistrationService.getAllAttendeesForAnEvent(eventId);

        // Verify the interactions and assertions
        verify(attendeeEventRegistrationRepo, times(1)).findByEventId(eventId);
        assertEquals(attendees, result);
    }

    @Test
    public void testGetAllEventsOfAttendee() {
        // Mock data
        int attendeeId = 1;
        List<AttendeeEventRegistration> events = new ArrayList<>();
        // Add some events to the list

        // Mock behavior
        when(attendeeEventRegistrationRepo.findByAttendeeId(attendeeId))
                .thenReturn(events);

        // Perform the test
        List<AttendeeEventRegistration> result = attendeeRegistrationService.getAllEventsOfAttendee(attendeeId);

        // Verify the interactions and assertions
        verify(attendeeEventRegistrationRepo, times(1)).findByAttendeeId(attendeeId);
        assertEquals(events, result);
    }

    @Test
    public void testGetAllRegisteredAttendees() {
        // Mock data
        List<AttendeeEventRegistration> attendees = new ArrayList<>();
        // Add some attendees to the list

        // Mock behavior
        when(attendeeEventRegistrationRepo.findAll())
                .thenReturn(attendees);

        // Perform the test
        List<AttendeeEventRegistration> result = attendeeRegistrationService.getAllRegisteredAttendees();

        // Verify the interactions and assertions
        verify(attendeeEventRegistrationRepo, times(1)).findAll();
        assertEquals(attendees, result);
    }
}
