package org.example;

import java.util.List;

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

                System.out.println("______MOTOAK_______");
              //  Ibilgailua motoa1 = new Ibilgailua (  "1212AAA",  "Panigale",
               //                        "Ducati",  2025);
                motoa1.erakutsiDatuak();

                for(Ibilgailua ibil : ibilgailuak){
                        //System.out.println(ibil.erakutsiDatuak());
                        ibil.mugitu();
                }
                Elektrikoa[] elektrikoak = {
                        new KamioiElektrikoak( matrikula: "HIL-1312.CO" ,marka: "TESLA", modeloa: "CYBERTRUCK", urtea: 2023)
                }
                for(Elektrikoak elek : elektrikoak){
                        elek.kargatu();
                }

                List<Elektrikoa> elektrikoakList = new ArrayList<>();
                elektrikoakList.add(new KamioiElektrikoa( matrikula: "ABC123", marka: "TESLA", modeloa: "CYBERTRUCK", urtea: 2006);
                //Lortu array posizio konkretuko ibilgailua
                elektrikoakList.get(0).kargatu();
                elektrikoakList.set(0, new KamioiElektrikoa(matrikula: "PROBA", marka: "BMW", modeloa: "M3 E30", 1989));
                elektrikoakList.remove( index: 1);
                System.out.println(elektrikoakList.size());

                System.out.println("Ibilgailu kopurua: " + Ibilgailua.getKopurua());

                //HashMap ikasi

        }

}
