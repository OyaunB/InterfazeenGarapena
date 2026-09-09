package org.example;

public class Ibilgailua {
    private String modeloa;
    private String marka;
    private int urtea;

    public Ibilgailua(String modeloa, String marka, int urtea){
        this.marka = marka;
        this.modeloa = modeloa;
        this.urtea = urtea;
    }

    public String getModeloa(){
        return modeloa;
    }
    public String setModeloa(){
        return modeloa;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModeloa(String modeloa) {
        this.modeloa = modeloa;
    }

    public int getUrtea() {
        return urtea;
    }

    public void setUrtea(int urtea) {
        if(urtea>1900) {
            this.urtea = urtea;
        }
    }

    public void erakutsiDatuak(){

        System.out.println("Ibilgailua: " + this.marka + " "
                + this.modeloa + " " + this.urtea);
    }
}
