package com.stackroute.eventmanagement.eventOrganizer.service;


import com.stackroute.eventmanagement.eventOrganizer.model.Event;
import com.stackroute.eventmanagement.eventOrganizer.repository.EventRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
class EventServiceImplTest {

    //autowire the EventService
    @Autowired
    private EventService eventService;

    //mock the EventRepo
    @MockBean
    private EventRepo eventRepo;

    //add test case for service getAllEvents() of EventServiceImpl class
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

// add test case for service getEventsByDate() of EventServiceImpl class
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

    }

// add test case for service getEventsByLocation() of EventServiceImpl class

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

// add test case for service createEvent() of EventServiceImpl class
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

// add test case for service updateEvent() of EventServiceImpl class
    @Test
    public void testUpdateEvent() {
        // Prepare test data
        Event event = new Event();
        int eventId = 123;

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

// add test case for service deleteEvent() of EventServiceImpl class
    @Test
    public void testDeleteEvent() {
        // Prepare test data
        Event event = new Event();
        int eventId = 123;

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
