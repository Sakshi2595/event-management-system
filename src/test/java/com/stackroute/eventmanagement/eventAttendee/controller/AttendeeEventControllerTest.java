package com.stackroute.eventmanagement.eventAttendee.controller;//package com.stackroute.eventmanagement.controller;
//
//import com.stackroute.eventmanagement.model.AttendeeEventRegistration;
//import com.stackroute.eventmanagement.service.AttendeeRegistrationService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.when;
//
//public class AttendeeEventControllerTest {
//
//    private MockMvc mockMvc;
//
//    @Mock
//    private AttendeeRegistrationService attendeeEventService;
//
//    @InjectMocks
//    private AttendeeEventController attendeeEventController;
//
//    @BeforeEach
//    public void setup() {
//        MockitoAnnotations.openMocks(this);
//        mockMvc = MockMvcBuilders.standaloneSetup(attendeeEventController).build();
//    }
//
//    @Test
//    public void testRegisterAttendeeEvent() throws Exception {
//        AttendeeEventRegistration registration = new AttendeeEventRegistration();
//        // Set the properties of registration object
//
//        when(attendeeEventService.registerAttendeeEvent(registration)).thenReturn("Registration successful");
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/attendee/register/event")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(asJsonString(registration)))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string("Registration successful"));
//    }
//
//    @Test
//    public void testGetAllRegisteredAttendees() throws Exception {
//        List<AttendeeEventRegistration> attendees = new ArrayList<>();
//        // Add sample attendees to the list
//
//        when(attendeeEventService.getAllRegisteredAttendees()).thenReturn(attendees);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/attendee/getAll"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(attendees.size()));
//    }
//
//    @Test
//    public void testGetAllAttendeesForAnEvent() throws Exception {
//        int eventId = 1;
//        List<AttendeeEventRegistration> attendees = new ArrayList<>();
//        // Add sample attendees to the list
//
//        when(attendeeEventService.getAllAttendeesForAnEvent(eventId)).thenReturn(attendees);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/attendee/getAll/{eventId}", eventId))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(attendees.size()));
//    }
//
//    @Test
//    public void testGetAllEventsOfAttendee() throws Exception {
//        int attendeeId = 1;
//        List<AttendeeEventRegistration> events = new ArrayList<>();
//        // Add sample events to the list
//
//        when(attendeeEventService.getAllEventsOfAttendee(attendeeId)).thenReturn(events);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/event/getAll/{attendeeId}", attendeeId))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(events.size()));
//    }
//
//    // Helper method to convert object to JSON string
//    private static String asJsonString(final Object obj) {
//        try {
//            return new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(obj);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
