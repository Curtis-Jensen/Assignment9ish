package OlderAssignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void print() {
        Person contact = new Person();
        contact.name = "Curtis Jensen";
        contact.phnNum = "661-330-3552";
        contact.email = "me@curtisjensen.com";
        contact.address = "3375 W 7800 S";
        assertEquals("Name: Curtis Jensen Phone: 661-330-3552 Age: 0 " +
                "Email: me@curtisjensen.com Address: 3375 W 7800 S", contact.print());
        assertTrue(4 == 2*2);
    }

    void SortPrint(){

    }
}