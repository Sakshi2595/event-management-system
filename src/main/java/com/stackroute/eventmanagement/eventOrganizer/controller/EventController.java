package com.stackroute.eventmanagement.eventOrganizer.controller;

import com.stackroute.eventmanagement.eventOrganizer.model.Event;
import com.stackroute.eventmanagement.eventOrganizer.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class EventController {
    
    @Autowired
    private EventService eventService;

    // create end point for getting all events with url /api/v1/event/all
    @GetMapping("/event")
    public List<Event> getAllEvents() {
       return this.eventService.getAllEvents();
    }

    @GetMapping("/event/location/{location}")
    public List<Event> getEventSortByCity(@PathVariable String location){
        System.out.println(location);
        return this.eventService.getEventsByLocation(location);
    }

    @GetMapping("/event/date/{date}")
    public List<Event> getEventSortByDate(@PathVariable String date){
        return this.eventService.getEventsByDate(date);
    }

    @PostMapping("/event/create")
    public String createEvent(@RequestBody Event event){
        return this.eventService.createEvent(event);
    }

   @PutMapping("/event/{eventId}")
    public String updateEvent(@RequestBody Event event,@PathVariable String eventId){
        return this.eventService.updateEvent(event,eventId);
    }

    @DeleteMapping("/event/{eventId}")
    public String deleteEvent(@PathVariable String eventId){
        return this.eventService.deleteEvent(eventId);
    }


}
