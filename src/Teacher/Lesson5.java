package Teacher;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson5 extends Lesson implements Launch{
    Scanner sc = new Scanner(System.in);

    private int Note=0;
    public Lesson5() {
        super(" Übung ", 5);
    }

    public void run() {
        excersice1();
        rerun();
    }

    public void excersice1() {


        HashMap<Integer, String> ex = new HashMap<>();

        ex.put(4 , "kommen");
        ex.put(5 , "komme");
        ex.put(6 , "komme");
        ex.put(2 , "heißen");
        ex.put(3 , "heiße");
        ex.put(8 , "wohnen");
        ex.put(7 , "wohne");
        ex.put(9 , "wohne");
        ex.put(1 , "ist");

        HashMap<Integer, String> empty = new HashMap<>();

        empty.put(1 , "(1)........");
        empty.put(2 , "(2)........");
        empty.put(3 , "(3)........");
        empty.put(4 , "(4)........");
        empty.put(5 , "(5)........");
        empty.put(6 , "(6)........");
        empty.put(7 , "(7)........");
        empty.put(8 , "(8)........");
        empty.put(9 , "(9)........");

        System.out.println(" Sich Vorstellen. // Self introducing \n");

        System.out.println("Aufgabe: Ordnen Sie die richtige Lösungen zu:\n");

        for(Map.Entry words : ex.entrySet()) {
            System.out.print(  words.getValue() + ", ");
        }
        System.out.println("\n");
        System.out.println(" -Frau Richter: Guten Tag. Mein Name "+ empty.get(1)+" Lydia Richter. \n wie "+empty.get(2)+" Sie? \n"
                + " -Herr Martinez: Ich "+ empty.get(3) + " Mario Martinez. \n"
                + " -Frau Richter:  Woher "+ empty.get(4) + "Sie, Herr Martinez? \n"
                + " -Herr Martinez: Ich "+ empty.get(5)+ " aus Spanien. Und Sie? \n"
                + " -Frau Richter:  Ich "+  empty.get(6)+ " aus Österreich. \n"
                + "                Ich "+  empty.get(7)+" in Wien. \n"
                + "                Wo "+ empty.get(8)+ " Sie? \n"
                + " -Herr Martinez: Ich "+ empty.get(9)+ " in Madrid.");


        HashMap<Integer, String> answer = new HashMap<>();

        System.out.println("\n bitte schreib deine Antwort // please write your answer :");
        for(int i=1; i<=9; i++) {
            System.out.println(" Antwort " + i +":");
            String an =  sc.next();
            answer.put(i, an);

            if(ex.containsValue(an)) {
                Note++;
            }
        }

        System.out.println(" deine Note: " + Note + "/9");

        if(Note == 9) {
            System.out.println(" Perfekt");
        }
        else if(Note <= 8 && Note > 6) {
            System.out.println(" sehr gut!");
        }
        else if(Note <= 6 && Note > 4) {
            System.out.println(" gut!");
        }
        else  {
            System.out.println("  du musst mehr lernen ;) ");
        }

        System.out.println(" ...................... \n");
        System.out.println(" Muster Lösung :\n");
        for(Map.Entry words : ex.entrySet()) {
            System.out.print(" \n"+ words.getKey() + "."+ words.getValue() + ",\n ");
        }
    }

    public void rerun() {
        System.out.println("\n Wähle eine Option // choose an option: \n 1. Aufgabe Widerholen // play the Excersice again \n 2. Main menu ");
        int option = sc.nextInt();

        switch(option) {
            case 1:
                run();
                break;
            case 2:
                Main.runProject();
                break;
            default:
                rerun();
                break;
        }

    }
}
