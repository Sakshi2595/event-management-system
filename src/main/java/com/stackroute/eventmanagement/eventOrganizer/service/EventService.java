package com.stackroute.eventmanagement.eventOrganizer.service;

//create an interface as EventService for event model

import com.stackroute.eventmanagement.eventOrganizer.model.Event;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventService {

    List<Event> getAllEvents();
    List<Event> getEventsByDate(String date);
    List<Event> getEventsByLocation(String location);
    String createEvent(Event event);
    String updateEvent(Event event,String eventId);
    String deleteEvent(String eventId);

}



