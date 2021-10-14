package Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LessonList {


    public static void printList() {
        Lesson l1 = new Lesson1();
        Lesson l2 = new Lesson2();
        Lesson l3 = new Lesson3();
        Lesson l4 = new Lesson4();
        Lesson l5 = new Lesson5();
        Lesson l6 = new Lesson6();
        Lesson l7 = new Lesson7();

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,Lesson> list = new HashMap<>();

        list.put(1,l1);
        list.put(2,l2);
        list.put(3,l3);
        list.put(4,l4);
        list.put(5,l5);
        list.put(6,l6);
        list.put(7,l7);


        System.out.println(" . . . . UnterrichtsList : \n");
        for(Map.Entry me : list.entrySet()) {
            System.out.println(" " + me.getKey() + ". " + me.getValue());
        }



        System.out.println(" Please choose a Lesson //bitte wähle einen Unterricht // :");
        int choosedLesson = sc.nextInt();

        Lesson l = list.get(choosedLesson);
        l.run();


    }

}
