package com.stackroute.eventmanagement.eventOrganizer.repository;//package com.stackroute.eventmanagement.repository;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import com.stackroute.eventmanagement.model.Event;
//
//@DataJpaTest
//public class EventRepoTest {
//
//    @Autowired
//    private EventRepo eventRepo;
//
//    @Test
//    public void testFindByLocation() {
//        // Create test events
//        Event event1 = new Event();
//        event1.setLocation("London");
//        eventRepo.save(event1);
//
//        Event event2 = new Event();
//        event2.setLocation("New York");
//        eventRepo.save(event2);
//
//        // Perform the search
//        List<Event> foundEvents = eventRepo.findByLocation("London");
//
//        // Assertion
//        assertNotNull(foundEvents);
//        assertEquals(1, foundEvents.size());
//        assertEquals("London", foundEvents.get(0).getLocation());
//    }
//
//    @Test
//    public void testFindByDate() {
//        // Create test events
//        Event event1 = new Event();
//        event1.setDate("2023-06-30");
//        eventRepo.save(event1);
//
//        Event event2 = new Event();
//        event2.setDate("2023-07-01");
//        eventRepo.save(event2);
//
//        // Perform the search
//        List<Event> foundEvents = eventRepo.findByDate("2023-06-30");
//
//        // Assertion
//        assertNotNull(foundEvents);
//        assertEquals(1, foundEvents.size());
//        assertEquals("2023-06-30", foundEvents.get(0).getDate());
//    }
//
//    @Test
//    public void testFindByEventId() {
//        // Create a test event
//        Event event = new Event();
//        event.setEventId(12345);
//        eventRepo.save(event);
//
//        // Perform the search
//        Event foundEvent = eventRepo.findByEventId("12345");
//        // Assertion
//        //assertNotNull(foundEvent);
//       // assertEquals("12345", foundEvent.getEventId());
//    }
//}
//
