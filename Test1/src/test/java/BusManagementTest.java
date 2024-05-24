import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusManagementTest {

    @Test
    public void testAddPassenger_Success() {
        BusManagement busManagement = new BusManagement();

        assertEquals("Passenger added. Attendance marked for irfan with id 12", busManagement.addPassenger("irfan", 12));
        assertEquals("Passenger added. Attendance marked for karar with id 6", busManagement.addPassenger("karar", 6));
        assertEquals("Passenger added. Attendance marked for Neelab with id 3", busManagement.addPassenger("Neelab", 3));
        assertEquals("Passenger added. Attendance marked for ijlal with id 5", busManagement.addPassenger("ijlal", 5));
        assertEquals("Passenger added. Attendance marked for Ali with id 1", busManagement.addPassenger("Ali", 1));
    }

    @Test
    public void testAddPassenger_EmptyName() {
        BusManagement busManagement = new BusManagement();

        assertEquals("Error: Invalid name.", busManagement.addPassenger("", 2));
    }

    @Test
    public void testAddPassenger_NegativeID() {
        BusManagement busManagement = new BusManagement();

        assertEquals("Error: Invalid ID.", busManagement.addPassenger("Ahmed", -1));
    }

    @Test
    public void testAddPassenger_BusFull() {
        BusManagement busManagement = new BusManagement();

        busManagement.addPassenger("irfan", 12);
        busManagement.addPassenger("karar", 6);
        busManagement.addPassenger("Neelab", 3);
        busManagement.addPassenger("ijlal", 5);
        busManagement.addPassenger("Ali", 1);

        assertEquals("Bus is full. Cannot add more passengers.", busManagement.addPassenger("uzair", 10));
    }

    @Test
    public void testAddPassenger_DuplicateID() {
        BusManagement busManagement = new BusManagement();

        busManagement.addPassenger("irfan", 12);
        busManagement.addPassenger("karar", 6);
        busManagement.addPassenger("Neelab", 3);
        busManagement.addPassenger("ijlal", 5);
        busManagement.addPassenger("Ali", 1);

        assertEquals("Error: Duplicate ID.", busManagement.addPassenger("Aisha", 3));
    }
}




