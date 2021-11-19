import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person Test1;
    Person Test2;
    Person Test3;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Test1 = new Person("Max","Mustermann", 175,  (byte) 2);
        Test2 = new Person("Maria","Musterfrau", 180,(byte) 3);
        Test3 = new Person("Susi","Sorglos",165,(byte) 4);


    }

    @org.junit.jupiter.api.Test
    void rechenBMI() {
        assertEquals("Normalgewicht",Test1.rechenBMI(80));
        assertEquals("Normalgewicht",Test2.rechenBMI(75));
        assertEquals("Normalgewicht",Test3.rechenBMI(62));

    }

    @org.junit.jupiter.api.Test
    void printPerson() {
        assertEquals(2,Test1.getAktivitaetslevel());
        assertEquals(3, Test2.getAktivitaetslevel());
        assertEquals(4, Test3.getAktivitaetslevel());
    }
}