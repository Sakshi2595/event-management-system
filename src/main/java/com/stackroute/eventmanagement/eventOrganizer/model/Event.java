package com.stackroute.eventmanagement.eventOrganizer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

@Entity
public class Event {
   // declare variables for event
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
    private int eventId;
    private String eventName;
    private String description;
    private String type;
    private String date;
    private String time;
    private String location;
    private String venue;
    private String organiser;
    private String duration;
    private String fee;

}
