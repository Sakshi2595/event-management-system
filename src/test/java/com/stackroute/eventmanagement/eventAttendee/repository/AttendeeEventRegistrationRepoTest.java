//package com.stackroute.eventmanagement.eventAttendee.repository;//package com.stackroute.eventmanagement.repository;
//
//import com.stackroute.eventmanagement.eventAttendee.model.AttendeeEventRegistration;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//@DataJpaTest
//public class AttendeeEventRegistrationRepoTest {
//
//    @Autowired
//    private AttendeeEventRegistrationRepo attendeeEventRegistrationRepo;
//
//// add test cases here for public List<AttendeeEventRegistration> findByEventId(int eventId); method of AttendeeEventRegistrationRepo interface
////generate test cases for findByEventId method
//@Test
//public void testFindByEventId() {
//    // Create test events
//    AttendeeEventRegistration attendeeEventRegistration1 = new AttendeeEventRegistration();
//    attendeeEventRegistration1.setEventId(1);
//    attendeeEventRegistrationRepo.save(attendeeEventRegistration1);
//
//    AttendeeEventRegistration attendeeEventRegistration2 = new AttendeeEventRegistration();
//    attendeeEventRegistration2.setEventId(2);
//    attendeeEventRegistrationRepo.save(attendeeEventRegistration2);
//
//    // Perform the search
//    List<AttendeeEventRegistration> foundAttendeeEventRegistrations = attendeeEventRegistrationRepo.findByEventId(1);
//
//    // Assertion
//    assertNotNull(foundAttendeeEventRegistrations);
//    assertEquals(1, foundAttendeeEventRegistrations.size());
//    assertEquals(1, foundAttendeeEventRegistrations.get(0).getEventId());
//}
//// add test cases here for public List<AttendeeEventRegistration> findByAttendeeId(int attendeeId); method of AttendeeEventRegistrationRepo interface
//@Test
//public void testFindByAttendeeId() {
//    // Create test events
//    AttendeeEventRegistration attendeeEventRegistration1 = new AttendeeEventRegistration();
//    attendeeEventRegistration1.setAttendeeId(1);
//    attendeeEventRegistrationRepo.save(attendeeEventRegistration1);
//
//    AttendeeEventRegistration attendeeEventRegistration2 = new AttendeeEventRegistration();
//    attendeeEventRegistration2.setAttendeeId(2);
//    attendeeEventRegistrationRepo.save(attendeeEventRegistration2);
//
//    // Perform the search
//    List<AttendeeEventRegistration> foundAttendeeEventRegistrations = attendeeEventRegistrationRepo.findByAttendeeId(1);
//
//    // Assertion
//    assertNotNull(foundAttendeeEventRegistrations);
//    assertEquals(1, foundAttendeeEventRegistrations.size());
//    assertEquals(1, foundAttendeeEventRegistrations.get(0).getAttendeeId());
//}
//// add test cases here for public AttendeeEventRegistration save(AttendeeEventRegistration attendeeEventRegistration); method of AttendeeEventRegistrationRepo interface
//@Test
//public void testSave() {
//    // Create test events
//    AttendeeEventRegistration attendeeEventRegistration1 = new AttendeeEventRegistration();
//    attendeeEventRegistration1.setAttendeeId(1);
//    attendeeEventRegistrationRepo.save(attendeeEventRegistration1);
//
//    AttendeeEventRegistration attendeeEventRegistration2 = new AttendeeEventRegistration();
//    attendeeEventRegistration2.setAttendeeId(2);
//    attendeeEventRegistrationRepo.save(attendeeEventRegistration2);
//
//    // Perform the search
//    List<AttendeeEventRegistration> foundAttendeeEventRegistrations = attendeeEventRegistrationRepo.findByAttendeeId(1);
//
//    // Assertion
//    assertNotNull(foundAttendeeEventRegistrations);
//    assertEquals(1, foundAttendeeEventRegistrations.size());
//    assertEquals(1, foundAttendeeEventRegistrations.get(0).getAttendeeId());
//}
//// add test cases here for public List<AttendeeEventRegistration> findAll(); method of AttendeeEventRegistrationRepo interface
//@Test
//public void testFindAll() {
//    // Create test events
//    AttendeeEventRegistration attendeeEventRegistration1 = new AttendeeEventRegistration();
//    attendeeEventRegistration1.setAttendeeId(1);
//    attendeeEventRegistrationRepo.save(attendeeEventRegistration1);
//
//    AttendeeEventRegistration attendeeEventRegistration2 = new AttendeeEventRegistration();
//    attendeeEventRegistration2.setAttendeeId(2);
//    attendeeEventRegistrationRepo.save(attendeeEventRegistration2);
//
//    // Perform the search
//    List<AttendeeEventRegistration> foundAttendeeEventRegistrations = attendeeEventRegistrationRepo.findByAttendeeId(1);
//
//    // Assertion
//   assertNotNull(foundAttendeeEventRegistrations);
//   assertEquals(1, foundAttendeeEventRegistrations.size());
//   assertEquals(1, foundAttendeeEventRegistrations.get(0).getAttendeeId());
//}
//
//
////add test cases here for public List<AttendeeEventRegistration> findByEventId(int eventId); method of AttendeeEventRegistrationRepo interface
//
//}
