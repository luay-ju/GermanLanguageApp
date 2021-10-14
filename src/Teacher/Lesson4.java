package Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson4 extends Lesson implements Launch{

    Scanner sc = new Scanner(System.in);

    public Lesson4() {
        super(" Begrüßung ", 4);

    }

    @Override
    public void run() {
        introduction();
        chooseSentences();

    }


    public void introduction() {

        System.out.println(" wellcome to the 4th Lesson. Today you will learn about greeting and goodbye in german !");
        System.out.println(" Wilkommen bei dem vierten Unterricht. Heute wirst du die Begrüßung und den Abschied lernen ! \n");

    }

    public void chooseSentences() {
        System.out.println(" please choose // bitte wähle  : \n\n 1. Begrüßung (greeting) \n 2. Abschied (goodbye) \n 3. Main Menu");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                greetingSentences();
                System.out.println();
                chooseSentences();
                break;
            case 2:
                goodbye();
                System.out.println();
                chooseSentences();
                break;
            case 3:
                System.out.println();
                Main.runProject();
                break;
            default:
                System.out.println(" wrong index! // falshe Eingabe! ");
                chooseSentences();
                break;

        }
    }

    public void greetingSentences() {

        System.out.println(" here you find some greeting Sentences which you always need during the day! \n // hier sind Begrüßungssätze, die du im Alltag immer brauchst :");

        ArrayList<String> greeting = new ArrayList<>();
        greeting.add("\n");
        greeting.add(" Hallo // hello \n");
        greeting.add(" Guten Tag // god day \n");
        greeting.add(" Guten Morgen // bood morning \n");
        greeting.add(" Guten Abend! // good evening \n");
        greeting.add(" Gute Nacht! // good night \n");
        greeting.add(" Willkommen! // wellcome \n");
        greeting.add(" Sei gegrüßt! // hail,Hello \n");
        greeting.add(" Ich grüße Sie! // I greet you \n");
        greeting.add(" Willkommen zurück! // wellcome back |n");

        System.out.println(greeting);
    }

    public void goodbye() {
        System.out.println(" here you find some goodbye Sentences ! \n // hier sind Abschiedssätze :");

        ArrayList<String> goodbye = new ArrayList<>();

        goodbye.add("\n");
        goodbye.add(" Tschüss // bye \n");
        goodbye.add(" Auf Wiedersehen! // see you \n");
        goodbye.add(" Auf Wiederhören // speak to you soon \n");
        goodbye.add(" Schlaf gut! // sleep well\n");
        goodbye.add(" Bis gleich! // see you soon \n");
        goodbye.add(" Bis dann! // see you \n");
        goodbye.add(" Bis Bald! // see you soon \n");
        goodbye.add(" Bis morgen! // see you tomorrow \n");
        goodbye.add(" Bis später! // see you läter \n");
        goodbye.add(" Mach’s gut! // take care \n");
        goodbye.add(" Hau ab! (unhöflich) // go away (unpolite) \n");

        System.out.println(goodbye);
    }


}