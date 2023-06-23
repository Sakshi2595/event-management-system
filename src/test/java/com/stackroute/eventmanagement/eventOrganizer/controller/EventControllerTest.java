package com.stackroute.eventmanagement.eventOrganizer.controller;////create test class EventControllerTest.java in event-management/src/test/java/com/stackroute/eventmanagement/controller/ with the following content:
//package com.stackroute.eventmanagement.controller;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.doReturn;
//import static org.mockito.Mockito.verify;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import com.stackroute.eventmanagement.model.Event;
//import com.stackroute.eventmanagement.service.EventService;
//
//class EventControllerTest {
//
//    @Mock
//    private EventService eventService;
//
//    @InjectMocks
//    private EventController eventController;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//
//
//    }
//
//    @Test
//    public void testGetAllEvents() {
//        // Prepare test data
//        List<Event> events = new ArrayList<>();
//        events.add(new Event());
//        events.add(new Event());
//
//        // Configure mock repository
//        doReturn(events).when(eventService).getAllEvents();
//
//        // Call the service method
//        List<Event> result = eventController.getAllEvents();
//
//        // Verify the repository method is called
//        verify(eventService).getAllEvents();
//
//        // Assert the result
//        assertEquals(2, result.size());
//    }
//
//  /*  @Test
//    public void testGetEventsByDate() {
//        // Prepare test data
//        String date = "2023-06-21";
//        List<Event> events = new ArrayList<>();
//        events.add(new Event());
//        events.add(new Event());
//
//        // Configure mock repository
//        doReturn(events).when(eventService).getEventsByDate(date);
//
//        // Call the service method
//        List<Event> result = eventController.getEventsByDate(date);
//
//        // Verify the repository method is called
//        verify(eventService).getEventsByDate(date);
//
//        // Assert the result
//        assertEquals(2, result.size());
//    }
//
//
//
//    @Test
//    public void testGetEventsByLocation() {
//        // Prepare test data
//        String location = "Bangalore";
//        List<Event> events = new ArrayList<>();
//        events.add(new Event());
//        events.add(new Event());
//
//        // Configure mock repository
//        doReturn(events).when(eventService).getEventsByLocation(location);
//
//        // Call the service method
//        List<Event> result = eventController.getEventsByLocation(location);
//
//        // Verify the repository method is called
//        verify(eventService).getEventsByLocation(location);
//
//        // Assert the result
//        assertEquals(2, result.size());
//    }*/
//
//
//
//}
