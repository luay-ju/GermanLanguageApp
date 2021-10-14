package Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Lesson7 extends Lesson implements Launch{

    private static String derArtikel;
    private static String dieArtikel;
    private static String dasArtikel;


    public Lesson7() {
        super(" Spiel", 7);

    }


    public void run() {
        startGame();
        askRerun();

    }

    static Scanner sc = new Scanner(System.in);

    static HashMap<Integer,String> der = new HashMap<>();
    static HashMap<Integer,String> die = new HashMap<>();
    static HashMap<Integer,String> das = new HashMap<>();

    private static int counter =0;

    static Random rand = new Random();




    public void startGame() {
        System.out.println("\n        ~ Der Die Das Spiel ~    \n");
        System.out.println(" Spielregeln (game rules): \n\n"
                + "1. es wird ein wort gezeigt und du musst wissen welche Artikel hat das Wort \n"
                + "// you gonna see a word and you should guess wich article it has \n"
                + "2. bei jeder richtigen Antwort bekommst du ein Wort \n"
                + "// you will get a point every time you guess the right answer \n"
                + "3. wenn du mehr als 5 Punkte bekommst, dann gewinnst du ;-) \n"
                + "// when you get 5 points you will win \n"
                + "\n    Viel Spaß  \n\n");



        for(int i=1; i<=7; i++) {
            int x=rand.nextInt(10);

            if(x == i){
                derAr();
            }
            if(x > i) {
                dieAr();
            }
            else {
                dasAr();
            }

        }
        printNote();
    }

    public void printNote() {

        System.out.println("\n Ergebnis : " + counter );
        if(counter > 5) {
            System.out.println(" yoho du hast gewonnen ;-) // you win ");
            askRerun();
        }
        if(counter < 5) {
            System.out.println(" schade du hast verloren :-! // you losed ");
            askRerun();
        }
    }

    public void derAr() {

        derArtikel="der";

        der.put(0, "Bauer");
        der.put(1, "Pilot");
        der.put(2, "Arzt");
        der.put(3, "Sommer");
        der.put(4, "Dienstag");
        der.put(5, "Winter");
        der.put(6, "Dezember");
        der.put(7, "Schnee");
        der.put(8, "Regen");
        der.put(9, "Umgang");
        der.put(10, "Umfang");
        der.put(11, "Schneider");
        der.put(12, "Fahrer");
        der.put(13, "Kuchen");
        der.put(14, "Platz");
        der.put(15, "Rentner");
        der.put(16, "Name");
        der.put(17, "Stuhl");
        der.put(18, "Dieb");

        for(int i=1; i<2; i++) {
            getRandomItem(der);

        }
        System.out.println(" dein Antwort : ");
        String answer = sc.next();
        if(answer.equalsIgnoreCase(derArtikel)) {
            System.out.println(" Richtig ;-) \n");
            counter++;
        }
        else {
            System.out.println(" falsh :-( \n");
        }

    }

    public void dieAr() {

        dieArtikel="die";

        die.put(0, "Freiheitheit");
        die.put(1, "Sicherheit");
        die.put(2, "Möglichkeit");
        die.put(3, "Freundschaft");
        die.put(4,"Fachschaft");
        die.put(5, "Umarmung");
        die.put(6, "Zeitung");
        die.put(7, "Eleganz");
        die.put(8, "Tendenz");
        die.put(9, "Informatik");
        die.put(10, "Musik");
        die.put(11, "Identität");
        die.put(12, "Universität");
        die.put(13, "Agentur");
        die.put(14, "Lampe");
        die.put(15, "Psychologie");
        die.put(16, "Gastronomie");
        die.put(17, "Lehrerin");
        die.put(18, "Ärztin");
        die.put(19, "Puppe");

        for(int i=1; i<2; i++) {
            getRandomItem(die);

        }
        System.out.println(" dein Antwort : ");
        String answer = sc.next();
        if(answer.equalsIgnoreCase(dieArtikel)) {
            System.out.println(" Richtig ;-) \n");
            counter++;
        }
        else {
            System.out.println(" falsh :-( \n");
        }
    }


    public void dasAr() {

        dasArtikel="das";

        das.put(0, "Wort");
        das.put(1, "Kind");
        das.put(2, "Kaninchen");
        das.put(3,  "Fräulein");
        das.put(4,  "Essen");
        das.put(5,  "Trinken");
        das.put(6,  "Rot");
        das.put(7,  "Gelb");
        das.put(8,  "Instrument");
        das.put(9,  "Bein");
        das.put(10,  "Restaurant");
        das.put(11,  "Ergebnis");
        das.put(12,  "Konto");
        das.put(13,  "Stadium");
        das.put(14,  "Praktikum");
        das.put(15,  "Fahrrad");
        das.put(16,  "Dach");
        das.put(17, "Haus");
        das.put(18,  "Land");
        das.put(19,  "Buch");

        for(int i=1; i<2; i++) {
            getRandomItem(das);

        }
        System.out.println(" dein Antwort : ");
        String answer = sc.next();
        if(answer.equalsIgnoreCase(dasArtikel)) {
            System.out.println(" Richtig ;-) \n");
            counter++;
        }
        else {
            System.out.println(" falsh :-( \n");
        }

    }


    private void getRandomItem(HashMap<Integer, String> words2) {

        if(words2 == der) {
            int index = rand.nextInt(der.size());

            System.out.println(" Wort :" + der.get(index));
        }
        if(words2 == die) {
            int index = rand.nextInt(die.size());

            System.out.println(" Wort :" + die.get(index));
        }
        if(words2 == das) {
            int index = rand.nextInt(das.size());

            System.out.println(" Wort :" + das.get(index));
        }

    }

    public void askRerun() {

        System.out.println("\n wähle // choose :\n 1. Spiel wiederholen // play again \n 2. Main Menu ");
        int option = sc.nextInt();

        switch(option) {
            case 1:
                run();
                break;
            case 2:
                Main.runProject();
                break;
            default:
                askRerun();
                break;
        }

    }
}