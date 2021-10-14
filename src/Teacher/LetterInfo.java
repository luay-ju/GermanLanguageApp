package Teacher;


import java.util.ArrayList;

public class LetterInfo {

    String pronunciation;

    ArrayList<String> words =new ArrayList<>();

    public LetterInfo(String pronunciation, ArrayList<String> words) {
        super();
        this.pronunciation = pronunciation;
        this.words = words;
    }

}