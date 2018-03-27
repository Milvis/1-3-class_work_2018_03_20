package testai;

import java.util.Collections;

public class Vartotojas <Vartotojas>{

        public String vardas;
        public String pavarde;
        public int amzius;
        public String miestas;

        public Vartotojas(String vardas, String pavarde, int amzius, String miestas) {
            this.vardas = vardas;
            this.pavarde = pavarde;
            this.amzius = amzius;
            this.miestas = miestas;
        }



    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public int getAmzius() {
        return amzius;
    }

    public String getMiestas() {
        return miestas;
    }

}
