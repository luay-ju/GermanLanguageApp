package Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Lesson1 extends Lesson implements Launch{

    HashMap<String , LetterInfo > info = new HashMap<>();

    public Scanner sc = new Scanner(System.in);

    public Lesson1() {

        super("Buchstaben ", 1);
        info.put("a", a());
        info.put("ä", ä());
        info.put("b", b());
        info.put("c", c());
        info.put("d", d());
        info.put("e", e());
        info.put("f", f());
        info.put("g", g());
        info.put("h", h());
        info.put("i", i());
        info.put("j", j());
        info.put("k", k());
        info.put("l", l());
        info.put("m", m());
        info.put("n", n());
        info.put("o", o());
        info.put("ö", ö());
        info.put("p", p());
        info.put("q", q());
        info.put("r", r());
        info.put("s", s());
        info.put("t", t());
        info.put("u", u());
        info.put("ü", ü());
        info.put("v", v());
        info.put("w", w());
        info.put("x", x());
        info.put("y", y());
        info.put("z", z());
        info.put("ß", ss());


    }



    @Override
    public void run() {
        buchstaben();
        chooseLetter();

    }


    public void buchstaben() {
        System.out.println("  Herzlich Wilkommen in deinem ersten deutsch Unterricht ");
        System.out.println(" heute werden wir die Buchstaben lernen >> ");
        System.out.println(" BuchstabensListe :   \n "
                + "A a , Ä ä ,  B b , C c, D d , E e , F f , G g  \n "
                + "H h , I i , J j , K k , L l , M m , N n , O o , Ö ö \n "
                + "P p , Q q , R r , S s ß, T t , U u , Ü ü , V v , \n "
                + "W w , X x , Y y , Z z  " );

    }

    private void callLetter(LetterInfo letterInfo) {

        System.out.println("// Pronunciation // Aussprache :  " + letterInfo.pronunciation + "\n");
        System.out.println(" // Examples // Beispiele : \n" );
        for(String word : letterInfo.words) {
            System.out.println(word);
        }
    }





    public void chooseLetter() {
        System.out.println(" \n wähle ein Buchstabe // choose a letter ");
        String choose = sc.next();



        LetterInfo letterInf = info.get(choose);
        callLetter(letterInf);

        System.out.println("\n druck (press): \n 1.(1) um Main wieder zu zeigen // go back to Main Menu \n"
                + " 2. druck auf irgend welche Taste um wieder einen Buchstabe zu wählen // press anything to choose another letter ");
        String choose2 = sc.next();
        if(choose2.equalsIgnoreCase("1")) {
            Main.runProject();
        }

        chooseLetter();


    }

    public void returnToMain() {
        Main.runProject();


    }


    public LetterInfo  ss() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" dieser Buchstabe fängt nie mals in dem Wort an ;-)  ");
        list.add(" English :// this letter never beggins in the word ;-)");

        return new LetterInfo("ss", list);

    }

    public LetterInfo  a() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Auto : Car ");
        list.add(" Alter : Age");
        list.add(" atmen : to breath ");
        list.add(" Anfang : beginning ");

        return new LetterInfo("aah", list);

    }

    public LetterInfo ä() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Ähnlichkeit : similarity");
        list.add(" Ärztin : Doktor ( female ) ");
        list.add(" ängstlich : afraid" );
        list.add(" ändern : to change ");
        return new LetterInfo("eeh", list);
    }


    public LetterInfo b() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Buchstabe : letter");
        list.add(" brauchen : need ");
        list.add(" Braun : braun " );
        list.add(" Blume : flower");
        return new LetterInfo("Be", list);
    }

    public LetterInfo c() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Cafe' : cafe' ");
        list.add(" Chance : chance");
        list.add(" Cent : cent " );
        list.add(" charmant : attractive ");

        return new LetterInfo("Tse ", list);
    }

    public LetterInfo d() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Drucker : Printer ");
        list.add(" Daumen : thumb ");
        list.add(" Dach : roof" );
        list.add(" dick : fat ");

        return new LetterInfo(" De ", list);
    }
    public LetterInfo e() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Ei : egg ");
        list.add(" Ein : one ");
        list.add(" Essen : food" );
        list.add(" essen : to eat ");

        return new LetterInfo(" e ", list);
    }
    public LetterInfo f() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Frage : quastion ");
        list.add(" Fuß : foot ");
        list.add(" fliegen : to fly " );
        list.add(" fliehen : to escape  ");

        return new LetterInfo(" f ", list);
    }
    public LetterInfo g() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Groß : big ");
        list.add(" greifen : to grab ");
        list.add(" Glass : glass " );
        list.add(" Gabel : fork  ");

        return new LetterInfo(" ge ", list);
    }
    public LetterInfo h() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Heiß : hot ");
        list.add(" Haut : skin ");
        list.add(" haben : to have " );
        list.add(" heilen : to heal  ");

        return new LetterInfo(" ha ", list);
    }
    public LetterInfo i() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Ich : I ");
        list.add(" Idee : idea ");
        list.add(" immer : always" );
        list.add(" Immobilie : estate ");

        return new LetterInfo(" ie ", list);
    }
    public LetterInfo j() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Junge : child  ");
        list.add(" Jagd : hunt ");
        list.add(" Joghurt : jogurt" );
        list.add(" Jacke : jacket ");

        return new LetterInfo(" yot and (ie) in the middel of speek ", list);
    }
    public LetterInfo k() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" können : can  ");
        list.add(" Kuchen : cake ");
        list.add(" Karte : card ");
        list.add(" Kartoffel : potato");

        return new LetterInfo(" ka ", list);
    }
    public LetterInfo l() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" leihen : to borrow ");
        list.add(" lügen : to lie ");
        list.add(" Lampe : lamp");
        list.add(" Loch : hole ");

        return new LetterInfo(" l ", list);
    }
    public LetterInfo m() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Meer : sea ");
        list.add(" machen : to do  ");
        list.add(" Mühle : mill");
        list.add(" malen : to draw");

        return new LetterInfo(" m ", list);
    }
    public LetterInfo n() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Nabel : navel ");
        list.add(" Nachbar : neighbor ");
        list.add(" Nummer : number");
        list.add(" Nichte : niece");

        return new LetterInfo(" n ", list);
    }
    public LetterInfo o() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Ohr : ear ");
        list.add(" Obst : fruit ");
        list.add(" Ost : east");
        list.add(" Obdach : shelter");

        return new LetterInfo(" o ", list);
    }
    public LetterInfo ö() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Österreich : austria ");
        list.add(" Öffentlichkeit : publicity  ");
        list.add(" Öffnung : openingt");
        list.add(" Ökonomie : economic");

        return new LetterInfo(" eoh ", list);
    }
    public LetterInfo p() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Post : post ");
        list.add(" Platz : place ");
        list.add(" Packung : pack ");
        list.add(" Pferd : horse ");

        return new LetterInfo(" p ", list);
    }
    public LetterInfo q() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Quelle : quel ");
        list.add(" quer : across");
        list.add(" Quadrat : quadrat ");
        list.add(" quasi : quasi ");

        return new LetterInfo(" ku ", list);
    }
    public LetterInfo r() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Ruhe : quiet ");
        list.add(" Restaurant : Restaurant ");
        list.add(" Reh : deer ");
        list.add(" Rettung : rescue ");

        return new LetterInfo(" r ", list);
    }
    public LetterInfo s() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" schnell : fats ");
        list.add(" Schule : school ");
        list.add(" Student : student ");
        list.add(" Stadt : city");

        return new LetterInfo(" s ", list);
    }
    public LetterInfo t() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Tee : tee ");
        list.add(" traurig : sad ");
        list.add(" Taube : dove ");
        list.add(" Trauben : grapes ");

        return new LetterInfo(" te ", list);
    }

    public LetterInfo u() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Uhr : watch/clock");
        list.add(" Umarmung : hug ");
        list.add(" Umgang : deal ");
        list.add(" unter : under ");

        return new LetterInfo(" uh ", list);
    }
    public LetterInfo ü() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" überzeugen : to convince");
        list.add(" Übergang : crossing ");
        list.add(" übersetzen : to translate ");
        list.add(" Übel : evil/badness ");

        return new LetterInfo(" euh ", list);
    }
    public LetterInfo v() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Vogel : bird ");
        list.add(" Vater : father ");
        list.add(" Vase : vase ");
        list.add(" Variante : variant");

        return new LetterInfo(" fao ", list);
    }
    public LetterInfo w() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" wechseln : to switch ");
        list.add(" wachsen : to grow ");
        list.add(" Wach : awake ");
        list.add(" warum : why ");

        return new LetterInfo(" ve ", list);
    }
    public LetterInfo x() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" X-Achse : X axis ");
        list.add(" X-strahlen : X Ray ");

        return new LetterInfo(" x ", list);

    }
    public LetterInfo y() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" Yacht : yacht ");
        list.add(" Yoga : yoga ");

        return new LetterInfo(" Epsilon / ye  ", list);

    }
    public LetterInfo z() {

        ArrayList<String> list = new ArrayList<>();

        list.add(" zittern : to quiver ");
        list.add(" Zitrone : lemon  ");
        list.add(" Zeit : time ");
        list.add(" zwischen : between ");

        return new LetterInfo(" Tset / ts  ", list);
    }


}
