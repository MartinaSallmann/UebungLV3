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

        double bmi = gewicht / ((körpergröße / 100) + (körpergröße / 100));

        if (bmi < 18.5) {
            return "Untergewicht";
        } else if (bmi < 25) {
            return "Normalgewicht";
        } else if (bmi < 30) {
            return "Übergewicht";
        } else {
            return "Adipositas";
        }
    }



    public void printPerson(int gewicht){

        if(aktivitaetslevel == 1){
            System.out.println(String.format(getVorname()+ " " +   getNachname() + "," + " Couch Potato, " + rechenBMI(gewicht)));
        }

        if (aktivitaetslevel == 2){
            System.out.println(String.format(getVorname() + " " +   getNachname() + "," + " Gelegenheitssportler, " + rechenBMI(gewicht)));
        }
        if (aktivitaetslevel == 3){
            System.out.println(String.format(getVorname() + " " +   getNachname() + "," + " Sportler, " + rechenBMI(gewicht)));
        }
        if (aktivitaetslevel == 4) {
            System.out.println(String.format(getVorname() + " " +   getNachname() + "," + " Profisportler, " + rechenBMI(gewicht)));
        }
    }


}
