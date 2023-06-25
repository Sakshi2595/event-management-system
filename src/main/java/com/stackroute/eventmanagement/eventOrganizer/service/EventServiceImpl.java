package com.stackroute.eventmanagement.eventOrganizer.service;

import com.stackroute.eventmanagement.eventOrganizer.model.Event;
import com.stackroute.eventmanagement.eventOrganizer.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventServiceImpl implements EventService{
    @Autowired
    private EventRepo eventRepo;

    //implement method for getting all events
    @Override
    public List<Event> getAllEvents() {
        return eventRepo.findAll();
    }

    //implement method for getting events by date
    @Override
    public List<Event> getEventsByDate(String date) {
        List<Event> events = this.getAllEvents();
        List<Event> eventList = new ArrayList<>();

        for(int i=0;i<events.size();i++){
            if(date.equals(events.get(i).getDate())){
                eventList.add(events.get(i));
            }
        }
        return eventList;
    }

    //implement method for getting events by city
    @Override
    public List<Event> getEventsByLocation(String location) {
        List<Event> events = this.getAllEvents();
        List<Event> eventList = new ArrayList<>();
        for(int i=0;i<events.size();i++){
            if(location.equalsIgnoreCase(events.get(i).getLocation())){
                eventList.add(events.get(i));
            }
        }
        return eventList;
    }

    //implement method for creating new event
    @Override
    public String createEvent(Event event) {
        Event e = eventRepo.save(event);
        if(e != null){
            return "Event Created Successfully";
        }
        return "Event Creation Failed";
    }

    //implement method for updating event
    @Override
    public String updateEvent(Event event, int eventId) {
        Event e = eventRepo.findByEventId(eventId);
        if(e != null){
            e.setEventName(event.getEventName());
            e.setDescription(event.getDescription());
            e.setType(event.getType());
            e.setDate(event.getDate());
            e.setTime(event.getTime());
            e.setLocation(event.getLocation());
            e.setVenue(event.getVenue());
            e.setOrganiser(event.getOrganiser());
            e.setDuration(event.getDuration());
            e.setFee(event.getFee());
            eventRepo.save(e);
            return "Event Updated Successfully";
        }
        return "Event Updation Failed";
    }

    //implement method for deleting event
    @Override
    public String deleteEvent(int eventId) {
        Event e = eventRepo.findByEventId(eventId);
        if(e != null){
            eventRepo.delete(e);
            return "Event Deleted Successfully";
        }
        return "Event Deletion Failed";
    }

}
