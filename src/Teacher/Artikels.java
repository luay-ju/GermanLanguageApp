package Teacher;

import java.util.ArrayList;

public class Artikels {

    String artikel;
    ArrayList<String> examples = new ArrayList<>();
    ArrayList<String> rules = new ArrayList<>();


    public Artikels(String artikel, ArrayList<String> examples, ArrayList<String> rules) {
        this.examples = examples;
        this.artikel = artikel;
        this.rules = rules;

    }

}