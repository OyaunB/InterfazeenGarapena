package org.example;

public class Ibilgailua {
    String modeloa;
    String marka;
    int urtea;

    public Ibilgailua(String modeloa, String marka, int urtea){
        this.marka = marka;
        this.modeloa = modeloa;
        this.urtea = urtea;
    }
    public void erakutsiDatuak(){

        System.out.println("Ibilgailua: " + this.marka + " "
                + this.modeloa + " " + this.urtea);
    }
}
