package org.example;

public class KamioiElektrikoa extends Ibiligailua implements Elektrikoa{
    public KamioiElektrikoa(String marka, String modeloa, int urtea, String matrikukla){
        super(matrikula, marka, modeloa, urtea);
    }

    @Override
    public void mugitu(){
        System.out.println("Kamioi elektrikoa mugitzen ari da. ");
    }

    @Override
    public void kargatu(){
        System.out.println("Kamioi elektrikoa kargatzen ari da. ");
    }

}
