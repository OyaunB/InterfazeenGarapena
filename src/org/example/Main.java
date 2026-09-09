package org.example;

public class Main {
        static void main()
        {
                Ibilgailua ibilgailua = new Ibilgailua( "8292DKW",  "IBIZA",
                                        "SEAT",  2005);

                ibilgailua.erakutsiDatuak();
                ibilgailua.setUrtea(2035);
                System.out.println("Datuak (urtea) aldatuta= ");
                ibilgailua.erakutsiDatuak();

        }

}
