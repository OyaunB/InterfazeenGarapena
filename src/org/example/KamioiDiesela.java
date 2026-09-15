package org.example;

public class KamioiDiesela implements Erregaiak{
    public class KamioiDiesela (String matrikukla, String marka, String modeloa, int urtea) {
        super(matrikula,marka,modeloa,urtea);

        @Override
        public void mugitu() {
            System.out.println("Kamioi diesela mugitzen ari da. ");
        }

        @Override
        public void hornitu() {
            System.out.println("Kamioi diesela hornitzen ari da. ");
        }
    }

}
