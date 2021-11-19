package KlassenUndObjekte;

public class Person {

    private String vorname;
    private String nachname;
    private int körpergröße;
    private byte aktivitaetslevel;


    public Person(String vorname, String nachname, int körpergröße, byte aktivitaetslevel) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.körpergröße = körpergröße;
        this.aktivitaetslevel = aktivitaetslevel;

    }


    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getKörpergröße() {
        return körpergröße;
    }

    public byte getAktivitaetslevel() {
        return aktivitaetslevel;
    }


    public void setKörpergröße(int körpergröße) {
        this.körpergröße = körpergröße;
    }

    public void setAktivitaetslevel(byte aktivitaetslevel) {
        this.aktivitaetslevel = aktivitaetslevel;
    }


    public String rechenBMI(int gewicht) {


        double bmi = (gewicht / ((körpergröße / 100) * (körpergröße / 100)));

        if (bmi < 18.5) {
            return "Untergewicht";
        } else if (bmi > 25) {
            return "Normalgewicht";
        } else if (bmi > 30) {
            return "Übergewicht";
        } else {
            return "Adipositas";
        }

    }



    public void printPerson(int gewicht){

        System.out.println(vorname + " " + nachname + ", ");
        switch (aktivitaetslevel){
            case 1:
                System.out.println("Couch Potato");
                break;
            case 2:
                System.out.println("Gelegenheitssportler");
                break;
            case 3:
                System.out.println("Sportler");
                break;
            case 4:
                System.out.println("Profisportler");
                break;
            default:
                System.out.println("no information");
        }
        System.out.println(", " + rechenBMI(gewicht));
    }


}
