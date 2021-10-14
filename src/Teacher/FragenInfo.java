package Teacher;

import java.util.ArrayList;

public class FragenInfo {

    String w;
    ArrayList<String> examples = new ArrayList<>();



    public FragenInfo(String w, ArrayList<String> examples) {
        this.w = w;
        this.examples = examples;

    }
}