package Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Lesson3 extends Lesson implements Launch {

    HashMap<String , FragenInfo> wFragen = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void run() {
        intoduction();
        fragen();
    }




    public Lesson3() {
        super(" W-Fragen ", 3);
        wFragen.put("wer", wer());
        wFragen.put("was", was());
        wFragen.put("wann", wann());
        wFragen.put("wo", wo());
        wFragen.put("wohin", wohin());
        wFragen.put("warum", warum());
        wFragen.put("wie", wie());



    }

    public void intoduction() {
        System.out.println(" Man stellt eine W-Frage, wenn man seinen Gesprächspartner nach einem unbekannten Sachverhalt fragt.\n"
                + " Diese Frage kann man nicht mit „Ja“ oder „Nein“ beantworten. \n"
                + "An erster Stelle von W-Fragen steht ein Fragewort, das meist mit dem Buchstaben W beginnt,\n");

        System.out.println(" //You ask a W-question when you ask your interlocutor about an unknown issue. \n "
                + "You cannot answer this question with “yes” or “no”. \n"
                + " In the first place of W questions is a question word that usually begins with the letter W. // \n");
    }

    public void fragen() {

        System.out.println(" here are examples of W quations // hier sind Beispiele für W-Fragen:  ");


        ArrayList<String> w = new ArrayList<>();
        w.add(" \n");
        w.add("  wer // who \n");
        w.add("  was // what \n");
        w.add("  wann // when \n");
        w.add("  wo // where \n");
        w.add("  wohin // where \n");
        w.add("  warum // why \n");
        w.add("  wie // how \n");


        System.out.println(w);

        chooseQuastion();


    }

    private void callwQuation(FragenInfo wInfo) {
        System.out.println(" W-Frage : " + wInfo.w + "\n");
        System.out.println(" // Examples // Beispiele : \n" );
        for(String word : wInfo.examples) {
            System.out.println(word);
        }


    }

    public void chooseQuastion() {

        System.out.println(" \n please choose one of the w-Quations to get examples // bitte wähle ein W-Frage, um Beispiele zu zeigen : ");
        String choice = scanner.next();

        FragenInfo wInfo = wFragen.get(choice);
        callwQuation(wInfo);

        System.out.println("\n druck (press): \n 1.(1) um Main wieder zu zeigen // go back to Main Menu \n"
                + " 2. druck auf irgend welche Taste um wieder einen Buchstabe zu wählen // press anything to choose another letter ");
        String choose2 = scanner.next();
        if(choose2.equalsIgnoreCase("1")) {
            Main.runProject();
        }
        chooseQuastion();



    }

    public FragenInfo wer() {

        ArrayList<String> list = new ArrayList<>();
        list.add(" Wer bist du? // who are you?");
        list.add(" Wer ist da? // who is here?");
        list.add(" Wer fängt an? // who beginns?");
        list.add(" Wer will spielen? // who wants to paly?");
        list.add(" Wer hat ein Auto? // who has a car?");
        list.add(" Wer möchte kommen? // who wants to come?");

        return new FragenInfo("wer",list);


    }

    public FragenInfo wo() {

        ArrayList<String> list = new ArrayList<>();
        list.add(" Wo bist du? // where are you?");
        list.add(" Wo ist mein Schlussel? // where is my key?");
        list.add(" Wo liegt Deutschland? // where is Germany?");
        list.add(" Wo sind die Jungs? // where are the boys?");
        list.add(" Wo kann ich mich setzen? // where can I sit down?");
        list.add(" Wo ist dein Auto? // where is your Car?");


        return new FragenInfo("wo",list);


    }

    public FragenInfo was() {

        ArrayList<String> list = new ArrayList<>();
        list.add(" Was ist das?// what is this?");
        list.add(" Was liest du?// what do you read?");
        list.add(" Was isst du?// what do you eat?");
        list.add(" Was machst du?// what are you doing?");
        list.add(" Was kosten diese Kartoffell?// what do these potatoes cost?");
        list.add(" Was kann ich mitbringen?// what can I bring with me?");


        return new FragenInfo("was",list);


    }

    public FragenInfo wann() {

        ArrayList<String> list = new ArrayList<>();
        list.add(" Wann kommst du nach Hause? // when will you come back home?");
        list.add(" Wann ist deine Prüfung? // when is your exam?");
        list.add(" Wann machen wir die Aufgabe? // when do we do the task?");
        list.add(" Wann kann ich essen? // when can I eat?");
        list.add(" Wann hat sie Zeit? // when does she have time?");
        list.add(" Wann bekommst du dein Geld? // when do you get your money?");


        return new FragenInfo("wann",list);


    }

    public FragenInfo wohin() {

        ArrayList<String> list = new ArrayList<>();
        list.add(" Wohin gehen wir? // where are you going?");
        list.add(" Wohin fährt der Bus? // where is the bus going?");
        list.add(" Wohin reist dein Vater? // where is your Father traveling?");
        list.add(" Wohin willst du umziehen? // where do you want to move?");
        list.add(" Wohin geht sie? // where is she going?");
        list.add(" Wohin läuft das Mädchen? // where is the Girl running to?");


        return new FragenInfo("wohin",list);

    }
    public FragenInfo warum() {

        ArrayList<String> list = new ArrayList<>();
        list.add(" Warum lernst du deutsch? // why do you learn german?");
        list.add(" Warum machst du Sport? // why do you do sport?");
        list.add(" Warum spielst du Gitare? // why do you play guiter?");
        list.add(" Warum gehen wir zu Kino? // why do we go to the cinema?");
        list.add(" Warum essen wir zusammen? // why we don't eat togather?");
        list.add(" Warum macht ihr keine Party? // why you don't have a Party?");


        return new FragenInfo("warum",list);

    }

    public FragenInfo wie() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Wie heißt du? // what is your name?");
        list.add(" Wie geht es dir? // how are you?");
        list.add(" Wie ist dein Name? // what is your name?");
        list.add(" Wie groß bist du? // how tall are you?");
        list.add(" Wie alt bist du? // how old are you?");
        list.add(" Wie kann man deutsch lernen? // how ?");


        return new FragenInfo("wie",list);

    }

}
