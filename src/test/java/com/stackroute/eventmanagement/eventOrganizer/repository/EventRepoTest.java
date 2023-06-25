package com.stackroute.eventmanagement.eventOrganizer.repository;//package com.stackroute.eventmanagement.repository;
//

import com.stackroute.eventmanagement.eventOrganizer.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@DataJpaTest
public class EventRepoTest {

    @Autowired
    private EventRepo eventRepo;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    public void setup() {
        // Set up test data
        Event event = new Event();
        // Set the properties of the event
        // ...
        entityManager.persistAndFlush(event);
    }

    //add test case for public List<Event> findByLocation(String location); method of EventRepo interface
    @Test
    public void testFindByLocation() {
        // Create test events
        Event event1 = new Event();
        event1.setLocation("London");
        entityManager.persist(event1);

        Event event2 = new Event();
        event2.setLocation("New York");
        entityManager.persist(event2);

        // Perform the search
        List<Event> foundEvents = eventRepo.findByLocation("London");

        // Assertion
        assertNotNull(foundEvents);
        assertEquals(1, foundEvents.size());
        assertEquals("London", foundEvents.get(0).getLocation());
    }

    //add test case for public List<Event> findByDate(String date); method of EventRepo interface
    @Test
    public void testFindByDate() {
        // Create test events
        Event event1 = new Event();
        event1.setDate("2023-06-30");
        entityManager.persist(event1);

        Event event2 = new Event();
        event2.setDate("2023-07-01");
        entityManager.persist(event2);

        // Perform the search
        List<Event> foundEvents = eventRepo.findByDate("2023-06-30");

        // Assertion
        assertNotNull(foundEvents);
        assertEquals(1, foundEvents.size());
        assertEquals("2023-06-30", foundEvents.get(0).getDate());
    }
    //add test case for findByEventId method of EventRepo interface
    @Test
    public void testFindByEventId() {
        // Perform the repository search
        Event foundEvent = eventRepo.findByEventId(1);

        // Assertion
        assertNotNull(foundEvent);
        assertEquals(1, foundEvent.getEventId());
    }

}

