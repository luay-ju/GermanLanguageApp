package Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Lesson2 extends Lesson implements Launch {

    HashMap<String, Artikels> printArtikel = new HashMap<>();

    public Scanner sc = new Scanner(System.in);
    public Lesson2() {
        super("Artikel ", 2);
        printArtikel.put("der", der());
        printArtikel.put("die", die());
        printArtikel.put("das", das());

    }

    @Override
    public void run() {
        introduction();
        chooseArtikel();
    }

    public void introduction() {
        System.out.println(" Deutsche Nomen/Substantive verwenden wir meistens mit Artikel.\n Am Artikel erkennen wir Genus (maskulin, feminin, neutral), \n Numerus (Singular, Plural) und Kasus (Nominativ, Akkusativ,  Dativ, Genitiv) \n");
        System.out.println(" Es gibt unbestimmte Artikel und bestimmte Artikel . Hier wirst Du dies kennenlernen : \n");
        System.out.println(" bestimmte Artikel : \n"
                + " der : für maskulin \n"
                + " die : für fiminin \n"
                + " das : für neutral \n"
                + "       und "
                + "\n die : für Plural \n ");
        System.out.println(" unbestimmte Artikel: \n ein ⟼ wir verwenden das mit Wörter mit dem Artikel ( der ) oder ( das )\n"
                + " eine ⟼  wir verwenden das mit Wörter mit dem Artikel ( die ) \n\n"
                + "  ★ Vorsicht ★ : ( eine , ein ) darf mie mit Plural vewenden !");
    }


    private void callArtikel(Artikels artikel) {
        System.out.println(" Artikel : " + artikel.artikel + "\n");
        System.out.println(" // Examples // Beispiele : \n" );
        for(String word : artikel.examples) {
            System.out.println(word);
        }
        System.out.println(" \n Druck 1 um Grammatik für die Artikel ("+ artikel.artikel +") zu zeigen oder 2 für Main Menu \n"
                + " // press 1 to show some grammers for the article ( "+artikel.artikel +" ) or 2 to go back to Main Menu:");
        int press = sc.nextInt();
        if(press==1) {
            for(String rules : artikel.rules) {
                System.out.println(rules);

            }
            chooseArtikel();
        }
        if(press==2) {
            Main.runProject();
        }

    }

    public void chooseArtikel() {
        System.out.println(" \n wähle ein Artikel // choose an article //");
        String choose = sc.next();

        Artikels artikel = printArtikel.get(choose);
        callArtikel(artikel);

    }

    public Artikels der() {

        ArrayList<String> exampleList = new ArrayList<>();
        exampleList.add("der Kuchen / the cake ");
        exampleList.add("der Mann / the man");
        exampleList.add("der Tag / the day ");
        exampleList.add("der Platz / the Place ");
        exampleList.add("der Mond / the moon");
        exampleList.add("der Lehrer / the Teacher");

        ArrayList<String> rules = new ArrayList<>();
        rules.add(" Names of male persons and job titles:: Vater, Pilot, Arzt;");
        rules.add(" Names of seasons: Frühling, Sommer, Herbst, Winter;");
        rules.add(" Names of months: Januar, Juli, Dezember;");
        rules.add(" Names of the days of the week: Montag, Dienstag, Sonntag;");
        rules.add(" Names of wind directions: Nordwest(en), Süd(en);");
        rules.add(" Names of rainfall: Regen, Schnee, Hagel;");
        rules.add(" Car brand names:Audi, BMW , Mercedes; ");
        rules.add(" Names of trains: IC;");
        rules.add(" // verbs ends with// Endung: Gang, Fang;");
        rules.add(" –er // subject //: Fahrer, Lehrer;");
        rules.add(" –ant: Demonstrant, Elefant;\n"
                + " Ausnahmen/exeption/: das Croissant, das Restaurant;");
        rules.add(" –ling: Lehrling, Schützling;\n"
                + " Ausnahmen/exeption/: das Dribbling, das Bowling;");
        rules.add(" –ner: Rentner, Schaffner, Zöllner; \n"
                + " Ausnahmen/exeption/: das Banner, die Wiener (Wurst);");
        rules.add(" –or: Motor, Traktor;\n"
                + " Ausnahmen/exeption/: das Gegentor, das Chlor;");

        return new Artikels(" der" , exampleList , rules);

    }

    public Artikels die() {

        ArrayList<String> exampleList = new ArrayList<>();
        exampleList.add(" die Geschwindigkeit / the speed");
        exampleList.add(" die Hoffnung / the hope");
        exampleList.add(" die Strasse / the street");
        exampleList.add(" die Frau / the woman");
        exampleList.add(" die Tür / the door");
        exampleList.add(" die Person / the person");

        ArrayList<String> rules = new ArrayList<>();
        rules.add(" –heit- Freiheit, Sicherheit; ");
        rules.add(" –keit- Möglichkeit, Schnelligkeit;");
        rules.add(" –schaft- Freundschaft, Mannschaft;");
        rules.add(" –ung- Leitung, Zeitung;");
        rules.add(" –ade- Hitparade, Marmelade;");
        rules.add(" –age- Garage, Passage;");
        rules.add(" –anz- Eleganz, Dominanz;");
        rules.add(" –enz- Existenz, Tendenz;");
        rules.add(" –ik- Kritik, Musik;");
        rules.add(" –ion- Diskussion, Koalition;");
        rules.add(" –tät- Identität, Qualität");
        rules.add(" –ur- Agentur, Reparatur;");
        rules.add(" –e- Grenze, Lampe;\n"
                + "Ausnahmen/exeption/: der Junge, der Friede;");
        rules.add(" –ei- Abtei, Metzgerei; \n"
                + "Ausnahmen/exeption/: das Ei, der Papagei;");
        rules.add(" –ie: Diplomatie, Psychologie;\n"
                + " Ausnahmen/exeption/: der Junkie, der Hippie;");
        rules.add(" –in: Ärztin, Studentin;\n"
                + " Ausnahmen/exeption/: das Benzin, der Harlekin;");

        return new Artikels(" die" , exampleList , rules);
    }
    public Artikels das() {

        ArrayList<String> exampleList = new ArrayList<>();
        exampleList.add(" das Buch / the book");
        exampleList.add(" das Auto / the car");
        exampleList.add(" das Kind / the child");
        exampleList.add(" das Dach / the roof");
        exampleList.add(" das Land / the country");
        exampleList.add(" das Haus / the haus");

        ArrayList<String> rules = new ArrayList<>();
        rules.add(" –chen- Kaninchen, Mädchen");
        rules.add(" –lein- Fräulein");
        rules.add(" -Infinitive- Essen, Schreiben");
        rules.add(" -Adjektive- Gute, Böse");
        rules.add(" -Farbnamen/colors/- Rot, Gelb, Blau");
        rules.add(" –ment- Instrument, Parlament; \n"
                + "Ausnahmen/exeption/: der Konsument, der Zement;");
        rules.add(" –nis- Ergebnis, Tennis;\n"
                + "Ausnahmen/exeption/: die Fahrerlaubnis, die Wildnis;");
        rules.add(" –o- Auto, Konto;\n"
                + "Ausnahmen/exeption/: die Avocado, der Euro;");
        rules.add(" –um- (die aus dem lateinischen kommen): Publikum, Museum, Stadium");
        rules.add(" –tum- Quantum, Ultimatum; \n"
                + "Ausnahmen/exeption/: der Reichtum, der Irrtum;");

        return new Artikels(" das" , exampleList , rules);
    }

}
