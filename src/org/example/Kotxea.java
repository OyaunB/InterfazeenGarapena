package org.example;

public class Kotxea  extends Ibilgailua{
    public Kotxea(String matrikula, String modeloa, String marka, int urtea) {
        super(matrikula, modeloa, marka, urtea);
    }

    @Override
    public void erakutsiDatuak(){
        System.out.println("Kotxea: " + getMarka() +" " +
                            getModeloa() + " " + getUrtea());
    }
}
