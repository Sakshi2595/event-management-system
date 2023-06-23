package com.stackroute.eventmanagement.eventOrganizer.service;

import com.stackroute.eventmanagement.model.Event;
import com.stackroute.eventmanagement.repository.EventRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

class EventServiceImplTest {

    @Mock
    private EventRepo eventRepo;

    @InjectMocks
    private EventServiceImpl eventService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllEvents() {
        // Prepare test data
        List<Event> events = new ArrayList<>();
        events.add(new Event());
        events.add(new Event());

        // Configure mock repository
        doReturn(events).when(eventRepo).findAll();

        // Call the service method
        List<Event> result = eventService.getAllEvents();

        // Verify the repository method is called
        verify(eventRepo).findAll();

        // Assert the result
        assertEquals(2, result.size());
    }

    @Test
    public void testGetEventsByDate() {
        // Prepare test data
        String date = "2023-06-21";
        List<Event> events = new ArrayList<>();
        events.add(new Event());
        events.add(new Event());

        // Configure mock repository
        doReturn(events).when(eventRepo).findAll();

        // Call the service method
        List<Event> result = eventService.getEventsByDate(date);

        // Verify the repository method is called
        verify(eventRepo).findAll();

        // Assert the result
      //  assertEquals(2, result.size());
    }

    @Test
    public void testGetEventsByLocation() {
        // Prepare test data
        String location = "New York";
        List<Event> events = new ArrayList<>();
        events.add(new Event());
        events.add(new Event());

        // Configure mock repository
        doReturn(events).when(eventRepo).findAll();

        // Call the service method
        List<Event> result = eventService.getEventsByLocation(location);

        // Verify the repository method is called
        verify(eventRepo).findAll();

        // Assert the result
      //  assertEquals(2, result.size());
    }

    @Test
    public void testCreateEvent() {
        // Prepare test data
        Event event = new Event();

        // Configure mock repository
        doReturn(event).when(eventRepo).save(any(Event.class));

        // Call the service method
        String result = eventService.createEvent(event);

        // Verify the repository method is called
        verify(eventRepo).save(any(Event.class));

        // Assert the result
        assertEquals("Event Created Successfully", result);
    }

    @Test
    public void testUpdateEvent() {
        // Prepare test data
        Event event = new Event();
        String eventId = "123";

        // Configure mock repository
        doReturn(event).when(eventRepo).findByEventId(eventId);
        doReturn(event).when(eventRepo).save(any(Event.class));

        // Call the service method
        String result = eventService.updateEvent(event, eventId);

        // Verify the repository methods are called
        verify(eventRepo).findByEventId(eventId);
        verify(eventRepo).save(any(Event.class));

        // Assert the result
        assertEquals("Event Updated Successfully", result);
    }

    @Test
    public void testDeleteEvent() {
        // Prepare test data
        Event event = new Event();
        String eventId = "123";

        // Configure mock repository
        doReturn(event).when(eventRepo).findByEventId(eventId);

        // Call the service method
        String result = eventService.deleteEvent(eventId);

        // Verify the repository methods are called
        verify(eventRepo).findByEventId(eventId);
        verify(eventRepo).delete(event);

        // Assert the result
        assertEquals("Event Deleted Successfully", result);
    }
}
