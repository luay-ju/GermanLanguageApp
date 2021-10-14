package Teacher;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Lesson6 extends Lesson implements Launch{

    public Lesson6() {
        super(" Lied ", 6);
    }

    public void run() {
        try {
            playSong();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {

            e.printStackTrace();
        }
        askToRerun();
    }
    static Scanner sc = new Scanner(System.in);

    public void playSong() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        System.out.println("      Herzlichen Welkommen in Unterricht 6   \n\n ");

        System.out.println(" Heute haben wir ein ( der, die, das ) Lied für dich, viel Spaß ;-) ");
        System.out.println(" Today we have a ( der, die, das ) Song for you, enjoy ;-) \n");



        File file = new File("der, die, das.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = " ";

        while(!response.equalsIgnoreCase("Q")) {
            System.out.println(" P = play // Spielen \n S = Stop // Stopp \n R = Reset // Wiederholen \n Q = Quit and show Lyrics// Verlassen und Gedicht zeigen\n");
            System.out.print("Enter your choice // gib dein Wahl :");

            response = sc.next();
            response = response.toUpperCase();

            switch(response) {
                case ("P"):
                    clip.start();
                    printLyrics() ;
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                    System.out.println("\n Tschüüüss \n Byeee  ");
                    askToRerun();
                    break;
                default: System.out.println("invalid choice // ungültige Wahl");
            }

        }
    }

    public void askToRerun() {

        System.out.println("\n wähle // choose :\n 1. Unterricht wiederholen // play the Lesson again \n 2. Main Menu ");
        int option = sc.nextInt();

        switch(option) {
            case 1:
                run();
                break;
            case 2:
                Main.runProject();
                break;
            default:
                askToRerun();
                break;
        }

    }


    public void printLyrics() {
        System.out.println(" Lyrics // Gedicht : \n");
        System.out.println("Der, die, das\n"
                + "Wer, wie, was\n"
                + "Wieso, weshalb, warum?\n"
                + "Wer nicht fragt bleibt dumm\n"
                + "Der, die, das\n"
                + "Wer, wie, was\n"
                + "Wieso, weshalb, warum?\n"
                + "Wer nicht fragt bleibt dumm\n"
                + "Tausend tolle Sachen, die gibt es überall zu sehen\n"
                + "Manchmal muss man fragen, um sie zu verstehen\n"
                + "Der, die, das\n"
                + "Wer, wie, was\n"
                + "Wieso, weshalb, warum?\n"
                + "Wer nicht fragt bleibt dumm\n"
                + "Tausend tolle Sachen, die gibt es überall zu sehen\n"
                + "Manchmal muss man fragen, um sie zu verstehen\n"
                + "Der, die, das\n"
                + "Wer, wie, was\n"
                + "Wieso, weshalb, warum?\n"
                + "Wer nicht fragt bleibt dumm\n");
    }

}
