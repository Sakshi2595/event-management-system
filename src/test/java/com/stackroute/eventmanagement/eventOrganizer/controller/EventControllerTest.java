package com.stackroute.eventmanagement.eventOrganizer.controller;

import com.stackroute.eventmanagement.eventOrganizer.model.Event;
import com.stackroute.eventmanagement.eventOrganizer.service.EventService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@WebMvcTest(EventController.class)
public class EventControllerTest {

    @MockBean
    private EventService eventService;

    @Autowired
    private MockMvc mockMvc;

    //add test case for controller getAllEvents() of EventController class
    @Test
    public void testGetAllEvents() throws Exception {
        // Mock the behavior of the EventService
        Event event = new Event();
        event.setEventName("Event1");
        List<Event> events = new ArrayList<>();
        events.add(event);
        events.add(event);
        when(eventService.getAllEvents()).thenReturn(events);
        // Prepare test data
        List<Event> events1 = new ArrayList<>();
        events1.add(new Event());
        events1.add(new Event());

        // Configure mock repository
        doReturn(events1).when(eventService).getAllEvents();

        // Call the service method
        List<Event> result = eventService.getAllEvents();

    }

//add test case for controller getEventSortByCity() of EventController class
    @Test
    public void testGetEventSortByCity() throws Exception {
        // Mock the behavior of the EventService
        Event event = new Event();
        event.setLocation("Bangalore");
        List<Event> events = new ArrayList<>();
        events.add(event);
        events.add(event);
        when(eventService.getEventsByLocation(any())).thenReturn(events);
        // Prepare test data
        String city = "Bangalore";
        List<Event> events1 = new ArrayList<>();
        events1.add(new Event());
        events1.add(new Event());

        // Configure mock repository
        doReturn(events1).when(eventService).getEventsByLocation(city);

        // Call the service method
        List<Event> result = eventService.getEventsByLocation(city);
    }

    //add test case for controller getEventSortByDate() of EventController class
    @Test
    public void testGetEventSortByDate() throws Exception {
        // Mock the behavior of the EventService
        Event event = new Event();
        event.setDate("2023-06-21");
        List<Event> events = new ArrayList<>();
        events.add(event);
        events.add(event);
        when(eventService.getEventsByDate(any())).thenReturn(events);
        // Prepare test data
        String date = "2023-06-21";
        List<Event> events1 = new ArrayList<>();
        events1.add(new Event());
        events1.add(new Event());

        // Configure mock repository
        doReturn(events1).when(eventService).getEventsByDate(date);

        // Call the service method
        List<Event> result = eventService.getEventsByDate(date);

  }

    //add test case for controller createEvent() of EventController class
    @Test
    public void testCreateEvent() throws Exception {
        // Mock the behavior of the EventService
        Event event = new Event();
        event.setEventName("Event1");
        //List<Event> events = new ArrayList<>();
        //events.add(event);
        //events.add(event);
        when(eventService.createEvent(event)).thenReturn("Event Created Successfully");
        // Prepare test data
        Event event1 = new Event();
        event1.setEventName("Event1");
       // List<Event> events1 = new ArrayList<>();
      //  events1.add(new Event());
       // events1.add(new Event());

        // Configure mock repository
       // doReturn(events1).when(eventService).createEvent(event1);

        // Call the service method
        String result = eventService.createEvent(event);
    }
// add test case for controller updateEvent() of EventController class
    @Test
    public void testUpdateEvent() throws Exception {
        // Mock the behavior of the EventService
        Event event = new Event();
        event.setEventName("Event1");
        //List<Event> events = new ArrayList<>();
        //events.add(event);
        //events.add(event);
        when(eventService.updateEvent(event,1)).thenReturn("Event Updated Successfully");
        // Prepare test data
        Event event1 = new Event();
        event1.setEventName("Event1");
        // List<Event> events1 = new ArrayList<>();
        //  events1.add(new Event());
        // events1.add(new Event());

        // Configure mock repository
        // doReturn(events1).when(eventService).createEvent(event1);

        // Call the service method
        String result = eventService.updateEvent(event,1);
    }

}
