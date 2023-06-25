package com.stackroute.eventmanagement.eventOrganizer.repository;

//create a repository interface for event model using jpa repository

import com.stackroute.eventmanagement.eventOrganizer.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer>{
   
    //create findByLocation method for finding event by location
    public List<Event> findByLocation(String location);

    //create findByDate method for finding event by date
    public List<Event> findByDate(String date);

    //create findByEventId method for finding event by eventId
    public Event findByEventId(int eventId);

}

