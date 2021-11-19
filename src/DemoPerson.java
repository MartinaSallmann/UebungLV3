public class DemoPerson {

    public static void main(String[] args) {
        Person stefan = new Person("Stefan","Heiserer", 193,(byte)3);
        stefan.rechenBMI(98);
        stefan.printPerson(98);

        Person martina = new Person("Martina", "Sallmann", 162,(byte) 4 );
        martina.rechenBMI(63);
        martina.printPerson(63);

    }
}
