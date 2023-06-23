package com.stackroute.eventmanagement.eventAttendee.model;

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
public class AttendeeEventRegistration {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private int attendeeId;
	private int eventId;
	private String fee;
	private String date;
	private String time;
	
}
