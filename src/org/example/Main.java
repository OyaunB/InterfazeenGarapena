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
                System.out.println("Datuak (Kotxea OBJETUA");
                Kotxea kotxea = new Kotxea( "1111NNN",  "MITSUBIBHI",
                        "EVO 6 makinen",  2002);
        }

}
